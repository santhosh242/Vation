package com.vation.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
@Component(
        service = {Servlet.class},
        property = {
                Constants.SERVICE_DESCRIPTION + "=Path-Based Servlet",
                "sling.servlet.methods=" + HttpConstants.METHOD_POST,
                "sling.servlet.paths=" + "/bin/example/delete"
        }
)
public class DeleteServlet extends SlingAllMethodsServlet {

        @Override
        protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
                String name = request.getParameter("data");
                if (name != null && !name.isEmpty()) {
                        ResourceResolver resolver = request.getResourceResolver();
                        try {
                                Resource resource = resolver.getResource("/content/formData");
                                if (resource != null) {
                                        Resource childResource = resource.getChild(name);
                                        if (childResource != null) {
                                                resolver.delete(childResource);
                                                resolver.commit();
                                                response.setStatus(SlingHttpServletResponse.SC_OK);
                                                response.getWriter().write("Delete successful");
                                        } else {
                                                response.setStatus(SlingHttpServletResponse.SC_NOT_FOUND);
                                                response.getWriter().write("Resource not found");
                                        }
                                } else {
                                        response.setStatus(SlingHttpServletResponse.SC_NOT_FOUND);
                                        response.getWriter().write("/content/formData not found");
                                }
                        } catch (Exception e) {
                                response.setStatus(SlingHttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                                response.getWriter().write("Error during deletion: " + e.getMessage());
                        }
                } else {
                        response.setStatus(SlingHttpServletResponse.SC_BAD_REQUEST);
                        response.getWriter().write("Invalid name parameter");
                }
        }
}

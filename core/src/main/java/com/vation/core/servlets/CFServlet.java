package com.vation.core.servlets;

import com.adobe.cq.dam.cfm.ContentElement;
import com.adobe.cq.dam.cfm.ContentFragment;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@Component(
        service = {Servlet.class},
        property = {
                Constants.SERVICE_DESCRIPTION + "=Path-Based Servlet",
                "sling.servlet.methods=" + HttpConstants.METHOD_GET,
                "sling.servlet.paths=" + "/bin/export/contentfragment"
        }
)
public class CFServlet extends SlingSafeMethodsServlet {

        private static final Logger log = LoggerFactory.getLogger(CFServlet.class);

        @Override
        protected void doGet(final SlingHttpServletRequest request, final SlingHttpServletResponse response) throws ServletException, IOException {
                response.setContentType("application/json");
                response.setCharacterEncoding("UTF-8");

                PrintWriter out = response.getWriter();
                try {
                        String fragmentPath = request.getParameter("path");
                        ResourceResolver resourceResolver = request.getResourceResolver();
                        Resource fragmentResource = resourceResolver.getResource(fragmentPath);
                        ContentFragment contentFragment = fragmentResource.adaptTo(ContentFragment.class);
                        Iterator<ContentElement> it = contentFragment.getElements();
                        JsonArray jsonArray = new JsonArray();
                        String[] lines = null;
                        while (it.hasNext()) {
                                ContentElement element = it.next();
                                lines = element.getContent().split("\n");
                        }
                        if (lines != null) {
                                for (String arr : lines) {
                                        Resource fragmentResource1 = resourceResolver.getResource(arr);
                                        ContentFragment contentFragment1 = fragmentResource1.adaptTo(ContentFragment.class);
                                        Iterator<ContentElement> it1 = contentFragment1.getElements();
                                        while (it1.hasNext()) {
                                                ContentElement element = it1.next();
                                                JsonObject jsonObject = new JsonObject();
                                                jsonObject.addProperty(element.getName(), element.getContent());
                                                jsonArray.add(jsonObject);
                                        }
                                }
                        }
                        out.print(jsonArray.toString());
                } catch (Exception e) {
                        log.error("Error during servlet execution", e);
                        response.setStatus(SlingHttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                        out.print("{\"error\":\"Internal Server Error\"}");
                } finally {
                        out.flush();
                        out.close();
                }
        }
}

package com.vation.core.servlets;

import com.day.cq.commons.jcr.JcrUtil;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;



@Component(
        service = { Servlet.class },
        property = {
                Constants.SERVICE_DESCRIPTION + "=Path-Based Servlet",
                "sling.servlet.methods=" + HttpConstants.METHOD_POST,
                "sling.servlet.paths=" + "/bin/example/hello"
        }
)
public class ContactFormServlet extends SlingAllMethodsServlet {
    private static final String PATH = "/content/formData";
    private static final Logger log = LoggerFactory.getLogger(ContactFormServlet.class);

    @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        ResourceResolver resourceResolver = request.getResourceResolver();
        Session session = resourceResolver.adaptTo(Session.class);
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");

        PrintWriter out = response.getWriter();
        try {
            Resource resource = resourceResolver.getResource(PATH + "/" + name);
                Node firstSubProduct = JcrUtil.createPath(PATH + "/" + name, "nt:unstructured", session);
                firstSubProduct.setProperty("name", name);
                firstSubProduct.setProperty("email", email);
                firstSubProduct.setProperty("subject", subject);
                firstSubProduct.setProperty("message", message);
                session.save();
                out.println("Form Saved");
                out.flush();
        } catch (RepositoryException e) {
            out.println("That went not so well...");
            out.flush();
            log.error("RepositoryException occurred", e);
        } finally {
            if (session != null) {
                session.logout();
            }
            if (out != null) {
                out.close();
            }
        }
    }

}
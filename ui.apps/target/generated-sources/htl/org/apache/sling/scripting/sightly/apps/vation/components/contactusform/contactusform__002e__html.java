/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.vation.components.contactusform;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class contactusform__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_wcmmode = bindings.get("wcmmode");
Object _global_clientlib = null;
Object _global_contactobj = null;
out.write("<!-- Contact Start -->\n");
{
    Object var_testvariable0 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit")) ? renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit") : renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "design")));
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<div class=\"cq-placeholder\" data-emptytext=\"Contact Us\"></div>");
    }
}
out.write("\n");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
out.write("\n    ");
{
    Object var_templatevar2 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "all");
    {
        String var_templateoptions3_field$_categories = "vation.styles";
        {
            java.util.Map var_templateoptions3 = obj().with("categories", var_templateoptions3_field$_categories);
            callUnit(out, renderContext, var_templatevar2, var_templateoptions3);
        }
    }
}
out.write("\n");
_global_contactobj = renderContext.call("use", com.vation.core.models.ContactFormModel.class.getName(), obj());
out.write("<div>\n<div class=\"container-fluid p-5\">\n    <div class=\"mb-5 text-center\">\n        <h5 class=\"text-primary text-uppercase\">Contact Us</h5>\n        <h1 class=\"display-3 text-uppercase mb-0\">Get In Touch</h1>\n    </div>\n    <div class=\"row g-5 mb-5\">\n        <div class=\"col-lg-4\">\n            <div class=\"d-flex flex-column align-items-center bg-dark rounded text-center py-5 px-3\">\n                <div class=\"bg-primary rounded-circle d-flex align-items-center justify-content-center mb-3\" style=\"width: 60px; height: 60px;\">\n                    <i class=\"fa fa-map-marker-alt fs-4 text-white\"></i>\n                </div>\n                <h5 class=\"text-uppercase text-primary\">Visit Us</h5>\n                <p class=\"text-secondary mb-0\">123 Street, New York, USA</p>\n            </div>\n        </div>\n        <div class=\"col-lg-4\">\n            <div class=\"d-flex flex-column align-items-center bg-dark rounded text-center py-5 px-3\">\n                <div class=\"bg-primary rounded-circle d-flex align-items-center justify-content-center mb-3\" style=\"width: 60px; height: 60px;\">\n                    <i class=\"fa fa-envelope fs-4 text-white\"></i>\n                </div>\n                <h5 class=\"text-uppercase text-primary\">Email Us</h5>\n                <p class=\"text-secondary mb-0\">info@example.com</p>\n            </div>\n        </div>\n        <div class=\"col-lg-4\">\n            <div class=\"d-flex flex-column align-items-center bg-dark rounded text-center py-5 px-3\">\n                <div class=\"bg-primary rounded-circle d-flex align-items-center justify-content-center mb-3\" style=\"width: 60px; height: 60px;\">\n                    <i class=\"fa fa-phone fs-4 text-white\"></i>\n                </div>\n                <h5 class=\"text-uppercase text-primary\">Call Us</h5>\n                <p class=\"text-secondary mb-0\">+012 345 6789</p>\n            </div>\n        </div>\n    </div>\n    <div class=\"row g-0\">\n        <div class=\"col-lg-6\">\n            <div class=\"bg-dark p-5\">\n                <form>\n                    <div class=\"row g-3\">\n                        <div class=\"col-6\">\n                            <input type=\"text\" class=\"form-control bg-light border-0 px-4\"");
{
    Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_global_contactobj, "name");
    {
        Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "attribute");
        {
            boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
            if (var_shoulddisplayattr7) {
                out.write(" placeholder");
                {
                    boolean var_istrueattr6 = (var_attrvalue4.equals(true));
                    if (!var_istrueattr6) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent5));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" style=\"height: 55px;\"/>\n                        </div>\n                        <div class=\"col-6\">\n                            <input type=\"email\" class=\"form-control bg-light border-0 px-4\"");
{
    Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(_global_contactobj, "email");
    {
        Object var_attrcontent9 = renderContext.call("xss", var_attrvalue8, "attribute");
        {
            boolean var_shoulddisplayattr11 = (((null != var_attrcontent9) && (!"".equals(var_attrcontent9))) && ((!"".equals(var_attrvalue8)) && (!((Object)false).equals(var_attrvalue8))));
            if (var_shoulddisplayattr11) {
                out.write(" placeholder");
                {
                    boolean var_istrueattr10 = (var_attrvalue8.equals(true));
                    if (!var_istrueattr10) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent9));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" style=\"height: 55px;\"/>\n                        </div>\n                        <div class=\"col-12\">\n                            <input type=\"text\" class=\"form-control bg-light border-0 px-4\"");
{
    Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(_global_contactobj, "subject");
    {
        Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "attribute");
        {
            boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
            if (var_shoulddisplayattr15) {
                out.write(" placeholder");
                {
                    boolean var_istrueattr14 = (var_attrvalue12.equals(true));
                    if (!var_istrueattr14) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent13));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" style=\"height: 55px;\"/>\n                        </div>\n                        <div class=\"col-12\">\n                            <textarea class=\"form-control bg-light border-0 px-4 py-3\" rows=\"4\"");
{
    Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(_global_contactobj, "message");
    {
        Object var_attrcontent17 = renderContext.call("xss", var_attrvalue16, "attribute");
        {
            boolean var_shoulddisplayattr19 = (((null != var_attrcontent17) && (!"".equals(var_attrcontent17))) && ((!"".equals(var_attrvalue16)) && (!((Object)false).equals(var_attrvalue16))));
            if (var_shoulddisplayattr19) {
                out.write(" placeholder");
                {
                    boolean var_istrueattr18 = (var_attrvalue16.equals(true));
                    if (!var_istrueattr18) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent17));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("></textarea>\n                        </div>\n                        <div class=\"col-12\">\n                            <button class=\"btn btn-primary w-100 py-3\" type=\"submit\">");
{
    Object var_20 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_contactobj, "sendmessage"), "text");
    out.write(renderContext.getObjectModel().toString(var_20));
}
out.write("</button>\n                        </div>\n                    </div>\n                </form>\n            </div>\n        </div>\n        <div class=\"col-lg-6\">\n            <iframe class=\"w-100\" src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3001156.4288297426!2d-78.01371936852176!3d42.72876761954724!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4ccc4bf0f123a5a9%3A0xddcfc6c1de189567!2sNew%20York%2C%20USA!5e0!3m2!1sen!2sbd!4v1603794290143!5m2!1sen!2sbd\" frameborder=\"0\" style=\"height: 457px; border:0;\" allowfullscreen=\"\" aria-hidden=\"false\" tabindex=\"0\"></iframe>\n        </div>\n    </div>\n</div>\n</div>\n\n\n<!-- Contact End -->");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


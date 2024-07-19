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
out.write("<div style=\"padding:24px;\">\n");
{
    Object var_testvariable0 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit")) ? renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit") : renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "design")));
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<div class=\"cq-placeholder\" data-emptytext=\"Contact Us\"></div>");
    }
}
out.write("\n");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
out.write("\n");
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
out.write("<div>\n<div class=\"row g-0\">\n<div class=\"col-lg-6\">\n<div class=\"bg-dark p-5\">\n<form id=\"contactForm\">\n<div class=\"row g-3\">\n<div class=\"col-6\">\n<input type=\"text\" class=\"form-control bg-light border-0 px-4\" name=\"name\"");
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
out.write(" style=\"height: 55px;\" required/>\n</div>\n<div class=\"col-6\">\n<input type=\"email\" class=\"form-control bg-light border-0 px-4\" name=\"email\"");
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
out.write(" style=\"height: 55px;\" required/>\n</div>\n<div class=\"col-12\">\n<input type=\"text\" class=\"form-control bg-light border-0 px-4\" name=\"subject\"");
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
out.write(" style=\"height: 55px;\" required/>\n</div>\n<div class=\"col-12\">\n<textarea class=\"form-control bg-light border-0 px-4 py-3\" rows=\"4\" name=\"message\"");
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
out.write(" required></textarea>\n</div>\n<div class=\"col-12\">\n<button class=\"btn btn-primary w-100 py-3\" type=\"submit\">Send Message</button>\n</div>\n</div>\n</form>\n</div>\n</div>\n<div class=\"col-lg-6\"></div>\n</div>\n</div>\n</div>\n\n\n<div id=\"responseMessage\"></div>\n</div>\n<script>\n  $(document).ready(function () {\n    $('#contactForm').submit(function (e) {\n      e.preventDefault();\n \n      var formData = $(this).serialize();\n \n      $.ajax({\n        type: 'POST',\n        url: '/bin/example/hello',\n        data: formData,\n        success: function (response) {\n          $('#responseMessage').html('<p>' + response + '</p>');\n          setTimeout(function() {\n            window.location.reload();\n          }, 500);\n        },\n        error: function (xhr, status, error) {\n          $('#responseMessage').html('<p>Error: ' + error + '</p>');\n        }\n      });\n    });\n  });\n \n</script>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


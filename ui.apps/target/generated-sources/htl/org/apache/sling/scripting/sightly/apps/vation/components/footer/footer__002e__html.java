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
package org.apache.sling.scripting.sightly.apps.vation.components.footer;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class footer__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_wcmmode = bindings.get("wcmmode");
Object _global_clientlib = null;
Object _global_model = null;
Collection var_collectionvar8_list_coerced$ = null;
Collection var_collectionvar23_list_coerced$ = null;
{
    Object var_testvariable0 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit")) ? renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit") : renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "design")));
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<div class=\"cq-placeholder\" data-emptytext=\"Footer\"></div>");
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
out.write("\n    ");
_global_model = renderContext.call("use", com.vation.core.models.FooterModel.class.getName(), obj());
out.write("\n\n        <!-- Footer Start -->\n        <div class=\"container-fluid bg-dark text-secondary px-5 mt-5\">\n            <div class=\"row gx-5\">\n                <div class=\"col-lg-8 col-md-6\">\n                    <div class=\"row gx-5\">\n                        <div class=\"col-lg-4 col-md-12 pt-5 mb-5\">\n                            <h4 class=\"text-uppercase text-light mb-4\">");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</h4>\n                            <div class=\"d-flex mb-2\">\n                                <i class=\"bi bi-geo-alt text-primary me-2\"></i>\n                                <p class=\"mb-0\">");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "address"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</p>\n                            </div>\n                            <div class=\"d-flex mb-2\">\n                                <i class=\"bi bi-envelope-open text-primary me-2\"></i>\n                                <p class=\"mb-0\">");
{
    Object var_6 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "email"), "text");
    out.write(renderContext.getObjectModel().toString(var_6));
}
out.write("</p>\n                            </div>\n                            <div class=\"d-flex mb-2\">\n                                <i class=\"bi bi-telephone text-primary me-2\"></i>\n                                <p class=\"mb-0\">");
{
    Object var_7 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "mobilenumber"), "text");
    out.write(renderContext.getObjectModel().toString(var_7));
}
out.write("</p>\n                            </div>\n                            <div class=\"d-flex mt-4\">\n                                <a class=\"btn btn-primary btn-square rounded-circle me-2\" href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n                                <a class=\"btn btn-primary btn-square rounded-circle me-2\" href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\n                                <a class=\"btn btn-primary btn-square rounded-circle me-2\" href=\"#\"><i class=\"fab fa-linkedin-in\"></i></a>\n                                <a class=\"btn btn-primary btn-square rounded-circle\" href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n                            </div>\n                        </div>\n                        <div class=\"col-lg-4 col-md-12 pt-0 pt-lg-5 mb-5\">\n                            <h4 class=\"text-uppercase text-light mb-4\">Quick Links</h4>\n                            <div class=\"d-flex flex-column justify-content-start\">\n                                ");
{
    Object var_collectionvar8 = renderContext.getObjectModel().resolveProperty(_global_model, "quicklinks");
    {
        long var_size9 = ((var_collectionvar8_list_coerced$ == null ? (var_collectionvar8_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar8)) : var_collectionvar8_list_coerced$).size());
        {
            boolean var_notempty10 = (var_size9 > 0);
            if (var_notempty10) {
                {
                    long var_end13 = var_size9;
                    {
                        boolean var_validstartstepend14 = (((0 < var_size9) && true) && (var_end13 > 0));
                        if (var_validstartstepend14) {
                            if (var_collectionvar8_list_coerced$ == null) {
                                var_collectionvar8_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar8);
                            }
                            long var_index15 = 0;
                            for (Object item : var_collectionvar8_list_coerced$) {
                                {
                                    boolean var_traversal17 = (((var_index15 >= 0) && (var_index15 <= var_end13)) && true);
                                    if (var_traversal17) {
                                        out.write("\n                                    <a class=\"text-secondary mb-2\"");
                                        {
                                            Object var_attrvalue18 = renderContext.getObjectModel().resolveProperty(item, "url");
                                            {
                                                Object var_attrcontent19 = renderContext.call("xss", var_attrvalue18, "uri");
                                                {
                                                    boolean var_shoulddisplayattr21 = (((null != var_attrcontent19) && (!"".equals(var_attrcontent19))) && ((!"".equals(var_attrvalue18)) && (!((Object)false).equals(var_attrvalue18))));
                                                    if (var_shoulddisplayattr21) {
                                                        out.write(" href");
                                                        {
                                                            boolean var_istrueattr20 = (var_attrvalue18.equals(true));
                                                            if (!var_istrueattr20) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent19));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write("><i class=\"bi bi-arrow-right text-primary me-2\"></i>");
                                        {
                                            Object var_22 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "linktitle"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_22));
                                        }
                                        out.write("</a>\n                                ");
                                    }
                                }
                                var_index15++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar8_list_coerced$ = null;
}
out.write("\n                            </div>\n                        </div>\n                        <div class=\"col-lg-4 col-md-12 pt-0 pt-lg-5 mb-5\">\n                            <h4 class=\"text-uppercase text-light mb-4\">Popular Links</h4>\n                            <div class=\"d-flex flex-column justify-content-start\">\n                                ");
{
    Object var_collectionvar23 = renderContext.getObjectModel().resolveProperty(_global_model, "popularlinks");
    {
        long var_size24 = ((var_collectionvar23_list_coerced$ == null ? (var_collectionvar23_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar23)) : var_collectionvar23_list_coerced$).size());
        {
            boolean var_notempty25 = (var_size24 > 0);
            if (var_notempty25) {
                {
                    long var_end28 = var_size24;
                    {
                        boolean var_validstartstepend29 = (((0 < var_size24) && true) && (var_end28 > 0));
                        if (var_validstartstepend29) {
                            if (var_collectionvar23_list_coerced$ == null) {
                                var_collectionvar23_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar23);
                            }
                            long var_index30 = 0;
                            for (Object item : var_collectionvar23_list_coerced$) {
                                {
                                    boolean var_traversal32 = (((var_index30 >= 0) && (var_index30 <= var_end28)) && true);
                                    if (var_traversal32) {
                                        out.write("\n                                    <a class=\"text-secondary mb-2\"");
                                        {
                                            Object var_attrvalue33 = renderContext.getObjectModel().resolveProperty(item, "url");
                                            {
                                                Object var_attrcontent34 = renderContext.call("xss", var_attrvalue33, "uri");
                                                {
                                                    boolean var_shoulddisplayattr36 = (((null != var_attrcontent34) && (!"".equals(var_attrcontent34))) && ((!"".equals(var_attrvalue33)) && (!((Object)false).equals(var_attrvalue33))));
                                                    if (var_shoulddisplayattr36) {
                                                        out.write(" href");
                                                        {
                                                            boolean var_istrueattr35 = (var_attrvalue33.equals(true));
                                                            if (!var_istrueattr35) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent34));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write("><i class=\"bi bi-arrow-right text-primary me-2\"></i>");
                                        {
                                            Object var_37 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "linktitle"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_37));
                                        }
                                        out.write("</a>\n                                ");
                                    }
                                }
                                var_index30++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar23_list_coerced$ = null;
}
out.write("\n                            </div>\n                        </div>\n                    </div>\n                </div>\n                <div class=\"col-lg-4 col-md-6\">\n                    <div class=\"d-flex flex-column align-items-center justify-content-center text-center h-100 bg-primary p-5\">\n                        <h4 class=\"text-uppercase text-white mb-4\">Newsletter</h4>\n                        <h6 class=\"text-uppercase text-white\">Subscribe Our Newsletter</h6>\n                        <p class=\"text-light\">Amet justo diam dolor rebum lorem sit stet sea justo kasd</p>\n                        <form action=\"\">\n                            <div class=\"input-group\">\n                                <input type=\"text\" class=\"form-control border-white p-3\" placeholder=\"Your Email\"/>\n                                <button class=\"btn btn-dark\">Sign Up</button>\n                            </div>\n                        </form>\n                    </div>\n                </div>\n            </div>\n        </div>\n        <div class=\"container-fluid py-4 py-lg-0 px-5\" style=\"background: #111111;\">\n            <div class=\"row gx-5\">\n                <div class=\"col-lg-8\">\n                    <div class=\"py-lg-4 text-center\">\n                        <p class=\"text-secondary mb-0\">&copy; <a class=\"text-light fw-bold\" href=\"#\">Your Site Name</a>. All Rights Reserved.</p>\n                    </div>\n                </div>\n                <div class=\"col-lg-4\">\n                    <div class=\"py-lg-4 text-center credit\">\n                        <p class=\"text-light mb-0\">Designed by <a class=\"text-light fw-bold\" href=\"https://htmlcodex.com\">HTML Codex</a></p>\n                    </div>\n                </div>\n            </div>\n        </div>\n    \n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


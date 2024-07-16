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
package org.apache.sling.scripting.sightly.apps.vation.components.headerNavigation;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class headerNavigation__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_wcmmode = bindings.get("wcmmode");
Object _global_clientlib = null;
Object _global_headernavmodel = null;
Collection var_collectionvar7_list_coerced$ = null;
{
    Object var_testvariable0 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit")) ? renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit") : renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "design")));
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<div class=\"cq-placeholder\" data-emptytext=\"Navigation\"></div>");
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
_global_headernavmodel = renderContext.call("use", com.vation.core.models.HeaderNavigationModel.class.getName(), obj());
out.write("\n        <div class=\"container-fluid bg-dark px-0\">\n        <div class=\"row gx-0\">\n            <div class=\"col-lg-3 bg-dark d-none d-lg-block\">\n                <a href=\"\" class=\"navbar-brand w-100 h-100 m-0 p-0 d-flex align-items-center justify-content-center\">\n                    <h1 class=\"m-0 display-4 text-primary text-uppercase\">");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_headernavmodel, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</h1>\n                </a>\n            </div>\n            <div class=\"col-lg-9\">\n                <div class=\"row gx-0 bg-secondary d-none d-lg-flex\">\n                    <div class=\"col-lg-7 px-5 text-start\">\n                        <div class=\"h-100 d-inline-flex align-items-center py-2 me-4\">\n                            <i class=\"fa fa-envelope text-primary me-2\"></i>\n                            <h6 class=\"mb-0\">");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_headernavmodel, "email"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</h6>\n                        </div>\n                        <div class=\"h-100 d-inline-flex align-items-center py-2\">\n                            <i class=\"fa fa-phone-alt text-primary me-2\"></i>\n                            <h6 class=\"mb-0\">");
{
    Object var_6 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_headernavmodel, "mobilenumber"), "text");
    out.write(renderContext.getObjectModel().toString(var_6));
}
out.write("</h6>\n                        </div>\n                    </div>                    \n                </div>\n                <nav class=\"navbar navbar-expand-lg bg-dark navbar-dark p-3 p-lg-0 px-lg-5\">\n                 <a href=\"\" class=\"navbar-brand d-block d-lg-none\">\n                        <h1 class=\"m-0 display-4 text-primary text-uppercase\"></h1>\n                    </a>\n                    <button type=\"button\" class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\n                        <span class=\"navbar-toggler-icon\"></span>\n                    </button>\n                    <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\n                        <div class=\"navbar-nav mr-auto py-0\">\n                           ");
{
    Object var_collectionvar7 = renderContext.getObjectModel().resolveProperty(_global_headernavmodel, "cards");
    {
        long var_size8 = ((var_collectionvar7_list_coerced$ == null ? (var_collectionvar7_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar7)) : var_collectionvar7_list_coerced$).size());
        {
            boolean var_notempty9 = (var_size8 > 0);
            if (var_notempty9) {
                {
                    long var_end12 = var_size8;
                    {
                        boolean var_validstartstepend13 = (((0 < var_size8) && true) && (var_end12 > 0));
                        if (var_validstartstepend13) {
                            if (var_collectionvar7_list_coerced$ == null) {
                                var_collectionvar7_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar7);
                            }
                            long var_index14 = 0;
                            for (Object item : var_collectionvar7_list_coerced$) {
                                {
                                    boolean var_traversal16 = (((var_index14 >= 0) && (var_index14 <= var_end12)) && true);
                                    if (var_traversal16) {
                                        out.write("\n                        <a");
                                        {
                                            Object var_attrvalue17 = renderContext.getObjectModel().resolveProperty(item, "url");
                                            {
                                                Object var_attrcontent18 = renderContext.call("xss", var_attrvalue17, "uri");
                                                {
                                                    boolean var_shoulddisplayattr20 = (((null != var_attrcontent18) && (!"".equals(var_attrcontent18))) && ((!"".equals(var_attrvalue17)) && (!((Object)false).equals(var_attrvalue17))));
                                                    if (var_shoulddisplayattr20) {
                                                        out.write(" href");
                                                        {
                                                            boolean var_istrueattr19 = (var_attrvalue17.equals(true));
                                                            if (!var_istrueattr19) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent18));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(" class=\"nav-item nav-link\">");
                                        {
                                            Object var_21 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "linktitle"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_21));
                                        }
                                        out.write("</a>\n                    ");
                                    }
                                }
                                var_index14++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar7_list_coerced$ = null;
}
out.write("                                                      \n                        </div>\n                        <a");
{
    Object var_attrvalue22 = renderContext.getObjectModel().resolveProperty(_global_headernavmodel, "buttonurl");
    {
        Object var_attrcontent23 = renderContext.call("xss", var_attrvalue22, "uri");
        {
            boolean var_shoulddisplayattr25 = (((null != var_attrcontent23) && (!"".equals(var_attrcontent23))) && ((!"".equals(var_attrvalue22)) && (!((Object)false).equals(var_attrvalue22))));
            if (var_shoulddisplayattr25) {
                out.write(" href");
                {
                    boolean var_istrueattr24 = (var_attrvalue22.equals(true));
                    if (!var_istrueattr24) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent23));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" class=\"btn btn-primary py-md-3 px-md-5 d-none d-lg-block\">");
{
    Object var_26 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_headernavmodel, "buttontext"), "text");
    out.write(renderContext.getObjectModel().toString(var_26));
}
out.write("</a>\n                    </div>\n                </nav>\n            </div>\n        </div>\n    </div>\n    \n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


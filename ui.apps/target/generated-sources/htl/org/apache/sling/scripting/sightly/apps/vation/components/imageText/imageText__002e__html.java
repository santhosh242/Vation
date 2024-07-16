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
package org.apache.sling.scripting.sightly.apps.vation.components.imageText;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class imageText__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_wcmmode = bindings.get("wcmmode");
Object _dynamic_properties = bindings.get("properties");
Object _dynamic_resource = bindings.get("resource");
Collection var_collectionvar26_list_coerced$ = null;
Collection var_collectionvar37_list_coerced$ = null;
{
    Object var_testvariable0 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit")) ? renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit") : renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "design")));
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<div class=\"cq-placeholder\" data-emptytext=\"Browse Image Text\"></div>");
    }
}
out.write("\n<section");
{
    String var_attrcontent1 = ((((("section--text-image-1 " + renderContext.getObjectModel().toString(renderContext.call("xss", ((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "varientType"), "varientDark")) ? "variant-dark" : "variant-light"), "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", ((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "imagePosition"), "imagerightlayout")) ? "image-right" : "image-left"), "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", ((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "isMultiGridColumn"), "true")) ? "grid-enabled" : ""), "attribute")));
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent1));
    out.write("\"");
}
out.write(">\n\t<div class=\"wrapper\">\n\t\t<div class=\"main-area\">\n\t\t\t<div class=\"content\">\n\t\t\t\t");
{
    Object var_testvariable2 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title");
    if (renderContext.getObjectModel().toBoolean(var_testvariable2)) {
        out.write("\n\t\t\t\t\t<h2 class=\"title\">");
        {
            String var_3 = (("\n\t\t\t\t\t\t" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "html"))) + "\n\t\t\t\t\t");
            out.write(renderContext.getObjectModel().toString(var_3));
        }
        out.write("</h2>\n\t\t\t\t");
    }
}
out.write("\n\n\t\t\t\t<div class=\"content-offset\">\n\t\t\t\t\t\t<div class=\"rich-text\">\n\t\t\t\t\t\t\t");
{
    Object var_testvariable4 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "description");
    if (renderContext.getObjectModel().toBoolean(var_testvariable4)) {
        {
            Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "description"), "html");
            out.write(renderContext.getObjectModel().toString(var_5));
        }
    }
}
out.write("\n\t\t\t\t\t\t\t");
{
    Object var_testvariable6 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "linktitle");
    if (renderContext.getObjectModel().toBoolean(var_testvariable6)) {
        out.write("\n\t\t\t\t\t\t\t<a");
        {
            Object var_attrvalue7 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "link");
            {
                Object var_attrcontent8 = renderContext.call("xss", var_attrvalue7, "uri");
                {
                    boolean var_shoulddisplayattr10 = (((null != var_attrcontent8) && (!"".equals(var_attrcontent8))) && ((!"".equals(var_attrvalue7)) && (!((Object)false).equals(var_attrvalue7))));
                    if (var_shoulddisplayattr10) {
                        out.write(" href");
                        {
                            boolean var_istrueattr9 = (var_attrvalue7.equals(true));
                            if (!var_istrueattr9) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent8));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            String var_attrcontent11 = ("btn " + renderContext.getObjectModel().toString(renderContext.call("xss", ((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "varientType"), "varientDark")) ? "variant-2" : "variant-2-dark"), "attribute")));
            out.write(" class=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent11));
            out.write("\"");
        }
        out.write(">");
        {
            Object var_12 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "linktitle"), "html");
            out.write(renderContext.getObjectModel().toString(var_12));
        }
        out.write("<svg width=\"9\" height=\"auto\" viewbox=\"0 0 9 8\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\">\n\t\t\t\t\t\t\t\t<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M6.99136 1.09085H2.19674V0.5H8.00673V6.31H7.41589V1.50191L1.41779 7.5L1 7.08221L6.99136 1.09085Z\" fill=\"currentColor\"></path>\n\t\t\t\t\t\t\t\t<path d=\"M6.99136 1.09085L7.16814 1.26762L7.59491 0.840847H6.99136V1.09085ZM2.19674 1.09085H1.94674V1.34085H2.19674V1.09085ZM2.19674 0.5V0.25H1.94674V0.5H2.19674ZM8.00673 0.5H8.25673V0.25H8.00673V0.5ZM8.00673 6.31V6.56H8.25673V6.31H8.00673ZM7.41589 6.31H7.16589V6.56H7.41589V6.31ZM7.41589 1.50191H7.66589V0.898353L7.23911 1.32513L7.41589 1.50191ZM1.41779 7.5L1.24102 7.67678L1.41779 7.85355L1.59457 7.67678L1.41779 7.5ZM1 7.08221L0.823223 6.90543L0.646447 7.08221L0.823223 7.25898L1 7.08221ZM6.99136 0.840847H2.19674V1.34085H6.99136V0.840847ZM2.44674 1.09085V0.5H1.94674V1.09085H2.44674ZM2.19674 0.75H8.00673V0.25H2.19674V0.75ZM7.75673 0.5V6.31H8.25673V0.5H7.75673ZM8.00673 6.06H7.41589V6.56H8.00673V6.06ZM7.66589 6.31V1.50191H7.16589V6.31H7.66589ZM7.23911 1.32513L1.24102 7.32322L1.59457 7.67678L7.59266 1.67868L7.23911 1.32513ZM1.59457 7.32322L1.17678 6.90543L0.823223 7.25898L1.24102 7.67678L1.59457 7.32322ZM1.17678 7.25898L7.16814 1.26762L6.81458 0.91407L0.823223 6.90543L1.17678 7.25898Z\" fill=\"currentColor\"></path></svg>\n\t\t\t\t\t\t\t</a>\n\t\t\t\t\t\t\t");
    }
}
out.write("\n\t\t\t\t\t\t</div>\n\n\t\t\t\t\t\t");
{
    Object var_testvariable13 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "gridTitle");
    if (renderContext.getObjectModel().toBoolean(var_testvariable13)) {
        out.write("\n\t\t\t\t\t\t\t<div class=\"grid-col\">\n\t\t\t\t\t\t\t\t<h3 class=\"grid-col-title\">");
        {
            String var_14 = (("\n\t\t\t\t\t\t\t\t\t" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "gridTitle"), "text"))) + "\n\t\t\t\t\t\t\t\t");
            out.write(renderContext.getObjectModel().toString(var_14));
        }
        out.write("</h3>\n\t\t\t\t\t\t\t\t<div class=\"grid-col-text\">");
        {
            String var_15 = (("\n\t\t\t\t\t\t\t\t\t" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "gridText"), "text"))) + "\n\t\t\t\t\t\t\t\t");
            out.write(renderContext.getObjectModel().toString(var_15));
        }
        out.write("</div>\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t");
    }
}
out.write("\n\t\t\t\t</div>\n\t\t\t</div>\n\t\t\t");
{
    Object var_testvariable16 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "fileReferenceImage");
    if (renderContext.getObjectModel().toBoolean(var_testvariable16)) {
        out.write("\n\t\t\t\t<div class=\"image\">\n\t\t\t\t\t<img");
        {
            Object var_attrvalue17 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "fileReferenceImage");
            {
                Object var_attrcontent18 = renderContext.call("xss", var_attrvalue17, "uri");
                {
                    boolean var_shoulddisplayattr20 = (((null != var_attrcontent18) && (!"".equals(var_attrcontent18))) && ((!"".equals(var_attrvalue17)) && (!((Object)false).equals(var_attrvalue17))));
                    if (var_shoulddisplayattr20) {
                        out.write(" src");
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
        {
            Object var_attrvalue21 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "imagealttext");
            {
                Object var_attrcontent22 = renderContext.call("xss", var_attrvalue21, "attribute");
                {
                    boolean var_shoulddisplayattr24 = (((null != var_attrcontent22) && (!"".equals(var_attrcontent22))) && ((!"".equals(var_attrvalue21)) && (!((Object)false).equals(var_attrvalue21))));
                    if (var_shoulddisplayattr24) {
                        out.write(" alt");
                        {
                            boolean var_istrueattr23 = (var_attrvalue21.equals(true));
                            if (!var_istrueattr23) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent22));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write("/>\n\t\t\t\t</div>\n\t\t\t");
    }
}
out.write("\n\n\t\t</div>\n\t\t");
{
    Object var_testvariable25 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "isMultiGridColumn");
    if (renderContext.getObjectModel().toBoolean(var_testvariable25)) {
        out.write("\n\t\t\t<div class=\"bottom-area\">\n\t\t\t\t");
        {
            Object var_collectionvar26 = renderContext.getObjectModel().resolveProperty(_dynamic_resource, "getChildren");
            {
                long var_size27 = ((var_collectionvar26_list_coerced$ == null ? (var_collectionvar26_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar26)) : var_collectionvar26_list_coerced$).size());
                {
                    boolean var_notempty28 = (var_size27 > 0);
                    if (var_notempty28) {
                        {
                            long var_end31 = var_size27;
                            {
                                boolean var_validstartstepend32 = (((0 < var_size27) && true) && (var_end31 > 0));
                                if (var_validstartstepend32) {
                                    if (var_collectionvar26_list_coerced$ == null) {
                                        var_collectionvar26_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar26);
                                    }
                                    long var_index33 = 0;
                                    for (Object multifield : var_collectionvar26_list_coerced$) {
                                        {
                                            boolean var_traversal35 = (((var_index33 >= 0) && (var_index33 <= var_end31)) && true);
                                            if (var_traversal35) {
                                                out.write("\n\t\t\t\t\t");
                                                {
                                                    boolean var_testvariable36 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(multifield, "name"), "cards"));
                                                    if (var_testvariable36) {
                                                        out.write("\n\t\t\t\t\t\t");
                                                        {
                                                            Object var_collectionvar37 = renderContext.getObjectModel().resolveProperty(multifield, "getChildren");
                                                            {
                                                                long var_size38 = ((var_collectionvar37_list_coerced$ == null ? (var_collectionvar37_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar37)) : var_collectionvar37_list_coerced$).size());
                                                                {
                                                                    boolean var_notempty39 = (var_size38 > 0);
                                                                    if (var_notempty39) {
                                                                        {
                                                                            long var_end42 = var_size38;
                                                                            {
                                                                                boolean var_validstartstepend43 = (((0 < var_size38) && true) && (var_end42 > 0));
                                                                                if (var_validstartstepend43) {
                                                                                    if (var_collectionvar37_list_coerced$ == null) {
                                                                                        var_collectionvar37_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar37);
                                                                                    }
                                                                                    long var_index44 = 0;
                                                                                    for (Object carditem : var_collectionvar37_list_coerced$) {
                                                                                        {
                                                                                            boolean var_traversal46 = (((var_index44 >= 0) && (var_index44 <= var_end42)) && true);
                                                                                            if (var_traversal46) {
                                                                                                out.write("\n\t\t\t\t\t\t\t<div class=\"grid-col\">\n\t\t\t\t\t\t\t\t");
                                                                                                {
                                                                                                    Object var_testvariable47 = renderContext.getObjectModel().resolveProperty(carditem, "multiGridTitle");
                                                                                                    if (renderContext.getObjectModel().toBoolean(var_testvariable47)) {
                                                                                                        out.write("\n\t\t\t\t\t\t\t\t\t<h3 class=\"grid-col-title\">");
                                                                                                        {
                                                                                                            String var_48 = (("\n\t\t\t\t\t\t\t\t\t\t" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(carditem, "multiGridTitle"), "text"))) + "\n\t\t\t\t\t\t\t\t\t");
                                                                                                            out.write(renderContext.getObjectModel().toString(var_48));
                                                                                                        }
                                                                                                        out.write("</h3>\n\t\t\t\t\t\t\t\t");
                                                                                                    }
                                                                                                }
                                                                                                out.write("\n\t\t\t\t\t\t\t\t");
                                                                                                {
                                                                                                    Object var_testvariable49 = renderContext.getObjectModel().resolveProperty(carditem, "multiGridText");
                                                                                                    if (renderContext.getObjectModel().toBoolean(var_testvariable49)) {
                                                                                                        out.write("\n\t\t\t\t\t\t\t\t\t<div class=\"grid-col-text\">");
                                                                                                        {
                                                                                                            String var_50 = (("\n\t\t\t\t\t\t\t\t\t\t" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(carditem, "multiGridText"), "html"))) + "\n\t\t\t\t\t\t\t\t\t");
                                                                                                            out.write(renderContext.getObjectModel().toString(var_50));
                                                                                                        }
                                                                                                        out.write("</div>\n\t\t\t\t\t\t\t\t");
                                                                                                    }
                                                                                                }
                                                                                                out.write("\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t<span class=\"divider\"></span>\n\t\t\t\t\t\t");
                                                                                            }
                                                                                        }
                                                                                        var_index44++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            var_collectionvar37_list_coerced$ = null;
                                                        }
                                                        out.write("\n\t\t\t\t\t");
                                                    }
                                                }
                                                out.write("\n\t\t\t\t");
                                            }
                                        }
                                        var_index33++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var_collectionvar26_list_coerced$ = null;
        }
        out.write("\n\t\t\t</div>\n\t\t");
    }
}
out.write("\n\t</div>\n</section>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


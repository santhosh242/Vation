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
package org.apache.sling.scripting.sightly.apps.vation.components.imagecard;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class imagecard__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
Object _dynamic_resource = bindings.get("resource");
Collection var_collectionvar2_list_coerced$ = null;
Collection var_collectionvar13_list_coerced$ = null;
out.write("<h2>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "mtitle"), "html");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h2>\n<p>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "mdescription"), "html");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\n\n");
{
    Object var_collectionvar2 = renderContext.getObjectModel().resolveProperty(_dynamic_resource, "getChildren");
    {
        long var_size3 = ((var_collectionvar2_list_coerced$ == null ? (var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2)) : var_collectionvar2_list_coerced$).size());
        {
            boolean var_notempty4 = (var_size3 > 0);
            if (var_notempty4) {
                {
                    long var_end7 = var_size3;
                    {
                        boolean var_validstartstepend8 = (((0 < var_size3) && true) && (var_end7 > 0));
                        if (var_validstartstepend8) {
                            if (var_collectionvar2_list_coerced$ == null) {
                                var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2);
                            }
                            long var_index9 = 0;
                            for (Object multifield : var_collectionvar2_list_coerced$) {
                                {
                                    boolean var_traversal11 = (((var_index9 >= 0) && (var_index9 <= var_end7)) && true);
                                    if (var_traversal11) {
                                        out.write("\n    ");
                                        {
                                            boolean var_testvariable12 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(multifield, "name"), "cards"));
                                            if (var_testvariable12) {
                                                out.write("\n        ");
                                                {
                                                    Object var_collectionvar13 = renderContext.getObjectModel().resolveProperty(multifield, "listChildren");
                                                    {
                                                        long var_size14 = ((var_collectionvar13_list_coerced$ == null ? (var_collectionvar13_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar13)) : var_collectionvar13_list_coerced$).size());
                                                        {
                                                            boolean var_notempty15 = (var_size14 > 0);
                                                            if (var_notempty15) {
                                                                {
                                                                    long var_end18 = var_size14;
                                                                    {
                                                                        boolean var_validstartstepend19 = (((0 < var_size14) && true) && (var_end18 > 0));
                                                                        if (var_validstartstepend19) {
                                                                            if (var_collectionvar13_list_coerced$ == null) {
                                                                                var_collectionvar13_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar13);
                                                                            }
                                                                            long var_index20 = 0;
                                                                            for (Object carditem : var_collectionvar13_list_coerced$) {
                                                                                {
                                                                                    boolean var_traversal22 = (((var_index20 >= 0) && (var_index20 <= var_end18)) && true);
                                                                                    if (var_traversal22) {
                                                                                        out.write("\n            <div class=\"card\">\n                <a");
                                                                                        {
                                                                                            Object var_attrvalue23 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(carditem, "properties"), "link");
                                                                                            {
                                                                                                Object var_attrcontent24 = renderContext.call("xss", var_attrvalue23, "uri");
                                                                                                {
                                                                                                    boolean var_shoulddisplayattr26 = (((null != var_attrcontent24) && (!"".equals(var_attrcontent24))) && ((!"".equals(var_attrvalue23)) && (!((Object)false).equals(var_attrvalue23))));
                                                                                                    if (var_shoulddisplayattr26) {
                                                                                                        out.write(" href");
                                                                                                        {
                                                                                                            boolean var_istrueattr25 = (var_attrvalue23.equals(true));
                                                                                                            if (!var_istrueattr25) {
                                                                                                                out.write("=\"");
                                                                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent24));
                                                                                                                out.write("\"");
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        out.write(" class=\"btn\">");
                                                                                        {
                                                                                            String var_27 = (("\n                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(carditem, "properties"), "linktitle"), "html"))) + "\n                ");
                                                                                            out.write(renderContext.getObjectModel().toString(var_27));
                                                                                        }
                                                                                        out.write("</a>\n                ");
                                                                                        {
                                                                                            Object var_testvariable28 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(carditem, "properties"), "fileReferenceImage");
                                                                                            if (renderContext.getObjectModel().toBoolean(var_testvariable28)) {
                                                                                                out.write("\n                    <img");
                                                                                                {
                                                                                                    Object var_attrvalue29 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(carditem, "properties"), "fileReferenceImage");
                                                                                                    {
                                                                                                        Object var_attrcontent30 = renderContext.call("xss", var_attrvalue29, "uri");
                                                                                                        {
                                                                                                            boolean var_shoulddisplayattr32 = (((null != var_attrcontent30) && (!"".equals(var_attrcontent30))) && ((!"".equals(var_attrvalue29)) && (!((Object)false).equals(var_attrvalue29))));
                                                                                                            if (var_shoulddisplayattr32) {
                                                                                                                out.write(" src");
                                                                                                                {
                                                                                                                    boolean var_istrueattr31 = (var_attrvalue29.equals(true));
                                                                                                                    if (!var_istrueattr31) {
                                                                                                                        out.write("=\"");
                                                                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent30));
                                                                                                                        out.write("\"");
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                {
                                                                                                    Object var_attrvalue33 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(carditem, "properties"), "imagealttext");
                                                                                                    {
                                                                                                        Object var_attrcontent34 = renderContext.call("xss", var_attrvalue33, "attribute");
                                                                                                        {
                                                                                                            boolean var_shoulddisplayattr36 = (((null != var_attrcontent34) && (!"".equals(var_attrcontent34))) && ((!"".equals(var_attrvalue33)) && (!((Object)false).equals(var_attrvalue33))));
                                                                                                            if (var_shoulddisplayattr36) {
                                                                                                                out.write(" alt");
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
                                                                                                out.write("/>\n                ");
                                                                                            }
                                                                                        }
                                                                                        out.write("\n                <h2>");
                                                                                        {
                                                                                            Object var_37 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(carditem, "properties"), "title"), "html");
                                                                                            out.write(renderContext.getObjectModel().toString(var_37));
                                                                                        }
                                                                                        out.write("</h2>\n                <p>");
                                                                                        {
                                                                                            Object var_38 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(carditem, "properties"), "description"), "html");
                                                                                            out.write(renderContext.getObjectModel().toString(var_38));
                                                                                        }
                                                                                        out.write("</p>\n            </div>\n        ");
                                                                                    }
                                                                                }
                                                                                var_index20++;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    var_collectionvar13_list_coerced$ = null;
                                                }
                                                out.write("\n    ");
                                            }
                                        }
                                        out.write("\n");
                                    }
                                }
                                var_index9++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar2_list_coerced$ = null;
}
out.write("\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


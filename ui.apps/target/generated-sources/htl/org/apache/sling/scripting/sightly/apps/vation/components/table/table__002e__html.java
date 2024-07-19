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
package org.apache.sling.scripting.sightly.apps.vation.components.table;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class table__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_formdata = null;
Object _global_contactformmodel = null;
Collection var_collectionvar4_list_coerced$ = null;
out.write("<style>\n  table {\n    border-collapse: collapse;\n    width: 100%;\n  }\n\n  th,\n  td {\n    border: 1px solid black;\n    padding: 8px;\n    text-align: left;\n  }\n\n  th {\n    background-color: #f2f2f2;\n  }\n</style>\n");
_global_formdata = renderContext.call("use", com.vation.core.models.TableModel.class.getName(), obj());
out.write("<div>\n  ");
_global_contactformmodel = renderContext.call("use", com.vation.core.models.ContactFormModel.class.getName(), obj());
out.write("<div>\n    <table id=\"dataTable\">\n      <thead>\n        <tr>\n          <th>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_contactformmodel, "name"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</th>\n          <th>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_contactformmodel, "email"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</th>\n          <th>");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_contactformmodel, "subject"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</th>\n          <th>");
{
    Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_contactformmodel, "message"), "text");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</th>\n          <th>Edit</th>\n          <th>Delete</th>\n        </tr>\n      </thead>\n      <tbody>\n        ");
{
    Object var_collectionvar4 = renderContext.getObjectModel().resolveProperty(_global_formdata, "formDataNodes");
    {
        long var_size5 = ((var_collectionvar4_list_coerced$ == null ? (var_collectionvar4_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar4)) : var_collectionvar4_list_coerced$).size());
        {
            boolean var_notempty6 = (var_size5 > 0);
            if (var_notempty6) {
                {
                    long var_end9 = var_size5;
                    {
                        boolean var_validstartstepend10 = (((0 < var_size5) && true) && (var_end9 > 0));
                        if (var_validstartstepend10) {
                            if (var_collectionvar4_list_coerced$ == null) {
                                var_collectionvar4_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar4);
                            }
                            long var_index11 = 0;
                            for (Object item : var_collectionvar4_list_coerced$) {
                                {
                                    boolean var_traversal13 = (((var_index11 >= 0) && (var_index11 <= var_end9)) && true);
                                    if (var_traversal13) {
                                        out.write("\n          <tr class=\"table-data\">\n            <td>");
                                        {
                                            Object var_14 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "name"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_14));
                                        }
                                        out.write("</td>\n            <td>");
                                        {
                                            Object var_15 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "email"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_15));
                                        }
                                        out.write("</td>\n            <td>");
                                        {
                                            Object var_16 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "subject"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_16));
                                        }
                                        out.write("</td>\n            <td>");
                                        {
                                            Object var_17 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "message"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_17));
                                        }
                                        out.write("</td>\n            <td>\n              <a href=\"#\" class=\"edit-link\">Edit</a>\n            </td>\n            <td>\n              <a href=\"#\" class=\"delete-link\">Delete</a>\n            </td>\n          </tr>\n        ");
                                    }
                                }
                                var_index11++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar4_list_coerced$ = null;
}
out.write("\n      </tbody>\n    </table>\n  </div>\n</div>\n\n<script>\n  document.addEventListener('DOMContentLoaded', function () {\n    const table = document.getElementById('dataTable');\n    const form = document.getElementById('contactForm');\n\n    table.addEventListener('click', function (event) {\n      if (event.target.classList.contains('edit-link')) {\n        event.preventDefault();\n        const tableRow = event.target.closest('tr');\n        const tableData = tableRow.querySelectorAll('td');\n        const cellValues = Array.from(tableData).slice(0, 4).map(td => td.innerHTML.trim());\n        form.elements['name'].value = cellValues[0] || '';\n        form.elements['email'].value = cellValues[1] || '';\n        form.elements['subject'].value = cellValues[2] || '';\n        form.elements['message'].value = cellValues[3] || '';\n      } else if (event.target.classList.contains('delete-link')) {\n        event.preventDefault();\n        const tableRow = event.target.closest('tr');\n        const dataToDelete = tableRow.querySelector('td:first-child').innerText.trim();\n        const deleteData = new FormData();\n        deleteData.append('data', dataToDelete);\n        $.ajax({\n          type: 'POST',\n          url: '/bin/example/delete', \n          data: deleteData,\n          processData: false, \n          contentType: false, \n          success: function (response) {\n            $('#responseMessage').html('<p>' + response + '</p>');\n              window.location.reload();\n          },\n          error: function (xhr, status, error) {\n            $('#responseMessage').html('<p>Error: ' + error + '</p>');\n          }\n        });\n      }\n    });\n  });\n</script>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


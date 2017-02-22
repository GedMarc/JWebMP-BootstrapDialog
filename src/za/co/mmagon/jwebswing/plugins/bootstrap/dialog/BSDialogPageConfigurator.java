/*
 * The MIT License
 *
 * Copyright 2017 GedMarc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package za.co.mmagon.jwebswing.plugins.bootstrap.dialog;

import java.util.logging.Logger;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.logger.LogFactory;

/**
 *
 * @author GedMarc
 * @since 19 Feb 2017
 *
 */
@PluginInformation(pluginName = "Bootstrap Dialog", pluginUniqueName = "bootstrap-dialog", pluginDescription = "The Bootstrap Dialog widget for Bootstrap", pluginVersion = "Bootstrap version 3 or 4",
        pluginDependancyUniqueIDs = "jquery,bootstrap", pluginCategories = "bootstrap,web ui,ui,framework", pluginSubtitle = "Make use of Bootstrap's modal more monkey-friendly.",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwing-BootstrapDialog", pluginSourceUrl = "https://github.com/EugenMayer/bootstrap-dialog",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapDialog/wiki")
public class BSDialogPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;
    private static final Logger log = LogFactory.getInstance().getLogger("BootstrapDialog");

    public BSDialogPageConfigurator()
    {
        super();
        setSortOrder(150);
    }

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {
            log.fine("Configuring Bootstrap Dialog");
            if (za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator.isBootstrap4())
            {
                page.getBody().getJavascriptReferences().add(BSDialogReferencePool.Bootstrap4DialogReference.getJavaScriptReference());
                page.getBody().getCssReferences().add(BSDialogReferencePool.Bootstrap4DialogReference.getCssReference());

                page.getBody().getJavascriptReferences().remove(BSDialogReferencePool.BootstrapDialogReference.getJavaScriptReference());
                page.getBody().getCssReferences().remove(BSDialogReferencePool.BootstrapDialogReference.getCssReference());
            }
            else
            {
                page.getBody().getJavascriptReferences().add(BSDialogReferencePool.BootstrapDialogReference.getJavaScriptReference());
                page.getBody().getCssReferences().add(BSDialogReferencePool.BootstrapDialogReference.getCssReference());
            }
            log.fine("Finished with Bootstrap Dialog");
        }

        return page;
    }
}

/* 
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.bootstrap.dialog;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * An implementation of the Bootstrap Dialog project.
 * <p>
 * @author Marc Magon
 * @param <J>
 *
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "Bootstrap Dialog Component", description = "A JWebSwing Component for Bootstrap to display dialog message boxes in an easier fashion",
        url = "https://github.com/EugenMayer/bootstrap-dialog", wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapDialog/wiki")
public class BSDialog<J extends BSDialog> extends Div<BSDialogChildren, BSDialogAttributes, BSDialogFeatures, BSDialogEvents, J>
{

    private static final long serialVersionUID = 1L;
    private BSDialogFeature feature;

    /**
     * Constructs a new instance of the Bootstrap Dialog Plugin
     */
    public BSDialog()
    {
        addFeature(getFeature());
    }

    /**
     * Returns the JQuery Feature for this component
     *
     * @return
     */
    public final BSDialogFeature getFeature()
    {
        if (feature == null)
        {
            feature = new BSDialogFeature(this);
        }
        return feature;
    }

    /**
     * Sets the options on this component
     *
     * @return
     */
    @Override
    public BSDialogOptions getOptions()
    {
        return getFeature().getOptions();
    }

    /**
     * Shortcut reference to the title in get Options
     *
     * @param title
     *
     * @return
     */
    public J setTitle(Component title)
    {
        getOptions().setTitle(title);
        return (J) this;
    }

    /**
     * Sets the message of this dialog
     *
     * @param message
     *
     * @return
     */
    public J setMessage(Component message)
    {
        getOptions().setMessage(message);
        return (J) this;
    }

}

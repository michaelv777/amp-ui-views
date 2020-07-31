/**
 * 
 */
package com.managed.ui.renderers;

import org.primefaces.component.selectonelistbox.SelectOneListbox;
import org.primefaces.component.selectonelistbox.SelectOneListboxRenderer;

/**
 * @author MVEKSLER
 *
 */
public class SelectOneListboxRendererCustom extends SelectOneListboxRenderer
{
	@Override
	protected String calculateWrapperHeight(SelectOneListbox listbox, int itemSize)
	{
	 	
	        int height = listbox.getScrollHeight();

	        if(height != Integer.MAX_VALUE) 
	        {
	            return height + "px";
	        } 
	        else 
	        {
	           return "auto";
	        }
	    }
}

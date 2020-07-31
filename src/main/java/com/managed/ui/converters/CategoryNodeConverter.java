package com.managed.ui.converters;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import com.amp.jpaentities.mo.CategoryMO;
import com.amp.jpaentities.mo.NodeMO;
import com.managed.ui.amazon.AmazonDataBean;
 

@FacesConverter("categoryNodeConverter")
public class CategoryNodeConverter implements Converter<Object>
{
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) 
	{
        if( value != null && value.trim().length() > 0 ) 
        {
            try 
            {
            	Map<String, Object> viewMap = FacesContext.getCurrentInstance().getViewRoot().getViewMap();
            	AmazonDataBean cAmazonDataBean = (AmazonDataBean) viewMap.get("cAmazonDataBean");
            		
            	/*
            	Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
            	SessionScopedBean sessionScopedBean = (SessionScopedBean) sessionMap.get("sessionScopedBean");
            	*/
            	
            	if ( cAmazonDataBean != null )
            	{
	                CategoryMO cCategory = cAmazonDataBean.getcSelectedCategory();
	                
	                
	                for( NodeMO cNode : cCategory.getcCategoryNodes() )
	                {
	                	if ( cNode.getBrowsenodeid().equals(value) )
	                	{
	                		return cNode;
	                	}
	                }
            	}
                return null;
            } 
            catch(NumberFormatException e) 
            {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                		"Conversion Error", "Not a valid Category Node."));
            }
        }
        else 
        {
            return null;
        }
    }
 
    public String getAsString(FacesContext fc, UIComponent uic, Object object) 
    {
        if(object != null) 
        {
            return String.valueOf(((NodeMO) object).getBrowsenodeid());
        }
        else 
        {
            return null;
        }
    }
}

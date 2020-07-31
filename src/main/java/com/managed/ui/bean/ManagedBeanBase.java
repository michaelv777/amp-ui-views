/**
 * 
 */
package com.managed.ui.bean;

import java.util.HashMap;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import com.managed.ui.extensions.CommonTypes.NodeLevel;

/**
 * @author MVEKSLER
 *
 */
public class ManagedBeanBase 
{
	protected boolean lcRes = true;
	
	//---class variables-------------------------------------------
	protected HashMap<String, String> cResources = null;

	protected String cSourceName = "";
	
	protected NodeLevel cNodeLevel = NodeLevel.NONE;
	//---getters/setters-------------------------------------------
	/**
	 * @return the cResources
	 */
	public HashMap<String, String> getcResources() {
		return cResources;
	}

	public NodeLevel getcNodeLevel() {
		return cNodeLevel;
	}

	public void setcNodeLevel(NodeLevel cNodeLevel) {
		this.cNodeLevel = cNodeLevel;
	}

	public String getcSourceName() {
		return cSourceName;
	}

	public void setcSourceName(String cSourceName) {
		this.cSourceName = cSourceName;
	}

	/**
	 * @param cResources the cResources to set
	 */
	public void setcResources(HashMap<String, String> cResources) {
		this.cResources = cResources;
	}

	/**
	 * @return the lcRes
	 */
	public boolean isLcRes() {
		return lcRes;
	}

	/**
	 * @param lcRes the lcRes to set
	 */
	public void setLcRes(boolean lcRes) {
		this.lcRes = lcRes;
	}
	/**
	 * 
	 */
	//---class methods--
	public ManagedBeanBase() 
	{
		try
		{
			this.init();
		}
		catch( Exception e)
		{
			
		}
	}
	
	private void init()  
	{
    	try
    	{
    		this.cResources = new HashMap<String, String>();
    	}
    	catch( Exception e )
    	{
    		FacesMessage msg = new FacesMessage(
  	        		FacesMessage.SEVERITY_ERROR, "init", 
  	        		e.getMessage());
  				
			FacesContext.getCurrentInstance().addMessage("loadResources", msg);
    	}
	}
	//---
	
	//---
	protected void addMessage(String mType, String summary, String detail) {
		FacesMessage message = null;
	
		if (mType != null) {
			if (mType.equalsIgnoreCase("INFO")) {
				message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
			} else if (mType.equalsIgnoreCase("ERROR")) {
				message = new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, detail);
			} else {
				message = new FacesMessage(FacesMessage.SEVERITY_WARN, summary, detail);
			}
		}
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
}

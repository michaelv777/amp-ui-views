/**
 * 
 */
package com.managed.ui.model.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MVEKSLER
 *
 */
public class TreeNodeObjectBase implements ITreeNodeObject
{
	//---class variables-------------------------------------------
	protected Map<String, Object> cObjectProperties = null;
	
	protected boolean lcRes = true;
	
	//---getters/setters-------------------------------------------
	
	
	//------------------------------------------------------------
	/**
	 * 
	 */
	public TreeNodeObjectBase() 
	{
		try
		{
			this.initClassVariables();
		}
		catch(Exception e) {}
	}
	//------------------------------------------------------------
	/**
	 * 
	 */
	private boolean initClassVariables() 
	{
		boolean cRes = true;
    	
    	try
    	{
    		this.cObjectProperties = new HashMap<String, Object>();
    		
    		return cRes;
    	}
    	catch( Exception e )
    	{
    		return ( cRes = false );
    	}
		
	}
	//------------------------------------------------------------
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
	//------------------------------------------------------------
	/* (non-Javadoc)
	 * @see com.managed.bean.controls.data.ITreeNodeObject#getTreeNodeObjectData(java.lang.String)
	 */
	@Override
	public Object getTreeNodeObjectData(String cObjectType) 
	{
		boolean cRes = true;
    	
    	try
    	{
    		//-----------------------------------------
    		if ( null == cObjectType )
        	{
        		this.setLcRes(cRes = false);
        	}
    		
    		//-----------------------------------------
    		if ( cRes )
    		{
    			return this.cObjectProperties.get(cObjectType);
    		}
    		//-----------------------------------------
    		
    		return cRes;
    	}
    	catch( Exception e )
    	{
    		return ( cRes = false );
    	}
	}
	//------------------------------------------------------------
	/* (non-Javadoc)
	 * @see com.managed.bean.controls.data.ITreeNodeObject#setTreeNodeObjectData(java.lang.String)
	 */
	@Override
	public boolean setTreeNodeObjectData(String cObjectType, Object cObject) 
	{
		boolean cRes = true;
    	
    	try
    	{
    		//-----------------------------------------
    		if ( (null == cObjectType) || (null == cObject))
        	{
        		this.setLcRes(cRes = false);
        	}
    		
    		//-----------------------------------------
    		if ( cRes )
    		{
    			this.cObjectProperties.put(cObjectType, cObject);
    		}
    		//-----------------------------------------
    		
    		return cRes;
    	}
    	catch( Exception e )
    	{
    		return ( cRes = false );
    	}
	}

}

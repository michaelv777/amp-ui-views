/**
 * 
 */
package com.managed.ui.model.tree;


/**
 * @author MVEKSLER
 *
 */
public class TreeNodeObject extends TreeNodeObjectBase
{
	//---class variables-------------------------------------------
	
	
	//---getters/setters-------------------------------------------
	
	
	//------------------------------------------------------------
	/**
	 * 
	 */
	public TreeNodeObject(String cObjectType, Object cObject)
	{
		super();
		
		try
		{
			this.setTreeNodeObjectData(cObjectType, cObject);
		}
		catch( Exception e){}
		// TODO Auto-generated constructor stub
	}
	//------------------------------------------------------------

}

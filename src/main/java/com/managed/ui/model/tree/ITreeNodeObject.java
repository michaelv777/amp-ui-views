/**
 * 
 */
package com.managed.ui.model.tree;

/**
 * @author MVEKSLER
 *
 */
public interface ITreeNodeObject 
{
	public Object getTreeNodeObjectData(String cObjectType);
	
	public boolean setTreeNodeObjectData(String cObjectType, Object cObject);
}

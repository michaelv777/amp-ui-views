/**
 * 
 */
package com.managed.ui.model.tree;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * @author MVEKSLER
 *
 */
public class TreeTableNodeObjectExt implements Serializable, Comparable<TreeTableNodeObjectExt>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//---class variables-------------------------------------------
	protected long level = -1;    
    
	//---for TreeTable---------
	protected String type = "";
	
	protected String item = "";
	
	protected String name = "";
	
	protected String hierarchyLoc = "";
	
	protected Map<Class<?>, Object> cObjectProperties = new HashMap<Class<?>, Object>();
	//---getters/setters-------------------------------------------
	
	
	//------------------------------------------------------------
	/**
	 * 
	 */
	public TreeTableNodeObjectExt(Class<?> cObjectClazz, Object cObject)
	{
		try
		{
			this.cObjectProperties.put(cObjectClazz, cObject);
		}
		catch( Exception e){}
		// TODO Auto-generated constructor stub
	}
	//------------------------------------------------------------
	/**
	 * @return the level
	 */
	public long getLevel() {
		return level;
	}

	/**
	 * @return the cObjectProperties
	 */
	public Map<Class<?>, Object> getcObjectProperties() {
		return cObjectProperties;
	}

	/**
	 * @param cObjectProperties the cObjectProperties to set
	 */
	public void setcObjectProperties(Map<Class<?>, Object> cObjectProperties) {
		this.cObjectProperties = cObjectProperties;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}



	/**
	 * @param level the level to set
	 */
	public void setLevel(long level) {
		this.level = level;
	}



	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}



	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the hierarchyLoc
	 */
	public String getHierarchyLoc() {
		return hierarchyLoc;
	}



	/**
	 * @param hierarchyLoc the hierarchyLoc to set
	 */
	public void setHierarchyLoc(String hierarchyLoc) {
		this.hierarchyLoc = hierarchyLoc;
	}



	/**
	 * @param siteId
	 * @param name
	 * @param value
	 */
	public TreeTableNodeObjectExt(long siteId, String name, String value) {
		super();
		this.level = siteId;
		this.item = name;
		this.name = value;
	}
	

	
	
	/**
	 * @param level
	 * @param item
	 * @param name
	 * @param hierarchyLoc
	 */
	public TreeTableNodeObjectExt(long level, 
								  String item, 
								  String name,
								  String hierarchyLoc) {
		super();
		this.level = level;
		this.item = item;
		this.name = name;
		this.hierarchyLoc = hierarchyLoc;
	}
	
	/**
	 * @param level
	 * @param item
	 * @param name
	 * @param hierarchyLoc
	 */
	public TreeTableNodeObjectExt(long level, 
								  String item, 
								  String name,
								  String type,
								  String hierarchyLoc) {
		super();
		this.level = level;
		this.item = item;
		this.name = name;
		this.type = type;
		this.hierarchyLoc = hierarchyLoc;
	}
	
	/**
	 * @param level
	 * @param item
	 * @param name
	 * @param hierarchyLoc
	 */
	public TreeTableNodeObjectExt(long level, 
								  String item, 
								  String name,
								  String type,
								  String hierarchyLoc,
								  Class<?> cObjectClazz, 
								  Object cObject ) 
	{
		super();
		
		try
		{
			this.level = level;
			this.item = item;
			this.name = name;
			this.type = type;
			this.hierarchyLoc = hierarchyLoc;
			
			if ( this.cObjectProperties != null )
			{
				this.cObjectProperties.put(cObjectClazz, cObject);
			}
		}
		catch( Exception e){}
	}
	
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.name = value;
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(TreeTableNodeObjectExt o) 
	{
		if ( o != null )
		{
		// TODO Auto-generated method stub
			return (this.getName() + this.getItem()).compareTo(o.getName() + o.getItem());
		}
		else return 0;
			
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + (int) (level ^ (level >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof TreeTableNodeObjectExt)) {
			return false;
		}
		TreeTableNodeObjectExt other = (TreeTableNodeObjectExt) obj;
		if (item == null) {
			if (other.item != null) {
				return false;
			}
		} else if (!item.equals(other.item)) {
			return false;
		}
		if (level != other.level) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
    public String toString() 
	{
		try
		{
			return this.level + "#" + this.item + "#" + this.name + "#" + this.hierarchyLoc;
		}
		catch( Exception e)
		{
			return "node#error";
		}
    }
	
}

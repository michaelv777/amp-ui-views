/**
 * 
 */
package com.managed.ui.model.table;

import java.io.Serializable;

/**
 * @author MVEKSLER
 *
 */
public class TableColumnModel implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String header;
    private String property;

    public TableColumnModel(String header, String property) {
        this.header = header;
        this.property = property;
    }

    public String getHeader() {
        return header;
    }

    public String getProperty() {
        return property;
    }
}

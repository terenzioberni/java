package com.tnz.model;

import java.io.Serializable;

/**
 * Fields that should be present in any entity
 * @author terenzio
 *
 */
public interface Entity extends Serializable {

	String getId();
	
	void setId(String id);
}

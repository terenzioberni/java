package com.tnz.model.hibernate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

import com.tnz.model.Entity;

/**
 * Fields that should be present in any entity
 * @author terenzio
 *
 */
@MappedSuperclass
public class EntityImpl implements Entity {

	private String id;
	private Integer version;

	/**
	 * Primary Key
	 */
	@Override
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	// @GeneratedValue(generator = "UUIDGenerator")
	// @GenericGenerator(name = "UUIDGenerator", strategy =
	// "com.tnz.model.hibernate.UUIDGenerator")
	@Column(name = "Id", length = 36)
	public String getId() {
		return id;
	}

	@Override
	public void setId(String uuid) {
		this.id = uuid;
	}

	/**
	 * Optimistic lock version number
	 */
	@Version
	@Column(name = "Version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}

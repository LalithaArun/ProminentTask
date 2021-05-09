package com.prominent.dto;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Lob;

import org.hibernate.annotations.Type;
import org.json.simple.JSONArray;

@Embeddable
public class VersionStatus implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name="version_status")
	private String status;
	
	@Lob
	@Type(type = "JsonType")
	@Column(columnDefinition = "json", name = "version_contains")
	private JSONArray contains;
	
	@Column(name="previous_version")
	private String previous_version;
	
	@Column(name="current_version")
	private String current_version;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public JSONArray getContains() {
		return contains;
	}

	public void setContains(JSONArray contains) {
		this.contains = contains;
	}

	public String getPrevious_version() {
		return previous_version;
	}

	public void setPrevious_version(String previous_version) {
		this.previous_version = previous_version;
	}

	public String getCurrent_version() {
		return current_version;
	}

	public void setCurrent_version(String current_version) {
		this.current_version = current_version;
	}
	
	

}

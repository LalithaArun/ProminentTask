package com.prominent.dto;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Type;
import org.json.simple.JSONArray;

@Embeddable
public class Title implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Type(type = "JsonType")
	@Column(columnDefinition = "json", name = "title_level")
	private JSONArray levels;

	@Column(name="title_name")
	private String name;

	@Column(name="title_role")
	private String role;
	
	private String sub_role;

	public JSONArray getLevels() {
		return levels;
	}

	public void setLevels(JSONArray levels) {
		this.levels = levels;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSub_role() {
		return sub_role;
	}

	public void setSub_role(String sub_role) {
		this.sub_role = sub_role;
	}
	
	

}

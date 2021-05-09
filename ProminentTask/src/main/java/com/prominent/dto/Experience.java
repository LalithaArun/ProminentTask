package com.prominent.dto;

import java.io.Serializable;


import javax.persistence.*;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.json.simple.JSONArray;

import com.vladmihalcea.hibernate.type.json.JsonStringType;




/**
 * The persistent class for the experience database table.
 * 
 */
@Entity
@TypeDef(name = "JsonType", typeClass = JsonStringType.class)
public class Experience implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="expid",nullable=false)
	private int expid;

	@Column(name="end_date")
	private String end_date;

	@Column(name="is_primary")
	private String is_primary;

	@Lob
	@Type(type = "JsonType")
	@Column(columnDefinition = "json", name = "location_names")
	private JSONArray location_names;

	private Company company;
	
	private  Title title;

	@Column(name="start_date")
	private String start_date;

	@Lob
	private String summary;

	//bi-directional many-to-one association to Main1
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="sno",nullable=false)
	private EmployeeMaster main3;

	public Experience() {
	}

	public int getExpid() {
		return this.expid;
	}

	public void setExpid(int expid) {
		this.expid = expid;
	}

	

	
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	
	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	

	public String getIs_primary() {
		return is_primary;
	}

	public void setIs_primary(String is_primary) {
		this.is_primary = is_primary;
	}

	

	

	public JSONArray getLocation_names() {
		return location_names;
	}

	public void setLocation_names(JSONArray location_names) {
		this.location_names = location_names;
	}

	

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	

	public EmployeeMaster getMain3() {
		return this.main3;
	}

	public void setMain3(EmployeeMaster main3) {
		this.main3 = main3;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}
	
	

}
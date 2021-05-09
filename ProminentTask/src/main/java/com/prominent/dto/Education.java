package com.prominent.dto;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the education database table.
 * 
 */
@Entity
public class Education implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="eduid",nullable=false)
	private int eduid;

	private String degrees;

	private String domain;

	@Column(name="end_date")
	private String end_date;

	@Column(name="facebook_url")
	private String facebook_url;

	private String gpa;

	private String id;

	@Column(name="linkedin_id")
	private String linkedin_id;

	@Column(name="linkedin_url")
	private String linkedin_url;

	private String location;

	private String majors;

	private String minors;

	private String name;

	@Column(name="start_date")
	private String start_date;

	@Lob
	private String summary;

	@Column(name="twitter_url")
	private String twitter_url;

	private String type;

	private String website;

	//bi-directional many-to-one association to Main1
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="sno",nullable=false)
	private EmployeeMaster main1;

	public Education() {
	}

	public int getEduid() {
		return this.eduid;
	}

	public void setEduid(int eduid) {
		this.eduid = eduid;
	}

	public String getDegrees() {
		return this.degrees;
	}

	public void setDegrees(String degrees) {
		this.degrees = degrees;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	
	public String getGpa() {
		return this.gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMajors() {
		return this.majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public String getMinors() {
		return this.minors;
	}

	public void setMinors(String minors) {
		this.minors = minors;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getFacebook_url() {
		return facebook_url;
	}

	public void setFacebook_url(String facebook_url) {
		this.facebook_url = facebook_url;
	}

	public String getLinkedin_id() {
		return linkedin_id;
	}

	public void setLinkedin_id(String linkedin_id) {
		this.linkedin_id = linkedin_id;
	}

	public String getLinkedin_url() {
		return linkedin_url;
	}

	public void setLinkedin_url(String linkedin_url) {
		this.linkedin_url = linkedin_url;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getTwitter_url() {
		return twitter_url;
	}

	public void setTwitter_url(String twitter_url) {
		this.twitter_url = twitter_url;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public EmployeeMaster getMain1() {
		return this.main1;
	}

	public void setMain1(EmployeeMaster main1) {
		this.main1 = main1;
	}

}
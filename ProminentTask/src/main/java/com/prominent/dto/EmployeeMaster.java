package com.prominent.dto;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.json.simple.JSONArray;
import com.vladmihalcea.hibernate.type.json.JsonStringType;


/**
 * The persistent class for the main1 database table.
 * 
 */
@Entity
@Table(name="main1")
@TypeDef(name = "JsonType", typeClass = JsonStringType.class)
public class EmployeeMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false)
	private String sno;
	
	@Column(name="birth_date")
	private String birth_date;

	@Column(name="birth_year")
	private String birth_year;

	@Lob
	@Type(type = "JsonType")
	@Column(columnDefinition = "json", name = "countries")
	private JSONArray countries;

	

	@Column(name="facebook_id")
	private String facebook_id;

	@Column(name="facebook_url")
	private String facebook_url;

	@Column(name="facebook_username")
	private String facebook_username;

	@Column(name="first_name")
	private String first_name;

	@Column(name="full_name")
	private String full_name;

	private String gender;

	@Column(name="github_url")
	private String github_url;

	@Column(name="github_username")
	private String github_username;

	private String id;

	private String industry;

	@Lob
	@Column(name="inferred_salary")
	private String inferred_salary;

	@Lob
	@Column(name="inferred_years_experience")
	private String inferred_years_experience;

	@Lob
	@Type(type = "JsonType")
	@Column(columnDefinition = "json", name = "interests")
	private JSONArray interests;

	@Column(name="job_company_facebook_url")
	private String job_company_facebook_url;

	@Column(name="job_company_founded")
	private String job_company_founded;

	@Column(name="job_company_id")
	private String job_company_id;

	@Column(name="job_company_industry")
	private String job_company_industry;

	@Column(name="job_company_linkedin_id")
	private String job_company_linkedin_id;

	@Column(name="job_company_linkedin_url")
	private String job_company_linkedin_url;

	@Column(name="job_company_location_address_line_2")
	private String job_company_location_address_line_2;

	@Column(name="job_company_location_continent")
	private String job_company_location_continent;

	@Column(name="job_company_location_country")
	private String job_company_location_country;

	@Column(name="job_company_location_geo")
	private String job_company_location_geo;

	@Column(name="job_company_location_locality")
	private String job_company_location_locality;

	@Column(name="job_company_location_name")
	private String job_company_location_name;

	@Column(name="job_company_location_postal_code")
	private String job_company_location_postal_code;

	@Column(name="job_company_location_region")
	private String job_company_location_region;

	@Column(name="job_company_location_street_address")
	private String job_company_location_street_address;

	@Column(name="job_company_name")
	private String job_company_name;

	@Column(name="job_company_size")
	private String job_company_size;

	@Column(name="job_company_twitter_url")
	private String job_company_twitter_url;

	@Column(name="job_company_website")
	private String job_company_website;

	@Column(name="job_last_updated")
	private String job_last_updated;
	
	@Column(name="job_start_date")
	private  String job_start_date;

	@Column(name="job_title")
	private String job_title;
	
	@Column(name="job_title_sub_role")
	private String job_title_sub_role;

	@Lob
	@Type(type = "JsonType")
	@Column(columnDefinition = "json", name = "job_title_levels")
	private JSONArray job_title_levels;

	@Column(name="job_title_role")
	private String job_title_role;

	@Column(name="last_name")
	private String last_name;

	@Column(name="linkedin_id")
	private String linkedin_id;

	@Column(name="linkedin_url")
	private String linkedin_url;

	@Column(name="linkedin_username")
	private String linkedin_username;

	@Column(name="location_address_line_2")
	private String location_address_line_2;

	@Column(name="location_continent")
	private String location_continent;

	@Column(name="location_country")
	private String location_country;

	@Column(name="location_geo")
	private String location_geo;

	@Column(name="location_last_updated")
	private String location_last_updated;

	@Column(name="location_locality")
	private String location_locality;

	@Column(name="location_name")
	private String location_name;
	
	@Column(name="job_summary")
	private String  job_summary;

	@Lob
	@Type(type = "JsonType")
	@Column(columnDefinition = "json", name = "location_names")
	private JSONArray location_names;

	@Column(name="location_postal_code")
	private String location_postal_code;

	@Column(name="location_region")
	private String location_region;

	@Column(name="location_street_address")
	private String location_street_address;

	@Column(name="middle_initial")
	private String middle_initial;

	@Column(name="middle_name")
	private String middle_name;

	@Column(name="mobile_phone")
	private String mobile_phone;

	@Lob
	@Type(type = "JsonType")
	@Column(columnDefinition = "json", name = "phone_numbers")
	private JSONArray phone_numbers;

	

	@Lob
	@Type(type = "JsonType")
	@Column(columnDefinition = "json", name = "regions")
	private JSONArray regions;

	@Lob
	@Type(type = "JsonType")
	@Column(columnDefinition = "json", name = "skills")
	private JSONArray skills;

	@Lob
	@Type(type = "JsonType")
	@Column(columnDefinition = "json", name = "street_addresses")
	private JSONArray street_addresses;

	@Lob
	private String summary;

	@Column(name="twitter_url")
	private String twitter_url;

	@Column(name="twitter_username")
	private String twitter_username;

	private VersionStatus version_status;

	@Column(name="work_email")
	private String work_email;

	//bi-directional many-to-one association to Education
	@OneToMany(mappedBy="main1", cascade = CascadeType.ALL)
	private List<Education> education;

	//bi-directional many-to-one association to Email
	@OneToMany(mappedBy="main2", cascade = CascadeType.ALL)
	private List<Email> emails;

	//bi-directional many-to-one association to Experience
	@OneToMany(mappedBy="main3", cascade = CascadeType.ALL)
	private List<Experience> experience;

	//bi-directional many-to-one association to Profile
	@OneToMany(mappedBy="main4", cascade = CascadeType.ALL)
	private List<Profile> profiles;

	public EmployeeMaster() {
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public String getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}

	public JSONArray getCountries() {
		return countries;
	}

	public void setCountries(JSONArray countries) {
		this.countries = countries;
	}

	public String getFacebook_id() {
		return facebook_id;
	}

	public void setFacebook_id(String facebook_id) {
		this.facebook_id = facebook_id;
	}

	public String getFacebook_url() {
		return facebook_url;
	}

	public void setFacebook_url(String facebook_url) {
		this.facebook_url = facebook_url;
	}

	public String getFacebook_username() {
		return facebook_username;
	}

	public void setFacebook_username(String facebook_username) {
		this.facebook_username = facebook_username;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGithub_url() {
		return github_url;
	}

	public void setGithub_url(String github_url) {
		this.github_url = github_url;
	}

	public String getGithub_username() {
		return github_username;
	}

	public void setGithub_username(String github_username) {
		this.github_username = github_username;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getInferred_salary() {
		return inferred_salary;
	}

	public void setInferred_salary(String inferred_salary) {
		this.inferred_salary = inferred_salary;
	}

	public String getInferred_years_experience() {
		return inferred_years_experience;
	}

	public void setInferred_years_experience(String inferred_years_experience) {
		this.inferred_years_experience = inferred_years_experience;
	}

	public JSONArray getInterests() {
		return interests;
	}

	public void setInterests(JSONArray interests) {
		this.interests = interests;
	}

	public String getJob_company_facebook_url() {
		return job_company_facebook_url;
	}

	public void setJob_company_facebook_url(String job_company_facebook_url) {
		this.job_company_facebook_url = job_company_facebook_url;
	}

	public String getJob_company_founded() {
		return job_company_founded;
	}

	public void setJob_company_founded(String job_company_founded) {
		this.job_company_founded = job_company_founded;
	}

	public String getJob_company_id() {
		return job_company_id;
	}

	public void setJob_company_id(String job_company_id) {
		this.job_company_id = job_company_id;
	}

	public String getJob_company_industry() {
		return job_company_industry;
	}

	public void setJob_company_industry(String job_company_industry) {
		this.job_company_industry = job_company_industry;
	}

	public String getJob_company_linkedin_id() {
		return job_company_linkedin_id;
	}

	public void setJob_company_linkedin_id(String job_company_linkedin_id) {
		this.job_company_linkedin_id = job_company_linkedin_id;
	}

	public String getJob_company_linkedin_url() {
		return job_company_linkedin_url;
	}

	public void setJob_company_linkedin_url(String job_company_linkedin_url) {
		this.job_company_linkedin_url = job_company_linkedin_url;
	}

	public String getJob_company_location_address_line_2() {
		return job_company_location_address_line_2;
	}

	public void setJob_company_location_address_line_2(String job_company_location_address_line_2) {
		this.job_company_location_address_line_2 = job_company_location_address_line_2;
	}

	public String getJob_company_location_continent() {
		return job_company_location_continent;
	}

	public void setJob_company_location_continent(String job_company_location_continent) {
		this.job_company_location_continent = job_company_location_continent;
	}

	public String getJob_company_location_country() {
		return job_company_location_country;
	}

	public void setJob_company_location_country(String job_company_location_country) {
		this.job_company_location_country = job_company_location_country;
	}

	public String getJob_company_location_geo() {
		return job_company_location_geo;
	}

	public void setJob_company_location_geo(String job_company_location_geo) {
		this.job_company_location_geo = job_company_location_geo;
	}

	public String getJob_company_location_locality() {
		return job_company_location_locality;
	}

	public void setJob_company_location_locality(String job_company_location_locality) {
		this.job_company_location_locality = job_company_location_locality;
	}

	public String getJob_company_location_name() {
		return job_company_location_name;
	}

	public void setJob_company_location_name(String job_company_location_name) {
		this.job_company_location_name = job_company_location_name;
	}

	public String getJob_company_location_postal_code() {
		return job_company_location_postal_code;
	}

	public void setJob_company_location_postal_code(String job_company_location_postal_code) {
		this.job_company_location_postal_code = job_company_location_postal_code;
	}

	public String getJob_company_location_region() {
		return job_company_location_region;
	}

	public void setJob_company_location_region(String job_company_location_region) {
		this.job_company_location_region = job_company_location_region;
	}

	public String getJob_company_location_street_address() {
		return job_company_location_street_address;
	}

	public void setJob_company_location_street_address(String job_company_location_street_address) {
		this.job_company_location_street_address = job_company_location_street_address;
	}

	public String getJob_company_name() {
		return job_company_name;
	}

	public void setJob_company_name(String job_company_name) {
		this.job_company_name = job_company_name;
	}

	public String getJob_company_size() {
		return job_company_size;
	}

	public void setJob_company_size(String job_company_size) {
		this.job_company_size = job_company_size;
	}

	public String getJob_company_twitter_url() {
		return job_company_twitter_url;
	}

	public void setJob_company_twitter_url(String job_company_twitter_url) {
		this.job_company_twitter_url = job_company_twitter_url;
	}

	public String getJob_company_website() {
		return job_company_website;
	}

	public void setJob_company_website(String job_company_website) {
		this.job_company_website = job_company_website;
	}

	public String getJob_last_updated() {
		return job_last_updated;
	}

	public void setJob_last_updated(String job_last_updated) {
		this.job_last_updated = job_last_updated;
	}

	public String getJob_start_date() {
		return job_start_date;
	}

	public void setJob_start_date(String job_start_date) {
		this.job_start_date = job_start_date;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getJob_title_sub_role() {
		return job_title_sub_role;
	}

	public void setJob_title_sub_role(String job_title_sub_role) {
		this.job_title_sub_role = job_title_sub_role;
	}

	public JSONArray getJob_title_levels() {
		return job_title_levels;
	}

	public void setJob_title_levels(JSONArray job_title_levels) {
		this.job_title_levels = job_title_levels;
	}

	public String getJob_title_role() {
		return job_title_role;
	}

	public void setJob_title_role(String job_title_role) {
		this.job_title_role = job_title_role;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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

	public String getLinkedin_username() {
		return linkedin_username;
	}

	public void setLinkedin_username(String linkedin_username) {
		this.linkedin_username = linkedin_username;
	}

	public String getLocation_address_line_2() {
		return location_address_line_2;
	}

	public void setLocation_address_line_2(String location_address_line_2) {
		this.location_address_line_2 = location_address_line_2;
	}

	public String getLocation_continent() {
		return location_continent;
	}

	public void setLocation_continent(String location_continent) {
		this.location_continent = location_continent;
	}

	public String getLocation_country() {
		return location_country;
	}

	public void setLocation_country(String location_country) {
		this.location_country = location_country;
	}

	public String getLocation_geo() {
		return location_geo;
	}

	public void setLocation_geo(String location_geo) {
		this.location_geo = location_geo;
	}

	public String getLocation_last_updated() {
		return location_last_updated;
	}

	public void setLocation_last_updated(String location_last_updated) {
		this.location_last_updated = location_last_updated;
	}

	public String getLocation_locality() {
		return location_locality;
	}

	public void setLocation_locality(String location_locality) {
		this.location_locality = location_locality;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	public String getJob_summary() {
		return job_summary;
	}

	public void setJob_summary(String job_summary) {
		this.job_summary = job_summary;
	}

	public JSONArray getLocation_names() {
		return location_names;
	}

	public void setLocation_names(JSONArray location_names) {
		this.location_names = location_names;
	}

	public String getLocation_postal_code() {
		return location_postal_code;
	}

	public void setLocation_postal_code(String location_postal_code) {
		this.location_postal_code = location_postal_code;
	}

	public String getLocation_region() {
		return location_region;
	}

	public void setLocation_region(String location_region) {
		this.location_region = location_region;
	}

	public String getLocation_street_address() {
		return location_street_address;
	}

	public void setLocation_street_address(String location_street_address) {
		this.location_street_address = location_street_address;
	}

	public String getMiddle_initial() {
		return middle_initial;
	}

	public void setMiddle_initial(String middle_initial) {
		this.middle_initial = middle_initial;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public JSONArray getPhone_numbers() {
		return phone_numbers;
	}

	public void setPhone_numbers(JSONArray phone_numbers) {
		this.phone_numbers = phone_numbers;
	}

	public JSONArray getRegions() {
		return regions;
	}

	public void setRegions(JSONArray regions) {
		this.regions = regions;
	}

	public JSONArray getSkills() {
		return skills;
	}

	public void setSkills(JSONArray skills) {
		this.skills = skills;
	}

	public JSONArray getStreet_addresses() {
		return street_addresses;
	}

	public void setStreet_addresses(JSONArray street_addresses) {
		this.street_addresses = street_addresses;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTwitter_url() {
		return twitter_url;
	}

	public void setTwitter_url(String twitter_url) {
		this.twitter_url = twitter_url;
	}

	public String getTwitter_username() {
		return twitter_username;
	}

	public void setTwitter_username(String twitter_username) {
		this.twitter_username = twitter_username;
	}

	public VersionStatus getVersion_status() {
		return version_status;
	}

	public void setVersion_status(VersionStatus version_status) {
		this.version_status = version_status;
	}

	public String getWork_email() {
		return work_email;
	}

	public void setWork_email(String work_email) {
		this.work_email = work_email;
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		for(Email email:emails) {
			email.setMain2(this);
		}
		this.emails = emails;
	}

	public List<Experience> getExperience() {
		return experience;
	}

	public void setExperience(List<Experience> experience) {
		for(Experience exp:experience) {
			exp.setMain3(this);
			
		}
		this.experience = experience;
	}

	public List<Profile> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<Profile> profiles) {
		for(Profile pro:profiles) {
			pro.setMain4(this);
		}
		this.profiles = profiles;
	}

	
}
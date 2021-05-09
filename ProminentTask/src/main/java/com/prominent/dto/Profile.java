package com.prominent.dto;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profile database table.
 * 
 */
@Entity
public class Profile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="proid",nullable=false)
	private int proid;

	private String id;

	private String network;

	private String url;

	private String username;

	//bi-directional many-to-one association to Main1
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="sno",nullable=false)
	private EmployeeMaster main4;

	public Profile() {
	}

	public int getProid() {
		return this.proid;
	}

	public void setProid(int proid) {
		this.proid = proid;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNetwork() {
		return this.network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public EmployeeMaster getMain4() {
		return this.main4;
	}

	public void setMain4(EmployeeMaster main4) {
		this.main4 = main4;
	}

}
package com.prominent.dto;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the emails database table.
 * 
 */
@Entity
@Table(name="emails")
public class Email implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="mailid",nullable=false)
	private int mailid;

	private String address;

	private String type;

	//bi-directional many-to-one association to Main1
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="sno",nullable = false)
	private EmployeeMaster main2;

	public Email() {
	}

	public int getMailid() {
		return this.mailid;
	}

	public void setMailid(int mailid) {
		this.mailid = mailid;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public EmployeeMaster getMain2() {
		return this.main2;
	}

	public void setMain2(EmployeeMaster main2) {
		this.main2 = main2;
	}

}
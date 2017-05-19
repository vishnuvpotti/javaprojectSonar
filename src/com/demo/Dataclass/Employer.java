package com.demo.Dataclass;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Employer")
public class Employer {

	private String id;
	private String employerName;
	private String employerAddress;
	private String startDate;
	private String endDate;
	
	@XmlAttribute(name = "empNum")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@XmlElement(name = "EmployerName")
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	@XmlElement(name = "EmployerAddress")
	public String getEmployerAddress() {
		return employerAddress;
	}
	public void setEmployerAddress(String employerAddress) {
		this.employerAddress = employerAddress;
	}
	@XmlElement(name = "StartDate")
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	@XmlElement(name = "EndDate")
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
	
}

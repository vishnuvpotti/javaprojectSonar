package com.demo.Dataclass;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Employment")
public class Employment {

	
	private List<Employer> employerList;

	@XmlElement(name = "Employer")
	public List<Employer> getEmployerList() {
		return employerList;
	}

	public void setEmployerList(List<Employer> employerList) {
		this.employerList = employerList;
	}
	
		
}

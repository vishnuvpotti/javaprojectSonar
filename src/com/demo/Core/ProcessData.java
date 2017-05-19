package com.demo.Core;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.demo.Dataclass.Person;
import com.demo.Dataclass.XmlData;
import com.demo.Logger.Logger;

public class ProcessData {
	String filePath = null;

	public ProcessData() {
		// TODO Auto-generated method stub
		filePath = "config\\XmlData.xml";
	}

	public void GetPersonDetails() {
		JAXBContext jc = null;
		Unmarshaller unmarshaller = null;
		XmlData personData = null;

		try {
			jc = JAXBContext.newInstance(XmlData.class);
			unmarshaller = jc.createUnmarshaller();
			System.out.println("Filepath:" + filePath);
			personData = (XmlData) unmarshaller.unmarshal(new File(filePath));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Logger.WriteLog("Exception while parsing xml. Please check detailed exception info." + e.getMessage());
			System.out.println("Exception while parsing xml. Please check detailed exception info." + e.getMessage());
			Logger.WriteLog("Exception stacktrace:" + e.getStackTrace());

		}

		try {
			System.out.println("Get Tasks Count:" + personData.getPersonList().size());
			Logger.WriteLog("Get total Tasks Count:" + personData.getPersonList().size());

			for (Person personID : personData.getPersonList()) {
				System.out.println("ID : " + personID.getId() + "; Name : " + personID.getFirstName() + "; LastName: "
						+ personID.getLastName() + "; Age :"+personID.getAge());
			}
		} catch (Exception e) {
			System.out.println("Exception while parsing." + e.getStackTrace());
		}
	}

	public int FormatStringtoInteger(String string) {

		int value = 0;
		try {
			Double dvalue = Double.valueOf(string);
			// Format to int
			value = dvalue.intValue();
			// System.out.println("Converted value:" + value);
		} catch (NumberFormatException e) {
			// returnValue= false;
		} catch (NullPointerException e) {
			// returnValue= false;
		}
		return value;
	}
}

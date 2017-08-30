package com.sb.elsinore;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

    String name;
    Integer number;
    
	public String getName() {
		return name;
	}
	
	@XmlElement(name="name")
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	@XmlElement(name="number")
	public void setNumber(Integer number) {
		this.number = number;
	}
}

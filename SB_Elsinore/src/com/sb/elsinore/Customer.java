package com.sb.elsinore;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

    String name;
    int age;
    int id;
    ArrayList<Employee> emps;

	public ArrayList<Employee> getEmps() {
		return emps;
	}

	public void setEmps(ArrayList<Employee> emps) {
		this.emps = emps;
	}

	public String getName() {
        return name;
    }

    @XmlElement(name="name")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @XmlElement(name="age")
    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @XmlAttribute(name="id")
    public void setId(int id) {
        this.id = id;
    }

}
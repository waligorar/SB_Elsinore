package com.sb.recipe;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "FERMENTABLES")
public class Fermentables {
	private ArrayList<Fermentable> fermentables = new ArrayList<Fermentable>();

	public ArrayList<Fermentable> getFermentables() {
		return fermentables;
	}

    @XmlElement(name="FERMENTABLE")
	public void setFermentables(ArrayList<Fermentable> fermentables) {
		this.fermentables = fermentables;
	}

}

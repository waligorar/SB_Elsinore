package com.sb.recipe;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "YEASTS")
public class Yeasts {
	private ArrayList<Yeast> yeasts = new ArrayList<Yeast>();

	public ArrayList<Yeast> getYeasts() {
		return yeasts;
	}

	@XmlElement(name = "YEAST")
	public void setYeasts(ArrayList<Yeast> yeasts) {
		this.yeasts = yeasts;
	}

}

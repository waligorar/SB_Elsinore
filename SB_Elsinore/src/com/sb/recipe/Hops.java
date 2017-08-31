package com.sb.recipe;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HOPS")
public class Hops {
	private ArrayList<Hop> hops = new ArrayList<Hop>();

	public ArrayList<Hop> getHops() {
		return hops;
	}

    @XmlElement(name="HOP")
	public void setHops(ArrayList<Hop> hops) {
		this.hops = hops;
	}

}

package com.sb.recipe;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MASH_STEPS")
public class MashSteps {
	private ArrayList<MashStep> mashSteps = new ArrayList<MashStep>();

	public ArrayList<MashStep> getMashSteps() {
		return mashSteps;
	}

	@XmlElement(name = "MASH_STEP")
	public void setMashSteps(ArrayList<MashStep> mashSteps) {
		this.mashSteps = mashSteps;
	}

}

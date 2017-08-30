package com.sb.recipe;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "RECIPES")
public class Recipes {
	private ArrayList<Recipe> recipe = new ArrayList<Recipe>();

	public ArrayList<Recipe> getRecipe() {
		return recipe;
	}

    @XmlElement(name="RECIPE")
	public void setRecipe(ArrayList<Recipe> recipe) {
		this.recipe = recipe;
	}
}

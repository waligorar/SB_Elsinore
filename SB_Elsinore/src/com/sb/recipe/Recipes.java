package com.sb.recipe;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "RECIPES")
public class Recipes {
	private ArrayList<Recipe> recipes = new ArrayList<Recipe>();

	public ArrayList<Recipe> getRecipes() {
		return recipes;
	}

    @XmlElement(name="RECIPE")
	public void setRecipes(ArrayList<Recipe> recipes) {
		this.recipes = recipes;
	}

}

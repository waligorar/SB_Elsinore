package com.sb.recipe;

import java.io.File;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class RecipeList {
	private static final String sRecipeFolder = "recipes";
	private String currentRecipe = "";
	
	public String getCurrentRecipe() {
		return currentRecipe;
	}

	public void setCurrentRecipe(String currentRecipe) {
		this.currentRecipe = currentRecipe;
	}

	private static Log log = LogFactory.getLog(RecipeList.class);

	public RecipeList() {
		log.debug("init() Start");
		log.debug("init() End");
	}
	
	public RecipeList(Recipe r) {
		log.debug("init(Recipe) Start");
		log.debug("init(Recipe) End");
	}
	
	public ArrayList<String> GetRecipeList() {
		log.debug("GetRecipeList(): Begin");
		
		File folder = new File(sRecipeFolder);
		File[] listOfFiles = folder.listFiles();
		ArrayList<String> recipes = new ArrayList<String>();
		
		for (File file : listOfFiles) {
			if (file.isFile()) {
				int i = 1;
				recipes.add(file.getName());
				log.debug("File(" + i++ + ") = " + file.getName());
			}
		}

		log.debug("GetRecipeList(): End");
		return recipes;
	}
	
	public void load() {
		log.debug("load(): Begin");
		log.debug("load(): End");
	}
}
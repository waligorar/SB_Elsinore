package com.sb.elsinore;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Marshaller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sb.recipe.MashStep;
import com.sb.recipe.MashSteps;
import com.sb.recipe.Mash;
import com.sb.recipe.Equipment;
import com.sb.recipe.Style;
import com.sb.recipe.Yeasts;
import com.sb.recipe.Yeast;
import com.sb.recipe.Fermentables;
import com.sb.recipe.Fermentable;
import com.sb.recipe.Hops;
import com.sb.recipe.Hop;
import com.sb.recipe.Recipe;
import com.sb.recipe.Recipes;

public class LaunchControl {
	/*
	 * Set the port for Web Server
	 */
    public int serverPort = 0;

	private static Log log = LogFactory.getLog(LaunchControl.class);
	
	private BrewServer bs = null;

	public static void main(String[] args) {
		log.debug("Main start");
		
		LaunchControl lc = new LaunchControl();
		lc.startServer();
		
		try {
			log.debug("main(): Begin mashal");
			
			Recipes recipes = new Recipes();

			JAXBContext jaxbContext = JAXBContext.newInstance(Recipes.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			recipes = (Recipes) jaxbUnmarshaller.unmarshal(new File("recipes/bas.xml"));
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			
			ArrayList<Recipe> recipeList = recipes.getRecipes();
			log.debug("Recipe count=" + recipeList.size());
			for (Recipe iRecipe: recipeList) {
				log.debug("Recipe forced=" + iRecipe.getForcedCarbonation());
				jaxbMarshaller.marshal(iRecipe,  System.out);
				System.out.println("\n");

				Hops hops = iRecipe.getHops();
				if (hops != null) {
					ArrayList<Hop> hopList = hops.getHops();
					log.debug("Hop count=" + hopList.size());
					for (Hop iHop: hopList) {
						jaxbMarshaller.marshal(iHop,  System.out);					
						System.out.println("\n");
					}
				}

				Fermentables fermentables = iRecipe.getFermentables();
				if (fermentables != null) {
					ArrayList<Fermentable> fermentableList = fermentables.getFermentables();
					log.debug("Fermentable count=" + fermentableList.size());
					for (Fermentable iFermentable: fermentableList) {
						jaxbMarshaller.marshal(iFermentable,  System.out);					
						System.out.println("\n");
					}
				}

				Yeasts yeasts = iRecipe.getYeasts();
				if (yeasts != null) {
					ArrayList<Yeast> yeastList = yeasts.getYeasts();
					log.debug("Yeast count=" + yeastList.size());
					for (Yeast iYeast: yeastList) {
						jaxbMarshaller.marshal(iYeast,  System.out);					
						System.out.println("\n");
					}
				}

				Style style = iRecipe.getStyle();
				if (style != null) {
					log.debug("Style Begin");
					jaxbMarshaller.marshal(style,  System.out);					
					System.out.println("\n");
					log.debug("Style End");
				}

				Equipment equipment = iRecipe.getEquipment();
				if (equipment != null) {
					log.debug("Equipment Begin");
					jaxbMarshaller.marshal(equipment,  System.out);					
					System.out.println("\n");
					log.debug("Equipment End");
				}

				Mash mash = iRecipe.getMash();
				if (mash != null) {
					log.debug("Mash Begin");
					jaxbMarshaller.marshal(mash,  System.out);					
					System.out.println("\n");

					MashSteps mashSteps = mash.getMashSteps();
					if (mashSteps != null) {
						ArrayList<MashStep> mashStepList = mashSteps.getMashSteps();
						log.debug("MashStep count=" + mashStepList.size());
						for (MashStep iMashStep: mashStepList) {
							jaxbMarshaller.marshal(iMashStep,  System.out);					
							System.out.println("\n");
						}
					}

					log.debug("Mash End");
				}
			}
			
			log.debug("main(): End unmashal");
		} catch (Exception ie) {
			ie.printStackTrace();
		}
		
		
		log.debug("Main end");
	}
	
	public LaunchControl() {
		log.debug("LaunchControl(): Begin");
		
		Properties prop = new Properties();
		InputStream input = null;
		
		try {
			input = new FileInputStream(Const.CONFIG_FILE_NAME);
			prop.load(input);
			
			this.serverPort = Integer.parseInt(prop.getProperty("DEFAULT_SERVER_PORT", Const.DEFAULT_SERVER_PORT));
			log.debug("Server Port = " + this.serverPort);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
			
		log.debug("LaunchControl(): End");
	}

	private void startServer() {
		log.debug("LaunchControl.startServer(): Begin");

		try {
			if (null == bs) {
				bs = new BrewServer(this.serverPort);
			}
		} catch (IOException ie) {
			log.error("main() IOException: " + ie.getMessage());
		}

		log.debug("LaunchControl.startServer(): End");
	}
	
}

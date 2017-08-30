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

//			Employee emp1 = new Employee();
//			emp1.setName("John Roberts");
//			emp1.setNumber(123456);
//			Employee emp2 = new Employee();
//			emp2.setName("Jackie Roberts");
//			emp2.setNumber(658425);
//			
//			ArrayList<Employee> emps = new ArrayList<Employee>();
//			emps.add(emp1);
//			emps.add(emp2);
//			
//			Customer custOut = new Customer();
//			custOut.setId(101);
//			custOut.setAge(19);
//			custOut.setName("janet");
//			custOut.setEmps(emps);
//			
//			File fileIn = new File("recipes/barrel-aged-stout.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Recipes.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			recipes = (Recipes) jaxbUnmarshaller.unmarshal(new File("recipes/bas.xml"));
//			File fileOut = new File("recipes/customerOut.xml");
//			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//			
//			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//			
//			jaxbMarshaller.marshal(recipes,  fileOut);
//			jaxbMarshaller.marshal(recipes,  System.out);
//			jaxbMarshaller.marshal(custOut,  fileOut);
//			jaxbMarshaller.marshal(custOut,  System.out);
//
//			log.debug("main(): End mashal");
//
//			log.debug("main(): Begin unmashal");
//			jaxbContext = JAXBContext.newInstance(Customer.class);
//			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//			Customer customer = (Customer) jaxbUnmarshaller.unmarshal(new File("recipes/customerOut.xml"));
//			log.debug("main(): customer.Name = " + customer.getName());
//			log.debug("main(): customer.Age = " + customer.getAge());
//			log.debug("main(): customer.ID = " + customer.getId());
//			
//			ArrayList<Employee> emps2 = customer.getEmps();
//
//			for (Employee thisEmp: emps2) {
//				log.debug("main(): currentEmp.Name = " + thisEmp.getName());
//				log.debug("main(): currentEmp.Number = " + thisEmp.getNumber());
//			}
			
			ArrayList<Recipe> recipeList = recipes.getRecipe();
			log.debug("Recipe count=" + recipeList.size());
			for (Recipe iRecipe: recipeList) {
				jaxbMarshaller.marshal(iRecipe,  System.out);
				System.out.println("\n");

				ArrayList<Hop> hopList = iRecipe.getHops();
				log.debug("Hop count=" + hopList.size());
				for (Hop iHop: hopList) {
					jaxbMarshaller.marshal(iHop,  System.out);					
					System.out.println("\n");
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

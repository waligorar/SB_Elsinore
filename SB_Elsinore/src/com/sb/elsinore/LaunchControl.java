package com.sb.elsinore;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sb.recipe.Recipe;

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
			log.debug("main(): Begin unmashal");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) jaxbUnmarshaller.unmarshal(new File("recipes/customer.xml"));
			log.debug("main(): End unmashal");
			log.debug("main(): Name = " + customer.getName());
			log.debug("main(): Age = " + customer.getAge());
			log.debug("main(): ID = " + customer.getId());
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

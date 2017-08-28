package com.sb.elsinore;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LaunchControl {
	/*
	 * Set the port for Web Server
	 */
    public int serverPort = 0;

	private static Log log = LogFactory.getLog(BrewServer.class);

	public static void main(String[] args) {
		log.debug("Main start");
		
		LaunchControl lc = new LaunchControl();
		lc.startServer();
		
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
			new BrewServer(this.serverPort);
		} catch (IOException ie) {
			log.error("main() IOException: " + ie.getMessage());
		}
		
		log.debug("LaunchControl.startServer(): End");
	}
	
}

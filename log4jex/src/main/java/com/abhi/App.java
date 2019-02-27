package com.abhi;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	logger.debug("Log debug message");
    	logger.error("This is error : " );
    	logger.info("log message");
        System.out.println( "Hello World!" );
    }
}

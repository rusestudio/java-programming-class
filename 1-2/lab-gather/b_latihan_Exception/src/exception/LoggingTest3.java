package exception;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoggingTest3 {
	
	private static final Logger logger = Logger.getLogger(LoggingTest3.class.getName());

	public static void main(String[] args) throws IOException { //need to throw exception for file handler
		// TODO Auto-generated method stub
		
		Handler handler = new FileHandler("logging.txt"); //save log info in here
		
		logger.addHandler(handler); //use handler to save log info
		logger.setLevel(Level.FINEST);
		logger.info("info level message"); //will show at console
		logger.fine("fine level message"); //will show at txt
		logger.finest("finest level message"); //will show at txt
		
		handler.flush(); // force to write to file
		handler.close(); // close file handler
		

	}

}

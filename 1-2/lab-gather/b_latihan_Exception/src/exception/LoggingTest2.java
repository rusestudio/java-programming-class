package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingTest2 {
	
	private static final Logger logger = Logger.getLogger("LoggingTest2");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.info("start logger");
		try {
			throw new Exception ("exception error");
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		}
		 logger.info("done");
	}

}

package _14장;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingTest {
    private static final Logger logger = Logger.getLogger("LoggingTest");

    public static void main(String[] args) {
        logger.info("Logger started");

        try {
            throw new Exception("Exception occurred");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Exception caught", e);
        }

        logger.info("Logger stopped");
    }
}
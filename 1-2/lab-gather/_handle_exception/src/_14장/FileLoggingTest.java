package _14장;

import java.io.IOException;
import java.util.logging.*;

public class FileLoggingTest {
    private static final Logger logger = Logger.getLogger("FileLoggingTest");

    public static void main(String[] args) {
        try {
            Handler handler = new FileHandler("logging.txt");

            logger.addHandler(handler);
            logger.setLevel(Level.FINEST);

            logger.info("info level message"); // can see at console and file
            logger.fine("fine level message"); // can see at file only
            logger.finest("finest level message"); // can see at file only

            handler.flush(); // force to write to file
            handler.close(); // close file handler
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
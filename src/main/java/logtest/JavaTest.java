package logtest;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class JavaTest {

  private static Logger logger = LogManager.getLogger(JavaTest.class.getName());

  public static void main(String[] args) {
    logger.trace("Entering application.");
    Bar bar = new Bar();

    if (!bar.doIt())
      logger.error("Didn't do it.");

    logger.trace("Exiting application.");
  }
}

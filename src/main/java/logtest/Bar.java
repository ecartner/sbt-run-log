package logtest;

import org.apache.logging.log4j.*;

public class Bar {
  static Logger logger = LogManager.getLogger(Bar.class.getName());

  public boolean doIt() {
    logger.entry();
    logger.error("Did it again!");
    return logger.exit(false);
  }
}

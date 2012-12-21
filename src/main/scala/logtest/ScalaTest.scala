package logtest

import org.apache.logging.log4j.{Logger, LogManager}

object ScalaTest {
  private val logger = LogManager.getLogger(getClass())
  def main(args: Array[String]) {
    logger.trace("Entering application.")

    val bar = new Bar()
    
    if (!bar.doIt())
      logger.error("Didn't do it.")

    logger.trace("Exiting application.")
  }
}

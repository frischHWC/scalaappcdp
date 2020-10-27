package com.cloudera.frisch.scalaappcdp

import org.apache.logging.log4j.scala.Logging


object App extends Logging {

  /**
    * Main function that launches treatment
    * @param args
    */
  def main(args : Array[String]) {

    logger.info("Starting Program")

    logger.debug("Debug is activated")

    logger.info("Program finished")
  }

}
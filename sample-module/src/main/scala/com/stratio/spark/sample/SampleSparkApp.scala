package com.stratio.spark.sample

import org.apache.log4j.Logger
import org.apache.spark.sql.{Dataset, SparkSession}

object SampleSparkApp {

  val logger = Logger.getLogger(getClass.getName)
  val spark = SparkSession.builder.appName("Sample Spark App")//.master("local[2]")
      .config("spark.sql.shuffle.partitions", 10).getOrCreate

  import spark.implicits._

 
  def main(args: Array[String]): Unit = {

    logger.info("Running Spark App")
    // TODO implement app
    

  }
}
import org.apache.spark.sql.{SparkSession, _}

/**
  * Created by rahul on 29/9/16.
  */
object JsonStream extends App{

  val sparkSession = SparkSession.builder
    .master("local")
    .appName("demo")
    .getOrCreate()

  val dataFrame : DataFrame = sparkSession.read.json("src/main/resources/dummy.json")
  dataFrame.distinct().show()
}

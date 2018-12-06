import scala.util.Random;

object patternMatching extends App {
  
  val x : Int = Random.nextInt(10)
  println(x)
  
  val y=  x match {
  case 0 => println("Zero")
  case 1 => println("One")
  case _ => println("Many")
  }
}
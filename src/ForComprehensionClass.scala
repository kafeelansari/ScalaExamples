import scala.collection.parallel.ParIterableLike.Foreach

/*
 *	For comprehension is scala is used to create the datatype which supports operations like withFilter, map and fliatMap
 * 
 * 	Usage : 
 * 	for (enumerator) yield e  
 */

object ForComprehensionClass extends App {
  case class User(name:String,age:Int)
  
  val userBase = List(
      User("Travis",24),
      User("Juliet",20),
      User("Jane",50)
      )
      
   val twentySomethings = for(user <- userBase if (user.age >= 20 && user.age < 30)) yield user.name
   
   //twentySomethings.foreach(println(_))
   twentySomethings.foreach(x -> println(x))
}
import singletonexamplepackage.info.printinfo

object singletonObjectExample extends App {
  class Project(name:String, daysToComplete:Int)
  
  class Test{
    val proj1 = new Project("TPS Report",3)
    val proj2 = new Project("Report" , 1)
    printinfo("Project created")
  }
  
  
  val x = new Test()
}
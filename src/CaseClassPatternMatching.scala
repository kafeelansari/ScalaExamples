

object CaseClassPatternMatching extends App {
  
  abstract class Notification
  
  case class SMS(caller:String,messsage:String) extends Notification
  case class Email(sender:String,title:String,body:String) extends Notification
  
  
  def showNotification(notification:Notification) = {
    notification match {
      case SMS(number,message) => s"You got a message from $number! Message: $message"
      case Email(email,title,_) => s"You got an email from $email with title; $title"
    }
  }
  
  val someSMS = SMS("12345","Are you there ? ")
  println(showNotification(someSMS))
  
}
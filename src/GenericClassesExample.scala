

object GenericClassesExample extends App {
  class Stack[A] {
    private var elements: List[A] = Nil
    def push(x: A) { elements = x :: elements }
    def peek: A = elements.head
    def pop(): A = {
      val currentTop = peek
      elements = elements.tail
      currentTop
    }
  }
  
  
  val x = new Stack[Int]
  x.push(1)
  x.push(2)
  println(x.pop())
  println(x.pop())
  
}
//A method which has no implementation in the abstract class called as abstract method it has a keyword abstract

abstract class Abclass{
  def add() //abstract method
  def sub(): Unit ={
    println("myworld")
  }
}
class child extends Abclass { //it will not inherit more than one abstract class as we do in trait
  def add(): Unit = {
    println("hello")
  }
  override def sub(): Unit ={
    println("it will access the override implementation leaving the first method which is defined")
  }
}

object Test extends App{
   val obj = new child
  obj.add()
  obj.sub()
   }



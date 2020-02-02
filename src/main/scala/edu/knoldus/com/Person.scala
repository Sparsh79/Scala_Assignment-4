package edu.knoldus.com



class Person(val name: String, val age: Int) extends Ordered[Person]{
  def compare(that: Person): Int = {
      if (this.name == that.name){
        this.age - that.age
      }
      else {
        this.name.length - that.name.length
      }
  }
}
object  Person{
  def main(args: Array[String]): Unit = {

    val person_first = new Person("sparsh", 22)
    val person_second = new Person(name = "sparshbhardwaj", age = 25)
 if (person_first<person_second)
    print(true)
    else
    print(false)
  }
}


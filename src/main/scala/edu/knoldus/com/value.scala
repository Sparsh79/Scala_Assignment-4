package edu.knoldus.com

class FirstName(val firstname: String) extends AnyVal{
  def firstName = firstname
}
class SurName(val surName: String) extends AnyVal{
  def lastName = surName
}
class Age(val age: Int) extends AnyVal{
  def Age= age
}

object Value{
  def main(args: Array[String]): Unit = {
    val firstName = new FirstName(firstname = "Sparsh")
    val surName = new SurName(surName = "Bhardwaj")
    val age = new Age(age = 22)
    display(firstName,surName,age)
    def display(firstName: FirstName, surName: SurName, age: Age): Unit ={
      println(firstName.firstName + " "+ surName.lastName + " is " + age.Age + " of age"  )

    }
  }
}

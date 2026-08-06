package ch02_kotlin_basics

class Person(
    val name: String,
    var isStudent: Boolean,
)

fun main() {
    val person = Person("Alice", true)
    println(person.name)
    println(person.isStudent)
    person.isStudent = false
    println(person.isStudent)
}
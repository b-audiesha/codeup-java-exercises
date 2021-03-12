//public class InheritanceandPolymorphismLec {
  //-- Pre-Lecture Research Questions
  //What is inheritance?

  //Inheritance is an important pillar of OOP(Object-Oriented Programming).
  // It is the mechanism in java by which one class is allowed to inherit the features(fields and methods) of another class.


  //What is the difference between a subclass and a super class? Super Class: The class whose features are inherited is known as superclass(or a base class or a parent class).

  //Sub Class: The class that inherits the other class is known as subclass(or a derived class, extended class, or child class).
  // The subclass can add its own fields and methods in addition to the superclass fields and methods.

  //Can a class extend from multiple classes? Yes, using Reusability: Reusability is, Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class.
  // By doing this, we are reusing the fields and methods of the existing class.

//Can a class be both a parent of another class and child of yet another class?
//  Yes
//What is method overriding?
//  Where the child class has a different implementation of the same method from it’s parent.
//Can a subclass overload methods of it’s parent class?
//  Yes
//What is the difference between private and protected visibility?
//  Protected class members are visible to any child classes (even in different packages)
//What are two uses of the “super” keyword in a subclass?
//  1. Call the parent constructor
//  2. Call the parent implementation of an overridden method
//What is Polymorphism?
//  Different implementations of a common code structure
//Can a subclass instance, when stored in a variable of it’s parent type, use methods unique to the subclass?
//  No (unless we cast the type)
//Aside from defining constants, what are some additional uses of the final keyword?
//  1. prevent a parameter from being reassigned
//  2. prevent a class from being extended

package com.rockthejvm

object Basics extends App{

  //note that extending 'App' means that
  // this file can be runned as a standalone application (just like it had a main method)

  //defining a value; strong typed; equivalent to constant, cannot be reassigned 'const int valInJava = 5'
  val myInt: Int = 5

  //compiler can detect types in Scala; types are optional
  val myBoolean = true

  //Strings can be composed and interpolated
  val compString = "composed" + " " + "string"
  val interpString = s"Insert the value here -> $myInt"


}

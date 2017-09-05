package com.example.android.kotlin

/**
 * Created by winzaldi on 9/5/17.
 */

//default val
class  People(var name: String,surename: String) {
    init {
        name = name.capitalize();
    }
}


//extend class from class where explicitly using open or abstract because default class is final
open class Animal(name : String)
class Person(name: String,surename:String) : Animal(name)


fun add(x:Int,y:Int) : Int {
      return  x + y
}

fun add2(x:Int,y: Int) = x + y

fun main(args: Array<String>) {
    print(add2(5,6))
    print(add(5,7))
}









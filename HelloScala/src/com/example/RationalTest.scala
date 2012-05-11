package com.example

object RationalTest {

  def main(args: Array[String]): Unit = {
    
    val half=new Rational(1,2)
    println(half.nom+"/"+half.denom)
    
    println("and now i'll try use toString method");
    println(half)
    
    val dontDooooThat=new Rational(1,0)
    println(half.nom+"/"+half.denom)
  }
  
}
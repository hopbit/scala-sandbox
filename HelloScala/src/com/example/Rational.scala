package com.example

class Rational(val nom:Int, val denom:Int) {
  require(denom!=0)
  override def toString(): String = (nom+"/"+denom)
}
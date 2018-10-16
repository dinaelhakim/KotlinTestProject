package com.elhakim.dina.kotlinapplication.models

class Person {
    var name = "Dina"
        //Custom constructor
        set(value) {
            name = "***$value***"
        }
    /*   var age = 0
           //Custom constructor
           set(value) {
               age = value + 2
           }*/
}

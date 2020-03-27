package com.skillboxhelloworld.module_4

interface Warrior {
    var isKilled:Boolean
    var evaisionChance:Int
    fun takeDamage(damage:Int)
    fun attack(enemy: Warrior):Int
}
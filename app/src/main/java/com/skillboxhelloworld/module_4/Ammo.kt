package com.skillboxhelloworld.module_4

import kotlin.random.Random
import kotlin.random.nextInt

enum class Ammo (
    private val damage:Int,
    private val criticalChance:Int,
    private val criticalMult:Int
){
    BulletPistol(15,3,2),
    BulletGun(25,5,3),
    BulletRifle(40,10,5);

    fun damageDone():Int{
        var dmg = damage
        if (Random.nextInt(0..criticalChance) == criticalChance)  dmg = damage*criticalMult
        return dmg
    }

}
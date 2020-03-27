package com.skillboxhelloworld.module_4

sealed class FireType (val shotQuantity : Int) {

    fun shot(ammo: Ammo): Int {
            return when (ammo) {
                Ammo.BulletPistol -> Ammo.BulletPistol.damageDone()
                Ammo.BulletRifle -> Ammo.BulletRifle.damageDone()
                Ammo.BulletGun -> Ammo.BulletGun.damageDone()
            }
        }
    }

    object SingleShot : FireType(1)
    object TripleShot : FireType(3)






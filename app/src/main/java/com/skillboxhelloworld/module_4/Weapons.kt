package com.skillboxhelloworld.module_4

import com.skillboxhelloworld.module_4.Ammo.*
import com.skillboxhelloworld.module_4.AbstractWeapon
import com.skillboxhelloworld.module_4.Ammo
import com.skillboxhelloworld.module_4.SingleShot
import com.skillboxhelloworld.module_4.TripleShot

object Weapons {
    val sniperGun = object : AbstractWeapon(cartridgeSize = 5,
        FireType = SingleShot, isBulletIn = false) {
        override fun createBullet(): Ammo = BulletRifle
    }

    val pistolGlock = object : AbstractWeapon(cartridgeSize = 20,
        FireType = TripleShot, isBulletIn = false) {
        override fun createBullet(): Ammo = BulletPistol
    }

    val automatFamas = object : AbstractWeapon(cartridgeSize = 25,
        FireType = TripleShot, isBulletIn = false) {
        override fun createBullet(): Ammo = BulletGun
    }

    val automatGalil = object : AbstractWeapon(35, SingleShot,
        false) {
        override fun createBullet(): Ammo = BulletGun
    }

    val pistolUsp = object : AbstractWeapon(cartridgeSize = 12,
        FireType = SingleShot, isBulletIn = false) {
            override fun createBullet(): Ammo = BulletPistol
    }
}





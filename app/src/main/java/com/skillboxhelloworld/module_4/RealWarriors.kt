package com.skillboxhelloworld.module_4


class Corporal: AbstractWarrior(1,1,1,
    Weapons.pistolGlock, 1)
class Seargeant: AbstractWarrior(100,2,2,
    Weapons.sniperGun, 2)
class Captain: AbstractWarrior(100,2,2,
    Weapons.sniperGun, 3 )
class Major: AbstractWarrior(100,2,2,
    Weapons.sniperGun, 4 )
class General: AbstractWarrior(100,2,2,
    Weapons.sniperGun, 5 )
package com.skillboxhelloworld.module_4

import kotlin.random.Random
import kotlin.random.nextInt

class Team (
    teamCount:Int
) {
    val teamList = mutableListOf<Warrior>()

    init {
        if (teamCount > 0) {
            for (number in 1..teamCount) {
                this.teamList.add(rndWarrior(Random.nextInt(1..7)))
            }
        }
    }

   private fun rndWarrior( rank : Int): Warrior {
        return  when (rank) {
            1-> Corporal()
            2-> Seargeant()
            3-> Captain()
            4-> Major()
            5-> General()
            else -> Corporal()
        }
    }


}
package com.skillboxhelloworld.module_4


class Battle(teamA: Team, teamB: Team) {
    var battleIsOver = false



    fun fight(teamOne: Team, teamTwo: Team) {
        teamOne.teamList.shuffle()
        teamTwo.teamList.shuffle()

         for (i in 0 until teamOne.teamList.size) {
            if ((!teamOne.teamList[i].isKilled) && (!teamTwo.teamList[i].isKilled)) {
                teamOne.teamList[i].attack(teamTwo.teamList[i])}
                else if (teamTwo.teamList[i].isKilled){ teamOne.teamList[i].attack(teamTwo.teamList.random())
            }
             if ((!teamTwo.teamList[i].isKilled)&&(!teamOne.teamList[i].isKilled)) {
                    teamTwo.teamList[i].attack(teamOne.teamList[i])
                }
             else if(teamOne.teamList[i].isKilled){
                 teamTwo.teamList[i].attack(teamOne.teamList.random())
             }
            }
    }

    fun getStatus(teamOne: Team, teamTwo: Team) :BattleState {
        var team1count=0
        var team2count=0
        teamOne.teamList.forEach { if(!it.isKilled) team1count++ }
//        println(team1count)
//        println(teamOne.teamList.count { it.isKilled })
//        println(teamTwo.teamList.count { it.isKilled })
        teamTwo.teamList.forEach { if(!it.isKilled) team2count++ }
//        println(team2count)
        if (teamOne.teamList.all{it.isKilled } || teamTwo.teamList.all { it.isKilled }){
            battleIsOver = true
            if(teamOne.teamList.count { it.isKilled } < teamTwo.teamList.count { it.isKilled }) {
                return Team1win()
            }
            if(teamOne.teamList.count { it.isKilled } > teamTwo.teamList.count { it.isKilled }){
                return Team2win()
            }
            if(teamOne.teamList.count { it.isKilled } == teamTwo.teamList.count { it.isKilled }) {
                return Draw()
            }
        }
        return Progress(team1count,team2count)
    }
}

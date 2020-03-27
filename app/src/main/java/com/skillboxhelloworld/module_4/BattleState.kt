package com.skillboxhelloworld.module_4

sealed class BattleState() {
}
class Progress(var t1Count: Int,
               var t2Count :Int,
               var t1TotalHealth: Int,
               var t2TotalHealth :Int
) : BattleState() {
    var liveNow = "В команде White $t1Count воинов! осталось $t1TotalHealth жизней \n" +
            "В Команде Black $t2Count воинов! осталось $t2TotalHealth жизней!"
}
class  Team1win(val win1: String = "Команда White Победила"):BattleState()
class  Team2win(val win2: String = "Команда Black Победила"):BattleState()
class  Draw(val draw: String = "Боевая ничья!"):BattleState()

fun resoult(battlestate: BattleState){
    return when (battlestate) {
        is Team1win -> println(battlestate.win1)
        is Team2win -> println(battlestate.win2)
        is Draw -> println(battlestate.draw)
        is Progress -> println(battlestate.liveNow)
    }
}
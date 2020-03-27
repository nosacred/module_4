package com.skillboxhelloworld.module_4

sealed class BattleState() {
}
class Progress(var t1Count: Int, var t2Count :Int) : BattleState() {
    var liveNow = "В команде White  $t1Count воинов осталось ! " +
            "В Команде Black $t2Count воинов осталось"
}
class  Team1win(val win1: String = "Команда 1 Победила"):BattleState()
class  Team2win(val win2: String = "Команда 2 Победила"):BattleState()
class  Draw(val draw: String = "Боевая ничья!"):BattleState()

fun resoult(battlestate: BattleState){
    return when (battlestate) {
        is Team1win -> println(battlestate.win1)
        is Team2win -> println(battlestate.win2)
        is Draw -> println(battlestate.draw)
        is Progress -> println(battlestate.liveNow)
    }
}
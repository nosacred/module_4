package com.skillboxhelloworld.module_4

fun main() {
    println("Введите количество игроков в командах!")
    val N: Int = readLine()?.toIntOrNull() ?: return
    if(N is Int && N > 0) {
        val team1 = Team(N)
        val team2 = Team(N)
        val batle = Battle(team1, team2)
        while (!batle.battleIsOver) {
            resoult(batle.getStatus(team1, team2))
            batle.fight(team1, team2)
        }
    }
}




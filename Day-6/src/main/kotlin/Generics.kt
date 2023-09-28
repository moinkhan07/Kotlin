// Generics -> '<>'
fun main() {
    var footballPlayer1 = FootballPlayer("Ronaldo")
    var footballPlayer2 = FootballPlayer("Messi")

    var footballTeam = Team("Barcelona", mutableListOf(footballPlayer1,footballPlayer2))
    footballTeam.addPlayer(footballPlayer2)
    footballTeam.addPlayer(footballPlayer1)

}

// Upper Bound Team<T:Player> : Upper bound basically means all the type we enter must be inherit from player
class Team<T:Player>(var teamName:String,var players:MutableList<T>){
    fun addPlayer(player:T){
        if (players.contains(player)){
            println("Player ${player.name} is already in the team ${this.teamName}")
        }else{
            println("Player ${player.name} is added in the team ${this.teamName}")
        }
    }
}

open class Player(var name:String)

class FootballPlayer(name:String) :Player(name)

class CricketPlayer(name:String) :Player(name)
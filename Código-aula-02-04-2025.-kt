import kotlin.random.Random

// Jogo pedra, papel e tesoura
// Pedra -> 0, papel -> 1, tesoura -> 2

// váriaveis globais
var jogador1 = 0  // pontos do jogador1
var jogador2 = 0  // pontos do jogador2

fun main() {
    var rodada = 1
    
    
        while(rodada < 6) {
        val escolhaJ1 = Random.nextInt(0, 3)
        val escolhaJ2 = Random.nextInt(0, 3)
        
    println(" ******** RODADA $rodada ********* ")
    println("J1 => ${ jogada(escolhaJ1) } X ${ jogada(escolhaJ2) } <= J2")
  
    combate( escolhaJ1, escolhaJ2 )
    
    println("===================================\n")
    
    println("PLACAR: J1 = $jogador1 | J2 = $jogador2 \n")
    
    rodada++
    } // final do while
        
        ganhador(jogador1, jogador2)

} // final do main


fun jogada(jogada: Int) :String {
    var result = ""
    when(jogada) {
        0 -> result = "PEDRA🪨"
        1 -> result = "PAPEL🧻"
        2 -> result = "TESOURA✂️"
    }
    
    return result 
}

fun combate(j1: Int, j2: Int) {
     if( j1 == j2 ){
         println("=> Empate")
     } else if(
             j1 == 0 && j2 == 2 ||
             j1 == 1 && j2 == 0 ||
             j1 == 2 && j2 == 1
     ) {
         println("=> Ponto para Jogador 1")
         jogador1++
     } else {
         println("=> Ponto para Jogador 2")
         jogador2++
         
     }
}

fun ganhador(j1: Int, j2: Int) {
    if( j1 > j2 ) {
      println("🏆 J1 WIN 🏆")
    }else if ( j1 < j2 ){
      println("🏆 J2 WIN 🏆")
    }else {
       println("EMPATE 🤝") 
    }
   
}

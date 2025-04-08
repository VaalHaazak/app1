import kotlin.random.Random

fun main() {
    println(" ====== 💭COACH VIRTUAL💭 ====== ")
    println("  ******* Frase do dia: *******  ")
    
    val sorteio = Random.nextInt(0, frases.size)
    
    println( frases[sorteio] )
    
    println("\n Mostrando todas as frases.")
    
   
   //Varrendo lista: método 1
    var num = 1 
       frases.forEach {
        println( "\n ||** $num - $it **||" )
         num++     
        }
          
   //Varrendo lista: método 2
   /*
   frases.forEachIndexed { v, frase -> 
       println( "\n ||== ${v + 1} - $frase ==||" )
      }      */
       
    print ("\n\n => Iterando sobre a lista de objetos:\n")
    mensagens.forEach{
        println("Autor: ${ it.autor }")
        println("Frase: ${ it.frase }")
        println("Ano: ${ it.ano }")
        println("========================================")
    }
}

//Criando uma lista de frase
val frases = arrayOf( 
    "Acredite em si mesmo e todo o resto virá naturalmente.",
    "Você nunca sabe o quão forte é até que ser forte seja sua única opção.",
    "Não importa o quão devagar você vá, contanto que não pare.",
    "O maior erro que você pode cometer é ter medo de cometer erros.",
    "Um sonho é algo que você faz por você mesmo, não pelos outros.",
    "Se você não arriscar nada, você arrisca mais.",
    "Mesmo que você caia dez vezes, levante-se onze. É assim que um verdadeiro guerreiro vive.",
    "não tema a morte. Tema viver sem propósito",
    "Meu corpo pode cair. Mas minha vontade e fé nunca!",
    "A raiva me moveu. A dor me moldou. Mas foi a vontade que me fez continuar.",
)

//Criando uma lista de objetos de Mensagem
val mensagens = arrayOf( 
    Mensagem( 
       autor = "William Shakespeare",
       ano = 1603, 
       frase = "Eu aprendi que todos querem viver no topo da montanha, mas toda felicidade e crescimento ocorre quando você está escalando-a"
       
    ),
     Mensagem( 
       autor = "Cora Coralina",
       ano = 1920, 
       frase = "O que vale na vida não é o ponto de partida e sim a caminhada. Caminhando e semeando, no fim, terás o que colher." 
             ),
    
    Mensagem( 
       autor = "Don Lorenzo",
       ano = 2025, 
       frase = "Seu pola!!! Me da 1 reaallll....",
            ),
    
    Mensagem( 
       autor = "Garvi",
       ano = 1300, 
       frase = " A dor não me quebrou. Ela me construiu",            
        )
 )

data class Mensagem(
    var frase: String,
    var autor: String,
    var ano: Int
)

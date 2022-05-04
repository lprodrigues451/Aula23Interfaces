package ExercicioUm

import kotlin.system.exitProcess

class Menu {

    fun menu() {
        println("1- Quadrado")
        println("2- Triângulo")
        println("3- Retângulo")
        println("4- Sair")

        when (readln().toInt()) {
            1 -> {
                val quadrado : FigurasGeometricas = Quadrado(0.0, 0.0, 0.0, 0.0)
                quadrado.informeOsValores()
                quadrado.resultado()
                menuNovoCalculo()
            }
            2 -> {
                val triangulo : FigurasGeometricas = Triangulo(0.0,0.0,0.0,0.0)
                triangulo.informeOsValores()
                triangulo.resultado()
                menuNovoCalculo()
            }
            3 -> {
                val retangulo : FigurasGeometricas = Retangulo(0.0,0.0,0.0,0.0)
                retangulo.informeOsValores()
                retangulo.informeOsValores()
                menuNovoCalculo()
            }

            4 -> {
                exitProcess(0)
            }

            else -> {
                println("\n Opção Inválida \n")
                menu()

            }
        }
    }
    private fun menuNovoCalculo(){
        println("1- Novo calculo/ 2- Menu inicial / 3 - Sair")

        when (readln().toInt()) {
            1 -> {

            }
            2 -> {
                menu()
            }
            3 -> {
                exitProcess(0)
            }

            else -> {
                println("\n Opção Inválida \n")
                menuNovoCalculo()

            }
        }
    }
}
package ExercicioUm

class Quadrado(override var lado: Double= 0.0, override var area: Double, override val base: Double,
               override val altura: Double) : FigurasGeometricas {
    private var formaGeometrica = "Quadrado"

    override fun informeOsValores(){
        println("Informe o lado do quadrado:")
         lado = readln().toDouble()
        area = lado * lado
    }
    override fun resultado(){
        println("Valor da área desse $formaGeometrica é : $area")    }
}
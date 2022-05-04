package ExercicioUm

class Retangulo (override var lado: Double= 0.0, override var area: Double, override var base: Double,
    override var altura: Double) : FigurasGeometricas {
    private var formaGeometrica = "Retângulo"

    override fun informeOsValores(){
        println("Informe a base do Retângulo:")
        base = readln().toDouble()
        println("Informe a altura do Retângulo:")
        altura = readln().toDouble()
        area = base*altura
    }
    override fun resultado(){
        println("Valor da área desse $formaGeometrica é : $area")
    }
}
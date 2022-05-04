package ExercicioUm

class Triangulo (override var lado: Double= 0.0, override var area: Double, override var base: Double,
                 override var altura: Double) : FigurasGeometricas {
    private var formaGeometrica = "Triângulo"

    override fun informeOsValores(){
        println("Informe a base do triângulo:")
        base = readln().toDouble()
        println("Informe a altura do triângulo:")
        altura = readln().toDouble()

        area = (base*altura) / 2
    }
    override fun resultado(){
        println("Valor da área desse $formaGeometrica é : $area")
    }
}
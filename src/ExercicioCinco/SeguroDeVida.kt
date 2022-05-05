package ExercicioCinco

class SeguroDeVida (var saldo : Double = 0.0): Tributos {
    override var calcularTributo: Double
        get() = 42.0
        set(value) {}
    override var resultado = saldo - calcularTributo
}
package ExercicioCinco

class ContaCorrente(private var saldo :Double = 0.0): Tributos {

    override var calcularTributo: Double
        get() =  saldo * 0.01
        set(value) {}
override var resultado = saldo - calcularTributo
}
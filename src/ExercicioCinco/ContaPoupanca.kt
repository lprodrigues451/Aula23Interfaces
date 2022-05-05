package ExercicioCinco

class ContaPoupanca(private var saldo: Double = 0.0): Tributos {
    override var calcularTributo: Double
        get() =  saldo * 0.0
        set(value) {}
    override var resultado = saldo - calcularTributo
}
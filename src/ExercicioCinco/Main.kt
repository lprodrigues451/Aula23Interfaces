package ExercicioCinco

fun main() {
    val cp : Tributos = ContaPoupanca(1000.0)
    println("Na Conta Poupança é tributado 0% do valor referente ao mês de Maio\n" +
            "Foi retirado do seu saldo :${cp.calcularTributo}")
    println("Seu saldo atual é : ${cp.resultado}")

    val cc : Tributos = ContaCorrente(1000.0)
    println("Na Conta Corrente é tributado 1% do valor referente ao mês de Maio\n" +
            "Foi retirado do seu saldo :${cc.calcularTributo}")
    println("Seu saldo atual é : ${cc.resultado}")

    val seguroDeVida : Tributos = SeguroDeVida(1000.0)
    println("O valor do tributo do seguro de vida é de : ${seguroDeVida.calcularTributo}")
    println("Seu saldo atual é : ${seguroDeVida.resultado}")
}
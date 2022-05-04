package Exemplo

class ContaCorrente : Conta {
    override val saldo: Double = 0.0
        get() = field

    override var valorDeposito: Double
        get() = super.valorDeposito
        set(value) {
            super.valorDeposito
        }

    override fun sacarValor(valorSaque: Double) {
        println("Saque no valor de $valorSaque na Conta Corrente!")
    }


    override fun depositarValor(valorDeposito: Double) {
        if (valorDeposito > 0.0){
            println("Valor depositado na Conta Corrente com sucesso!")
        }
    }
}
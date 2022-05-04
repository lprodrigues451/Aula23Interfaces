package Exemplo
interface Conta {
    //Propriedade abstratada
    val saldo: Double

    //Propriedade implementada
    var valorDeposito: Double
        get() = 0.0
        set(value) {
            if(value > 10){
                println("Valor depositado com sucesso!")
            }
        }

    //método abstrato
    fun sacarValor(valorSaque: Double)

    //Metodo implementado
    fun depositarValor(valorDeposito: Double){
        println("Deposito no valor de $valorDeposito")
    }
}
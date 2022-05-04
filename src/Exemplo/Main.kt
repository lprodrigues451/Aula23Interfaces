package Exemplo

fun main() {
    val contaCorrenteJessica: Conta = ContaCorrente()
    val contaPoupancaCarol : Conta = ContaPoupanca()
    val extratoBancario = Extrato()

    extratoBancario.exibirExtrato(contaCorrenteJessica)
    extratoBancario.exibirExtrato(contaPoupancaCarol)
}
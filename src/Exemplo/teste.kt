package Exemplo

import javax.swing.JOptionPane
import javax.swing.JScrollPane
import javax.swing.JTextArea


object fila_encadeada {
    @JvmStatic
    fun main(agrs: Array<String>) {
        var inicio: Fila? = null
        var fim: Fila? = null
        var aux: Fila?
        var op = 0
        do {
            val fi = Fila()
            op = try {
                JOptionPane.showInputDialog(dados(), 1).toInt()
            } catch (e: Exception) {
                Mensagem("AÇÃO CANCELAR FOI ACIONADA...... SISTEMA ENCERRANDO")
                break
            }
            if (op == 1) {
                fi.numero = JOptionPane.showInputDialog("DIGITE O NUMERO").toInt()
                fi.nome = JOptionPane.showInputDialog("DIGITE O NOME")
                if (inicio == null) {
                    inicio = fi
                    fim = fi
                } else {
                    fim!!.prox = fi
                    fim = fi
                }
            }
            if (op == 2) {
                if (inicio == null) {
                    ListaVazia()
                } else {
                    aux = inicio
                    val informacao = JTextArea(6, 25)
                    val scrool = JScrollPane(informacao)
                    informacao.append("NUMERO/t NOME \n")
                    informacao.append("===================\n")
                    while (aux != null) {
                        informacao.append(
                            """${aux.numero}	${aux.nome}
"""
                        )
                        aux = aux.prox
                    }
                    JOptionPane.showMessageDialog(
                        null, scrool, " MENSAGEM DO SISTEMA",
                        JOptionPane.INFORMATION_MESSAGE
                    )
                }
            }
            if (op == 3) {
                if (inicio == null) {
                    ListaVazia()
                } else {
                    Mensagem("Numero " + inicio.numero + " foi removido!")
                    inicio = inicio.prox
                }
            }
            if (op == 4) {
                if (inicio == null) {
                    ListaVazia()
                } else {
                    Mensagem("LISTA FOI ESVAZIADA !")
                    inicio = null
                }
            }
            if (op == 5) {
                if (inicio == null) {
                    ListaVazia()
                } else {
                    aux = inicio
                    var cont = 0
                    while (aux != null) {
                        cont++
                        aux = aux.prox
                    }
                    //Mensagem("TOTAL DE NUMEROS CADASTRADOS É: "+cont);
                }
            }
            if (op == 6) {
                Mensagem("SISTEMA ENCERRANDO....")
                break
            }
        } while (op != 6)
    }

    fun dados(): String {
        return """
               MENU DE OPÇÕES
               1- INSERIR NA FILA 
               2- CONSULTAR FILA 
               3- REMOVER DA FILA 
               4- REMOVER TODOS 
               5-QUANTIDADE DE ELEMENTOS NA FILA
               """.trimIndent()
    }

    fun Mensagem(a: String?) {
        JOptionPane.showMessageDialog(null, a, "RETORNO DO SISTEMA", JOptionPane.INFORMATION_MESSAGE)
    }

    fun ListaVazia() {
        JOptionPane.showMessageDialog(
            null, "<<< FILA ESTÁ VAZIA >>", "RETORNO DO SISTEMA",
            JOptionPane.INFORMATION_MESSAGE
        )
    }

    class Fila {
        var nome: String? = null
        var numero = 0
        var prox: Fila? = null
    }
}
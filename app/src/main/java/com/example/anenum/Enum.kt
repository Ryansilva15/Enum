package com.example.anenum

enum class StatusPedido{
    AGUARDANDO_APROVACAO,
    PEDIDO_REALIZADO,
    PAGAMENTO_CONFIRMADO,
    PEDIDO_ENVIADO,
    PEDIDO_ENTREGUE

}
class Pedido{
    val total : Double = 0.0
    var itens : String = ""
    var statusPedido : StatusPedido = StatusPedido.AGUARDANDO_APROVACAO

}

fun main() {
    var pedido : Pedido(125.90,"Camiseta, livro")

    pedido.statusPedido = StatusPedido.PEDIDO_REALIZADO

    pedido.statusPedido = StatusPedido.PEDIDO_ENVIADO


    if(pedido.statusPedido == StatusPedido.PEDIDO_REALIZADO){
        println("O seu pedido foi realizado!")
    } else if(pedido.statusPedido == StatusPedido.PEDIDO_ENVIADO){
        println("O seu pedido foi enviado")
    }else if(pedido.statusPedido == StatusPedido.PAGAMENTO_CONFIRMADO){
        println("O seu pagamento foi confirmado")
    }
}

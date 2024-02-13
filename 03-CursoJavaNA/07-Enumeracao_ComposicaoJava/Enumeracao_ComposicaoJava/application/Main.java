package Enumeracao_ComposicaoJava.application;

import Enumeracao_ComposicaoJava.entidades.Order;
import Enumeracao_ComposicaoJava.enumm.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Date utilDate = new Date();
        Order order = new Order(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
        System.out.println(order);

        //transformando emun em Estring
        OrderStatus so1 = OrderStatus.ENTREGUE;
        OrderStatus so2 = OrderStatus.valueOf("ENTREGUE");

        System.out.println(so1);
        System.out.println(so2);
    }
}

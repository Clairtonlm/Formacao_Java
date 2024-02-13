package Enumeracao_ComposicaoJava.application;

import Enumeracao_ComposicaoJava.entidades.Order;
import Enumeracao_ComposicaoJava.enumm.OrderStatus;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Order orde1 = new Order(180, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
        Order order = new Order(100, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
    }
}

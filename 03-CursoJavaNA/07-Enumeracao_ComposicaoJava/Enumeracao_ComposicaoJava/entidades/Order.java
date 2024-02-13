package Enumeracao_ComposicaoJava.entidades;
/*

 */
import Enumeracao_ComposicaoJava.enumm.OrderStatus;

import java.util.Date;
import java.util.Objects;

public class Order {
    private  Integer Id;
    private Date moment;
    private OrderStatus status;



    public Order(Integer id, Date moment, OrderStatus status) {
        Id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Date getDate() {
        return moment;
    }

    public void setDate(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return Objects.equals(getId(), order.getId()) && Objects.equals(getDate(), order.getDate()) && getStatus() == order.getStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDate(), getStatus());
    }

    @Override
    public String toString() {
        return "Order" + "\n" +
                "Id =" + this.Id + "\n" +
                "date =" + this.moment + "\n" +
                "status =" + this.status
                ;
    }
}

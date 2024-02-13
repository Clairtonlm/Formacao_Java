package Enumeracao_ComposicaoJava.entidades;

import Enumeracao_ComposicaoJava.enumm.OrderStatus;

import java.sql.Date;
import java.util.Objects;

public class Order {
    private  Integer Id;
    private Date date;
    private OrderStatus status;

    public Order(){

    }

    public Order(Integer id, Date date, OrderStatus status) {
        Id = id;
        this.date = date;
        this.status = status;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
                "date =" + this.date + "\n" +
                "status =" + this.status
                ;
    }
}

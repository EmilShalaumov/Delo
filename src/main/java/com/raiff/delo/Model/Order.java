package com.raiff.delo.Model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "orders")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer orderId;
    private Integer totalPrice;
    private Integer customerType;
    private Integer formOfPayment;

    public Integer getOrderId() {
        return orderId;
    }
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getCustomerType() {
        return customerType;
    }
    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    public Integer getPaymentForm() {
        return formOfPayment;
    }
    public void setPaymentForm(Integer formOfPayment) {
        this.formOfPayment = formOfPayment;
    }
}

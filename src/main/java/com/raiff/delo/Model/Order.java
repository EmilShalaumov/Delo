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
    private Integer accountId;

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

    public Integer getFormOfPayment() {
        return formOfPayment;
    }
    public void setFormOfPayment(Integer formOfPayment) {
        this.formOfPayment = formOfPayment;
    }

    public Integer getAccountId() {
        return accountId;
    }
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
}

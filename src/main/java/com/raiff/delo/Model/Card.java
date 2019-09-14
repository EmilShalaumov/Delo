package com.raiff.delo.Model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "cards")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Card {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Integer account_id;
    @Temporal(TemporalType.DATE)
    private Date open_date;
    @Temporal(TemporalType.DATE)
    private Date expire_date;
    private Integer number;
    private Integer status;
    private Integer product_id;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return account_id;
    }
    public void setAccountId(Integer account_id) {
        this.account_id = account_id;
    }

    public Date getOpenDate() {
        return open_date;
    }
    public void setOpenDate(Date open_date) {
        this.open_date = open_date;
    }

    public Date getExpireDate() {
        return expire_date;
    }
    public void setExpireDate(Date expire_date) {
        this.expire_date = expire_date;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getProductId() {
        return product_id;
    }
    public void setProductId(Integer productId) {
        this.product_id = product_id;
    }
}
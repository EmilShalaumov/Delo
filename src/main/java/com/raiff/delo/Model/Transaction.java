package com.raiff.delo.Model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "transactions")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Transaction {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Integer accountId;
    private Integer cardId;
    private Integer type;
    private Double amount;
    private Integer postStatus;
    private String accountFrom;

    public Integer getTransactionId() {
        return id;
    }
    public void setTransactionId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getCardId() {
        return cardId;
    }
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getPostStatus() {
        return postStatus;
    }
    public void setPostStatus(Integer postStatus) {
        this.postStatus = postStatus;
    }

    public String getAccountFrom() {
        return accountFrom;
    }
    public void setAccountFrom(String accountFrom) {
        this.accountFrom = accountFrom;
    }

}


package com.company;

import java.math.BigDecimal;

public abstract class Deposit {
    private BigDecimal amount;
    private int period;

    public BigDecimal getAmount() {
        return amount;
    }

    public int getPeriod() {
        return period;
    }


    public Deposit(BigDecimal depositeAmount, int depositePeriod) {
        this.amount=depositeAmount;
        this.period=depositePeriod;

    }

    public abstract BigDecimal Income();


}

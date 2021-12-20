package com.company;

import java.math.BigDecimal;
import java.util.Arrays;

public class Client {
    private  Deposit[] deposits;

    public Client() {
        deposits = new Deposit[10];
    }

    public boolean addDeposite(Deposit deposit){
        for (int i = 0; i < deposits.length; i++) {
            if(deposits[i]==null){
                this.deposits[i]=deposit;
                return true;
            }

        }
        return false;
    }

    public BigDecimal totalIncome(){
        BigDecimal total_income = BigDecimal.valueOf(0);
        for (int i = 0; i < deposits.length; i++) {
            if(deposits[i]!=null){
                total_income = total_income.add(deposits[i].Income());

            }else break;

        }
        return total_income;
    }

    public BigDecimal maxIncome(){
        BigDecimal max_income = BigDecimal.valueOf(0);

        for (int i = 0; i < deposits.length; i++) {
            if(deposits[i]!=null){
                if(deposits[i].Income().compareTo(max_income)>0){
                    max_income = deposits[i].Income();
                }}else break;
        }
        return max_income;
    }

    public BigDecimal getIncomeByNumber(int n){
        if(deposits[n-1]!=null){
            return deposits[n-1].Income();
        }
        return BigDecimal.valueOf(0);
    }
}

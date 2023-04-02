package com.project9.types;

import com.project9.Period;

public class Salary {
    private Period period = Period.MONTHLY;
    private double amount;

    public Salary(double amount) {
        this.amount = amount;
    }

    public Salary(Period period, double amount) {
        this(amount);
        this.period = period;
    }


    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public double getMonthly( ){
        switch (period){
            case DAILY: return  amount * 25;
            case WEEKLY: return  amount * 4;
            case YEARLY: return amount / 12;
            case  MONTHLY: return  amount;
            default:
                System.out.println("Unsupported Period");
        }
        return amount;
    }

    @Override
    public String toString() {
        return "ხელფასი: " +
                "პერიოდა=" + period +
                ", რაოდენობა=" + amount ;
    }
}

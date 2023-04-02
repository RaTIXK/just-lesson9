package com.project9.enums;

import com.project9.types.Salary;

public enum Profession {
    PROGRAMMER("პროგრამისტი", new Salary(600)),
    TEACHER("მასწავლებელი",  new Salary(800)),
    BAKER("მცხობელი",  new Salary(500)),
    ENGINEER("ინჟინერი",  new Salary(1200));

    private Salary averageSalary;
    private String readableName;
    Profession(String humanReadableName, Salary averageSalary) {
        this.averageSalary = averageSalary;
    }

    public Salary getAverageSalary() {
        return averageSalary;
    }

    public String getReadableName() {
        return readableName;
    }

    @Override
    public String toString() {
        return readableName;
    }
}

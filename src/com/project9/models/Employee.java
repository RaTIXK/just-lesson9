package com.project9.models;

import com.project9.enums.Gender;
import com.project9.enums.Profession;
import com.project9.types.FullName;
import com.project9.types.Salary;

public class Employee {

    private FullName fullName; //TODO Generalize
    private Gender gender;
    private Profession proffession;
    private Salary salary; //TODO Generalize

    public Employee(FullName fullName, Gender gender, Profession proffession, Salary salary) {
        this.fullName = fullName;
        this.gender = gender;
        this.proffession = proffession;
        this.salary = salary;
    }


    public FullName getName() {
        return fullName;
    }

    public void setName(FullName fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Profession getProffession() {
        return proffession;
    }

    public void setProffession(Profession proffession) {
        this.proffession = proffession;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "მუშაკი{" +
                "სახელი='" + fullName + '\'' +
                ", სქესი=" + gender +
                ", პროფესია=" + proffession +
                ", შემოსავალი=" + salary +
                '}';
    }

    public class Statistic {
        public boolean hasMoreThanAverageSalary() {
           return
            proffession.getAverageSalary().getMonthly() < salary.getMonthly();
        }
        public  double getAnnualSalary(){
            return 12 * salary.getAmount();
        }

    }
}

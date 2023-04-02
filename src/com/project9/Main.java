package com.project9;

import com.project9.enums.Gender;
import com.project9.enums.NameType;
import com.project9.enums.Profession;
import com.project9.models.Employee;
import com.project9.types.FullName;
import com.project9.types.Salary;

public class Main {
    public static void main(String[] args) {

        FullName fullName = new FullName(NameType.FULL_NO_MIDDLE_NAME, "Rati  Kvariani");
        System.out.println(fullName.getNames()[1]);
        Employee ratiKvariani = new Employee(
                fullName,
                Gender.MALE,
                Profession.PROGRAMMER,
                new Salary(Period.YEARLY, 10000.00));

        Employee.Statistic statistic = ratiKvariani.new Statistic();
        System.out.println(ratiKvariani.getName() + "-ის წლიური შემოსავალია: " + statistic.getAnnualSalary());

        if (statistic.hasMoreThanAverageSalary()) {
            System.out.print("აქვს");
        } else {
            System.out.print("არ აქვს ");
        }
        System.out.println(" საშუალოზე მეტი შემოსავალი: " + ratiKvariani.getSalary());
    }
}
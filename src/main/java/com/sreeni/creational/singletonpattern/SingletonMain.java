package com.sreeni.creational.singletonpattern;

public class SingletonMain {
    public static void main(String[] args) {
        FinanceDeptSingleton financeDeptSingleton1 = FinanceDeptSingleton.createFinanceDept();
        FinanceDeptSingleton financeDeptSingleton2 = FinanceDeptSingleton.createFinanceDept();
        FinanceDeptSingleton financeDeptSingleton3 = FinanceDeptSingleton.createFinanceDept();
        FinanceDeptSingleton financeDeptSingleton4 = FinanceDeptSingleton.createFinanceDept();

        System.out.println("Finance department1 " + financeDeptSingleton1);
        System.out.println("Finance department2 " + financeDeptSingleton2);
        System.out.println("Finance department3 " + financeDeptSingleton3);
        System.out.println("Finance department4 " + financeDeptSingleton4);


    }
}

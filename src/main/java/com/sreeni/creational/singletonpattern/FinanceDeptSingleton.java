package com.sreeni.creational.singletonpattern;

public class FinanceDeptSingleton {

    private static FinanceDeptSingleton financeDeptSingleton;
    private Integer financeDeptRoom;
    private String financeDeptHead;

/*    @Override
    public String toString() {
        return "FinanceDeptSingleton{" +
                "financeDeptRoom=" + financeDeptRoom +
                ", financeDeptHead='" + financeDeptHead + '\'' +
                ", financeDeptPhone='" + financeDeptPhone + '\'' +
                '}';
    }*/

    private String financeDeptPhone;

    private FinanceDeptSingleton(Integer financeDeptRoom, String financeDeptHead, String financeDeptPhone){
            this.financeDeptHead = financeDeptHead;
            this.financeDeptPhone = financeDeptPhone;
            this.financeDeptRoom = financeDeptRoom;
    }

    //synchronized keyword is used to create Singleton class in multithread programming as well, so no two threads create same object.
    public static synchronized FinanceDeptSingleton createFinanceDept(){
        if(financeDeptSingleton == null){
            financeDeptSingleton = new FinanceDeptSingleton(101, "JOHN", "9994445551");
        }
        return financeDeptSingleton;
    }

}

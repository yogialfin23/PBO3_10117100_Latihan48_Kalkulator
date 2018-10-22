package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class Main {

    public static void main(String[] args) {
        kalkulator kal = new kalkulator();
        kal.setValue1(7);
        kal.setValue2(5);
        System.out.println("VALUE 1 = "+kal.getValue1());
        System.out.println("VALUE 2 = "+kal.getValue2());
        kal.setNameProject();
        kal.setNoteProject("this project shown you how to manage method in java");
        System.out.println("Result add is = "+kal.add(kal.getValue1(),
                kal.getValue2()));
        System.out.println("Result minus is = "+kal.minus
                (kal.getValue1(),kal.getValue2()));
        System.out.println("Result Mutiple is = "+kal.multiplication
                (kal.getValue1(),kal.getValue2()));
        System.out.println("Result Division is = "+kal.division(
                kal.getValue1(),kal.getValue2()));
    }
}

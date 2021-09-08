package Loops;

import org.omg.CORBA.WStringSeqHelper;

public class StarPractice {

    public static void main(String[] args) {

        // 5 ==>
        //*
        //**
        //***
        //****
        //*****

        int number = 0;
        String star = "";

        while (number<10){
            star = star + "*";
            System.out.println(star);
            number++;

        }

    }
}

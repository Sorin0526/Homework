package IfStatement;

import java.util.Scanner;

public class Nested_If_Practice2 {

    public static void main(String[] args) {
        /*
        ask the candidate
        if knows Java
            if yes --> ask if know selenium
                      --> ask if knows API testing
                           --> ask if knows SQL
                              yes --> congrats . you are hired!
        if Java is no  --> print "Please learn Java and come back"
        if Sel is no --> print  we need someone who has sel knowledge
        if API testing is no -->  we need someone who knows API testing
        if SQL is no --> print we need someone who has SQL knowledge

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome. Do you know Java? yes/no");
        String java = scanner.next();

        if(java.equalsIgnoreCase("yes")){
            System.out.println(" Do u know Selenium?");
            String selenium = scanner.next();

            if(selenium.equalsIgnoreCase("yes")){
                System.out.println("Do you know API testing?");
                String api = scanner.next();

                if(api.equalsIgnoreCase("yes")){
                    System.out.println("do you have SQL knowledge?");
                    String sql = scanner.next();

                    if (sql.equalsIgnoreCase("yes")) {
                        System.out.println(" Congrats! you are hired");
                    }
                }else{
                    System.out.println("we need someone who knows API testing");

                }
            }else{
                System.out.println("we need someone who has sel knowledge");
            }
        }else {
            System.out.println("Please learn Java and come back");

        }


        }

    }


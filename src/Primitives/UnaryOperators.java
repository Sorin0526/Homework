package Primitives;

public class UnaryOperators {

    public static void main(String[] args) {

        int studentNumber= 25;
        studentNumber = studentNumber +1;
        studentNumber += 1;
        studentNumber++;
        System.out.println(studentNumber);

        ++studentNumber;
        System.out.println(studentNumber);

        studentNumber--;
        System.out.println(studentNumber);
        --studentNumber; //27
        System.out.println(studentNumber);
        studentNumber--; studentNumber--; studentNumber--;
        System.out.println(studentNumber);//24
//=====================================================================

        studentNumber++;
        studentNumber--;
        System.out.println(studentNumber++); //25 ----> it shows 24 but increases afterwards. studentNumber is now 25.
        System.out.println(studentNumber);// it will show 25

        System.out.println(++studentNumber); // it shows 26, that means increases first and then prints out

        System.out.println(studentNumber--);//show 26 and decrease by 1 , 25
        studentNumber--;//24
        --studentNumber;//23
        System.out.println(--studentNumber);//22  decrease first 22, show 22
        System.out.println(studentNumber);// print 22

        int a = studentNumber++ + studentNumber++ + 5;
        a--;
        a = studentNumber; // a= 24
        System.out.println(a--);// shows 24 a= 23
        System.out.println(a--);// shows 23 a= 22
        System.out.println(a);// shows 22










    }
}

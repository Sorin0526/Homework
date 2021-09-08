package Primitives;

public class BooleanPractice {
    public static void main(String[] args){
// for boolean data type, you can only give values of true or false

        boolean isLighton=true;

        boolean isBreaktime;

        isBreaktime=isLighton;

        System.out.println(isLighton);
        System.out.println(isBreaktime);

        int num=6;
        System.out.println(num);
        int num1=num;
        System.out.println(num1);

        boolean isClear= false;
        System.out.println(isClear);
        //System.out.println(isBreaktime+isClear); it will not compile
        System.out.println("!!!!!"+ isBreaktime+isClear);

        int i1 = 5;
        int i2 = 5;
        int i3 = 10;


        //is i1 = i2? yes--> true i1 == i2
        // is i1  = i3? no--> false i1 == i3 --> false

        boolean  isi1equalsToi2 = i1 == i2;
        System.out.println(isi1equalsToi2);// true
        boolean isi1equalsToi3 = i1 == i3;
        System.out.println(isi1equalsToi3);// false





}
}

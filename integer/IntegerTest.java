package main.base.integer;

public class IntegerTest
{
    public static void main(String[] args)
    {
        Integer x1 = new Integer(1);
        Integer x2 = 1;
        int x3 = 1;
        int x4 = new Integer(1);

        Integer x11 = new Integer(200);
        Integer x21 = 200;
        int x31 = 200;
        int x41 = new Integer(200);

        System.out.println(x1 == x2);//false
        System.out.println(x1 == x3);//true
        System.out.println(x2 == x3);//true
        System.out.println(x3 == x4);//true
        System.out.println(x2 == x4);//true

        System.out.println(x11 == x21);//false
        System.out.println(x11 == x31);//true
        System.out.println(x21 == x31);//true
        System.out.println(x31 == x41);//true
        System.out.println(x21 == x41);//true
        System.out.println(x2.equals(x3));//

    }
}

package main.base.string;

/**
 * 字符串测试
 * @author fanwei
 *
 */
public class StringTest
{
    public static void main(String[] args)
    {
        String s = new String("abc");
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println("=============================================================");
        System.out.println("s的地址： " + java.lang.System.identityHashCode(s));
        System.out.println("s1的地址： " + java.lang.System.identityHashCode(s1));
        System.out.println("s2的地址： " + java.lang.System.identityHashCode(s2));
        System.out.println("=============================================================");
        /**
         * 此时s1.intern()返回的是s1的常量池引用地址
         * s == s1.intern() ?： false
         */
        System.out.println("s == s1.intern() ?： " + (s == s1.intern()));
        System.out.println("s的地址： " + java.lang.System.identityHashCode(s));
        System.out.println("s1的地址： " + java.lang.System.identityHashCode(s1));
        System.out.println("=============================================================");
        /**
         * 此时s2.intern()返回的是s1的常量池引用地址
         * s == s2.intern() ?： false
         */
        System.out.println("s == s2.intern() ?： " + (s == s2.intern()));
        System.out.println("s的地址： " + java.lang.System.identityHashCode(s));
        System.out.println("s2的地址： " + java.lang.System.identityHashCode(s2));
        System.out.println("=============================================================");
        /**
         * 此时s2.intern()返回的是s1的常量池引用地址
         * s1 == s2.intern() ?： true
         */
        System.out.println("s1 == s2.intern() ?： " + (s1 == s2.intern()));
        System.out.println("s1的地址： " + java.lang.System.identityHashCode(s1));
        System.out.println("s2的地址： " + java.lang.System.identityHashCode(s2));
        System.out.println("=============================================================");
        System.out.println("s的地址： " + java.lang.System.identityHashCode(s));
        System.out.println("s1的地址： " + java.lang.System.identityHashCode(s1));
        System.out.println("s2的地址： " + java.lang.System.identityHashCode(s2));
        System.out.println("=============================================================");

    }
}

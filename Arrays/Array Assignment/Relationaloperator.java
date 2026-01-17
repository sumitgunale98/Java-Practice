public class Relationaloperator {
    public static void main(String[]args){
        System.out.println(10<20);
        System.out.println('a'<20);
        System.out.println('A'< 'a');
        System.out.println('a'<97.0);
        //System.out.println(true<false);
        //System.out.println(10<20<30);

        System.out.println(10==20);
        System.out.println('b'=='c');
        System.out.println('a'==97.0);
        System.out.println(10!=20);
        System.out.println(false== false);

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
        System.out.println(t1==t2);
        System.out.println(t1==t3);

        Thread t = new Thread();
        Object o = new Object();
        String s = new String("Sumit");
        System.out.println(t==o);
        System.out.println(o==t);
        //System.out.println(s==t);

        // Difference between == operator and .equals to operator

        String s1 = new String("ABCD");
        String s2 = new String("ABCD");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));




    }
}

 class Operators
{
    public static void main(String[] args)
    {
      int x = 10;
      int y = x++; //y = ++10;/y = ++(x++)/ constant values are not applicable.
      // final int x= 10;it is not allowed.
      char ch = 'a';
      ++ch;
      double d =10.5;
      ++d;
      //All primitive type except boolean we can apply increment and decrement operators.
      //byte b = 10;b = b+1;
      System.out.println(y);
      System.out.println(x);
      System.out.println(ch);
      System.out.println(d);


    }
}


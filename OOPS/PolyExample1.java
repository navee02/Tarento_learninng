class A{
   int multiply(int a,int b)
   {
     return a*b;
   }

   double multiply(double a,double b)
   {
     return a*b;
   }
}

public class PolyExample1 {
    public static void main(String args[])
    {
        A x=new A();
        System.out.println(x.multiply(2,5));
        System.out.println(x.multiply(2.6,5.3));
    }
    
}

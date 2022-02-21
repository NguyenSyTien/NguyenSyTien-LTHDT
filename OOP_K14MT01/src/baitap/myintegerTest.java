package baitap;

public class myintegerTest {
     public static void main(String[] args) { 
          myInteger interger;
         interger = new myInteger(3);
         interger.show();
         interger.increment();
         myintegerTest integerone;
         integerone = new integerone(1);
         System.out.println(integerone.greaterThan(interger));
         System.out.println(integerone.lessThan(interger));


       
    }
    
}

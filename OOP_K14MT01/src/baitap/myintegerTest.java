package baitap;

public class myintegerTest {
     public static void main(String[] args) { 
        myinterge interger;
         interger = new myinterge(3);
         interger.show();
         interger.increment();
         myintegerTest integerone;
         integerone = new myinterge(1);
         System.out.println(integerone.greaterThan(interger));
         System.out.println(integerone.lessThan(interger));


       
    }
    
}

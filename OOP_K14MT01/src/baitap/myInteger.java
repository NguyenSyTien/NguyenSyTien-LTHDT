package baitap;

 class myInteger {
     private int value;
     public myInteger(int initialvalue){
         value = initialvalue;

     }
public myInteger(){
    this(0);
}
public myInteger(myInteger other){
    this(other.value);
}
    
}

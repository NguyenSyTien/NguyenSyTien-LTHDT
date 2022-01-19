package baitap;
 class myinterger {
     private int value;
     public Boolean greaterThan (myinterger other){
         return (this.value > other.value);
     }
    public boolean lessthan(myinterger other){
        return(other.greaterThan(this));
    }
    public myinterger increment(){
        value++;
        return this;
    }
}

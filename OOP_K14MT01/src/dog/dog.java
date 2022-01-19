package dog;
public class dog {
    int size;
    String breed;
    void bark(){
        if(size > 14){
            System.out.println("ruf! ruf!");
        }else{
            System.out.println("Yip! Yip!");
        }
    }
void setBigger(){
        size += 5;

    }
  void run(){
      System.out.println("Running ...");
      this.bark();
  }  
}

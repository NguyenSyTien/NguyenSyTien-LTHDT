package ooToan3Buoi5;

public class dog {
   private int size;//implementation(che lai ne)
   private String breed;//interface(khoe ra ne)
   private String name ;//interface
    //khoe ra ne
    public void setSize(int size){
    this.size = size;
    if(size>0){
    this.size = size;
    }else
        System.out.println("sai kich co !!!");
    }

    public int getSize(){
        return this.size;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed() {
        return this.breed;
            
    }
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return this.name;
    }
    
}
    
        
    
    


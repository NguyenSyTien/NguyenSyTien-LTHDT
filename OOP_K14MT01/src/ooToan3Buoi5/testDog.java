package ooToan3Buoi5;

public class testDog {
     public static void main(String[] args) {
        dog dog = new dog();
        dog.setName("phat");
        dog.setSize(8);
        dog.setBreed("viet nam"); 
        System.out.println("ten cua cho la:"+ dog.getName());
        System.out.println("size cua cho:"+ dog.getSize());
        System.out.println("Giong cho:"+ dog.getBreed());
       
}

}

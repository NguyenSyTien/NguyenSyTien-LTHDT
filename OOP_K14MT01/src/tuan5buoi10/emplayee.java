package tuan5buoi10;

public class emplayee extends person{
    private double salary;
    @Override
    public String toString(){
        return "name"+this.name+"birthday"+birthday+"salary"+this.salary;
    }
}

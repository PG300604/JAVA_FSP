package comp.examples.codes.inheritance;
class Students{
    void study(){
        System.out.println("We are in Students Class");
    }
}
class Teachers{
    void study(){
        System.out.println("We are in teachers Class");
    }

}

public class Multiple_Inheritance extends Students,Teachers {
    public static void main(String[] args){

    }
}

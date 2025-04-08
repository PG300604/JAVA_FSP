package comp.examples.codes.inheritance;
class Employee{
    void work(){
        System.out.println("Employee Works.");
    }
}
class Human extends Employee{
    void result(){
        System.out.println("Human Solves Tasks");
    }
}
class Workmen extends Employee{
    void task(){
        System.out.println("Workmen works to Give Result");
    }
}

public class Employee_Heirarchial_Inheritance {
    public static void main(String[] args){
        Human h=new Human();
        Workmen w=new Workmen();
        h.work();
        w.work();
        h.result();
        w.task();
    }
}

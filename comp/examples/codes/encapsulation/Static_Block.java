package comp.examples.codes.encapsulation;

public class Static_Block {
    public Static_Block(){
        System.out.println("We are in Constructor.");
    }
    static {
        System.out.println("We are in Static Block.");
    }
    public static void main (String[] args){
        System.out.println("We are in main function.");
        Static_Block ss=new Static_Block();
    }
}

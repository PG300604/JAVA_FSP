package comp.examples.codes.inheritance;

class Customer
{
    void Transaction(){
        System.out.println("We are in Customer Class");
    }
}
public class Banking extends Customer {
    void Balance(){
        System.out.println("Bank has Balance.");
    }
    public static void main (String[] args){
        Banking b =new Banking();
        b.Transaction();
        b.Balance();
    }

}

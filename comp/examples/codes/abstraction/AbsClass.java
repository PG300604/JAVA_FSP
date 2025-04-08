package comp.examples.codes.abstraction;

abstract class College {
    abstract void admission();
    void admin(){
        System.out.println("Administrative Block.");
    }
}
class AdminBlock extends College{

    @Override
    void admission() {
        System.out.println("In College.");
    }
}
public class AbsClass {
    public static void main (String[] args){
        AdminBlock ad=new AdminBlock();
        ad.admin();
        ad.admission();
    }
}

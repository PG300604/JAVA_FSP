package comp.examples.codes;

public class StaticVariable2 {
    int roll;
    static String college="AEC";
    public StaticVariable2(int roll){
        this.roll=roll;
    }
    void display(){
        System.out.println("Roll="+roll+" College="+college);
    }

    public static void main(String[] args) {
        StaticVariable2 str1=new StaticVariable2(101);
        StaticVariable2 str2=new StaticVariable2(102);
        str1.display();
        str2.display();

        StaticVariable2.college="NIT";
        str1.display();
        str2.display();
    }
}

package comp.examples.codes;

public class StaticVariable {
    public static int count=0;
    public StaticVariable(){
        count++;
        System.out.println("Value="+count);
    }
    public static void main(String[] args) {
        StaticVariable str1=new StaticVariable();
        StaticVariable str2=new StaticVariable();
        StaticVariable str3=new StaticVariable();
        StaticVariable str4=new StaticVariable();
    }
}

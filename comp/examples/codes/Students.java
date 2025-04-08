package comp.examples.codes;

public class Students {
    int roll;
    String name;
    public Students(String n, int r){
        this.roll=r;
        this.name=n;
    }
    void display(){
        System.out.println(name+" "+roll);
    }
    void result(){
        this.display();
        System.out.println("This is the result part");
    }
    public static void main(String[] args){
        Students st=new Students("Priyanshu",9);
        st.result();
    }
}

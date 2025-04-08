package comp.examples.codes.encapsulation;

public class Encap_main {
    public static void main(String[] args){
        Encapsulation e=new Encapsulation();
        e.setCollege("AEC");
        e.setCollege("Asansol Eng Clg");
        e.setRoll(9);

        System.out.println(e.getCollege());
        System.out.println(e.getCollege());
        System.out.println(e.getRoll());
    }
}

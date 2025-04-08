package comp.examples.codes.exception_handling;

class CustomAgeException extends Exception{
    public CustomAgeException(String name){
        super(name);
    }
}
public class ThrowExample {
    static void checkage(int age) throws CustomAgeException{
        if(age<18){
            throw new CustomAgeException("You are a Loser Bro !!!");
        }
        else{
            System.out.println("You are now the conqueror ,you can do whatever you want ,whatever!!!");
        }
    }
    public static void main(String[] args) {
        try {
            ThrowExample.checkage(21);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

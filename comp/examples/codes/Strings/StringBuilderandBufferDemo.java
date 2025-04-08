package comp.examples.codes.Strings;

public class StringBuilderandBufferDemo {
    public static void main(String[] args) {
        StringBuilder builder =new StringBuilder("Priyanshu ");
        builder.append("Ghosh");
        System.out.println("String Builder output is :"+builder);
        StringBuffer buffer =new StringBuffer("Priyanshu ");
        buffer.append("Ghosh");
        System.out.println("String Buffer output is :"+buffer);
    }
}

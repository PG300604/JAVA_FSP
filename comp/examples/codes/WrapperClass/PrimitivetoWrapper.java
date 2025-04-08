package comp.examples.codes.WrapperClass;

public class PrimitivetoWrapper {
    public static void main(String[] args) {
        int num=100;
        Integer wrapper=Integer.valueOf(num);
        System.out.println(wrapper);

        int primitive=wrapper.intValue();
        System.out.println(primitive);

        Integer a=100;
        Integer b=100;
        System.out.println(a==b);
        System.out.println(a.equals(num));

        String str ="123";
        int number=Integer.parseInt(str);
        System.out.println("Parsed integer : "+number);

        int x=456;
        String ss=Integer.toString(x);
        System.out.println("converted String : "+ss);

        System.out.println("Integer Min :"+Integer.MIN_VALUE);
        System.out.println("Integer Max :"+Integer.MAX_VALUE);

        System.out.println("Binary : "+Integer.toBinaryString(num));
        System.out.println("Octal : "+Integer.toOctalString(num));
        System.out.println(("Hexadecimal : "+Integer.toHexString(num)));

        char ch='A';
        System.out.println("The Letter : "+Character.isLetter(ch));
        System.out.println("The Letter : "+Character.isDigit(ch));
        System.out.println("The Letter : "+Character.toLowerCase(ch));

    }
}

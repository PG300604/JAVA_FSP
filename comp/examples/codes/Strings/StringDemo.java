package comp.examples.codes.Strings;

public class StringDemo {
    public static void main(String[] args) {
        String data ="Hello World";
        //Method2: String data=new String("Hello World");
        String data2="hello World";
        String data3="Chamatkar";
        String data4="    Hello World   ";
        int len=data.length();
        System.out.println(len);
        System.out.println(data==data2);
        System.out.println(data.equals(data2));
        System.out.println(data.charAt(8));
        System.out.println(data2.equalsIgnoreCase(data));
        System.out.println(data.indexOf("l"));
        System.out.println(data3.replace("Chamatkar","Balatkar"));
        System.out.println(data.substring(1,4));
        System.out.println(data4.toUpperCase());
        System.out.println(data4.trim());
        System.out.println(data.contains("H"));
        System.out.println(data.startsWith("h",4));
        char[] arr=new char[9];
        data.getChars(1,8,arr,0);
        System.out.println(arr);
    }
}

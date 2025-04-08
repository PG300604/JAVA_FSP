package comp.examples.codes.Generics;

interface College<T> {
    void admission(T data);
}

public class GenericInterface<T> implements College<T> {

    @Override
    public void admission(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        College<String> cl = new GenericInterface<>();
        cl.admission("2025 batch");
    }
}

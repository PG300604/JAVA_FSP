package comp.examples.codes.Generics;

class ElectronicGoods<T> {
    private T t;

    public void setItems(T t) {
        this.t = t;
    }

    public T getItems() {
        return t;
    }
}

public class GenericsClass {
    public static void main(String[] args) {
        ElectronicGoods<String> electronicGoods = new ElectronicGoods<String>();
        electronicGoods.setItems("Refrigerator");
        System.out.println("String Item: " + electronicGoods.getItems());

        ElectronicGoods<Integer> elc = new ElectronicGoods<Integer>();
        elc.setItems(12345);
        System.out.println("Integer Item: " + elc.getItems());
    }
}

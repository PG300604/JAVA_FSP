package comp.examples.codes.abstraction;

    interface MyInterface {
        void abstractMethod();

        default void defaultMethod() {
            System.out.println("This is the default method from the interface.");
        }

        static void staticMethod() {
            System.out.println("This is the static method from the interface.");
        }
    }

    class MyClass implements MyInterface {
        public void abstractMethod() {
            System.out.println("Abstract method implemented in MyClass.");
        }

        @Override
        public void defaultMethod() {
            System.out.println("Default method overridden in MyClass.");
        }

        public void accessAllMethods() {
            abstractMethod();
            defaultMethod();
            MyInterface.staticMethod();
        }
    }

    public class InterfaceDemo {
        public static void main(String[] args) {
            MyClass obj = new MyClass();
            obj.accessAllMethods();
        }
    }

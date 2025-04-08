package comp.examples.codes.abstraction;
public class InfImp1 {

    interface MyInterface {
        void display();

        void result();
    }

    interface OurInterface extends MyInterface {
        void teach();
    }

    public static class InfImp1 implements OurInterface {

        @Override
        public void teach() {

        }

        @Override
        public void display() {

        }
    }

    public static void main(String[] args) {
        InfImp1 ad=new InfImp1();
        ad.display();
        ad.result();
        ad.teach();
    }
}


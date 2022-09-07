class OuterClass {

    private int value = 100;

    //non static inner class
    class InnerClass {
        InnerClass() {
            System.out.println("Value = " + value);
        }
    }

    static class MyStaticInner {
        MyStaticInner(int value) {
            System.out.println("Value = " + value);
        }
    }
}

public class NestedExample {
    public static void main(String[] args) {
        OuterClass.MyStaticInner inner = new OuterClass.MyStaticInner( 100);
        
    }
}

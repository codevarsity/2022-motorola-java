
class MyNumber {
    int number;
    MyNumber(int number) {
        this.number = number;
    }
}

public class DataPassing {

    public static void main(String[] args) {
        int myValue = 100;
        updateValue(myValue);
        System.out.println(myValue);

        MyNumber myNumber = new MyNumber(100);
        updateNumber(myNumber);
        System.out.println(myNumber.number);

        int number = 10;
        int number1 = number;

        number ++;

        System.out.println(number1);

        Integer i = new Integer(10);
        Integer i1 = i;
        i1++;
        System.out.println(i);
    }

    static void updateValue(int val) {
        val += 1;
    }

    static void updateNumber(MyNumber n) {
        n.number += 1;
    }
}

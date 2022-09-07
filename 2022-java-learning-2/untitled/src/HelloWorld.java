import java.util.ArrayList;

class Student {
    String name;
    String id;
    String Address;
    int age;
}

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");


        //value types, copy
        int value1 = 100;
        int value2 = value1;

        float speed;


        //int, float, double, char, byte etc.


        //Reference Types, pointers & references
        String name = "Amit";
        String name1 = name;
        String nam2 = new String("Amit Gulati");

        float temp = 100.0f;
        //Float temperature = Float.valueOf(temp);

        final float PI = 3.14159f;
        float radius = 10.0f;

        //result of an arithmetic expression is the same type as operands
        float area = PI * radius * radius;

        float temperature = 100.0f;
        //result of a logical expression is boolean type
        boolean isBoiling = temperature >= 100.0f;

        boolean myBooleanVal = true;
        boolean result = myBooleanVal && temperature >= 100.0f;

        double myDoubleValue = 100.0f;

        String address = null;
        address = "India";
        String lowerCase = address.toLowerCase();

        String countryName = "India";
        boolean isSame = (address.equals(countryName));
        System.out.println(isSame);


        Object obj1 = new Object();
        Object obj2 = new Object();

        isSame = obj1 == obj2;
        System.out.println(isSame);

        StringBuilder builder = new StringBuilder();
        builder.append("Amit");
        builder.append(" ");
        builder.append("Gulati");
        String fullName = builder.toString();

    }
}

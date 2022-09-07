
public class ConditionalCode {
    public static void main(String[] args) {

        double temperature = 33.0;
        if (temperature >= 40.0) {
            System.out.println("Its Too Hot");
        } else {
            System.out.println("The weather is fine");
        }


        int numberOfWheels = 2;
        switch (numberOfWheels) {
            case 1:
                System.out.println("Unicycle");
                break;
            case 2:
                System.out.println("Bi-Cycle");
                break;
            case 3:
                System.out.println("Tri-Cycle");
                break;
            case 4:
                System.out.println("Quad-Cycle");
                break;

        }

    }
}

public class Loops {

    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i) {
            System.out.println(i);
        }

        int numberOfLives = 3;
        while (numberOfLives >= 0) {
            System.out.println("Number of Lives = " + numberOfLives);
            numberOfLives -= 1;
        }
    }
}

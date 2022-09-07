import java.io.Closeable;
import java.io.IOException;

class Blob implements Closeable {

    Blob() {
        System.out.println("Creating Blob");
    }


    @Override
    public void close() throws IOException {
        System.out.println("Deallocating Blob");
    }
}

public class MemoryManagement {

    public static void main(String[] args) {
        createObjects();
    }

    public static void createObjects() {
        Blob blob = new Blob();
    }
}

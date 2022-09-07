

interface ButtonListener {
    void doWork();
}


class Button {
    ButtonListener listener;

    String title;


    Button(String title) {
        this.title = title;
    }

    void setButtonListener(ButtonListener listener) {
        this.listener = listener;
    }
    void buttonTapped() {
        System.out.println("Button " + title + " tapped");
        if (listener != null) {
            listener.doWork();
        }

    }
}

class Action implements ButtonListener {
    public void doWork() {
        System.out.println("Working on Action");
    }
}


public class ObjectCommunication {

    public static void main(String[] args) {
        Button button = new Button("Do Work:");
        Action action = new Action();
        button.setButtonListener(action);
        button.buttonTapped();
    }
}



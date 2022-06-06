package Utils;

public class Printer {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessages(String message1, String message2) {
        System.out.println(message1 + " " + message2);
    }

    public void printMessages(String message, int valor) {
        System.out.println(message+": "+valor);
    }
}

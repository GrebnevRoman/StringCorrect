package view;

public class ConsoleResultPrinter implements ResultPrinter {
    @Override
    public void print(String message) {
        System.out.print(message);
    }
}

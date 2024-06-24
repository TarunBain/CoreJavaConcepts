package NumberPrinter;

public class NumberPrinter implements Runnable{
    private int numberToPrint;
    public void run(){
        System.out.println( numberToPrint + "Thread- " + Thread.currentThread().getName());
    }
    public NumberPrinter(int x) {
        numberToPrint = x;
    }

}

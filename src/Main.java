import helloWorldPackage.HelloWorldClass;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HelloWorldClass obj = new HelloWorldClass();
        //this will not start a new thread
        //obj.run();

        Thread t = new Thread(obj);
        t.start();
        System.out.println("Hello World!" + Thread.currentThread().getName());
    }
}
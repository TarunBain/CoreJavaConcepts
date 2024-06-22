package helloWorldPackage;

public class HelloWorldClass implements Runnable{
    public void run(){
        System.out.println("Hello World from HelloWorldClass" + Thread.currentThread().getName());
    }
}

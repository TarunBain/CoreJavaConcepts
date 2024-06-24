package helloWorldPackage;

public class HelloWorldClass implements Runnable{
    public void doSomething(){
        System.out.println("Doing something" + Thread.currentThread().getName());
    }
    public void run(){
        System.out.println("Hello World from HelloWorldClass " + Thread.currentThread().getName());
        doSomething();
    }
}

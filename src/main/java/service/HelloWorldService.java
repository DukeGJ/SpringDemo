package main.service;

public class HelloWorldService {
    private HelloWorld helloWorld;

    public HelloWorldService(){

    }
    public HelloWorld getHelloWorld() {
        return helloWorld;
    }

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }
}

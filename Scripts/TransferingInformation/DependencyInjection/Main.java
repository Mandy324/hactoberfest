package File6_Recursion.Scripts.TransferingInformation.DependencyInjection;

public class Main {

    public static void main(String[] args) {
        StringProvider stringProvider = new CreateString("Hello World!");
        SeeStringText seeStringText = new SeeStringText(stringProvider);
    }
}

/*
To make and use dependency injection (DI) you need few things:
1. Interface
2. Class that implements the interface
3. Class that injects the interface to get the information

1.1 In the interface you create the abstract method or method

2.1 You implement the interface and provide to it some kind of value

3.1 How you need to provide the class with the interface, but not by implementing it.
You create it as a private variable, and use it as such. You need to provide the
interface variable to the constructor parameters. This is what dependency injection is!

 */
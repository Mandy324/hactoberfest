package File6_Recursion.Scripts.TransferingInformation.Composition;

public class Main {

    public static void main(String[] args) {
        CreateSentence createSentence = new CreateSentence("This is a sentence filled with information");
        GetSentenceInformation getSentenceInformation = new GetSentenceInformation(createSentence);
    }
}

/*
This is Composition, the main difference between DI and Composition is how tight are the connections
between classes. The looser, the better, but in some cases is best to have tight coupled components.

With DI is loose coupled is possible!
Composition is much better than extending a class. There are no added benefits from extending a class,
but by Composition you have more flexibility and looser connection between components (Objects)!

To make Composition possible, you need to get a class and provide it to the other class as a variable.

CreateSentence is converted to a variable object to the GetSentenceInformation.

 */
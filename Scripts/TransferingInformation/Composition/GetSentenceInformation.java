package File6_Recursion.Scripts.TransferingInformation.Composition;

public class GetSentenceInformation {

    private final CreateSentence createSentence;

    public GetSentenceInformation(CreateSentence createSentence) {
        this.createSentence = createSentence;

        getSentenceInformation();
    }

    private void getSentenceInformation() {
        String sentence = createSentence.getSentence();
        System.out.println(sentence);
    }
}

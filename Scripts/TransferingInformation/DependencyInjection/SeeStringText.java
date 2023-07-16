package File6_Recursion.Scripts.TransferingInformation.DependencyInjection;

public class SeeStringText {

    private final StringProvider stringProvider;

    public SeeStringText(StringProvider stringProvider) {
        this.stringProvider = stringProvider;

        showTextInformation();
    }

    private void showTextInformation() {
        String text = stringProvider.getText();
        System.out.println(text);
    }
}

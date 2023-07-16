package File6_Recursion.Scripts.TransferingInformation.DependencyInjection;

public class CreateString implements StringProvider {

    private String text;

    public CreateString(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}

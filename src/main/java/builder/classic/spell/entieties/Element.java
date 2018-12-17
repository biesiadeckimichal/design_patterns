package builder.classic.spell.entieties;

public class Element {
    private String element;

    public void setElement(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Element{" +
                "element='" + element + '\'' +
                '}';
    }
}

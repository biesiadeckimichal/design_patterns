package builder.classic.spell.entieties;

public class AdditionalEffect {
    private String additionalEffect;

    public void setAdditionalEffect(String additionalEffect) {
        this.additionalEffect = additionalEffect;
    }

    @Override
    public String toString() {
        return "AdditionalEffect{" +
                "additionalEffect='" + additionalEffect + '\'' +
                '}';
    }
}

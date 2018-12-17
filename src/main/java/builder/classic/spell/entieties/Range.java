package builder.classic.spell.entieties;

public class Range {
    private String type;
    private int range;

    public void setType(String type) {
        this.type = type;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Range{" +
                "type='" + type + '\'' +
                ", range=" + range +
                '}';
    }
}

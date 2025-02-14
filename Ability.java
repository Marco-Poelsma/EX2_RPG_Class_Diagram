public class Ability {
    private Type type;
    private Range range;

    public Ability(Type type, Range range) {
        this.type = type;
        this.range = range;
    }

    // Getters and setters
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }
}

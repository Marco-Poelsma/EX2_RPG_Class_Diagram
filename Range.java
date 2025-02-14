public enum Range {
    MELEE(1), MEDIUM(10), LONG(25);
    
    int distance;
    
    Range(int distance) {
        this.distance = distance;
    }

    public int distance() {
        return distance;
    }
    
}

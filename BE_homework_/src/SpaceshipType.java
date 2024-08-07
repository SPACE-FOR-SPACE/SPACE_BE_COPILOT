public enum SpaceshipType {
    MANNED(true), UNMANNED(false);
    private final boolean isManned;

    SpaceshipType(boolean isManned) {
        this.isManned=isManned;
    }

    public boolean isManned(){
        return isManned;
    }
}

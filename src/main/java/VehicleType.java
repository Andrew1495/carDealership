public enum VehicleType {
    DISEL("disel"),
    PETROL("petrol"),
    HYBRID("hybrid"),
    ELECTRIC("electric");


    private final String engine;


    VehicleType(String engine){
        this.engine = engine;

    }

    public String getEngine() {
        return engine;
    }
}

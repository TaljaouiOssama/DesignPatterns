public class Director {

    private  Builder builder;


    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void makeSUV(Builder builder){
        this.builder.reset();
        this.builder.setSeats(6);
        this.builder.setEngine(new Engine("SUV Engine"));
        this.builder.setTripComputer(new TripComputer());

    }
    public  void makeSportCar(Builder builder){
        this.builder.reset();
        this.builder.setSeats(2);
        this.builder.setEngine(new Engine("Sport Engine"));
        this.builder.setGPS(new GPS());
    }
}

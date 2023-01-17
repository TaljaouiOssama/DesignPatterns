public class Car {
    private GPS gps;
    private Engine engine;
    private TripComputer tripComputer;
    private int seats;

    public Car() {
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GPS getGps() {
        return gps;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "gps=" + gps +
                ", engine=" + engine +
                ", tripComputer=" + tripComputer +
                ", seats=" + seats +
                '}';
    }
}

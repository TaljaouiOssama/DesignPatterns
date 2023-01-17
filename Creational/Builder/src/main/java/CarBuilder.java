public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder() {
       this.reset();
    }

    @Override
    public void reset() {
        this.car=new Car();
    }

    @Override
    public void setSeats(int numbers) {
        this.car.setSeats(numbers);
    }

    @Override
    public void setEngine(Engine engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
    this.car.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(GPS gps) {
        this.car.setGps(gps);

    }
    public Car getResult(){
        Car product=this.car;
        this.reset();
        return product;
    }
}

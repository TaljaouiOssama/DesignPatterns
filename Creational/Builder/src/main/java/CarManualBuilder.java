public class CarManualBuilder implements Builder{
    private Manual manual;
    public CarManualBuilder(){
        this.reset();
    }
    @Override
    public void reset() {
        this.manual=new Manual();
    }

    @Override
    public void setSeats(int numbers) {
        String result=this.manual.getManual()+" Seats: "+numbers;
        this.manual.setManual(result);
    }

    @Override
    public void setEngine(Engine engine) {
        String result=this.manual.getManual()+" Engine: "+engine;
        this.manual.setManual(result);
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        String result=this.manual.getManual()+" TripComputer: "+tripComputer;
        this.manual.setManual(result);

    }

    @Override
    public void setGPS(GPS gps) {
        String result=this.manual.getManual()+" GPS: "+gps;
        this.manual.setManual(result);

    }

    public Manual getResult() {
        return this.manual;
    }
}

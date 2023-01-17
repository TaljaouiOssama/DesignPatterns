public class Client {
    public static void main(String[] args) {
        Director director=new Director();
        CarBuilder carBuilder=new CarBuilder();
        director.makeSportCar(carBuilder);
        Car car= carBuilder.getResult();
        System.out.println(car);
        CarManualBuilder carManualBuilder=new CarManualBuilder();
        director.makeSportCar(carManualBuilder);
        Manual manual=carManualBuilder.getResult();
        System.out.println(manual);
    }
}

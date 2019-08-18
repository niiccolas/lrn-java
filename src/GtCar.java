public class GtCar {


    String make, model, photo;
    byte gasoline;
    int speed, distTravelled;

    GtCar(String make, String model, int speed, String photo) {
        this.make = make;
        this.model = model;
        this.photo = photo;
        this.speed = speed;

        this.gasoline = 100;
        this.distTravelled = 0;
    }

    public void drive(int nGear) {
        this.distTravelled += nGear * this.speed;
        this.gasoline -= this.distTravelled / 4;
    }

    public static void main(String[] args) {

    }


    @Override
    public String toString() {
        return "GtCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", gasoline=" + gasoline +
                ", distTravelled=" + distTravelled +
                ", speed=" + speed +
                '}';
    }
}

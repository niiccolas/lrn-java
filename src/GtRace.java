import java.util.Scanner;

public class GtRace {
    private static int raceDistance = 100;
    static GtCar ranking[] = {
            new GtCar("Alpine", "A310", 5, "🚙"),
            new GtCar("Bugatti", "Chiron", 7, "🚗"),
            new GtCar("Renault", "Spider", 6, "🚕"),
    };

    public GtRace(){
        raceDistance = 100;
    }

    public static void main(String[] args) {
        while(!carWinsRace()) {
            run();
        }

        for (GtCar car : ranking) {
            System.out.println(car.toString());
        }
    }

    public static boolean carWinsRace() {
        for (GtCar car : ranking) {
            if (car.distTravelled >= raceDistance) {
                return true;
            }
        }
        return false;
    }

    public static void driveCars() {
        for (GtCar car : ranking) {
            System.out.print(String.format("Driving the %s %s %s. ", car.photo, car.make, car.model));
            car.drive(getUserInput());
            System.out.println(car.toString());
        }
    }

    public static void run() {
        driveCars();
        drawRanking();
    }

    public static void drawRanking() {

        System.out.println("------TURN RESULTS-------");
        for (GtCar car : ranking) {
            System.out.println(car.make + "\t travelled " + car.distTravelled + " Km. " + (raceDistance - car.distTravelled) + " Km to go." );
        }
        System.out.println("--------------------");
    }

    public static int getUserInput() {
        Scanner kb = new Scanner(System.in);
        int userInput;
        System.out.print("Change gears (1-5): ");

        while (true)
            try {
                userInput = Integer.parseInt(kb.nextLine());
                if (userInput < 1 || userInput > 5)
                    System.out.print("Gears from 1 to 5 only! Try again: ");
                else
                    // exit the while loop as soon as we have a correct input
                    break;
            } catch (NumberFormatException nfe) {
                System.out.print("Integers only! Try again: ");
            }

        return userInput;
    }


    // SETTERS
    public void setraceDistance(int d){
        raceDistance = d;
    }
    // GETTERS
    public static int getraceDistance(){
        return raceDistance;
    }
}

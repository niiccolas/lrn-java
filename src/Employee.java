/*
*   COURSE JAVA L1
*   Plusieurs voitures en compétition
*   POO
*
*   1. Demande un chiffre
*           multiplité à la vitesse de la voiture
*               pour chaque voiture
*               = AVANCÉE EN KM
*
* */

//public class GtRace {
//
//
//    GtRace(String make, String model, int year) {
//        carMake    = make;
//        carModel   = model;
//        carYear    = year;
//    }
//
//    public static void main(String[] args) {
//        new Car("Renault");
//        System.out.println();
//    }
//}

public class Employee {

    int id;
    String name;

    //parameterized constructor with two parameters
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    void info(){
        System.out.println("Id: "+id+" Name: "+name);
    }

    public static void main(String args[]){
        Employee obj1 = new Employee(10245,"Chaitanya");
        Employee obj2 = new Employee(92232,"Negan");
        obj1.info();
        obj2.info();
    }
}
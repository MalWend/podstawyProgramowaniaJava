import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        Car Opel = new Car (2,3.0,4);
        Opel.newMethod();
        Car Skoda = new Car("super", "zielony", 2004, "petrol");
        Skoda.ifIBuy();
        Car Toyota = new Car("Razor", "blue", 2021, "diesel");
        Car Fiat = new Car ("Uno FIRE","silver",2000,"petrol");
        Car Mercedes = new Car ("C 300", "yellow", 1986, "petrol");

        ArrayList<Car> carTable = new ArrayList<>();
        carTable.add(Mercedes);
        carTable.add(Opel);
        carTable.add(Skoda);
        carTable.add(Fiat);
        carTable.add(Toyota);
    }

    }


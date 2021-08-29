public class Car {
    public String model;
    public String color;
    public int makeYear;
    public String fuelType;

    public Car(){
    }
    public Car(String model, String color, int makeYear, String furlType){
        this.model = model;
        this.color = color;
        this.makeYear = makeYear;
        this.fuelType = furlType;
    }

    public Car(String model, String color, String fuelType) {
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
    }
    public void startEngine (){
        System.out.println("Silnik się uruchomił");
    }
    public void startEngine2 (){
        System.out.println("Silnik " + model + "został uruchomiony");
    }
}

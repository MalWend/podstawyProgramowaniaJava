public class Main {
    public static void main (String args[]){
        System.out.println("Hello World");
        System.out.println("Hello everyone!");
        System.out.println("Hello" + " others!");
        System.out.println("Hiiiia\tcossss");
        System.out.println("Hiiiia\n");
        System.out.println("Hiiiia");
        System.out.println("Hiiiia \"cossss\"");

        Car Opel = new Car();
        Car Mazda = new Car("Fajna", "czerwona", 1999, "petrol");
        Mazda.startEngine();
        Mazda.startEngine2();
        Opel.stopEngine(20);

    }
}

import java.awt.*;

public class Main {

    public static void main  (String[] args) {
        System.out.println("Hello World! My name is Erick");
        System.out.println("Hi!");

        Car myCar = new Car(25.5,
                "1BCERICK", Color.BLUE, true);

        Car sallyCar = new Car(30.9, "lolwhatm8", Color.BLACK, false);

        System.out.println("My car License Plate: " + myCar.licencePlate);
        System.out.println("Sally's License Plate: " + sallyCar.licencePlate);

        System.out.println(myCar.paintColor.toString());
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor.toString());
    }




}

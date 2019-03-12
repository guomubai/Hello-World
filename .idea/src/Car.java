import java.awt.*;

public class Car {

    //Datatypes
    //int -> interger 1,2,3
    // double -> decimal 34.5
    //String - you know this
    //Color -> from awt library "abstract window tool"
    // boolean -> true or false of course

    double averageMilesPerGallon;
    String licencePlate;
    Color paintColor;
    boolean areTailLightsWorking;

    //Making a new constructor below

    public Car (double inputaAverageMPG,
                String inputLicensePlate,
                Color inputPaintColor,
                boolean inputAreTailLightsWorking) {
        this.averageMilesPerGallon = inputaAverageMPG;
        this.licencePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailLightsWorking = inputAreTailLightsWorking;
    }

    public void changePaintColor (Color newPaintColor) {
        this.paintColor = newPaintColor;
    }
}

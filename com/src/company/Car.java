package company;

public class Car extends Vehicle {

    private int numOfDoors;
    private String carColour;

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public void getValues(){
        System.out.println("Vehicle Id NUmber:" +getVehicleId());
        System.out.println("Vehicle Brand:"+getVehicleBrand());
        System.out.println("Vehicle Entry date and time:"+getEntryDateTime());
        System.out.println("Vehicle's number of doors:"+getNumOfDoors());
        System.out.println("Vehicle colour:"+getCarColour());

    }
}

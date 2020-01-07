package company;

public class Motorbike extends Vehicle {

    private int engineSize;
    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public void getValues() {
        System.out.println("Vehicle Id NUmber:" + getVehicleId());
        System.out.println("Vehicle Brand:" + getVehicleBrand());
        System.out.println("Vehicle Entry date and time:" + getEntryDateTime());
        System.out.println("Vehicle engine size" + getEngineSize());

    }
}
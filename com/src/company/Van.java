package company;
public class Van extends Vehicle {

    private int cargoVolume;
    public int getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(int cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    public void getValues() {
        System.out.println("Vehicle Id NUmber:" + getVehicleId());
        System.out.println("Vehicle Brand:" + getVehicleBrand());
        System.out.println("Vehicle Entry date and time:" + getEntryDateTime());
        System.out.println("Vehicle cargo volume" + getCargoVolume());

    }
}
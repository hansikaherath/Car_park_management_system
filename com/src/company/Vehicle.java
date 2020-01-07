package company;

import java.util.Scanner;

public class Vehicle {
    private String vehicleId;
    private String vehicleBrand;
    private String entryDateTime;

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleBrand(){
    return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getEntryDateTime() {
        return entryDateTime;
    }

    public void setEntryDateTime(String entryDateTime) {
        this.entryDateTime = entryDateTime;
    }

    public void setvalues(){
        Scanner value=new Scanner(System.in);
        System.out.println("enter vehicle id plate number:\n");
        String selectId=value.nextLine();
        setVehicleId(selectId);
        System.out.println("enter vehicle brand");
        String selectBrand=value.nextLine();
        setVehicleBrand(selectBrand);
        System.out.println("enter vehicle entry date and time");
        String selectTime=value.nextLine();
        setEntryDateTime(selectTime);
    }
}


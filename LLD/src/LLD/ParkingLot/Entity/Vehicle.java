package LLD.ParkingLot.Entity;

import LLD.ParkingLot.Enums.VehicleType;

import java.util.UUID;

public class Vehicle {
    UUID slotId;
    VehicleType vehicleType;
    String vehicleNumber;

    public Vehicle(VehicleType vehicleType, String vehicleNumber) {
        this.vehicleType = vehicleType;
        this.slotId = UUID.randomUUID();
        this.vehicleNumber = vehicleNumber;
    }

    public UUID getSlotId() {
        return slotId;
    }

    public void setSlotId(UUID slotId) {
        this.slotId = slotId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}

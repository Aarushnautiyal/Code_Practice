package LLD.ParkingLot.Entity;

import LLD.ParkingLot.Enums.VehicleType;

import java.util.UUID;

public class Slot {
    UUID id;
    boolean isAvailable;
    VehicleType slotType;

    public Slot(VehicleType slotType) {
        this.id = UUID.randomUUID();
        this.slotType = slotType;
        this.isAvailable = true;
    }

    public UUID getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public VehicleType getSlotType() {
        return slotType;
    }

    public void setSlotType(VehicleType slotType) {
        this.slotType = slotType;
    }
}

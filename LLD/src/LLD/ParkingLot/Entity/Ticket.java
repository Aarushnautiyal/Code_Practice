package LLD.ParkingLot.Entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    UUID id;
    LocalDateTime entryTime;
    String vehicleNumber;
    Boolean isPaid;
    UUID slotId;
    LocalDateTime exitTime;

    public UUID getId() {
        return id;
    }

    public void setExitTime() {
        this.exitTime = LocalDateTime.now();
    }

    public UUID getSlotId() {
        return slotId;
    }

    public void setIsPaid(Boolean paid) {
        this.isPaid = paid;
    }
    public Boolean getIsPaid() {
        return isPaid;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    Ticket(Builder builder){
        this.id = UUID.randomUUID();
        this.isPaid = false;
        this.vehicleNumber = builder.getVehicleNumber();
        this.entryTime = builder.getEntryTime();
        this.slotId = builder.getSlotId();
    }
    public static class Builder{
        LocalDateTime entryTime;
        String vehicleNumber;
        LocalDateTime exitTime;
        UUID slotId;

        public LocalDateTime getEntryTime() {
            return entryTime;
        }

        public String getVehicleNumber() {
            return vehicleNumber;
        }

        public LocalDateTime getExitTime() {
            return exitTime;
        }

        public UUID getSlotId() {
            return slotId;
        }

        public Builder entryTime(LocalDateTime entryTime){
            this.entryTime = entryTime;
            return this;
        }
        public Builder slotId(UUID slotId){
            this.slotId = slotId;
            return this;
        }
        public Builder vehicleId(String vehicleNumber){
            this.vehicleNumber = vehicleNumber;
            return this;
        }

        public Ticket build(){
            return new Ticket(this);
        }
    }
}

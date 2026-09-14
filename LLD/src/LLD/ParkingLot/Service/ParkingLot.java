package LLD.ParkingLot.Service;

import LLD.ParkingLot.Entity.Slot;
import LLD.ParkingLot.Entity.Ticket;
import LLD.ParkingLot.Entity.Vehicle;
import LLD.ParkingLot.Enums.VehicleType;
import LLD.ParkingLot.Strategy.PaymentStrategy;
import LLD.ParkingLot.Strategy.PriceStrategy;

import java.time.LocalDateTime;
import java.util.*;

public class ParkingLot {
    Map<VehicleType, Queue<Slot>> availableSlots = new HashMap<>();
    Map<UUID, Slot> alotted = new HashMap<>();
    PriceStrategy priceStrategy;
    PaymentStrategy paymentStrategy;

    public ParkingLot(Map<VehicleType, Queue<Slot>> availableSlots, PriceStrategy priceStrategy, PaymentStrategy paymentStrategy){
        this.availableSlots = availableSlots;
        this.priceStrategy = priceStrategy;
        this.paymentStrategy = paymentStrategy;
    }
    public synchronized Ticket parkVehicle(Vehicle vehicle) throws Exception {
        VehicleType vehicleType = vehicle.getVehicleType();
        Queue<Slot> queue = availableSlots.get(vehicleType);
        Slot slot = queue.poll();
        if(Objects.isNull(slot)){
            throw new Exception("Slots not found");
        }
        slot.setAvailable(false);
        alotted.put(slot.getId(), slot);
        return new Ticket
                .Builder()
                .vehicleId(vehicle.getVehicleNumber())
                .slotId(slot.getId())
                .entryTime(LocalDateTime.now())
                .build();
    }

    public String unParkVehicle(Ticket ticket) {
        if(!ticket.getIsPaid()){
            return "Ticket is not paid yet";
        }
        Slot slot = alotted.get(ticket.getSlotId());
        if (Objects.nonNull(slot)) {
            slot.setAvailable(true);
            availableSlots.get(slot.getSlotType()).add(slot);
            alotted.remove(slot.getId());
            return "Vehicle unparked slot %s available".formatted(slot.getId());
        }
        return "slot not found";
    }

    public PriceStrategy getPriceStrategy(){
        return priceStrategy;
    }

    public PaymentStrategy getPaymentStrategy(){
        return paymentStrategy;
    }
}

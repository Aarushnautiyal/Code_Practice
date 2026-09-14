package LLD.ParkingLot;

import LLD.ParkingLot.Entity.Slot;
import LLD.ParkingLot.Entity.Ticket;
import LLD.ParkingLot.Entity.Vehicle;
import LLD.ParkingLot.Enums.VehicleType;
import LLD.ParkingLot.Service.ParkingLot;
import LLD.ParkingLot.Strategy.*;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ParkingManager {
    public static void main(String[] args) throws Exception {
        Slot carSlot = new Slot(VehicleType.CAR);
        Slot hmvSlot = new Slot(VehicleType.HMV);
        Slot bikeSlot = new Slot(VehicleType.BIKE);

        Queue<Slot> hmvSlotqueue = new LinkedList<>();
        hmvSlotqueue.add(hmvSlot);
        Queue<Slot> carSlowQueue = new LinkedList<>();
        carSlowQueue.add(carSlot);
        Queue<Slot> bikeSlotQueue = new LinkedList<>();
        bikeSlotQueue.add(bikeSlot);
        Map<VehicleType, Queue<Slot>> alottedSpots = Map.of(carSlot.getSlotType(), carSlowQueue, hmvSlot.getSlotType(), hmvSlotqueue, bikeSlot.getSlotType(), bikeSlotQueue);
        PriceStrategy priceStrategy = new SurgeFee();
        PaymentStrategy paymentStrategy = new UPI();
        ParkingLot parkingLot = new ParkingLot(alottedSpots, priceStrategy,paymentStrategy);
        Vehicle vehicle = new Vehicle(VehicleType.CAR,"dsgjfkysgfda");

        Ticket ticket = parkingLot.parkVehicle(vehicle);
        ticket.setExitTime();
        int price  = parkingLot.getPriceStrategy().calculatePrice(ticket);
        Payment payment = new Payment(parkingLot.getPaymentStrategy());
        payment.pay(ticket,price,price);
        System.out.println(parkingLot.unParkVehicle(ticket));

    }
}

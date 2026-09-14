package LLD.ParkingLot.Strategy;

import LLD.ParkingLot.Entity.Ticket;

public interface PriceStrategy {
    int calculatePrice(Ticket ticket);
}

package LLD.ParkingLot.Strategy;

import LLD.ParkingLot.Entity.Ticket;

public class FlatFee implements PriceStrategy {
    @Override
    public int calculatePrice(Ticket ticket) {
        return 100;
    }
}

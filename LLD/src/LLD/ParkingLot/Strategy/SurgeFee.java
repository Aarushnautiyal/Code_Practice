package LLD.ParkingLot.Strategy;

import LLD.ParkingLot.Entity.Ticket;

import java.time.Duration;
import java.time.LocalDateTime;

public class SurgeFee implements PriceStrategy {
    @Override
    public int calculatePrice(Ticket ticket) {
            LocalDateTime entryTime =ticket.getEntryTime();
            LocalDateTime exitTime =ticket.getExitTime();
            long duration = Duration.between(entryTime,exitTime).toHours();

            duration = duration>1?duration:1;
            long price = duration*20;
            return (int) price;
    }
}

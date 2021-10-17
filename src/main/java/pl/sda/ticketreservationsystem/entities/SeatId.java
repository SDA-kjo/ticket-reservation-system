package pl.sda.ticketreservationsystem.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SeatId  implements Serializable {
    private static final long serialVersionUID = 11l;

    private int seatRow;
    private int seatNumber;
    private int cinemaHallNumber;


    public int getCinemaHallNumber() {
        return cinemaHallNumber;
    }

    public void setCinemaHallNumber(int cinemaHallNumber) {
        this.cinemaHallNumber = cinemaHallNumber;
    }
}

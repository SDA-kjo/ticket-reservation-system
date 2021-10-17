package pl.sda.ticketreservationsystem.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "seats")
public class Seat {

    @EmbeddedId
    private SeatId seatId;

    @ManyToOne
    @JoinColumn(referencedColumnName = "cinemaHallNumber", name = "hallNumber")
    private CinemaHall cinemaHall;

    public SeatId getSeatId() {
        return seatId;
    }

    public void setSeatId(SeatId seatId) {
        this.seatId = seatId;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }
}

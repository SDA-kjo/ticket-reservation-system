package pl.sda.ticketreservationsystem;

import org.hibernate.Session;
import pl.sda.ticketreservationsystem.entities.CinemaHall;
import pl.sda.ticketreservationsystem.entities.Customer;
import pl.sda.ticketreservationsystem.entities.Movie;
import pl.sda.ticketreservationsystem.entities.Seans;
import pl.sda.ticketreservationsystem.entities.Seat;
import pl.sda.ticketreservationsystem.entities.SeatId;
import pl.sda.ticketreservationsystem.hibernate.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        /**
         * Wywołamy to jednorazowo, zeby uzupelnic baze danych
         */
        initMovies(session);
        initCinemaHalls(session);
        //initSeanse(session);

        /**
         *
         * Zasymuluj, ze klienicu kupuja bilety na rozne seanse
         *
         */

        session.getTransaction().commit();
        session.close();
        HibernateUtil.close();
    }


    public static void initMovies(Session session) {
        Movie movie1 = new Movie();
        movie1.setId(1);
        movie1.setTitle("Hary Pota");

        Movie movie2 = new Movie();
        movie2.setId(2);
        movie2.setTitle("Dildo Vagins z Szajeru");

        Movie movie3 = new Movie();
        movie3.setId(3);
        movie3.setTitle("Nightmare from the elm street");

        session.save(movie1);
        session.save(movie2);
        session.save(movie3);
    }

    public static void initCinemaHalls(Session session) {
        // stworzcie 3 sale z kilkoma miejscami
        CinemaHall cinemaHall = new CinemaHall();
        cinemaHall.setCinemaHallNumber(1);
        cinemaHall.setSeats(initSeatsForCinemaHalls(cinemaHall));

        session.save(cinemaHall);

        CinemaHall cinemaHall2 = new CinemaHall();
        cinemaHall2.setCinemaHallNumber(2);
        cinemaHall2.setSeats(initSeatsForCinemaHalls(cinemaHall2));

        session.save(cinemaHall2);

        CinemaHall cinemaHall3 = new CinemaHall();
        cinemaHall3.setCinemaHallNumber(3);
        cinemaHall3.setSeats(initSeatsForCinemaHalls(cinemaHall3));

        session.save(cinemaHall3);
    }

    public static List<Seat> initSeatsForCinemaHalls(CinemaHall cinemaHall) {
        int rows = 10;
        int seatsInRow = 20;
        List<Seat> seatsForCinemaHall = new ArrayList<>();
        for (int r = 1; r <= rows; r++) {
            for(int s = 1; s <= seatsInRow; s++) {
                SeatId seatId = new SeatId();
                seatId.setSeatRow(r);
                seatId.setSeatNumber(s);
                seatId.setCinemaHallNumber(cinemaHall.getCinemaHallNumber());

                Seat seat = new Seat();
                seat.setSeatId(seatId);
                seat.setCinemaHall(cinemaHall);

                seatsForCinemaHall.add(seat);
            }
        }
        return seatsForCinemaHall;
    }

    public static void initSeanse(Session session) {
        // stworzcie 5 seasow
    }

    public static void buyTicketForSeansForCustomer(Customer customer, Seans seans) {
        /**
         * Sporobuj napisac taka metode
         */
    }
}

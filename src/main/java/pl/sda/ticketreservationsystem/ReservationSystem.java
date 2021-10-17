package pl.sda.ticketreservationsystem;

import org.hibernate.Session;
import pl.sda.ticketreservationsystem.entities.Customer;
import pl.sda.ticketreservationsystem.entities.Seans;
import pl.sda.ticketreservationsystem.hibernate.HibernateUtil;

public class ReservationSystem {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        /**
         * Wywołamy to jednorazowo, zeby uzupelnic baze danych
         */
        initMovies(session);
        initCinemaHalls(session);
        initSeanse(session);

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
        // stworzcie 3 filmy
    }

    public static void initCinemaHalls(Session session) {
        // stworzcie 3 sale z kilkoma miejscami
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

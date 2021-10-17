package pl.sda.ticketreservationsystem.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "customerId", referencedColumnName="id")
    private Customer customer;

    @OneToOne
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "seansId", referencedColumnName = "id")
    private Seans seans;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}

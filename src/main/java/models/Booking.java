package models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {
    private List<ShowSeat> showSeats;
    private User user;
    private int amount;
    private List<Payment> payments;

}

package lt.viko.eif.dborkovskij.soap;

import lt.viko.eif.dborkovskij.soap.model.Hotel;
import org.springframework.stereotype.Component;

@Component
public class HotelRepository {
    private Hotel hotel;

    public HotelRepository(Hotel hotel) {
        this.hotel = hotel;
    }

    public Hotel get(int id) {
        return hotel;
    }

    public void update(Hotel hotel){
        this.hotel = hotel;
    }

}

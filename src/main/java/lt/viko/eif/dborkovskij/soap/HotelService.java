package lt.viko.eif.dborkovskij.soap;

import lt.viko.eif.dborkovskij.soap.model.CreateData;
import lt.viko.eif.dborkovskij.soap.model.Hotel;

public class HotelService {
    private Hotel hotel = CreateData.generateHotel();

    public RoomRepository roomRepository = new RoomRepository(hotel);
    public HotelRepository hotelRepository = new HotelRepository(hotel);
}

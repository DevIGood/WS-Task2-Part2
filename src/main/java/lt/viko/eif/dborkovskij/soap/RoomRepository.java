package lt.viko.eif.dborkovskij.soap;

import lt.viko.eif.dborkovskij.soap.model.Hotel;
import lt.viko.eif.dborkovskij.soap.model.Room;
import lt.viko.eif.dborkovskij.soap.model.Hotel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoomRepository {
    private Hotel hotel;

    public RoomRepository(Hotel hotel) {
        this.hotel = hotel;
    }

    public Room get(Integer id){
        return hotel.getRoomList().stream().filter(room -> room.getRoomNumber() == id).findFirst().orElse(null);
    }

    public List<Room> getAll(){
        return hotel.getRoomList();
    }

    public void insert(Room room){
        hotel.getRoomList().add(room);
    }

    public void update(Room room){
        Room room1 = this.get(room.getRoomNumber());
        Integer integer = hotel.getRoomList().indexOf(room1);
        hotel.getRoomList().set(integer,room);
    }

    public void delete(Integer id){
        hotel.getRoomList().remove(this.get(id));
    }
}

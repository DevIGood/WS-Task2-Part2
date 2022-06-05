package lt.viko.eif.dborkovskij.soap.model;

import java.util.ArrayList;
import java.util.List;

public class CreateData {

    public static Hotel generateHotel(){
        Hotel hotel = new Hotel();
        hotel.setHotelID(95556);
        hotel.setHotelName("Jeeio Premium");
        hotel.setAddress("Adreso g. 10");
        hotel.setCity("Vilnius");
        hotel.setPhoneNumber("+337542123");
        hotel.setZip(11580);
        hotel.setRoomList(generateRooms());

        return hotel;
    }

    public static List<Room> generateRooms(){
        List<Room> rooms = new ArrayList<>();

        Room room1 = new Room();
        room1.setRoomNumber(101);
        room1.setRoomType("Standard");
        room1.setBedType("Standard");
        room1.setisFree(false);
        room1.setCost(25.99);

        Room room2 = new Room();
        room2.setRoomNumber(102);
        room2.setRoomType("Standard");
        room2.setBedType("Standard");
        room2.setisFree(false);
        room2.setCost(25.99);

        Room room3 = new Room();
        room3.setRoomNumber(103);
        room3.setRoomType("Standard");
        room3.setBedType("Standard");
        room3.setisFree(false);
        room3.setCost(25.99);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        return rooms;
    }
}

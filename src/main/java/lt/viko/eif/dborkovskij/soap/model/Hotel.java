package lt.viko.eif.dborkovskij.soap.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The root of directory, contains all data about this hotel.
 */

public class Hotel {
    private int hotelID;
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String city;
    private int zip;
    private List<Room> roomList = new ArrayList<>();

    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    @Override
    public String toString() {
        return "\n\tHotel Info\nHotel ID: " + hotelID
                + "\nHotel Name: " + hotelName
                + "\nHotel Address: " + address
                + "\nPhone Number: " + phoneNumber
                + "\nCity: " + city
                + "\nZip: " + zip
                + "\nRooms: " + getRoomList();
    }
}

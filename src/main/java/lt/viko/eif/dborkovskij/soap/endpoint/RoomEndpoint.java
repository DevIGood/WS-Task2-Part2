package lt.viko.eif.dborkovskij.soap.endpoint;

import lt.viko.eif.dborkovskij.soap.HotelService;
import lt.viko.eif.dborkovskij.soap.localhost.hotel.room.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class RoomEndpoint {
    private static final String URI = "http://localhost/hotel/room";

    private final HotelService hotelService;

    @Autowired
    public RoomEndpoint(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PayloadRoot(namespace = URI, localPart = "getRoomRequest")
    @ResponsePayload
    public localhost.hotel.room.GetRoomResponse getRoom(@RequestPayload GetRoomRequest request){
        localhost.hotel.room.GetRoomResponse response = new localhost.hotel.room.GetRoomResponse();
        response.setRoomNumber(hotelService.roomRepository.get(request.getRoomNumber()));
        return response;
    }

    @PayloadRoot(namespace = URI, localPart = "insertRoomRequest")
    @ResponsePayload
    public InsertRoomResponse roomResponse(@RequestPayload localhost.hotel.room.InsertRoomRequest request){
        hotelService.roomRepository.insert(request.getRoom());
        ServiceStatus serviceStatus = new ServiceStatus();
        serviceStatus.setStatusCode("201");
        serviceStatus.setMessage("Room was inserted");
        InsertRoomResponse response = new InsertRoomResponse();
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = URI, localPart = "updateRoomRequest")
    @ResponsePayload
    public UpdateRoomResponse updateRoomResponse(@RequestPayload UpdateRoomRequest request){
        hotelService.roomRepository.update(request.getRoom());
        ServiceStatus serviceStatus = new ServiceStatus();
        serviceStatus.setStatusCode("204");
        serviceStatus.setMessage("Room was updated");
        UpdateRoomResponse response = new UpdateRoomResponse();
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = URI, localPart = "deleteRoomRequest")
    @ResponsePayload
    public localhost.hotel.room.DeleteRoomResponse deleteRoomResponse(@RequestPayload localhost.hotel.room.DeleteRoomRequest request){
        hotelService.roomRepository.delete(request.getId());
        ServiceStatus serviceStatus = new ServiceStatus();
        serviceStatus.setStatusCode("204");
        serviceStatus.setMessage("Room was deleted");
        localhost.hotel.room.DeleteRoomResponse response = new localhost.hotel.room.DeleteRoomResponse();
        response.setServiceStatus(serviceStatus);
        return response;
    }
}

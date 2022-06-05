package lt.viko.eif.dborkovskij.soap.endpoint;

import lt.viko.eif.dborkovskij.soap.HotelService;
import lt.viko.eif.dborkovskij.soap.localhost.hotel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class HotelEndpoint {
    private static final String URI = "http://localhost/hotel";
    @Autowired
    private HotelService hotelService;

    public HotelEndpoint(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PayloadRoot(namespace = URI, localPart = "getHotelRequest")
    @ResponsePayload
    public GetHotelResponse getHotel(@RequestPayload GetHotelRequest request){
        GetHotelResponse response = new GetHotelResponse();
        response.setHotel(hotelService.hotelRepository.get(request.getId()));
        return response;
    }

    @PayloadRoot(namespace = URI, localPart = "updateHotelRequest")
    @ResponsePayload
    public UpdateHotelResponse updateHotelResponse(@RequestPayload UpdateHotelRequest request){
        hotelService.hotelRepository.update(request.getHotel());
        ServiceStatus serviceStatus = new ServiceStatus();
        serviceStatus.setStatusCode("204");
        serviceStatus.setMessage("Hotel was updated");
        UpdateHotelResponse response = new UpdateHotelResponse();
        response.setServiceStatus(serviceStatus);
        return response;
    }


}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.05 at 06:53:02 PM EEST 
//


package lt.viko.eif.dborkovskij.soap.localhost.hotel.room;
import lt.viko.eif.dborkovskij.soap.model.Room;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localhost.hotel.room package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localhost.hotel.room
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link localhost.hotel.room.DeleteRoomRequest }
     * 
     */
    public localhost.hotel.room.DeleteRoomRequest createDeleteRoomRequest() {
        return new localhost.hotel.room.DeleteRoomRequest();
    }

    /**
     * Create an instance of {@link localhost.hotel.room.InsertRoomRequest }
     * 
     */
    public localhost.hotel.room.InsertRoomRequest createInsertRoomRequest() {
        return new localhost.hotel.room.InsertRoomRequest();
    }

    /**
     * Create an instance of {@link Room }
     * 
     */
    public Room createRoom() {
        return new Room();
    }

    /**
     * Create an instance of {@link localhost.hotel.room.GetRoomResponse }
     * 
     */
    public localhost.hotel.room.GetRoomResponse createGetRoomResponse() {
        return new localhost.hotel.room.GetRoomResponse();
    }

    /**
     * Create an instance of {@link localhost.hotel.room.GetRoomRequest }
     * 
     */
    public localhost.hotel.room.GetRoomRequest createGetRoomRequest() {
        return new localhost.hotel.room.GetRoomRequest();
    }

    /**
     * Create an instance of {@link UpdateRoomResponse }
     * 
     */
    public UpdateRoomResponse createUpdateRoomResponse() {
        return new UpdateRoomResponse();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

    /**
     * Create an instance of {@link localhost.hotel.room.DeleteRoomResponse }
     * 
     */
    public localhost.hotel.room.DeleteRoomResponse createDeleteRoomResponse() {
        return new localhost.hotel.room.DeleteRoomResponse();
    }

    /**
     * Create an instance of {@link InsertRoomResponse }
     * 
     */
    public InsertRoomResponse createInsertRoomResponse() {
        return new InsertRoomResponse();
    }

    /**
     * Create an instance of {@link UpdateRoomRequest }
     * 
     */
    public UpdateRoomRequest createUpdateRoomRequest() {
        return new UpdateRoomRequest();
    }

}

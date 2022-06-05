package lt.viko.eif.dborkovskij.soap;

import lt.viko.eif.dborkovskij.soap.model.Hotel;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapWebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/soapWS/*");
    }

    @Bean(name = "Room")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema filmsSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setLocationUri("/soapWS");
        definition.setPortTypeName("RoomsPort");
        definition.setTargetNamespace("http://localhost/hotel/room");
        definition.setSchema(filmsSchema);
        return definition;
    }

    @Bean(name = "Hotel")
    public DefaultWsdl11Definition defaultWsdl11Definition2(XsdSchema theaterRoomsSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setLocationUri("/soapWS");
        definition.setPortTypeName("HotelPort");
        definition.setTargetNamespace("http://localhost/hotel");
        definition.setSchema(theaterRoomsSchema);
        return definition;
    }

    @Bean
    public XsdSchema filmsSchema() {
        return new SimpleXsdSchema(new ClassPathResource("room.xsd"));
    }

    @Bean
    public XsdSchema theaterRoomsSchema() {
        return new SimpleXsdSchema(new ClassPathResource("hotel.xsd"));
    }

    @Bean
    public HotelService filmService(){
        return new HotelService();
    }

    @Bean
    public Hotel cinema(){
        return new Hotel();
    }
}

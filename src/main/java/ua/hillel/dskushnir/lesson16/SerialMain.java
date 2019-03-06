package ua.hillel.dskushnir.lesson16;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import ua.hillel.dskushnir.lesson12.model.Lesson;
import ua.hillel.dskushnir.lesson12.model.Student;
import ua.hillel.dskushnir.lesson12.model.Task;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;





public class SerialMain {
    public static void main(String[] args) throws JAXBException ,IOException{
       NewCourse newCourse=new NewCourse(11,"AAA");
        NewCourse newCourse1=new NewCourse(22,"BBB");

        jaxb();
        jacksonXml();
        jacksonJson(newCourse1);

    }
    private static void jaxb()throws JAXBException{
        JAXBContext jaxbContext = JAXBContext.newInstance(NewCourse.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        NewCourse newCourse=getCourse();
        marshaller.marshal(newCourse,new File("courseJabx.xml"));
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Object obj=unmarshaller.unmarshal(new File("courseJabx.xml"));
        System.out.println(obj);
    }
    private static void jacksonXml()throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.registerModule(new JavaTimeModule());
        xmlMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        NewCourse newCourse = getCourse();
        xmlMapper.writeValue(new File("courseJackson_XML.xml"), newCourse);
        NewCourse newCourse1 = xmlMapper.readValue(new File("courseJackson_XML.xml"), NewCourse.class);
        System.out.println(newCourse1);
    }
    private static void jacksonJson(NewCourse newCourse1)throws IOException{
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());
            objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
            objectMapper.writeValue(new File("courseJackson_JSON.json"),newCourse1);
            NewCourse newCourse2=objectMapper.readValue(new File("courseJackson_JSON.json"),NewCourse.class);
            System.out.println(newCourse2);

        }


    public static NewCourse getCourse(){
        return new NewCourse();
    }
}

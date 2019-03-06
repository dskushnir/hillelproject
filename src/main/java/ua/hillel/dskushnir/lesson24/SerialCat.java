package ua.hillel.dskushnir.lesson24;
import com.fasterxml.jackson.databind.ObjectMapper;
import ua.hillel.dskushnir.lesson07.Cat;
import java.io.File;
import java.io.IOException;


public class SerialCat {
    public static void main(String[] args) throws IOException{
        Cat cat=new Cat("Murka","British Shorthair","lilac");
        ObjectMapper objectMapper = new ObjectMapper();
        String serialized=objectMapper.writeValueAsString(cat);
        System.out.println(serialized);
        objectMapper.writeValue(new File("catJackson_JSON.json"),cat);
        Cat cat1=objectMapper.readValue(new File("catJackson_JSON.json"),Cat.class);
        System.out.println(cat1);

    }

}

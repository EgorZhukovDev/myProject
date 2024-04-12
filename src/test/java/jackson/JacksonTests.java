package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import pojo.CarPojo;
import pojo.EmployeePojo;
import pojo.OrderPojo;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;


public class JacksonTests {
    // ObjectMapper часть библиотеки Jackson для преобразования между POJO и JSON.
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void pojoToJsonString() throws JsonProcessingException {
        EmployeePojo employee = new EmployeePojo("Mark", "James", 20);

        // writeValue() используется для преобразования POJO в JSON (сериализация).
        String json = objectMapper.writeValueAsString(employee);

        System.out.println(json);
    }

    @Test
    void jsonStringToPojo() throws JsonProcessingException {
        String employeeJson = "{\n" +
                " \"firstName\" : \"Jalil\",\n" +
                " \"lastName\" : \"Jarjanazy\",\n" +
                " \"age\" : 30\n" +
                "}";

        // readValue() для преобразования JSON из строки, потока или файла в POJO (десериализации)
        EmployeePojo employee = objectMapper.readValue(employeeJson, EmployeePojo.class);

        Assert.assertEquals(employee.getFirstName(), "Jalil");

    }

    @Test // Создание POJO из файла JSON
    void jsonFileToPojo() throws IOException {
        File file = new File("src/test/resources/jsons/employee.json");

        EmployeePojo employee = objectMapper.readValue(file, EmployeePojo.class);

        Assert.assertEquals(employee.getAge(), 44);
        Assert.assertEquals(employee.getLastName(), "Simpson");
        Assert.assertEquals(employee.getFirstName(), "Homer");
    }

    @Test // Создание POJO из массива байт в формате JSON
    void byteArrayToPojo() throws IOException {
        String employeeJson = "{\n" +
                " \"firstName\" : \"Jalil\",\n" +
                " \"lastName\" : \"Jarjanazy\",\n" +
                " \"age\" : 30\n" +
                "}";

        EmployeePojo employee = objectMapper.readValue(employeeJson.getBytes(), EmployeePojo.class);

        Assert.assertEquals(employee.getFirstName(), "Jalil");
    }

    @Test // Создание списка POJO из JSON
    void fileToListOfPojos() throws IOException {
        File file = new File("src/test/resources/jsons/employeeList.json");
        List<EmployeePojo> employeeList = objectMapper.readValue(file, new TypeReference<>(){});

        Assert.assertEquals(employeeList.size(), 2);
        Assert.assertEquals(employeeList.get(0).getAge(), 33);
        Assert.assertEquals(employeeList.get(0).getLastName(), "Simpson");
        Assert.assertEquals(employeeList.get(0).getFirstName(), "Marge");
    }

    @Test // Создание Map из JSON
    void fileToMap() throws IOException {
        File file = new File("src/test/resources/jsons/employee.json");
        Map<String, Object> employee = objectMapper.readValue(file, new TypeReference<>(){});

//        assertThat(employee.keySet()).containsExactly("firstName", "lastName", "age");

        Assert.assertEquals(employee.get("firstName"), "Homer");
        Assert.assertEquals(employee.get("lastName"), "Simpson");
        Assert.assertEquals(employee.get("age"), 44);
    }

    @Test // Работа с датами in Jackson
    void orderToJsonWithDate() throws JsonProcessingException {
        OrderPojo order = new OrderPojo(1, LocalDate.of(2023, 1, 1));

        objectMapper.registerModule(new JavaTimeModule()); // you have to register the module like this

        String json = objectMapper.writeValueAsString(order);

        System.out.println(json);
    }

    @Test
    void fileToCar() throws IOException {
        File file = new File("src/test/resources/jsons/car.json");

        CarPojo car = objectMapper.readValue(file, CarPojo.class);

        Assert.assertEquals(car.getBrand(), "BMW");
    }

    @Test
    //@JsonAnySetter аннотация (что в POJO файле) полезна в случаях, когда JSON содержит некоторые поля, не объявленные в POJO
    void fileToUnrecognizedCar() throws IOException {
        File file = new File("src/test/resources/jsons/carUnrecognized.json");

        CarPojo car = objectMapper.readValue(file, CarPojo.class);

        Assert.assertTrue(car.getUnrecognizedFields().containsKey("productionYear"));
        System.out.println(car.getBrand());
        System.out.println(car.getUnrecognizedFields().get("productionYear"));
    }
}

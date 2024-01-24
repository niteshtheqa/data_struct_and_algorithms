package workingwithjson;

//import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonReaderExample {
    public static void main(String[] args) {
        // Step 1: Create an instance of ObjectMapper
        //ObjectMapper objectMapper = new ObjectMapper();

        // Step 2: Read JSON data from the file and map it to a Java object
//        try {
//            File jsonFile = new File("src/workingwithjson/data.json");
//           // Person person = objectMapper.readValue(jsonFile, Person.class);
//
//            // Now you can work with the 'person' object, which represents the data from the
//            // JSON file
////            System.out.println("Name: " + person.getName());
////            System.out.println("Age: " + person.getAge());
////            System.out.println("Email: " + person.getEmail());
////            System.out.println("Address: " + person.getAddress());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

class Person {
    private String name;
    private int age;
    private String email;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

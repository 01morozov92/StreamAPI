package TestStreams;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private String FirstName;
    private String LastName;
    private int id;
    private int age;
    private Position position;


}

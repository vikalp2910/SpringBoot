package edu.vikalp.fifthapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int eid;
    private String name;
    private String city;

}

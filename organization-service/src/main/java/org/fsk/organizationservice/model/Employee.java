package org.fsk.organizationservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Employee {

    private Long id;
    private String name;
    private int age;
    private String position;

}

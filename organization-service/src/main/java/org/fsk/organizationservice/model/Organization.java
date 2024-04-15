package org.fsk.organizationservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Organization {
    private Long id;
    private String name;
    private String address;
    private List<Department> departments = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
}

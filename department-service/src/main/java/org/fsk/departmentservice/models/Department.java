package org.fsk.departmentservice.models;


import java.util.ArrayList;
import java.util.List;

public class Department {

    private Long id;
    private Long organizationId;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department() {
    }

    public Department(Long id, Long organizationId, String name, List<Employee> employees) {
        this.id = id;
        this.organizationId = organizationId;
        this.name = name;
        this.employees = employees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

package org.fsk.departmentservice.repository;

import org.fsk.departmentservice.models.Department;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentRepository {

    private List<Department> departments = new ArrayList<>();

    public Department add(Department department) {
        department.setId((long)(departments.size()+1));
        departments.add(department);
        return department;
    }

    public Department findById(Long id) {
        return departments.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Department> findAll() {
        return departments;
    }

    public List<Department> findByOrganization(Long organizationId) {
        return departments.stream()
                .filter(a -> a.getOrganizationId().equals(organizationId))
                .toList();
    }

}

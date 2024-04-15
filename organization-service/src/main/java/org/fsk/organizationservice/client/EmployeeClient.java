package org.fsk.organizationservice.client;

import org.fsk.organizationservice.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "department-service")
@Service
public interface EmployeeClient {

    @GetMapping("/organization/{organizationId}")
    List<Employee> findByOrganization(@PathVariable("organizationId") Long organizationId);

}

package net.java.employee_backend.service.Impl;

import lombok.AllArgsConstructor;
import net.java.employee_backend.dto.EmployeeDto;
import net.java.employee_backend.entity.Employee;
import net.java.employee_backend.mapper.EmployeeMapper;
import net.java.employee_backend.repository.EmployeeRepository;
import net.java.employee_backend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee= employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}

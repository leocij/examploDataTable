package examploDataTable.service;

import java.util.List;

import examploDataTable.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(long id);

}
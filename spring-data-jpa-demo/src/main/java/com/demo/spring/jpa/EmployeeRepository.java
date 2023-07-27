package com.demo.spring.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findByName(String name);
    List<Employee> findByJob(String job);
    List<Employee> findByJoiningDate(LocalDate joinDate);
    List<Employee> findBySalaryBetween(double salFrom, double salTo);
    List<Employee> findBySalaryGreaterThan(double salary);

    @Query(value = "select * from employee where job = :job", nativeQuery = true)
    List<Employee> fetchEmployeesById(@Param("job") String job);

    @Query(value = "select empid, firstname, job from employee", nativeQuery = true)
    List<Object[]> fetchEmployeeWithFewDetails();
}

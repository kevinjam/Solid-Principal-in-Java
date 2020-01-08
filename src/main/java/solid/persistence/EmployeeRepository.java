package solid.persistence;

import solid.personnel.Employee;
import solid.personnel.FullTimeEmployee;
import solid.personnel.Intern;
import solid.personnel.PartTimeEmployee;

import java.util.Arrays;
import java.util.List;

/*
Helper method to perform CRUD operations on employees. In a production
application we could use the database for persistence. In this demo,
we are storing employees in the file system.
 */

public class EmployeeRepository {

    public List<Employee> findAll(){

        // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        Employee kevin = new Intern("Kevin Janvier", 920,20);
        Employee john = new Intern("John Ssebagala", 920,20);

        return Arrays.asList(anna, billy, steve, magda, kevin, john);
    }
}

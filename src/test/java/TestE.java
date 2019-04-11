
import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;


public class TestE {

    @Test
    public  void Test() {
        Department departmentOne = new Department("HSBC",DepartmentType.MARKETING);
        Department departmentTwo = new Department("IBM",DepartmentType.MARKETING);

        Person personOne = new Person("Karol","Kowalski", new Date(2019,2,1),"92011804838",Position.MARKETING_CONSULTANT);
        departmentOne.addPerson(personOne);
        departmentOne.shiftPerson(personOne,departmentTwo);

        assertTrue(departmentTwo.getPersonList().contains(personOne));
        assertFalse(departmentOne.getPersonList().contains(personOne));
    }
}

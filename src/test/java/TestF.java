
import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertTrue;

public class TestF {

    @Test(expected = IllegalArgumentException.class)
    public  void Test() {
        Department departmentOne = new Department("HSBC",DepartmentType.MARKETING);
        Department departmentTwo = new Department("IBM",DepartmentType.HR);

        Person personOne = new Person("Karol","Kowalski", new Date(2019,2,1),"172849378912",Position.MARKETING_CONSULTANT);
        departmentOne.addPerson(personOne);
        departmentOne.shiftPerson(personOne,departmentTwo);
        assertTrue(departmentTwo.getPersonList().contains(personOne));
    }
}

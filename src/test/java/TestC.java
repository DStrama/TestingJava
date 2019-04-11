
import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertTrue;


public class TestC {

    @Test
    public  void Test() {

        Person personTwo = new Person("Karol","Nowak", new Date(2019,2,1),"92011804838",Position.CPP_DEVELOPER);
        Department department = new Department("KOLO",DepartmentType.DEVELOPMENT);
        department.addPerson(personTwo);
        assertTrue(department.getPersonList().contains(personTwo));
    }
}

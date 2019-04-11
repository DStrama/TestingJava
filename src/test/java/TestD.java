import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertTrue;


public class TestD {

    @Test(expected = IllegalArgumentException.class)
    public  void Test() {


        Person personTwo = new Person("Karol","Jaki", new Date(2019,2,1),"92011804839",Position.CPP_DEVELOPER);
        Department department = new Department("KOLO",DepartmentType.MARKETING);
        department.addPerson(personTwo);
        assertTrue(department.getPersonList().contains(personTwo));
    }
}
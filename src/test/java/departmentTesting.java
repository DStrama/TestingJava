import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;


public class departmentTesting {

    //////////////////// C
    @Test
    public  void Test1() {

        Person personTwo = new Person("Karol","Nowak", new Date(2019,2,1),"92011804838",Position.CPP_DEVELOPER);
        Department department = new Department("KOLO",DepartmentType.DEVELOPMENT);
        department.addPerson(personTwo);
        assertTrue(department.getPersonList().contains(personTwo));
    }
    //////////////////// D

    @Test(expected = IllegalArgumentException.class)
    public  void Test2() {


        Person personTwo = new Person("Karol","Jaki", new Date(2019,2,1),"92011804839",Position.CPP_DEVELOPER);
        Department department = new Department("KOLO",DepartmentType.MARKETING);
        department.addPerson(personTwo);
        assertTrue(department.getPersonList().contains(personTwo));
    }

    //////////////////// E

    @Test
    public  void Test3() {
        Department departmentOne = new Department("HSBC",DepartmentType.MARKETING);
        Department departmentTwo = new Department("IBM",DepartmentType.MARKETING);

        Person personOne = new Person("Karol","Kowalski", new Date(2019,2,1),"92011804838",Position.MARKETING_CONSULTANT);
        departmentOne.addPerson(personOne);
        departmentOne.shiftPerson(personOne,departmentTwo);

        assertTrue(departmentTwo.getPersonList().contains(personOne));
        assertFalse(departmentOne.getPersonList().contains(personOne));
    }

    //////////////////// F

    @Test(expected = IllegalArgumentException.class)
    public  void Test4() {
        Department departmentOne = new Department("HSBC",DepartmentType.MARKETING);
        Department departmentTwo = new Department("IBM",DepartmentType.HR);

        Person personOne = new Person("Karol","Kowalski", new Date(2019,2,1),"172849378912",Position.MARKETING_CONSULTANT);
        departmentOne.addPerson(personOne);
        departmentOne.shiftPerson(personOne,departmentTwo);
        assertTrue(departmentTwo.getPersonList().contains(personOne));
    }

}



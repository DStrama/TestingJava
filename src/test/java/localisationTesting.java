
import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertTrue;

public class localisationTesting {

    //////////////////// G
    @Test
    public  void Test1() {
        Localisation localisationOne = new Localisation("Prokocim","Warsaw");
        Localisation localisationTwo = new Localisation("Biezanow","Krakow");
        Department department = new Department("nokia",DepartmentType.HR);
        localisationOne.addDepartment(department);

        localisationOne.shiftDepartment(department,localisationTwo);
        assertTrue(localisationTwo.getDepartmentList().contains(department));
    }

    //////////////////// H

    @Test(expected = IllegalArgumentException.class)
    public  void Test2() {
        Localisation localisationOne = new Localisation("Kurdwanow","Krakow");
        Localisation localisationTwo = new Localisation("Huta","Krakow");
        Department departmentOne = new Department("HR",DepartmentType.HR);
        Department departmentTwo = new Department("HR",DepartmentType.HR);

        localisationOne.addDepartment(departmentOne);
        localisationTwo.addDepartment(departmentTwo);
        localisationOne.shiftDepartment(departmentOne,localisationTwo);

    }
}

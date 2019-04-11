import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertTrue;

public class TestH {

    @Test(expected = IllegalArgumentException.class)
    public  void Test() {
        Localisation localisationOne = new Localisation("Kurdwanow","Krakow");
        Localisation localisationTwo = new Localisation("Huta","Krakow");
        Department departmentOne = new Department("HR",DepartmentType.HR);
        Department departmentTwo = new Department("HR",DepartmentType.HR);

        localisationOne.addDepartment(departmentOne);
        localisationTwo.addDepartment(departmentTwo);
        localisationOne.shiftDepartment(departmentOne,localisationTwo);

    }
}

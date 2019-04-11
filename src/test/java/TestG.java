import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertTrue;


public class TestG {

    @Test
    public  void Test() {
        Localisation localisationOne = new Localisation("Dluga","Katowice");
        Localisation localisationTwo = new Localisation("Marszalkowska","Lublin");
        Department department = new Department("Kosal",DepartmentType.HR);
        localisationOne.addDepartment(department);

        localisationOne.shiftDepartment(department,localisationTwo);
        assertTrue(localisationTwo.getDepartmentList().contains(department));
    }
}

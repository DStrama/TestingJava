import org.junit.Test;


import java.util.Date;

import static junit.framework.TestCase.assertTrue;

public class TestI {

    @Test
    public  void Test() {
        Person Dominik = new Person("Dominik","Strama", new Date(1997,7,27),"99111354854", Position.HR_ANALYST);
        Person Kamil = new Person("Kamil","Nowak", new Date(1998,3,11), "88022766155", Position.HR_ANALYST);
        Person Jurek = new Person("Jurek","Jaki", new Date(2001,9,20),"96122734657",Position.HR_ANALYST);
        Person Damian = new Person("Damian","Kowalski", new Date(1999,2,1),"92070636733",Position.HR_ANALYST);

        Department departmentOne = new Department("NOVOMATIC",DepartmentType.HR);

        departmentOne.addPerson(Dominik);
        departmentOne.addPerson(Kamil);
        departmentOne.addPerson(Jurek);
        departmentOne.addPerson(Damian);

        Department departmentTwo = new Department("NOVOMATIC_VOL2",DepartmentType.HR);

        departmentOne.shiftPerson(Dominik,departmentTwo);
        departmentOne.shiftPerson(Kamil,departmentTwo);
        departmentOne.shiftPerson(Jurek,departmentTwo);
        departmentOne.shiftPerson(Damian,departmentTwo);



    }
}

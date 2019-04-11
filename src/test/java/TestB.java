

import org.junit.Test;

import javax.sql.PooledConnection;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


public class TestB {

    @Test
    public  void Test(){

        Person personOne = new Person("Dominik","Kowalski", new Date(2019,7,27), "97072702938", Position.CPP_DEVELOPER );
        assertNotNull(personOne);

        assertEquals(personOne.getName(),"Dominik");
        assertEquals(personOne.getSurname(),"Kowalski");
        assertEquals(personOne.getBirthDate(),new Date(2019,7,27));
        assertEquals(personOne.getPosition(), Position.CPP_DEVELOPER);
        assertEquals(personOne.getPesel(),"97072702938");
    }

}
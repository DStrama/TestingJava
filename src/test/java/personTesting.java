

import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class personTesting {

    //////////////////// A
    @Test(expected = IllegalArgumentException.class)
    public  void Test1(){
        Person personOne = new Person("","Kowalski", new Date(1997,7,27), "85112733796", Position.CPP_DEVELOPER );
    }

    @Test(expected = IllegalArgumentException.class)
    public  void Test2(){
        Person personOne = new Person("Karol","", new Date(1997,7,27), "85112733796", Position.CPP_DEVELOPER );
    }

    @Test(expected = IllegalArgumentException.class)
    public  void Test3(){
        Person personOne = new Person("","", new Date(1997,7,27), "", Position.CPP_DEVELOPER );
    }

    //////////////////// B
    @Test
    public  void Test4(){

        Person personOne = new Person("Dominik","Kowalski", new Date(2019,7,27), "97072702938", Position.CPP_DEVELOPER );
        assertNotNull(personOne);

        assertEquals(personOne.getName(),"Dominik");
        assertEquals(personOne.getSurname(),"Kowalski");
        assertEquals(personOne.getBirthDate(),new Date(2019,7,27));
        assertEquals(personOne.getPosition(), Position.CPP_DEVELOPER);
        assertEquals(personOne.getPesel(),"97072702938");
    }
}

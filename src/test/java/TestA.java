

import org.junit.Test;

import java.util.Date;

public class TestA {
    //A
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
    //////////



}


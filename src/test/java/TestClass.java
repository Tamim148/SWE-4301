import assignment1.Nextdaygenerator;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {
    @Test
    void Daytest(){
        Nextdaygenerator nextdaygenerator=new Nextdaygenerator(1,1,2022);
        String expected="The next day is: 2.1.2022";
        assertEquals(expected,nextdaygenerator.getNextDay(nextdaygenerator.getDay(), nextdaygenerator.getMonth(), nextdaygenerator.getYear()));
    }
    @Test
    void Monthtest(){
        Nextdaygenerator nextdaygenerator=new Nextdaygenerator(30,9,2022);
        String expected="The next day is: 1.10.2022";
        assertEquals(expected,nextdaygenerator.getNextDay(nextdaygenerator.getDay(), nextdaygenerator.getMonth(), nextdaygenerator.getYear()));
    }
    @Test
    void Yeartest(){
        Nextdaygenerator nextdaygenerator=new Nextdaygenerator(31,12,2022);
        String expected="The next day is: 1.1.2023";
        assertEquals(expected,nextdaygenerator.getNextDay(nextdaygenerator.getDay(), nextdaygenerator.getMonth(), nextdaygenerator.getYear()));
    }

}

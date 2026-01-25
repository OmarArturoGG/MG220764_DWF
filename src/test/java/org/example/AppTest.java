package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;


//Omar Arturo Maldonado Guzman
//MG220764


class AppTest {

    @Test
    void testGetNumbers(){
        App app = new App();
        List<Integer> numbers = app.getNumbers();
        Assertions.assertNotNull(numbers);
        Assertions.assertEquals(1, numbers.get(0));
        Assertions.assertEquals(5, numbers.size());
    }


}

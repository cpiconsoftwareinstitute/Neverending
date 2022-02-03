package com.neverending.world.test;


import com.neverending.world.Board;
import com.neverending.world.Characters;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharactersTest {


    @Test
    public void SetPositionTest() {
        Board OneGUY = new Characters();


        OneGUY.setPosition(5,2);


        assertEquals(OneGUY.getPositionX(), 5, "Wrong position");
        assertEquals(OneGUY.getPositionY(), 2, "Wrong position");
    }

}

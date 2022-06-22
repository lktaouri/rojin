package com.example.rojin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RojinControllerTest {
    RojinController testen = new RojinController();

    @Test
    void testingYourMOM(){
        String a = testen.index();
        String b = "Rojin";
        assertEquals(a,b);
    }

}
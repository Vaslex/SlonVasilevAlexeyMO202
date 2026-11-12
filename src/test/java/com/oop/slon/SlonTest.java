package com.oop.slon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlonTest {
    @Test
    void teasesBackWithUsersOwnLine() {
        Slon slon = new Slon();
        String response = slon.respond("Привет");
        assertTrue(response.contains("Привет"));
        assertTrue(response.contains("а ты купи слона"));
    }
    @Test
    void helpCommandIsRecognized() {
        Slon slon = new Slon();
        String response = slon.respond("\\help");
        assertTrue(response.contains("Я предлагаю купить слона,ты отвечаешь,а после отвечаю я."));
        assertFalse(response.contains("а ты купи слона"));
    }
    @Test
    void exitCommandIsRecognized() {
        Slon slon = new Slon();
        assertTrue(slon.isExit("\\exit"));
        assertFalse(slon.isExit("Привет"));
    }
}







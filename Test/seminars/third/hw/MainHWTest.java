package seminars.third.hw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    private static MainHW mainHw;

    @BeforeAll
    public static void createMainHW() {
        mainHw = new MainHW();
    }

    @Test
    void evenOddNumberFalse() {
        int checkNum = 3;
        boolean expectedResult = false;
        // boolean actualResult = mainHw.evenOddNumber(checkNum);
        assertEquals(expectedResult, mainHw.evenOddNumber(checkNum), "метод evenOddNumber некорректен");
    }


    @Test
    void evenOddNumberTrue() {
        int checkNum = 20;
        boolean expectedResult = true;
        assertEquals(expectedResult, mainHw.evenOddNumber(checkNum), "метод evenOddNumber некорректен");
    }

    @Test
    void numberInIntervalTrue() {
        int checkNum = 26;
        boolean expectedResult = true;
        assertEquals(expectedResult, mainHw.numberInInterval(checkNum), "метод numberInInterval некорректен");
    }

    @Test
    void numberInIntervalFalse() {
        int checkNum = 100;
        boolean expectedResult = false;
        assertEquals(expectedResult, mainHw.numberInInterval(checkNum), "метод numberInInterval некорректен");
    }
}
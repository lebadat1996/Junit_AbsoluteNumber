import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNUmberTest {

    @Test
    void findAbsoluteNumber() {
        int number = 1; //input
        int except = 1; //mong muon
        int actual = AbsoluteNUmber.findAbsoluteNumber(number); // thuc te
        assertEquals(except,actual);
    }
}
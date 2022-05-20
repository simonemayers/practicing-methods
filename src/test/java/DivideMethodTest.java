import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideMethodTest {
    @Test
    @DisplayName("should divde two numbers")
    void shouldDivide(){
        assertEquals("1 / 3 = 0.3333333333333333", DivideMethod.divide(1,3));
    }

}
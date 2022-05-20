import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageMethodTest {
    @Test
    @DisplayName("should find sum of 3 numbers")
    void shouldSum(){
        assertEquals(15.0, AverageMethod.sum(2,5,8));
    }

    @Test
    @DisplayName("should find average of 3 numbers")
    void shouldAverage(){
        assertEquals(5.0, AverageMethod.average(2,5,8));
    }

}
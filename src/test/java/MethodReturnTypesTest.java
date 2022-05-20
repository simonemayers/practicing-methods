import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodReturnTypesTest {
    @Test
    @DisplayName("should return a string")
    void shouldReturnString(){
        assertEquals("Hello World", MethodReturnTypes.returnString());
    }

    @Test
    @DisplayName("should return an integer")
    void shouldReturnInt(){
        assertEquals(1, MethodReturnTypes.returnInt());
    }

    @Test
    @DisplayName("should return a boolean")
    void shouldReturnBoolean(){
        assertTrue(MethodReturnTypes.returnBoolean());
    }

}
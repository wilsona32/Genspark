import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class MainTest {
    Main main;
    @BeforeEach
    void setUp(){
        main = new Main();
    }

    @Test
    void check(){
        char[] correctLetter = {'c','a','r'};
        char[] expectedLetter = {'c','a','r'};
        assertEquals(correctLetter, expectedLetter, "System continues as expected");

    }

}
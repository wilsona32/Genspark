import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class MainTest {
    Main main;
    @BeforeEach
    void setUp(){
        main = new Main();
    }

    @Test
    void playAgain(){

        assertEquals("y", main.playAgain(), "System reset as expected");
        assertEquals("n", main.playAgain(), "System closed");
    }

}
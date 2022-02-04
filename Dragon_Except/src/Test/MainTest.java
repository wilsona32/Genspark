import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class MainTest {
    Main main;
    @BeforeEach
    void setUp(){
        main = new Main();
    }

    @Test
    void coinFlip(){
        assertEquals( 1, main.coinFlip(), "Answer was given as an output");
        assertEquals( 2, main.coinFlip(), "Answer was given as an output");
    }
}

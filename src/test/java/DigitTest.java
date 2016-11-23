import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 ._.   ...   ._.   ._.   ...   ._.   ._.   ._.   ._.   ._.
 |.|   ..|   ._|   ._|   |_|   |_.   |_.   ..|   |_|   |_|
 |_|   ..|   |_.   ._|   ..|   ._|   |_|   ..|   |_|   ..|
 */


public class DigitTest {

    Digit digit = new Digit();

    @Test
    public void emptyInput(){
//        assertEquals("._.\n|.|\n|_|", digit.printDigits(0));
//        assertEquals("...\n..|\n..|", digit.printDigits(1));
//        assertEquals("._.\n._|\n|_.", digit.printDigits(2));
//        assertEquals("._.\n._|\n._|", digit.printDigits(3));


        assertEquals("._. ._. ...\n._| ._| ..|\n._| |_. ..|", digit.printDigits(321));

    }

    @Test
    public void name(){
        assertEquals("._.\n|.|\n|_|", digit.printDigits(0));
    }
    @Test
    public void nasefme(){
        assertEquals("... ._.\n..| ._|\n..| |_.", digit.printDigits(12));
    }
    @Test
    public void nasfme(){
        assertEquals("._. ._.\n._| ._|\n._| |_.", digit.printDigits(32));
    }
    @Test
    public void nasfmesf(){
        assertEquals("", digit.printDigits(1234567890));
    }
}

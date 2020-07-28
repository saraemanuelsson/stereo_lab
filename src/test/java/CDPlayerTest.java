import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    private CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer();
    }

    @Test
    public void startsEmpty(){
        assertEquals("", cdPlayer.checkDiskTray());
    }

    @Test
    public void canInsert() {
        cdPlayer.inputDisk("Hamilton");
        assertEquals("Hamilton", cdPlayer.checkDiskTray());
    }


}

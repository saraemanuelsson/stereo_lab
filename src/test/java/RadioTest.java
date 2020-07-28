import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    private Radio radio;

    @Before
    public void before(){
        radio = new Radio();
    }

    @Test
    public void canTuneIn(){
        assertEquals("", radio.tune());
    }
    
    @Test
    public void canChangeStation(){
        radio.changeStation("Radio 1");
        assertEquals("Radio 1", radio.tune());
    }

    @Test
    public void canGetVolume(){
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void canChangeVolume() {
        radio.setVolume(42);
        assertEquals(42, radio.getVolume());
    }
}

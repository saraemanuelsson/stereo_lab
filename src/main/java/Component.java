import com.sun.org.apache.xpath.internal.operations.Bool;

public abstract class Component implements IVolume{

    private int volume;
    private Boolean power;

    public Component(){
        this.volume = 0;
        this.power = false;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Boolean getPower() {
        return power;
    }

    public void setPower(Boolean power) {
        this.power = power;
    }
}

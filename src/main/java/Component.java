public abstract class Component {

    protected int volume;
    protected Boolean power;

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

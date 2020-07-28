public abstract class Component implements IVolume{

    private int volume;

    public Component(){
        this.volume = 0;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

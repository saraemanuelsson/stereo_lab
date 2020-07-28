public class Stereo extends Component implements ITune, IPower, IPlay, IVolume {

    private String name;
    private String station;
    private Boolean playPause;

    public Stereo(String name){
        this.name = name;
        this.station = "";
        this.playPause = false;
    }

    public String tune(){
        return this.station;
    }

    public String getName(){
        return this.name;
    }

    public void changeStation(String station) {
        this.station = station;
    }

    public Boolean getPlayPause(){
        return playPause;
    }

    public void setPlayPause(Boolean playPause) {
        this.playPause = playPause;
    }


}

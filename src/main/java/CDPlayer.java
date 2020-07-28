public class CDPlayer extends Component {

    private String disk;
    private Boolean playPause;

    public CDPlayer(){
        this.disk = "";
        this.playPause = false;
    }
    public String checkDiskTray(){
        return disk;
    }

    public void inputDisk(String disk) {
        this.disk = disk;
    }

    public Boolean getPlayPause(){
        return playPause;
    }

    public void setPlayPause(Boolean playPause) {
        this.playPause = playPause;
    }
}

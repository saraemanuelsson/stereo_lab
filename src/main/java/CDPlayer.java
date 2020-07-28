public class CDPlayer extends Component {

    private String disk;

    public CDPlayer(){
        this.disk = "";
    }
    public String checkDiskTray(){
        return disk;
    }

    public void inputDisk(String disk) {
        this.disk = disk;
    }
}

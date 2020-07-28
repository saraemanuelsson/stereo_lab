public class Radio extends Component implements ITune, IVolume, IPower {

    private String station;

    public Radio() {
        this.station = "";
    }

    public String tune(){
        return station;
    }

    public void changeStation(String station){
        this.station = station;
    }


}

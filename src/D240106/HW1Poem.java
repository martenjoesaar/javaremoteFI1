package D240106;

public class HW1Poem {
    private HW1Author creator;
    private int stropheNumbers;

    public HW1Poem(HW1Author creator, int stropheNumbers){
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public HW1Author getCreator() {
        return creator;
    }
}

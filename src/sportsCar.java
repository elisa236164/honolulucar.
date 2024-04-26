public class sportsCar extends carType{

    private boolean automaticGear;
    private boolean airConditon;
    private boolean cruiseControl;
    private int leatherSeat;


    public sportsCar(boolean automaticGear, boolean airConditon, boolean cruiseControl, int leatherSeat) {
        this.automaticGear = automaticGear;
        this.airConditon = airConditon;
        this.cruiseControl = cruiseControl;
        this.leatherSeat = leatherSeat;
    }

    public boolean getAirConditon() {
        return airConditon;
    }

    public void setAirConditon(boolean airConditon) {
        this.airConditon = airConditon;
    }

    public int getLeatherSeat() {
        return leatherSeat;
    }

    public void setLeatherSeat(int leatherSeat) {
        this.leatherSeat = leatherSeat;
    }

    public boolean isCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(boolean cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

    @Override
    public String toString() {
        return "sportsCar{" +
                "automaticGear=" + automaticGear +
                ", airConditon=" + airConditon +
                ", cruiseControl=" + cruiseControl +
                ", leatherSeat=" + leatherSeat +
                '}';
    }
}

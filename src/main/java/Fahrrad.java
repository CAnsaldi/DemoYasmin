public class Fahrrad extends Fahrzeug{

    private boolean hatFederung;

    public Fahrrad(int xPosition, int yPosition, int anzRaeder, String marke, boolean hatFederung) {
        super(xPosition, yPosition, anzRaeder, marke);
        this.hatFederung = hatFederung;
    }
    public boolean getHatFederung(){
        return  hatFederung;
    }

    public void klingeln(){
        System.out.println("Ring Ring");
    }

}

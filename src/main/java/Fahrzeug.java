public class Fahrzeug {
    int xPosition;
    int yPosition;
    int anzRaeder;
    String marke;

    public Fahrzeug(int xPosition, int yPosition, int anzRaeder, String marke){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.anzRaeder = anzRaeder;
        this.marke = marke;
    }

    public void move(int xMovement, int yMovement){
        xPosition += xMovement;
        yPosition += yMovement;
    }

    public int getxPosition(){
        return xPosition;
    }

    public  int getyPosition(){
        return yPosition;
    }

    public String getMarke(){
        return marke;
    }
}

public class Auto extends Fahrzeug{
    private int anzahlPS;

    public Auto(int xPosition, int yPosition, int anzRaeder, String marke, int anzahlPS) {
        super(xPosition, yPosition, anzRaeder, marke);
        this.anzahlPS = anzahlPS;
    }

    public void hupen(){
        System.out.println("Nöööööök");
    }

}

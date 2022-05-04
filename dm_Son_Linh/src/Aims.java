public class Aims {
    public static  void main (String[] args)
    {
        // TODO Auto-generated method stub
        DigitalVideoDisc.Order anOrder = new DigitalVideoDisc.Order();
        // Create a new dyd object and set the fields
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("John Wick","Action","Hoang",123,50);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Doraemon","children","Nambazilt",90,55);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Spiderman","drama","Den Houser",100,90);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Hulk","action","Joan Lapotar",120,60);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Silent Hill","horor","Koon De",95,95);
        // add the dvd to the order
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.addDigitalVideoDisc(dvd4);
        anOrder.addDigitalVideoDisc(dvd5);
        System.out.print ("Total Cost is: ");
        System.out.println (anOrder.totalCost());

    }
}

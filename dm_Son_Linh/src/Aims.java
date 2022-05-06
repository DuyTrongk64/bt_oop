public class Aims {
    public static  void main (String[] args)
    {
        // TODO Auto-generated method stub
        DigitalVideoDisc.Order anOrder = new DigitalVideoDisc.Order();
        // Create a new dyd object and set the fields
        /*
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory ("Animation");
        dvd1.setCost (19.95f);
        dvd1.setDirector ("Roger Allers");
        dvd1.setLength (87);
        //add the dyd to the order
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory ("Science Fiction");
        dvd2.setCost (24.95f);
        dvd2. setDirector ("George Lucas");
        dvd2.setLength (124);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory ("Animation");
        dvd3.setCost (18.99f);
        dvd3.setDirector ("John Musker");
        dvd3.setLength (90);

         */
        // add the dvd to the order
        DigitalVideoDisc d1 = new DigitalVideoDisc("John Wick","Action","Hoang",123,50);
        DigitalVideoDisc d2 = new DigitalVideoDisc("Doraemon","children","Nambazilt",90,55);
        DigitalVideoDisc d3 = new DigitalVideoDisc("Spiderman","drama","Den Houser",100,90);
        DigitalVideoDisc d4 = new DigitalVideoDisc("Hulk","action","Joan Lapotar",120,60);
        DigitalVideoDisc d5 = new DigitalVideoDisc("Silent Hill","horor","Koon De",95,95);
        /*
        anOrder.addDigitalVideoDisc(d1);
        anOrder.addDigitalVideoDisc(d2);
        anOrder.addDigitalVideoDisc(d3);
        anOrder.addDigitalVideoDisc(d4);
        anOrder.addDigitalVideoDisc(d5);
         */
        anOrder.addDigitalVideoDisc(d1,d2,d3,d4,d5); // số lượng đối số tùy ý
        System.out.print ("Total Cost is: ");
        System.out.println (anOrder.totalCost());
    }
}

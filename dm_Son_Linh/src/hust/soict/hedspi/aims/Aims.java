package hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
public class Aims {
    public static  void main (String[] args)
    {
        // TODO Auto-generated method stub
        DigitalVideoDisc.Order anOrder = new DigitalVideoDisc.Order();
        // Create a new dyd object and set the fields
        /*
        hust.soict.hedspi.aims.disc.DigitalVideoDisc dvd1 = new hust.soict.hedspi.aims.disc.DigitalVideoDisc("The Lion King");
        dvd1.setCategory ("Animation");
        dvd1.setCost (19.95f);
        dvd1.setDirector ("Roger Allers");
        dvd1.setLength (87);
        //add the dyd to the order
        anOrder.addDigitalVideoDisc(dvd1);
        hust.soict.hedspi.aims.disc.DigitalVideoDisc dvd2 = new hust.soict.hedspi.aims.disc.DigitalVideoDisc("Star Wars");
        dvd2.setCategory ("Science Fiction");
        dvd2.setCost (24.95f);
        dvd2. setDirector ("George Lucas");
        dvd2.setLength (124);
        anOrder.addDigitalVideoDisc(dvd2);
        hust.soict.hedspi.aims.disc.DigitalVideoDisc dvd3 = new hust.soict.hedspi.aims.disc.DigitalVideoDisc("Aladdin");
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

        DigitalVideoDisc[] oder = new DigitalVideoDisc[5];
        oder[0]=d1;
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("John Wick noob deep ngu lon","Action","Hoang",123,50);
        /*
        oder[1]=d2;
        oder[2]=d3;
        oder[3]=d4;
        oder[4]=d5;
        anOrder.print(oder);

         */
        boolean check = dvd1.search("john deep lon");
        System.out.println(check);
        //anOrder.addDigitalVideoDisc(d1,d2,d3,d4,d5); // số lượng đối số tùy ý
        //System.out.print ("Total Cost is: ");
        //.out.println (anOrder.totalCost());
    }
}

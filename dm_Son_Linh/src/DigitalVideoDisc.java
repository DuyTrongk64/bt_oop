import java.util.Scanner;
public class DigitalVideoDisc {
    private  String title;
    private  String category;
    private  String director;
    private  int length;
    private  float cost;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }


    public DigitalVideoDisc(String title){
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public DigitalVideoDisc(String title, String category, String director) {
        this.title = title;
        this.category = category;
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public static class  Order{
        public static final int MAX_NUMBERS_ORDERED = 10;
        private DigitalVideoDisc itemOordered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

        int qtyOrdered()
        {
            int count =0;
            for(int i=0;i<10;i++)
            {
                if(itemOordered[i]!=null) count++;
                else break;
            }
            //System.out.println("So DigitalVideoDiscs trong đơn đặt hàng la : "+count);
            return count;
        }

        void addDigitalVideoDisc(DigitalVideoDisc disc)
        {
            int count=qtyOrdered();
            if(count==10){
                System.out.println("So Luong don hang da day.");
            }
            else {
                itemOordered[count]=disc;
                itemOordered[count].setCost(disc.cost);
                itemOordered[count].setTitle(disc.title);
                itemOordered[count].setCategory(disc.category);
                itemOordered[count].setDirector(disc.director);
                itemOordered[count].setLength(disc.length);
                count++;
            }
        }

        void addDigitalVideoDisc(DigitalVideoDisc [] dvdList)
        {
            int count = qtyOrdered();
            if(count>=10)
            {
                System.out.println("Danh sach da day.");
                return;
            }

            
        }

        float totalCost(){
            int count=qtyOrdered();
            float sum=0;
            for(int i=0;i<count;i++)
            {
                sum+=itemOordered[i].cost;
            }
            return sum;
        }

    }

}

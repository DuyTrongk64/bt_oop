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
            int count=0;
            for(int i=0;i<10;i++)
            {
                if(itemOordered[i].length!=0)
                {
                    count++;
                }
            }
            System.out.println("So DigitalVideoDiscs trong đơn đặt hàng la : "+count);
            return count;
        }

        void addDigitalVideoDisc(DigitalVideoDisc disc)
        {
            int count = qtyOrdered();
            if(count==10){
                System.out.println("So Luong don hang da day.");
            }
            else {
                Scanner sc = new Scanner(System.in);
                System.out.println("nhap title");
                disc.title = sc.next();
                System.out.println("nhap category");
                disc.category = sc.next();
                System.out.println("nhap director");
                disc.director = sc.next();
                System.out.println("nhap length");
                disc.length = sc.nextInt();
                System.out.println("nhap cost");
                disc.cost = sc.nextFloat();
                itemOordered[count+1]= disc;
            }
        }

        float totalCost(){
            int count = qtyOrdered();
            float sum=0;
            for(int i=0;i<count;i++)
            {
                sum+=itemOordered[i].cost;
            }
            return sum;
        }

    }

}

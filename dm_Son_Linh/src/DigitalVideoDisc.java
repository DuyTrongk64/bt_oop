import java.util.Arrays;
import java.util.List;
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
            count++;
            for(int i=0;i<(10-count);i++)
            {
                itemOordered[count]=dvdList[i];
                itemOordered[count].setCost(dvdList[i].cost);
                itemOordered[count].setTitle(dvdList[i].title);
                itemOordered[count].setCategory(dvdList[i].category);
                itemOordered[count].setDirector(dvdList[i].director);
                itemOordered[count].setLength(dvdList[i].length);
                count++;
            }

        }
        /*
        //số lượng đối số tùy ý
        void addDigitalVideoDisc(DigitalVideoDisc... list) // tạo varargs
        {

            int count = qtyOrdered(); // đếm số phần tử trong mảng
            int length = list.length; // lấy số tham số nhập vào
            if(count+length>=10) // nếu tổng số phần tử nhập vào và tham số > 10 => báo lỗi
            {
                System.out.println("do dai chuoi nhap vao vuot qua so luong toi da");
                return;
            }
            else
            {
                for(int i=0;i<length;i++)
                {   // thêm giá trị từ tham số nhập vào vào mảng itemOordered
                    itemOordered[count]=list[i];
                    itemOordered[count].setCost(list[i].cost);
                    itemOordered[count].setTitle(list[i].title);
                    itemOordered[count].setCategory(list[i].category);
                    itemOordered[count].setDirector(list[i].director);
                    itemOordered[count].setLength(list[i].length);
                    count++;
                }
            }
        }
         */
        void addDigitalVideoDisc (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2)
        {

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
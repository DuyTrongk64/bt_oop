package hust.soict.hedspi.aims.media;

import java.util.Date;

public class DigitalVideoDisc extends Media {
    private  String director;
    private  int length;


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
        public static final int MAX_LIMITTED_ORDERED = 5;
        private DigitalVideoDisc itemOordered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
        private static int nbOders = 0;
        private Date dateOrdered;


        public int qtyOrdered() // đếm số DigitalVideoDisc trong đơn đặt hàng
        {
            int count =0;
            for(int i=0;i<10;i++)
            {
                if(itemOordered[i]!=null) count++;
                else break;
            }
            System.out.println("So DigitalVideoDiscs trong đơn đặt hàng la : "+count);
            return count;
        }

        public void addDigitalVideoDisc(DigitalVideoDisc disc)
        {
            int count=qtyOrdered();
            if(count==MAX_NUMBERS_ORDERED){
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

        public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList)
        {
            int length = dvdList.length;
            int count = qtyOrdered();

            if(count+length>=MAX_NUMBERS_ORDERED)
            {
                System.out.println("so phan tu them vao vuot qua so luong toi da.");
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
        public void addDigitalVideoDisc(hust.soict.hedspi.aims.media.DigitalVideoDisc... list) // tạo varargs
        {

            int count = qtyOrdered(); // đếm số phần tử trong mảng
            int length = list.length; // lấy số tham số nhập vào
            if(count+length>=MAX_NUMBERS_ORDERED) // nếu tổng số phần tử nhập vào và tham số > 10 => báo lỗi
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

        public void addDigitalVideoDisc (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2)
        {
            int count = qtyOrdered();

            if(count==MAX_NUMBERS_ORDERED)
            {
                System.out.println("so mat hang vao da day.");
                System.out.println("khong the them"+dvd1.title+"va"+dvd2.title+".");
                return;
            }

            else
            {
                itemOordered[count]=dvd1;
                itemOordered[count].setCost(dvd1.cost);
                itemOordered[count].setTitle(dvd1.title);
                itemOordered[count].setCategory(dvd1.category);
                itemOordered[count].setDirector(dvd1.director);
                itemOordered[count].setLength(dvd1.length);
                count++;
                if(count==MAX_NUMBERS_ORDERED)
                {
                    System.out.println("so mat hang vao da day.");
                    System.out.println("khong the them"+dvd2.title+".");
                    return;
                }

                else
                {
                    itemOordered[count]=dvd2;
                    itemOordered[count].setCost(dvd2.cost);
                    itemOordered[count].setTitle(dvd2.title);
                    itemOordered[count].setCategory(dvd2.category);
                    itemOordered[count].setDirector(dvd2.director);
                    itemOordered[count].setLength(dvd2.length);
                   return;
                }
            }

        }
        public float totalCost(){
            int count=qtyOrdered();
            float sum=0;
            for(int i=0;i<count;i++)
            {
                sum+=itemOordered[i].cost;
            }
            return sum;
        }

        public Order() {
        }

        public Order(Date dateOrdered) {
            if(nbOders<5){
                this.dateOrdered = dateOrdered;
                nbOders++;
            }
            else{
                System.out.println("số lượng đơn đặt hàng hiện tại vượt quá số lượng giới hạn");
            }
        }

        public void print(DigitalVideoDisc [] dvdList)
        {

            int length = dvdList.length;
            Date date = this.dateOrdered;
            System.out.println("***********************Order***********************");
            System.out.println("Date: "+date);
            System.out.println("Ordered Items:");
            for(int i=0;i<length;i++)
            {
                itemOordered[i]=dvdList[i];
                System.out.println((i+1)+".DVD -"+itemOordered[i].title+"-"+itemOordered[i].category+"-"+itemOordered[i].director+"-"+itemOordered[i].length+": "+itemOordered[i].cost+"$");
            }
            float sum=0;
            for(int i=0;i<length;i++)
            {
                sum+=itemOordered[i].cost;
            }
            System.out.println("Total cost:"+sum);
            System.out.println("***************************************************");
        }
    }

    public boolean search(String title){
        String [] result1 = title.split(" "); // tach title thanh chuoi cac xau
        String [] result2 = this.getTitle().split(" ");
        int length1=result1.length;
        int lenhth2=result2.length;
        int count=0;
        for(int i=0;i<length1;i++)
        {
            for (int j=0;j<lenhth2;j++)
            {
                if(result1[i].equalsIgnoreCase(result2[j])==true) {
                    count++;
                    break;
                }
                else continue;
            }
        }
        if(count==length1)
        return true;
        else return false;
    }
}
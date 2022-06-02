package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public List<String> getauthors() {
        return authors;
    }

    public void setauthors(List<String> authors) {
        this.authors = authors;
    }

    public Book() {
    }

    public void addAuthor(String authorName){
        int size = authors.size(); // đếm số phần tử trong list
        for(int i=0;i<size;i++) // kiem tra
        {
            if(authorName==authors.get(i)){
                System.out.println("author is present in the ArrayList");
                return;
            }
        }

        authors.add((size+1),authorName); // thêm author vào vị trí thứ size +1 trong list
        return;
    }

    public void removeAuthor(String authorName){
        int size = authors.size(); // đếm số phần tử trong list
        int count =0;
        for(int i=0;i<size;i++) // kiem tra
        {
            if(authorName==authors.get(i)){
                authors.remove(i);
                count++;
                return;
            }
        }
        if(count==0) System.out.println("is not already in the ArrayList ");
        return;
    }
}

public class book {
    public String name;
    public String author;
    public int year;

public book(String name,String author,int year)
{
this.name=name;
this.author=author;
this.year=year;
}
public void display()
{
    System.out.println("book name is:"+name+"author name is:"+author+"year:"+year);
}
public static void main(String[] args) {
    book b=new book("snp","ssp",123);
    b.display();

}
}


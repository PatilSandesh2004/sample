public class car2 {
    public String model;
    public int  year;
    public String color;

    public car2(String model,int year,String color)
    {
        this.model=model;
        this.year=year;
        this.color=color;

    }
    public void display()
    {
        System.out.println("car model is:"+model+"production year is:"+ year+"color is:"+color);

    }

    public static void main(String[] args) {
        car2 c2=new car2("benz",2025,"red");
        c2.display();
    }
}

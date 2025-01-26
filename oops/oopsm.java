// encpulation use to hide the data 
public class oopsm{
    private String name;
    private int age;

    public String  getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }

    public void setName( String name)
    {
        this.name=name;
    }
    public void setAge(int age)
{
    this.age=age;

}

public static void main(String[] args) {
    oopsm o=new oopsm();
    o.setName("snp");
o.setAge(12);
System.out.println("name is:"+o.getname()); 
System.out.println("age is :"+o.getage());   

}
}

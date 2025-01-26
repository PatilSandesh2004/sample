public class attribute1 {
    public String name;
    public int price;
    public int totalproduct=0;

    public attribute1(String name,int price, int totalproduct)
    {
        this.name=name;
        this.price=price;
        this.totalproduct++;
    }
    public  void dispaly()
    {
            System.out.println("Name is:"+name+"price:"+price+"totalproduct is:"+totalproduct);

    }

    public static void main(String[] args) {
        attribute1 a=new attribute1("snp", 1000,0);
        // attribute1 a=new attribute1("mnp", 2000,0);
        
        a.dispaly();


    }

}

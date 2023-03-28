public class Vegetable implements Comparable<Vegetable>{
    public String vegetableName;
    public int price;
    public int quantity;
    public Vegetable(String vegetableName,int price ,int quantity){
        this.vegetableName=vegetableName;
        this.price=price;
        this.quantity=quantity;
    }
    public String getVegetableName(){return vegetableName;}
    public int getPrice(){return price;}
    public int getQuantity(){return quantity;}

    public int compareTo(Vegetable o){
    if (this.price==o.price)
        return 0;
    else if(this.price>o.price)
        return -1;
    return 1;
    }

}
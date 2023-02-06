package Inheritence;

public class OrderProduct extends Prodouct {
    private int qty;
    private double unitprice;

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public double getUnitprice() {
        return unitprice;
    }
    public OrderProduct(int code,String name,double unitprice,int qty){
        super(code,name);
        setUnitprice(unitprice);
        setQty(qty);
    }
    public void Display(){
        super.Display();
        System.out.println("QTY:"+getQty());
        System.out.println("Unitprice:"+getUnitprice());
    }

}

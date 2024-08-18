public abstract class Product {
    private String p_id;
    private String p_name;
    private double p_price;
    private int p_total;

    public Product(){

    }

    public Product(String p_id, String p_name, double p_price, int p_total){
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_price = p_price;
        this.p_total = p_total;
    }

    public String getP_id() {
        return p_id;
    }
    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }
    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public double getP_price() {
        return p_price;
    }
    public void setP_price(double p_price) {
        this.p_price = p_price;
    }

    public int getP_total() {
        return p_total;
    }
    public void setP_total(int p_total) {
        this.p_total = p_total;
    }

    public abstract double getTotalPrice();

    @Override
    public String toString() {
        return "Định danh SP: " + p_id + "\tTên SP: " + p_name + "\tGiá SP: " + p_price +"\tSố lượng SP: " + p_total;
    }
}

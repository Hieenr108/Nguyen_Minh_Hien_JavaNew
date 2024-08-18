public class Mobile extends Product{
    private String m_manu;
    private int m_ram;

    public Mobile(){
        super();
    }

    public Mobile(String hangSX, int boNho, String p_id, String p_name, double p_price, int p_total){
        super(p_id,p_name,p_price,p_total);
        this.m_manu = hangSX;
        this.m_ram = boNho;
    }

    public String getM_manu() {
        return m_manu;
    }
    public void setM_manu(String m_manu) {
        this.m_manu = m_manu;
    }

    public int getM_ram() {
        return m_ram;
    }
    public void setM_ram(int m_ram) {
        this.m_ram = m_ram;
    }

    @Override
    public String toString() {
        return "Hãng sản xuất: " + m_manu + "\t\tBộ nhớ: " + m_ram;
    }

    @Override
    public double getTotalPrice() {
        return getP_total()*getP_price()*1.2;
    }
}

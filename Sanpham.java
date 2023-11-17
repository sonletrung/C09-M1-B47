public class Sanpham {
    private int id;
    private String tensp;
    private int giasp;
    private int soluong;
    public Sanpham(int id, String tensp, int giasp, int soluong) {
        this.id = id;
        this.tensp = tensp;
        this.giasp = giasp;
        this.soluong = soluong;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTensp() {
        return tensp;
    }
    public void setTensp(String tensp) {
        this.tensp = tensp;
    }
    public int getGiasp() {
        return giasp;
    }
    public void setGiasp(int giasp) {
        this.giasp = giasp;
    }
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    @Override
    public String toString() {
        return "Sanpham [id = " + id + ", tensp = " + tensp + ", giasp = " + giasp + ", soluong = " + soluong + "]";
    }
    
}

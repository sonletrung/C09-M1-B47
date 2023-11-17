public class Listdonhang {
    private String tennguoimua;
    private int soluongsp;
    private int Idsanpham;
    private int slhanghoa;
    private int Tongtien;
    public Listdonhang(String tennguoimua, int soluongsp, int idsanpham, int slhanghoa, int tongtien) {
        this.tennguoimua = tennguoimua;
        this.soluongsp = soluongsp;
        Idsanpham = idsanpham;
        this.slhanghoa = slhanghoa;
        Tongtien = tongtien;
    }
    public String getTennguoimua() {
        return tennguoimua;
    }
    public void setTennguoimua(String tennguoimua) {
        this.tennguoimua = tennguoimua;
    }
    public int getSoluongsp() {
        return soluongsp;
    }
    public void setSoluongsp(int soluongsp) {
        this.soluongsp = soluongsp;
    }
    public int getIdsanpham() {
        return Idsanpham;
    }
    public void setIdsanpham(int idsanpham) {
        Idsanpham = idsanpham;
    }
    public int getSlhanghoa() {
        return slhanghoa;
    }
    public void setSlhanghoa(int slhanghoa) {
        this.slhanghoa = slhanghoa;
    }
    public int getTongtien() {
        return Tongtien;
    }
    public void setTongtien(int tongtien) {
        Tongtien = tongtien;
    }
    @Override
    public String toString() {
        return "Listdonhang [tennguoimua=" + tennguoimua + "\n soluongsp = " + soluongsp + "\n Idsanpham = " + Idsanpham
                + "\n slhanghoa = " + slhanghoa + "\n Tongtien = " + Tongtien + "]";
    }
    
}

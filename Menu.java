import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Sanpham>danhsach;
    private ArrayList<Listdonhang>danhsach1;
    public Menu(){
        this.danhsach = new ArrayList<>();
        this.danhsach1=new ArrayList<>();
        this.danhsach.add(new Sanpham(1234, "nuocngot", 15000, 10));
        this.danhsach.add(new Sanpham(2345, "migoi", 10000, 20));
        this.danhsach.add(new Sanpham(3245, "bimbim", 20000, 50));
        this.danhsach.add(new Sanpham(23556, "thuocla", 12000, 6));
        this.danhsach1.add(new Listdonhang("sơn", 5, 1234, 2, 30000));
    }
    public void hiends(){
        for (Sanpham sanpham : danhsach) {
              System.out.println(sanpham);
        }
    }
    public void timkiem(){
        Scanner input = new Scanner(System.in);
        String tentk = input.nextLine();
        boolean ketqua = false;
        for (Sanpham sanpham : danhsach) {
            if (sanpham.getTensp().equals(tentk)) {
                System.out.println(sanpham);
                ketqua=true;
                break;
            }
        }
        if (!ketqua){
            System.out.println("Khong tim thay");
        }
    }
    public void xemconhang(){
        Scanner input = new Scanner(System.in);
        String tenhang = input.nextLine();
        for (Sanpham sanpham : danhsach) {
            if (sanpham.getTensp().equals(tenhang)) {
                int socer = sanpham.getSoluong();
                if (socer>0) {
                    System.out.println("Số lượng sản phẩm còn lại là: "+socer);
                }
                else{
                    System.out.println("hết hàng");
                }
                break;
            }
        }
    }
    public void muahang(){
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào ID của hàng: ");
        int idhang = input.nextInt();
        System.out.println("nhập vào số lượng hàng");
        int slhang = input.nextInt();
        input.nextLine();
        System.out.println("nhập vào tên người mua: ");
        String tennguoimua = input.nextLine();
        for (Sanpham sanpham : danhsach) {
            if (sanpham.getId()==idhang) {
                int socer = sanpham.getSoluong();
                int tongtien = slhang*sanpham.getGiasp();
                if (socer-slhang>=0) {
                    System.out.println("bạn xác nhận mua hàng");
                    System.out.println("nhập 1 để in ra đơn hàng"
                    +"\nnhập 2 để hủy đơn hàng");
                    int chon = input.nextInt();
                    switch (chon) {
                        case 1:
                        System.out.println("-------------------------- "
                        +"\nngười mua hàng: "+ tennguoimua
                        +"\nid hàng hóa là: "+idhang
                        +"\nSố lượng hàng đã mua: "+slhang
                        +"\nTổng tiền: " +tongtien
                        +"\n------------------------------------");
                        this.danhsach1.add(new Listdonhang(tennguoimua, slhang, idhang, slhang, tongtien));
                            break;
                        case 2:
                        System.out.println("Hủy đơn hàng");
                        break;
                        default:
                            break;
                    }
                }
                else{
                    System.out.println("Không đủ số lượng hàng hóa yêu cầu");
                }
                break;
            }
        }
    }
    public void danhsachdonhang(){
        for (Listdonhang sanpham : danhsach1) {
            System.out.println(sanpham);
        }
    }
}

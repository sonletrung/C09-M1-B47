import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu hienthi = new Menu();
        Scanner input = new Scanner(System.in);
        int choice;
      
        do {
            System.out.println("----------------Menu----------------------");
            System.out.println("|  1. Hiển thị danh sách                 |");
            System.out.println("|  2. Tìm kiếm theo tên                  |");
            System.out.println("|  3. Xem còn hàng không                 |");
            System.out.println("|  4. Mua hàng                           |");
            System.out.println("|  5. xem lịch sử đơn hàng               |");
            System.out.println("------------------------------------------");
            choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 1:
                hienthi.hiends();
                break;
                case 2:
                hienthi.timkiem();
                break;
                case 3:
                hienthi.xemconhang();
                break;
                case 4:
                hienthi.muahang();
                break;
                case 5:
                hienthi.danhsachdonhang();
                break;
            }
        } while (choice!=0);
    }
}

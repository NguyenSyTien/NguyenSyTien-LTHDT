import java.util.Scanner;
public class Test {
    static Scanner sc = new Scanner(System.in);
    //tạo phương thức nhập thông tin cho xe
      static void nhapXe(vehicle xe){
            System.out.print("Nhập mã xe: ");
            xe.setMaXe(sc.nextInt());sc.nextLine();
            System.out.print("Nhập tên chủ xe: ");
            xe.setChuXe(sc.nextLine());
            System.out.print("Nhập dung tích xe: ");
            xe.setDungTich(sc.nextInt());
            System.out.print("Nhập trị giá xe: ");
            xe.setTriGia(sc.nextDouble());;sc.nextLine();
            System.out.print("Mô tả: ");
            xe.setMoTa(sc.nextLine());
        }
        //tạo phương thức main để chạy các phương thức khác ở class Vehicle
    public static void main(String[] args) {
        vehicle v[]= null;//mang chua xe
        int a,n=0;
        boolean flag = true;
        //sử dụng switch case để tạo menu cho chương trình
        do{
            System.out.println("ban chon lam gi!!!");
            System.out.println("1.Tao cac đoi tuong xe va nhap thong  tin \n"+
                    "2.Xuat bang ke khai tien thue cua cac xe.\n"+
                    "Nhap so khac đe thoat");
            a =sc.nextInt();
            switch (a){
                case 1:
                    System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
                    n=sc.nextInt();
                    //khai báo mảng v[] để chứa số lượng xe
                    v= new vehicle[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thứ " + (i+1));
                        v[i] = new vehicle();
                        nhapXe(v[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%5s %5s %5s %10s %10s %8s \n","Mã xe","Chủ xe","Dung tích","Trị giá","mô tả","Thuế");
                    for (int i = 0; i < n; i++) {
                        v[i].inThue();
                    }
                    break;
                default:
                    System.out.println("bye");
                    flag=false;
                    break;
            }
        }while (flag);
    }
}
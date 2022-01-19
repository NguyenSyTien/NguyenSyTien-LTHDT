package nonstructure;
import java.util.Scanner;

public class BankNonstucture {
    public static void main(String[] args) {
        //data
        int account_number = 12345;//số tk
        int account_balance = 0;//số dư

        //operation: thao tác lên dữ liệu
        //deposit
        //số tiền gửi được nhập từ bàn phím
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap so tien gui> ");
        int depositAmount = input.nextInt();
        account_balance += depositAmount;

        //show
        System.out.println("Thong tin tai khoan:");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);

        //with draw: rut tien
        int withdrawAmount = 0;
        System.out.print("Nhap so tien muon rut> ");
        withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount;

        //show
        System.out.println("Thong tin tai khoan:");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);


        //with draw: rut tien
        System.out.print("Nhap so tien muon rut> ");
        withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount;
        //show
        System.out.println("Thong tin tai khoan:");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);

    } 
    
}
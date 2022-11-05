import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database db = new Database();
        // TODO Create Menu
        Menu m1 = new Menu();
        m1.setName("Ayam goreng");
        m1.setName("Indomie");
        m1.setName("Mie ayam");


        // TODO Insert Menu to Database
        db.insertMenu(m1);


        // TODO Display Main Menu
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat datang di Restaurant");
        System.out.println("Silahkan register terlebih dahulu");

        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Phone number");
        int phoneNumber = sc.nextInt();

        System.out.println("Name: "+name);
        System.out.println("Phone Number: "+phoneNumber);

        sc.close();

        // TODO Create User

        // Display Menu
    }
}
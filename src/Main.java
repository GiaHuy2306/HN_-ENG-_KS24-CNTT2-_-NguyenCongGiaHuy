import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();

        productRepository.add(new ElectronicProduct("D01", "Kim dien", 10000, 12));
        productRepository.add(new ElectronicProduct("D02", "May khoan", 50000, 5));

        productRepository.add(new FoodProduct("F01", "Mi y", 30000, 5));
        productRepository.add(new ElectronicProduct("F02", "Pho", 50000, 10));

        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("MENU\n" +
                    "1. Hien thi toan bo danh sach san pham\n" +
                    "2. Tim san pham \n" +
                    "3. Sap xep san pham theo gia \n" +
                    "4. Thong ke san pham tung loai \n" +
                    "5. Thoat ");
            System.out.print("Nhap lua chon: ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    break;
                case 2:
                    System.out.print("Nhap id san pham can tim: ");
                    String id = input.nextLine();
                    productRepository.findById(id);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
    }
}
package scanner.ex;

import java.util.Scanner;

public class ScannerShopEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int total = 0;

        while(true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");

            int num = sc.nextInt();

            if(num == 1) {
                System.out.print("상품명을 입력하세요:");
                String name = sc.next();
                System.out.print("상품의 가격을 입력하세요:");
                int price = sc.nextInt();
                System.out.print("구매 수량을 입력하세요:");
                int count = sc.nextInt();

                total += (price * count);
                System.out.println("상품명: " + name + " 가격: " + price + " 수량: " + count + " 합계: " + total);

            } else if(num == 2) {
                System.out.println("총 비용: " + total);
                total = 0;
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

        sc.close();
    }
}

package LAB1;

import java.util.Scanner;

public class HinhChuNhat {
/*	 Yêu cầu nhập vào từ bàn phím chiều dài và chiều rộng của một hình chữ nhật. 
	 In ra màn hình chu vi và diện tích của hình chữ nhật đó. */
	
	public int dai;
	public int rong;
//Tạo công thức tính chu vi	
	public int tinhChuvi() {
		int chuvi = (this.dai+this.rong)*2;
		return chuvi;
	}
	//Tạo công thức tính Diện tích		
	public int tinhDientich() {
		int dientich = this.dai*this.rong;
		return dientich;
	}
	
	public static void main(String[] args) {
		HinhChuNhat o = new HinhChuNhat();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
// sử dụng vòng lặp nhập thông số, khi người dùng nhấn E thì thoát		
		while (!exit) {
			try {
				System.out.print("Nhap vao chieu dai (hoac nhap E de thoat): ");
				String daiInput = scanner.nextLine();
				
				if (daiInput.equalsIgnoreCase("E")) {
					exit = true;
					break;
				}
				
				o.dai = Integer.parseInt(daiInput);
				
				System.out.print("Nhap vao chieu rong: ");
				o.rong = Integer.parseInt(scanner.nextLine());

				int chuvi = o.tinhChuvi();
				int dientich = o.tinhDientich();
				System.out.println("Chu vi hinh chu nhat = "+ chuvi);
				System.out.println("Dien tich hinh chu nhat = "+ dientich);
				
			} catch (NumberFormatException ex) {
				System.out.println("Vui long nhap gia tri so hoac E de thoat!");
			}
		}
		
		System.out.println("Chuong trinh da thoat.");
		
	}


}

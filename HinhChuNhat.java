package LAB1;

import java.util.Scanner;

public class HinhChuNhat {
/*	 Yêu cầu nhập vào từ bàn phím chiều dài và chiều rộng của một hình chữ nhật. 
	 In ra màn hình chu vi và diện tích của hình chữ nhật đó. */
	
	public int dai;
	public int rong;
		
	public int tinhChuvi() {
		int chuvi = (this.dai+this.rong)*2;
		return chuvi;
	}
	
	public int tinhDientich() {
		int dientich = this.dai*this.rong;
		return dientich;
	}
	
	public static void main(String[] args) {
		HinhChuNhat o = new HinhChuNhat();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao chieu dai: ");
		int chieudai = scanner.nextInt();
		o.dai = chieudai;
		
		System.out.print("Nhap vao chieu rong: ");
		int chieurong = scanner.nextInt();
		o.rong = chieurong;
		
		int chuvi = o.tinhChuvi();
		int dientich = o.tinhDientich();
		System.out.println("Chu vi hinh chu nhat = "+ chuvi);
		System.out.println("Dien tich hinh chu nhat = "+ dientich);

		
	}

}

package NhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static ArrayList<Programmer> listPro = new ArrayList<Programmer>();
	private static ArrayList<Tester> listTester = new ArrayList<Tester>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhapNhanVienProgrammer();
		NhapNhanVienTester();
		Xuat();
		LoiDuoiNam();
		GioOTnhieuNhat();
	}
	
	public static void NhapNhanVienProgrammer(){
		System.out.print("Nhap so nhan vien Programmer n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			System.out.println("\nNhap nhan vien Programmer so " +(i+1));
			Programmer pro = new Programmer();
			pro.NhapThongTin();
			listPro.add(pro);
		}
	}
	
	public static void NhapNhanVienTester(){
		System.out.print("Nhap so nhan vien Tester n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			System.out.println("\nNhap nhan vien Tester so" +(i+1));
			Tester tester = new Tester();
			tester.NhapThongTin();
			listTester.add(tester);
		}
		
	}
	
	public static void Xuat(){
		System.out.println("-------------------------------");
		System.out.println("DANH SACH LUONG NHAN VIEN: ");
		System.out.println("-------------------------------");
		System.out.printf("%-10s|%-10s|%-10s","Ma NV","Ten NV","Luong NV");
		System.out.println("\n-------------------------------");
		for(Programmer pro : listPro){
			System.out.println(pro.XuatThongTin());
		}
		for(Tester tester : listTester){
			System.out.println(tester.XuatThongTin());
		}
		System.out.println("-------------------------------");
		
	}
	
	public static void LoiDuoiNam(){
		int i = 0;
		for(Programmer pro : listPro){
			if(pro.getSoLoi() < 5){
				i++;
			}
		}
		System.out.println("SO NHAN VIEN CO LOI DUOI 5: " + i);
	}
	
	public static void GioOTnhieuNhat(){
		System.out.println("NHAN VIEN CO GIO OT NHIEU NHAT ");
		System.out.println("-------------------------------");
		System.out.printf("%-10s|%-10s|%-10s","Ma NV","Ten NV","Luong NV");
		System.out.println("\n-------------------------------");
		int maxOT = 0;
		
		for(Tester tester : listTester){
			if(tester.getSoGioOT() > maxOT){
				maxOT = tester.getSoGioOT();
			}
		}
		
		for(Tester tester : listTester){
			if(tester.getSoGioOT() == maxOT){
				System.out.println(tester.XuatThongTin());
			}
		}
		
		System.out.println("-------------------------------");
		
	}

}

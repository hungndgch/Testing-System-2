package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;

public class Demo4 {
	public static void main(String[] args) {
		// Demo Array
		String[] student = { "Thảo", "Nghĩa", "Quyên", "Điền" };
		for (int i = 0; i < student.length; i++) {
			System.out.println("Student " + i + ": " + student[i]);
		}
		System.out.println("=====================================");
		String[] std = new String[4];
		std[0] = "Thảo";
		std[1] = "Quyên";
		std[2] = "Điền";
		std[3] = "Nghĩa";
		for (int i = 0; i < std.length; i++) {
			System.out.println("Student " + i + ": " + std[i]);
		}
		System.out.println("=====================================");
		// Khai báo phòng
		Department department1 = new Department();
		department1.Id = 1;
		department1.Name = "Sale";

		Department department2 = new Department();
		department2.Id = 2;
		department2.Name = "Kỹ thuật";

		Department department3 = new Department();
		department3.Id = 3;
		department3.Name = "Marketing";

		Department[] dpt = new Department[] { department1, department2, department3 };
		for (int i = 0; i < dpt.length; i++) {
			System.out.println("Department " + (i + 1) + " " + dpt[i].Name);
		}
		// Position
		Position position1 = new Position();
		position1.Id = 1;
		position1.Name = PositionName.Dev;

		Position position2 = new Position();
		position2.Id = 2;
		position2.Name = PositionName.Tester;

		Position position3 = new Position();
		position3.Id = 3;
		position3.Name = PositionName.ScrumMaster;

		// Group
		Group group1 = new Group();
		group1.Id = 1;
		group1.name = "Football";

		group1.createDate = LocalDate.of(2022, 01, 20);

		Group group2 = new Group();
		group2.Id = 2;
		group2.name = "Guitar";
		group2.createDate = LocalDate.now();

		Group group3 = new Group();
		group3.Id = 3;
		group3.name = "Mentor";
		group3.createDate = LocalDate.now();

		// Khai báo account
		Account a1 = new Account();
		a1.Id = 1;
		a1.username = "username 1";
		a1.fullName = "Fullname 1";
		a1.createDate = LocalDate.now();
		a1.department = department3;
		a1.position = position2;
		a1.email = "email 1";
		// Tạo ra mảng các Group mà a1 tham gia
		Group[] groupa1 = new Group[] { group1, group2 };
		a1.groups = groupa1;

		Account a2 = new Account();
		a2.Id = 2;
		a2.username = "username 2";
		a2.fullName = "Fullname 2";
		a2.createDate = LocalDate.now();
//		a2.department = department2;
		a2.position = position1;
		a2.email = "email 2";
		// Tạo ra mảng các Group mà a1 tham gia
		a2.groups = new Group[] { group1, group3 };

		Account a3 = new Account();
		a3.Id = 3;
		a3.username = "username 3";
		a3.fullName = "Fullname 3";
		a3.createDate = LocalDate.now();
		a3.department = department2;
		a3.position = position1;
		a3.email = "email 3";
		// Tạo ra mảng các Group mà a1 tham gia
		a3.groups = new Group[] { group1, group3 };

//		group1.accounts = new Account[] { a1, a3 };
		group2.accounts = new Account[] { a1, a2 };
		group3.accounts = new Account[] { a2, a2, a3 };

		// Hiển thị data
		for (int i = 0; i < group2.accounts.length; i++) {
			System.out.println("[" + group2.name + "] " + group2.accounts[i].username);
		}

		for (int i = 0; i < group3.accounts.length; i++) {
			System.out.println("[" + group3.name + "] " + group3.accounts[i].username);
		}

		// In thông tin account 1
		System.out.println("\n=====================================");
		System.out.println("| Full Name: " + a1.fullName);
		System.out.println("| Id: " + a1.Id);
		System.out.println("| Email: " + a1.email);
		System.out.println("| Username: " + a1.username);
		System.out.println("| Department: " + a1.department.Name);
		System.out.println("| Position: " + a1.position.Name);
		for (int i = 0; i < a1.groups.length; i++) {
			System.out.println("| [Group " + (i + 1) + "] " + a1.groups[i].name);
		}
		System.out.println("=====================================");

		// Kiểm tra account 2 có department chưa
		if (a2.department == null) {
			System.out.println("Chưa có Department");
		} else {
			System.out.println("Phòng ban" + " - " + a1.department.Name);
		}

		System.out.println("=====================================");
		// Kiểm tra account 2 tham gia bao nhiêu group
		if (a2.groups.length == 1 || a2.groups.length == 2) {
			System.out.println("Account 2 đang tham gia " + a2.groups.length + " groups");
			for (int i = 0; i < a2.groups.length; i++) {
				System.out.println("[Group " + (i + 1) + "] " + a2.groups[i].name);
			}
		} else if (a2.groups.length >= 3) {
			System.out.println("Account 2 đang tham gia hơn 3 groups");
		} else {
			System.out.println("Account 2 chưa tham gia group nào");
		}
		System.out.println("=====================================");
		// Ternary - Toán tử 3 ngôi - If else rút gọn
		// Cú pháp
		// variable_name = (condition) ? value1 : value2
		// Nếu condition nó là đúng (hay là true) thì toán tử sẽ trả về value 1
		// còn nếu là sai (hay là false) thì nó sẽ trả về giá trị của value 2
		System.out.println("=====================================");
		System.out.println(a2.department == null ? "Chưa có phòng ban " : "Phòng ban: " + a2.department.Name);
		System.out.println("=====================================");
		System.out.println(a1.position.Name == PositionName.Dev ? "Đây là Developer" : "Đây không phải Developer");

		System.out.println("=====================================");
//		Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//		Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//		Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//		Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//		Còn lại in ra "Nhóm có nhiều thành viên

		if (group1.accounts == null) {
			System.out.println("Group 1 chưa có account");
		} else {
			int countGroupAcc = group1.accounts.length;
			switch (countGroupAcc) {
			case 1:
				System.out.println("Nhóm có 1 thành viên");
				break;
			case 2:
				System.out.println("Nhóm có 2 thành viên");
				break;
			case 3:
				System.out.println("Nhóm có 3 thành viên");
				break;
			default:
				System.out.println("Nhóm có nhiều thành viên");
				break;
			}
		}

		System.out.println("========== Demo Foreach ====================");
		Account[] accs = new Account[] { a1, a2, a3 };
		for (Account accInfo : accs) {
			if (accInfo.department == null) {
				System.out.println("No Department" + " | " + accInfo.email + " | " + accInfo.fullName + " | "
						+ accInfo.username + " | ");
			} else {
				System.out.println(accInfo.department.Name + " | " + accInfo.email + " | " + accInfo.fullName + " | "
						+ accInfo.username + " | ");

			}
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
		System.out.println("================ Demo For ==================");
		// Hãy in các số từ 1 đến 10
		System.out.println("Hãy in các số từ 1 đến 10");
		for (int i = 1; i <= 10; i++) {
			System.out.printf(i + " ");
		}
		System.out.println("\n==================================");
		for (int i = 0; i < accs.length; i++) {
			System.out.println(accs[i].fullName);
		}
		// Dùng for in thông tin tất cả các phòng ban gồm id và name
		System.out.println("=====================================");
		for (int i = 0; i < dpt.length; i++) {
			System.out.println("Thông tin phòng ban số " + (i + 1));
			System.out.println("ID: " + dpt[i].Id + " - Name: " + dpt[i].Name);
		}

		System.out.println("================ While ==================");
		int i = 11;
		while (i <= 10) {
			System.out.printf(i + " ");
			i = i + 1;
		}
		System.out.println("\n=====================================");
		// Dùng for in thông tin tất cả các phòng ban gồm id và name
		int index = 0;
		while (index < dpt.length) {
			System.out.println("Thông tin phòng ban số " + (index + 1));
			System.out.println("ID: " + dpt[index].Id + " | Name: " + dpt[index].Name);
			index = index + 1;
		}

		System.out.println("================ Do While ==================");
		int j = 11;
		do {
			System.out.printf(j + " ");
			j = j + 1;
		} while (j <= 10);

		System.out.println("\n=====================================");
		int k = 11;
		while (k <= 10) {
			System.out.printf(k + " ");
			k = k + 1;
		}
		System.out.println("=====================================");

	}
}

package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;

public class TestingSystem2_Exercise_2_Question_6 {
	public static void main(String[] args) {

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

		Position position4 = new Position();
		position4.Id = 4;
		position4.Name = PositionName.PM;
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
		a1.email = "email1";
		// Tạo ra mảng các Group mà a1 tham gia
		Group[] groupa1 = new Group[] { group1, group2 };
		a1.groups = groupa1;

		Account a2 = new Account();
		a2.Id = 2;
		a2.username = "username 2";
		a2.fullName = "Fullname 2";
		a2.createDate = LocalDate.now();
		a2.department = department2;
		a2.position = position1;
		a2.email = "email2";
		a2.groups = new Group[] { group1, group3 };

		Account a3 = new Account();
		a3.Id = 3;
		a3.username = "username 3";
		a3.fullName = "Fullname 3";
		a3.createDate = LocalDate.now();
		a3.department = department2;
		a3.position = position1;
		a3.email = "email3";
		a3.groups = new Group[] { group1, group3 };

		Account a4 = new Account();
		a4.Id = 4;
		a4.username = "username 4";
		a4.fullName = "Fullname 4";
		a4.createDate = LocalDate.now();
		a4.department = department1;
		a4.position = position4;
		a4.email = "email4";
		a3.groups = new Group[] { group1, group2 };

		Account a5 = new Account();
		a5.Id = 5;
		a5.username = "username 5";
		a5.fullName = "Fullname 5";
		a5.createDate = LocalDate.now();
//		a5.department = department3;
		a5.position = position2;
		a5.email = "email5";
		a5.groups = new Group[] { group1 };

		group1.accounts = new Account[] { a1, a3, a4 };
		group2.accounts = new Account[] { a1, a2 };
		group3.accounts = new Account[] { a2, a2, a3, a5 };

		Account[] accs = new Account[] { a1, a2, a3, a4, a5 };

		for (Account accInfo : accs) {
			if (accInfo.department == null) {
				System.out.printf("|%1$15s | %2$15s | %3$20s | %4$20s |%n", "No Department",
						accInfo.email + "@gmail.com", accInfo.fullName, accInfo.username);
				System.out
						.println("----------------------------------------------------------------------------------");
			} else {
				System.out.printf("|%1$15s | %2$15s | %3$20s | %4$20s |%n", accInfo.department.Name,
						accInfo.email + "@gmail.com", accInfo.fullName, accInfo.username);
				System.out
						.println("----------------------------------------------------------------------------------");
			}
		}

		System.out.println("===================================================================================");
	}
}

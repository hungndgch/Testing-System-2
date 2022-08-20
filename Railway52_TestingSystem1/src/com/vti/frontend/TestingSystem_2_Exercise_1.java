package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;

public class TestingSystem_2_Exercise_1 {
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
		a5.Id = 4;
		a5.username = "username 5";
		a5.fullName = "Fullname 5";
		a5.createDate = LocalDate.now();
//		a5.department = department3;
		a5.position = position2;
		a5.email = "email4";
		a5.groups = new Group[] { group1 };

		group1.accounts = new Account[] { a1, a3, a4 };
		group2.accounts = new Account[] { a1, a2 };
		group3.accounts = new Account[] { a2, a2, a3, a5 };

		Account[] accs = new Account[] { a1, a2, a3, a4, a5 };

		System.out.println("====================== Exercise 1 ======================");
		System.out.println("********************** Question 1 **********************");

		if (a2.department == null) {
			System.out.println("Chưa có Department");
		} else {
			System.out.println("Phòng ban của account 2 : " + a1.department.Name);
		}

		System.out.println("*********************** Question 2 **********************");

		// Kiểm tra account 2 tham gia bao nhiêu group
		if (a2.groups == null) {
			System.out.println("Account 2 chưa tham gia group nào");

		} else if (a2.groups.length == 1 || a2.groups.length == 2) {
			System.out.println("Account 2 đang tham gia " + a2.groups.length + " groups");
			for (int i = 0; i < a2.groups.length; i++) {
				System.out.println("[Group " + (i + 1) + "] " + a2.groups[i].name);
			}

		} else if (a2.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

		System.out.println("********************** Question 3 **********************");
		System.out.println("Sử dụng toán tử ternary");
		System.out.println(a2.department == null ? "Chưa có phòng ban " : "Phòng ban: " + a2.department.Name);

		System.out.println("********************** Question 4 **********************");
		System.out.println("Sử dụng toán tử ternary");
		System.out.println(a1.position.Name == PositionName.Dev ? "Đây là Developer" : "Đây không phải Developer");

		System.out.println("********************** Question 5 **********************");

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

		System.out.println("********************** Question 6 ***********************");
		if (a2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			int countAcc = a1.groups.length;
			switch (countAcc) {
			case 1:
				for (Group gra1 : a1.groups) {
					System.out.println("[Group]" + gra1.name);
				}
				break;
			case 2:
				System.out.println("Account 2 đang tham gia " + a2.groups.length + " groups");
				for (int i = 0; i < a2.groups.length; i++) {
					System.out.println("[Group " + (i + 1) + "] " + a2.groups[i].name);
				}
				break;
			case 3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;
			default:
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;
			}
		}

		System.out.println("********************** Question 7 **********************");

		switch (a1.position.Name) {

		case Dev:
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Đây không phải là Developer");
			System.out.println("Đây là " + a1.position.Name);
			break;
		}

		System.out.println("********************** Question 8 **********************");

		for (Account accInfo : accs) {
			if (accInfo.department == null) {
				System.out.println("No Department" + " | " + accInfo.email + " | " + accInfo.fullName + " | "
						+ accInfo.username + " | ");
			} else {
				System.out.println(accInfo.department.Name + " | " + accInfo.email + " | " + accInfo.fullName + " | "
						+ accInfo.username + " | ");
			}
		}

		System.out.println("********************** Question 9 **********************");

		for (Department dept : dpt) {
			System.out.println("ID " + dept.Id + " - Name " + dept.Name);
		}

		System.out.println("********************** Question 10 *********************");

		for (int i = 0; i < accs.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là");
			System.out.println("Email: " + accs[i].email + "@gmail.com");
			System.out.println("Full Name: " + accs[i].fullName);
			if (accs[i].department == null) {
				System.out.println("Phòng ban: Chưa có");
			} else {
				System.out.println("Phòng ban: " + accs[i].department.Name);

			}
			System.out.println("..........................................");
		}

		System.out.println("********************** Question 11 *********************");

		for (int i = 0; i < dpt.length; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là");
			System.out.println("ID: " + dpt[i].Id);
			System.out.println("Name: " + dpt[i].Name);
		}

		System.out.println("********************** Question 12 *********************");

		for (int i = 0; i < 2; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là");
			System.out.println("ID: " + dpt[i].Id);
			System.out.println("Name: " + dpt[i].Name);
		}

		System.out.println("********************** Question 13 *********************");

		for (int i = 0; i < accs.length; i++) {
			if (accs[i] != a2) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là");
				System.out.println("Email: " + accs[i].email + "@gmail.com");
				System.out.println("Full Name: " + accs[i].fullName);
				if (accs[i].department == null) {

					System.out.println("Phòng ban: Chưa có");

				} else {
					System.out.println("Phòng ban: " + accs[i].department.Name);
				}
				System.out.println("..........................................");
			}
		}

		System.out.println("********************** Question 14 *********************");

		for (int i = 0; i < accs.length; i++) {
			if (accs[i].Id < 4) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là");
				System.out.println("Email: " + accs[i].email + "@gmail.com");
				System.out.println("Full Name: " + accs[i].fullName);
				if (accs[i].department == null) {

					System.out.println("Phòng ban: Chưa có");

				} else {
					System.out.println("Phòng ban: " + accs[i].department.Name);
				}
				System.out.println("..........................................");
			}
		}

		System.out.println("********************** Question 15 *********************");

		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.printf(i + " - ");
			}
		}
		System.out.println("");

		System.out.println("********************** Question 16 *********************");

		System.out.println("Question 10.2");

		int accIndex = 0;

		while (accIndex < accs.length) {
			System.out.println("Thông tin account thứ " + (accIndex + 1) + " là");
			System.out.println("Email: " + accs[accIndex].email + "@gmail.com");
			System.out.println("Full Name: " + accs[accIndex].fullName);
			if (accs[accIndex].department == null) {
				System.out.println("Phòng ban: Chưa có");
			} else {
				System.out.println("Phòng ban: " + accs[accIndex].department.Name);
			}
			System.out.println("");
			accIndex++;
		}
		System.out.println("..........................................");

		System.out.println("Question 11.2");

		int depIndex = 0;

		while (depIndex < dpt.length) {
			System.out.println("Thông tin department thứ " + (depIndex + 1) + " là");
			System.out.println("ID: " + dpt[depIndex].Id);
			System.out.println("Name: " + dpt[depIndex].Name);
			depIndex++;
		}
		System.out.println("..........................................");

		System.out.println("Question 12.2");

		int depIndex1 = 0;

		while (depIndex1 < 2) {
			System.out.println("Thông tin department thứ " + (depIndex1 + 1) + " là");
			System.out.println("ID: " + dpt[depIndex1].Id);
			System.out.println("Name: " + dpt[depIndex1].Name);
			depIndex1++;
		}
		System.out.println("..........................................");

		System.out.println("Question 13.2");

		int accIndex1 = 0;

		while (accIndex1 < accs.length) {
			if (accs[accIndex1] == a2) {
				accIndex1++;
				continue;
			} else {
				System.out.println("Thông tin account thứ " + (accIndex1 + 1) + " là");
				System.out.println("Email: " + accs[accIndex1].email + "@gmail.com");
				System.out.println("Full Name: " + accs[accIndex1].fullName);

				if (accs[accIndex1].department == null) {
					System.out.println("Phòng ban: Chưa có");
				} else {
					System.out.println("Phòng ban: " + accs[accIndex1].department.Name);
				}
				System.out.println("");
			}

			accIndex1++;
		}
		System.out.println("..........................................");

		System.out.println("Question 14.2");

		int accIndex14 = 0;

		while (accIndex14 < accs.length) {

			if (accs[accIndex14].Id == 4) {
				accIndex14++;
				break;
			} else {
				System.out.println("Thông tin account thứ " + (accIndex14 + 1) + " là");
				System.out.println("Email: " + accs[accIndex14].email + "@gmail.com");
				System.out.println("Full Name: " + accs[accIndex14].fullName);

				if (accs[accIndex14].department == null) {
					System.out.println("Phòng ban: Chưa có");
				} else {
					System.out.println("Phòng ban: " + accs[accIndex14].department.Name);
				}
				System.out.println("");
			}
			accIndex14++;
		}

		System.out.println("..........................................");

		System.out.println("Question 15.2");

		int j = 0;

		while (j <= 20) {

			if (j % 2 == 0) {
				System.out.printf(j + " ");
				j++;
				continue;
			}
			j++;
		}

		System.out.println("..........................................");

		System.out.println("********************** Question 17 *********************");

		System.out.println("Question 10.3");

		int accIndex103 = 0;

		do {
			System.out.println("Thông tin account thứ " + (accIndex103 + 1) + " là");
			System.out.println("Email: " + accs[accIndex103].email + "@gmail.com");
			System.out.println("Full Name: " + accs[accIndex103].fullName);

			if (accs[accIndex103].department == null) {
				System.out.println("Phòng ban: Chưa có");
			} else {
				System.out.println("Phòng ban: " + accs[accIndex103].department.Name);
			}
			System.out.println("");
			accIndex103++;

		} while (accIndex103 < accs.length);

		System.out.println("..........................................");

		System.out.println("Question 11.3");

		int depIndex113 = 0;

		do {
			System.out.println("Thông tin department thứ " + (depIndex113 + 1) + " là");
			System.out.println("ID: " + dpt[depIndex113].Id);
			System.out.println("Name: " + dpt[depIndex113].Name);
			depIndex113++;

		} while (depIndex113 < dpt.length);

		System.out.println("..........................................");

		System.out.println("Question 12.3");

		int depIndex123 = 0;

		do {
			System.out.println("Thông tin department thứ " + (depIndex123 + 1) + " là");
			System.out.println("ID: " + dpt[depIndex123].Id);
			System.out.println("Name: " + dpt[depIndex123].Name);
			depIndex123++;

		} while (depIndex123 < 2);

		System.out.println("..........................................");

		System.out.println("Question 13.3");

		int accIndex133 = 0;

		do {

			if (accs[accIndex133] == a2) {
				accIndex133++;
				continue;
			} else {
				System.out.println("Thông tin account thứ " + (accIndex133 + 1) + " là");
				System.out.println("Email: " + accs[accIndex133].email + "@gmail.com");
				System.out.println("Full Name: " + accs[accIndex133].fullName);

				if (accs[accIndex133].department == null) {
					System.out.println("Phòng ban: Chưa có");
				} else {
					System.out.println("Phòng ban: " + accs[accIndex133].department.Name);
				}
				System.out.println("");
			}

			accIndex133++;

		} while (accIndex133 < accs.length);

		System.out.println("..........................................");

		System.out.println("Question 14.3");

		int accIndex143 = 0;

		do {

			if (accs[accIndex143].Id == 4) {
				accIndex143++;
				break;
			} else {
				System.out.println("Thông tin account thứ " + (accIndex143 + 1) + " là");
				System.out.println("Email: " + accs[accIndex143].email + "@gmail.com");
				System.out.println("Full Name: " + accs[accIndex143].fullName);

				if (accs[accIndex143].department == null) {
					System.out.println("Phòng ban: Chưa có");
				} else {
					System.out.println("Phòng ban: " + accs[accIndex143].department.Name);
				}
				System.out.println("");
			}
			accIndex143++;

		} while (accIndex143 < accs.length);

		System.out.println("..........................................");

		System.out.println("Question 15.3");

		int i153 = 0;

		do {
			if (i153 % 2 == 0) {
				System.out.printf(i153 + " ");
				i153++;
				continue;
			}
			i153++;
		} while (i153 <= 20);

		System.out.println("..........................................");

	}
}

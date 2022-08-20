package com.vti.frontend;

import com.vti.entity.Department;
import com.vti.entity.Position;
import com.vti.entity.PositionName;

public class Demo_2 {
	public static void main(String[] args) {
//		Tạo phòng ban
		// Khai báo phòng 1
		Department department1 = new Department();
		department1.Id = 1;
		department1.Name = "Sale";
		System.out.println("Department 1 : " + department1.Id + " | " + department1.Name);

		// Khai báo phòng 2
		Department department2 = new Department();
		department2.Id = 2;
		department2.Name = "Kỹ thuật";
		System.out.println("Department 2 : " + department2.Id + " | " + department2.Name);

//		Tạo Position
		// Khai báo position 1
		Position position1 = new Position();
		position1.Id = 1;
		position1.Name = PositionName.Dev;
		System.out.println("Postion 1 : " + position1.Id + " - " + position1.Name);
	}
}

package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName(String stuName) {
		System.out.println("studentName"+"="+stuName);
	}
	public void studentDept(String stuDep) {
		System.out.println("studentDept"+"="+stuDep);
	}
	public void studentId(int stuId) {
		System.out.println("studentId"+"="+stuId);
	}
	public static void main(String[] args) {
		Student details=new Student();
		details.collegeName("TestLeaf");
		details.collegeCode("TL005");
		details.collegeRank(1);
		details.deptName("Engineering");
		details.studentName("Sreedhar Varma");
		details.studentDept("Mechanical Engineering");
		details.studentId(850303);
	}

}

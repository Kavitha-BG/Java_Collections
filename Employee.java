package com.basicsstrong.streams;

public class Employee {

		private String name;
		public int salary;
		public Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}

}

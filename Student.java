package Supplier.Supplier_Lamda;

public class Student {
		private static String name;
		private static int id;
		private static String dept;
		public String getName() {
			return name;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", id=" + id + ", dept=" + dept + "]";
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public Student(String name, int id, String dept) {
			super();
			this.name = name;
			this.id = id;
			this.dept = dept;
		}

		
		
	}


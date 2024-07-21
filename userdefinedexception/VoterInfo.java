package com.userdefinedexception;

public class VoterInfo {
		private String name;
		private int age;
		private String gender;
		
		
		public VoterInfo() {
			super();
		}
		
		
		
		public VoterInfo(String name, int age, String gender) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
		}



		

		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public int getAge() {
			return age;
		}



		public void setAge(int age) {
			try {
				AgeVali.isValiAge(age);
				this.age = age;
			}catch(InvalidAgeException e) {
				System.err.println("Please enter valid age");
			}
		}



		public String getGender() {
			return gender;
		}



		public void setGender(String gender) {
			this.gender = gender;
		}



		@Override
		public String toString() {
			return "VoterInfo [name=" + name + ", age=" + age + ", gender=" + gender + "]";
		}


		
		
				
			
		
		
		

	}



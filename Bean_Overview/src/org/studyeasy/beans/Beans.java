package org.studyeasy.beans;

public class Beans 
{
	
		private String firstName;
		private String lastName;
		public Beans() 
		{
			firstName = "John";
			lastName = "Doe";
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
}

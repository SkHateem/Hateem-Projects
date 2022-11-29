package com.python.kotak;

public class Students 
{
	private int idNumber;
	private String cName;
	
	public Students() 
	{
		
	}

	public Students(int idNumber, String cName) {
		super();
		this.idNumber = idNumber;
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Students [idNumber=" + idNumber + ", cName=" + cName + "]";
	}
	

}

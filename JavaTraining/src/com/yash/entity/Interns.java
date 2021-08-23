package com.yash.entity;

import java.util.Arrays;
import java.util.List;

public class Interns {

	private int id;
	private String internFirstName;
	private String internLastName;
	private int internAge;
	
	public Interns(Interns.Builder builder) {
		this.id=builder.id;
		this.internFirstName=builder.internFirstName;
		this.internLastName=builder.internLastName;
		this.internAge=builder.internAge;
	}
	public int getId() {
		return id;
	}
	public String getInternFirstName() {
		return internFirstName;
	}
	public String getInternLastName() {
		return internLastName;
	}
	public int getInternAge() {
		return internAge;
	}
	
	public static class Builder{
		private int id;
		private String internFirstName;
		private String internLastName;
		private int internAge;
		
		public Builder() {}
		
		public Builder setId(int id) {
			this.id=id;
			return this;
		}
		public Builder setinternFirstName(String internFirstName) {
			this.internFirstName=internFirstName;
			return this;
		}
		public Builder setinternLastName(String  internLastName) {
			this.internLastName=internLastName;
			return this;
		}
		public Builder setinternAge(int internAge) {
			this.internAge=internAge;
			return this;
		}
		public Interns build() {
			return new Interns(this);
		}
		
		public static List<Interns> createInternsList(){
			return Arrays.asList(
					new Interns.Builder()
					.setId(1001)
					.setinternFirstName("sabbir")
					.setinternLastName("poonawala")
					.setinternAge(23)
					.build(),
					new Interns.Builder()
					.setId(1002)
					.setinternFirstName("amit")
					.setinternLastName("patel")
					.setinternAge(23)
					.build()
					
					);
		}

		
		
	}
	@Override
	public String toString() {
		return "Builder [id=" + id + ", internFirstName=" + internFirstName + ", internLastName=" + internLastName
				+ ", internAge=" + internAge + "]";
	}
}

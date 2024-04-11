package com.azoho;

public class Person {

	 private String name;
	    private String gender;
	    private String father;
	    private String mother;

	    public Person(String name, String gender, String father, String mother) {
	        this.name = name;
	        this.gender = gender;
	        this.father = father;
	        this.mother = mother;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getFather() {
			return father;
		}

		public void setFather(String father) {
			this.father = father;
		}

		public String getMother() {
			return mother;
		}

		public void setMother(String mother) {
			this.mother = mother;
		}
	    
	    
}

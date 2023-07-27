package project;
	import java.util.ArrayList;
	import java.util.Scanner;
	class Student {
	    private String name;
	    private int age;
	    private String studentId;

	    public Student(String name, int age, String studentId) {
	        this.name = name;
	        this.age = age;
	        this.studentId = studentId;
	    }

	    // Getters and setters

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
	        this.age = age;
	    }

	    public String getStudentId() {
	        return studentId;
	    }

	    public void setStudentId(String studentId) {
	        this.studentId = studentId;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + name + ", Age: " + age + ", Student ID: " + studentId;
	    }
	}


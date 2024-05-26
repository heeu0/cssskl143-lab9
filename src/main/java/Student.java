import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Comparable<Student>, Cloneable, Serializable{
	private double gpa;
	private String name;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public Student(Student other){
		this.name = other.name;
		this.gpa = other.gpa;
	}

	@Override
	public int compareTo(Student o) {
		return Double.compare(this.gpa, o.gpa);
	}

	@Override
	public Student clone(){
		return new Student(this);
	}

	public double getGPA() {
		return gpa;
	}

	public void setGPA(double gpa) {
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString(){
		return "\nGPA: " + gpa + "\nName: " + name;
	}
}

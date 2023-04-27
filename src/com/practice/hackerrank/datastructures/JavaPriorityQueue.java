package com.practice.hackerrank.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student1 {
	private int id;
	private String name;
	private double cgpa;
	
	public Student1(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCgpa() {
		return cgpa;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
	
}

class Student1Comparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		if(s1.getCgpa() > s2.getCgpa()) return -1;
		else if(s1.getCgpa() < s2.getCgpa()) return 1;
		else {
			if(s1.getName().compareTo(s2.getName()) == 0) {
				return s1.getId() - s2.getId();
			} else {
				return (s1.getName().compareTo(s2.getName()) < 0) ? -1 : 1;
			}
		}
	}
	
}

class Priorities {
	
	public List<Student1> getStudents(List<String> events) {
		Comparator<Student1> student1Comparator = Comparator.comparing(Student1::getCgpa).reversed()
				.thenComparing(Student1::getName)
				.thenComparing(Student1::getId);
		
		PriorityQueue<Student1> studentQueue = new PriorityQueue<>(student1Comparator);
		
		for(String event : events) {
			String[] eventArray = event.split("\\s");
			
			if(eventArray.length == 1) {
				studentQueue.poll();

			} else {
				studentQueue.offer(new Student1(Integer.parseInt(eventArray[3]), eventArray[1], Double.parseDouble(eventArray[2])));
			}

		}
		
		List<Student1> students = new ArrayList<>(studentQueue);
		
		Collections.sort(students, student1Comparator);
		
		return students;
	}
	
}

public class JavaPriorityQueue {

	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student1> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student1 st : students) {
				System.out.println(st.getName());
			}
		}
	}

}

package mypac;

import java.util.Scanner;

public class Candidate3{
	public static void main(String[] args){
		Candidate c1=new Candidate();

		c1.getCandidateDeatil(510,"Sachin",18,50,140);
		c1.printCandidateDetail();

	}
}

class Candidate{
	int id;
	String name;
	int age;
	int weight;
	int height;

	void getCandidateDeatil(int id,String name,int age,int weight,int height){
		this.id=id;
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;
	}

	void printCandidateDetail(){
		System.out.println("Name = "+name);
		System.out.println("id = "+id);
		System.out.println("age = "+age);
		System.out.println("weight = "+weight);
		System.out.println("height = "+height);
	}
}




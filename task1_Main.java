package ktp_task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class task1_Main {

//1 - ������� �� �������� �������	
static int remaider (int a, int b) {
		return a % b;
	}
//2 - ������� ������� ������� ������������ 
static int area (int base, int height) {
	return ((base * height)/2);
}

//3 - ������� ���������� ���
static int animals (int chickens, int cows, int pigs) {
	return (chickens*2 + cows*4 + pigs*4);
}
//4 - ���������� true, ���� prob * prize > pay; � ��������� ������ ���������� false
static boolean profitableGamble (double prob,double prize, double pay) {
	if ((prob*prize) > pay) {
		return true;
	}
	else {
		return false;
	}
}
//5 - �������, ������� ��������� 3 ����� � ���������� 
//������  �������� ��� N 	
static String operation(int a, int b, int N){
	if (a * b == N) {
		return "multiplication";
	}
	if (a/b == N) {
		return "division";
	}
	if (a + b ==N) {
		return "added";
	}
	if(a - b == N) {
		return "subtraction";
	}
	return "none";
}
//6 -  �������, ������� ���������� �������� ASCII ����������� �������. 
static int ctoa (String a) {
	return a.charAt(0);	
}

//7 - �������� �������, ������� ����� ��������� ����� �� ����������������� ������
//����� � ���������� ����� ���� ����� �� ���� � ������� ���. 
static int addUpTo (int a) {
	int sum = 0;
	for (int i = 1; i<=a; i++) {
	sum += i;
	}
	return sum;
}
//8 - �������, ������� ������� ������������ �������� �������� ����� ������������, ��� ����� ������ �������� ������ �������
static int nextEdge(int a, int b) {
	return a+b-1;
}
//9 - �������� �������, ������� ��������� ������ ����� � ���������� ����� ��� �����
static int sumOfCubes (List<Integer> integers) {
	int sumOfCubes = 0;
	for (int i = 0; i< integers.size(); i++ ) {
		sumOfCubes += integers.get(i)*integers.get(i)*integers.get(i);
	}
	return sumOfCubes;
}
//10 - �������, ������� ����� ��� ������� a, b, c(�������� A � ���� B ���;������� �� ��������� �� C)
static boolean abcmath(int a, int b, int c) {
for (int i=0; i<b; i++) {
	a=a+a;
}
if (a%c==0) {
	return true;
}
else {
	return false;
}
}

public static void main(String[] args) {
//1 
		Scanner in = new Scanner(System.in);
		System.out.println("#1 - enter divisor and dividend");
		System.out.println("remainder of division operation: " + remaider(in.nextInt(),in.nextInt()));	
//2
		System.out.println("#2 - enter the base and height of the triangle");
		System.out.println("area of this triangle: " + area(in.nextInt(),in.nextInt()));	
//3
		System.out.println("#3 - enter count of chickens,cows,pigs");
		System.out.println("count of legs: "+animals(in.nextInt(),in.nextInt(), in.nextInt()));
//4
		System.out.println("#4 - enter prob,prize,pay");
		System.out.println(profitableGamble(in.nextDouble(),in.nextDouble(),in.nextDouble()));

//5
	System.out.println("#5 - enter nubbers and result");
	System.out.println("necessary operation: " + operation(in.nextInt(), in.nextInt(), in.nextInt()));
//6
	System.out.println("#6 - enter symbol");
	System.out.println("ASCII of that symbol: " + ctoa(in.next()));
//7
	System.out.println("#7 - enter number");
	System.out.println("addUpTo: " + addUpTo(in.nextInt()));
//8
	System.out.println("#8 - enter lines if triagle");
	System.out.println("max lenght of triagle: " + nextEdge(in.nextInt(), in.nextInt()));
//9 
	ArrayList <Integer> elements = new ArrayList<Integer>(); //���� ������	
	System.out.print("#9 - enter the list");
	if (in.hasNextInt()){
		elements.add(in.nextInt());
	}
	elements.add(in.nextInt());
	//System.out.println(elements);
	System.out.println("SumOfCubes: " + sumOfCubes(elements));	
//10
	System.out.println("#10 - enter numbers");
	System.out.println("Is result divisible by C: "+ abcmath(in.nextInt(), in.nextInt(), in.nextInt()));	
}
}

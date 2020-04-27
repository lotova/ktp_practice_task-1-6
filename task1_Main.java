package ktp_task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class task1_Main {

//1 - остаток от операции деления	
static int remaider (int a, int b) {
		return a % b;
	}
//2 - функция расчета площади треугольника 
static int area (int base, int height) {
	return ((base * height)/2);
}

//3 - подсчет количества ног
static int animals (int chickens, int cows, int pigs) {
	return (chickens*2 + cows*4 + pigs*4);
}
//4 - возвращает true, если prob * prize > pay; в противном случае возвращает false
static boolean profitableGamble (double prob,double prize, double pay) {
	if ((prob*prize) > pay) {
		return true;
	}
	else {
		return false;
	}
}
//5 - функция, которая принимает 3 числа и возвращает 
//нужный  оператор для N 	
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
//6 - 

//7 - Напишите функцию, которая берет последнее число из последовательного списка
//чисел и возвращает сумму всех чисел до него и включая его. 
static int addUpTo (int a) {
	int sum = 0;
	for (int i = 1; i<=a; i++) {
	sum += i;
	}
	return sum;
}
//8 - функция, которая находит максимальное значение третьего ребра треугольника, где длины сторон являются целыми числами
static int nextEdge(int a, int b) {
	return a+b-1;
}
//9 - Создайте функцию, которая принимает массив чисел и возвращает сумму его кубов
static int sumOfCubes (List<Integer> integers) {
	int sumOfCubes = 0;
	for (int i = 0; i< integers.size(); i++ ) {
		sumOfCubes += integers.get(i)*integers.get(i)*integers.get(i);
	}
	return sumOfCubes;
}
//10 - Функция, которая будет для данного a, b, c(Добавьте A к себе B раз;делится ли результат на C)
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
		System.out.println("enter divisor and dividend");
		System.out.println("remainder of division operation: " + remaider(in.nextInt(),in.nextInt()));	
//2
		System.out.println("enter the base and height of the triangle");
		System.out.println("area of this triangle: " + area(in.nextInt(),in.nextInt()));	
//3
		System.out.println("enter count of chickens,cows,pigs");
		System.out.println("count of legs: "+animals(in.nextInt(),in.nextInt(), in.nextInt()));
//4
		System.out.println("enter prob,prize,pay");
		System.out.println(profitableGamble(in.nextDouble(),in.nextDouble(),in.nextDouble()));

//5
	System.out.println("enter nubbers and result");
	System.out.println("necessary operation: " + operation(in.nextInt(), in.nextInt(), in.nextInt()));
//6
	
//7
	System.out.println("enter number");
	System.out.println("addUpTo: " + addUpTo(in.nextInt()));
//8
	System.out.println("enter lines if triagle");
	System.out.println("max lenght of triagle: " + nextEdge(in.nextInt(), in.nextInt()));
//9 
	ArrayList <Integer> elements = new ArrayList<Integer>(); //ввод списка	
	System.out.print("enter the list");
	if (in.hasNextInt()){
		elements.add(in.nextInt());
	}
	elements.add(in.nextInt());
	//System.out.println(elements);
	System.out.println("SumOfCubes: " + sumOfCubes(elements));	
//10
	System.out.println("enter numbers");
	System.out.println("Is result divisible by C: "+ abcmath(in.nextInt(), in.nextInt(), in.nextInt()));	
}
}

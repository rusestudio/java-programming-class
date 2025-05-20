package array;

// use when need many variable
// same data type can use as array variable.
// use array variable
// int[] s; example array variable
//s[0]; 0 is index number, the number of array= same like variable and give value s=0;

//to declare array
// int[] s;
//s = new int[10]; - 10 is the array size, how many
//need package like scanner= s = new int[10];
// length/ fill= array size
//int intArray[]-->intArray = new int[10];-->int[] intArray = new int[10]

//int intArray[] = {4, 3, 2, 1, 0}; declare use initial value
// index always start from 0 no negative;
//element of the array= array value

// length= array size , cannot change value
//ex: int[] intArray;
//intArray = new int[5];
//int size = intArray.length;--> now 5 value cannnot change the length
//
//
//anynomous array= only use 초기 값 to declare. no variable name
//save value but no name.

// for each loop
// for (variable : array) 
//for each element/varible in array loop it.

//copy array
// int [] list = {1,2,3};
// int [] numbers = list; //number value also 1,2,3
//to copy all array use arrayclass library
// copyOf() method
// int [] list_copy = Arrays.copyOf(list-original array name), list.length-ori length);

//main method/ function.
// public static void
// void = return type
// main method = main(string[] args)= 인자 전달
// args= command line argument

//array sort. 정렬
// array.sort()
// int [] a = new int[100];
//a[0] =32;
//arrays.sort(a)

// double array
//int [][] s = new int[3][5];
// row행 and coloum열
//3= row 5=coloum = 3*5 table is made
// int intArray[][] = new int[2][5]; - can change data type too
// direct decalre= int intArray[][]= {{0,1,2},{3,4,5},{6,7,8}}; = 3*3
//double array length
// int i [][] = new int [2][5];
//int size1 = i.length; for 2
//int size2 = i[0].length;  for 5 length
//i[n].length = mean nrow

//arraylist class libray
//ArrayList<E>
//will need wrapper class to save data value
//ArrayList<data type> list = new ArrayList<data type>();
//ex: ArrayList<String> strArr = new ArrayList<String>();
//strArr.add("철수");
//strArr.remove(i);
//strArr.size();
//strArr.get(i); get index-i 요수 겍체

//일반 array
// every row coloum number is same array
//int i[][];
// i = new int [4][4];

//ragged array
//every row column have diffrent array
//int i [][];
//i = new int [4][]; // every row start 1 coloum to 4 coloum at the end
//i[0]= new int [1];
//i[1]= new int [2];
//i[index number]= new int[number coloum]
//i.length = double array length
//i[n].length- nth row of colum number
























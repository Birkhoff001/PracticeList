package PracticeJava;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 1.定义一个数组，包含10个元素，对其进行赋值，使每个元素的值
 * 等于其下标，然后输出，最后将首末倒置输出。
 * 2.有30个0-9之间的数字，分别统计0-9各出现次数。
 * 3.在排序好的数组中添加一个数字，将该数字插入到合适位置。
 */
public class ReverseCount {
	public static void main(String args[]){
//		reverse();
		count();
//		sortnumbers(null);
//		immadiateInsert(sortnumbers());
//		midsort(null);
	}

	public static void reverse() {
		int[] arr = new int[10];
		System.out.print("array[]= ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.print(arr[i]);
		}
		for(int i = 0;i < arr.length/2; i++) {
			int temp;
			temp = arr[i];
			arr[i] = arr[9-i];
			arr[9-i] = temp;
		}
		System.out.print("\n" + "Reverse after, arr[]= ");
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public static void count() {
		Random random = new Random();
		int numlength[] = new int[30];
		int number_range[] = new int[10];
		System.out.print("the random numbers: ");
		for(int i=0; i<numlength.length; i++){
			numlength[i] = Math.abs(random.nextInt()%10);
			System.out.print(numlength[i] + ",");
		}
		ArrayList num_array = new ArrayList();
		for(int i=0; i<numlength.length; i++) {
			num_array.add(numlength[i]);
			System.out.print("num_array : " + num_array[i] + " ");
		}
//		insertscrum(scan);
		num_array.add(0, "10");
		System.out.print("num_array : " + num_array[i] + " ");
		System.out.println();
		for(int j=0; j<number_range.length; j++){  
			for(int k=0; k<numlength.length; k++){
				if(numlength[k] == j){
					number_range[j]++; 
//					System.out.println("\n" + " number_range[] : " + number_range[j]);
				}
/*				System.out.println("j=" + j + ", number_range[j]=" + 
				number_range[j] + "," + "k=" + k + ", numlength[k]=" + numlength[k]
						);
*/			}
			System.out.println("the number " + j + " appear count: " + 
					number_range[j] + ",");
		}	
	}
	public static void randomlist(int[] number) {
		System.out.println("i'm insertscrum()");
		Random random = new Random();
		int[] numbers = new int[20];
		System.out.print("the random numbers: ");
	}
	public static void insertscrum(int scan){
		System.out.print("Please input the number: ");
		Scanner insertNum = new Scanner(System.in);
		int n = insertNum.nextInt();
	}
	public static void sortnumbers(int[] number) {
		System.out.println("i'm sortnumbers()");
//		randomlist(number);
		Random random = new Random();
		int[] numbers = new int[20];
		System.out.print("the random numbers: ");
		for(int i=0; i<numbers.length; i++){
			numbers[i] = Math.abs(random.nextInt(100));
			System.out.print(numbers[i] + ",");
		}
		System.out.print("\n");
//		Arrays.sort(numbers);
		
//		quicksort(numbers);
		System.out.print("the sort random numbers: ");
		for(int i=0; i<numbers.length; i++){
			System.out.print(numbers[i] + ",");
		}
		System.out.println();
	}
	public static void immadiateInsert(int[] data, int scan) {	
		System.out.println("i'm immadiateInsert()");
		insertscrum(scan);
		System.out.println("aaaaaaaaaaa " + scan);
		for(int i=1; i<data.length; i++) {
			scan = data[i];
			int j;
			for(j=i-1; j>=0; j--){
				if(data[j]>scan) {
					data[j+1] = data[j];
					System.out.print("bbbb " + data[j]);
				}
				else {
					break;
				}
			}
			data[j+1] = scan;
		}
		System.out.println("after sort of numbers: ");
		for(int i=0; i< data.length; i++) {
			System.out.print(data[i] + ",");
		}
	}
	public static void midsort(int[] data) {
		System.out.println("i'm midsort()");
		System.out.print("Please input the number: ");
		Scanner insertNum = new Scanner(System.in);
		int n = insertNum.nextInt();
		for(int i=0; i<data.length; i++) {
			int left = 0;
			int right = i-1;
			int mid = 0;
			while(left<=right){
				mid = (right + left) / 2;
				if(n<data[mid]){
					right = mid-1;
				}
				else{
					left = mid+1;
				}
			}
			for(int j=i-1; j>=left; j--){
				data[j+1] = data[j];
			}
			if(left != i){
				data[left]= n; 
			} 
		}
		System.out.println("after sort of numbers: ");
		for(int i=0; i< data.length; i++) {
			System.out.print(data[i] + ",");
		}
	}
	public static void quicksort(int[] data2, int in){
//		ArrayList<List> numberlist = new ArrayList<List>();
		int[] data3 = new int[data2.length+1];
		System.out.println(data3.length);
		insertscrum(in);
		data3[0] = in;
		if(data3.length != 0) {
			quickSort(data3, 0, data3.length - 1);
		}
	}
	public static void quickSort(int[] list, int low, int high) {
		if(low < high) {
			int mid = getMiddle(list, low, high);  //split the array list half to half
			quickSort(list, low, high-1);  //sort the low list
			quickSort(list, mid + 1, high); //sort the high list
		} 
	}

	private static int getMiddle(int[] list, int low, int high) {
		int tmp = list[low];     //with first number of list to middle
		while(low < high) {
			while(low < high && list[high] >=tmp) {
				high--;
			}
			list[low] = list[high];  //lower for middle will moving lowest
			while(low < high && list[high] <=tmp) {
				low++;
			}
			list[high] = list[low];  //higher for middle will moving highest
		}
		list[low] = tmp;
		return low;
	}
}









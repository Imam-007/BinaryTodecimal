package imam.practice;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Binary Number");
		int num=sc.nextInt();
		System.out.println(convert(num));
	}
	public static int convert(int num) {
		int dec=0,pow=0;
		while(num>0) {
			int rem=num%10;
			dec=(int) (dec+(rem*Math.pow(2,pow)));
			num/=10;
			pow++;
		}
		return dec;
	}
	public static void selectionSort(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			int minPos=i;
			int j=0;
			for(j=i+1;j<arr.length;j++) {
				if(arr[minPos]>arr[j]) {
					minPos=j;
				}
			}
			if(i!=minPos) {
				count++;
				int temp=arr[minPos];
				arr[minPos]=arr[i];
				arr[i]=temp;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n"+count);
	}
	public static void countingSort(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>max) {
				max=num;
			}
		}
		int count[]=new int[max+1];
		for(int num:arr) {
			count[num]++;
		}
		int j=0;
		for(int i=0;i<count.length;i++) {
			while(count[i]>0) {
				arr[j++]=i;
				count[i]--;
			}
		}
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getData();
		int arr[]= {5,3,1,7,9,477};
	    //countingSort(arr);

	}

}

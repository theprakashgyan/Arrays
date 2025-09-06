package Arrays;

import java.util.Scanner;

public class ContinerProblem {
	public static int maxArea(int[] height) {
        int maxWater =0;
        int n = height.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int w =j-i;
                int hi=Math.min(height[i], height[j]);
                int area = w*hi;
                maxWater =Math.max(maxWater, area);
            }
        }
        return maxWater;
    }
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int  i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       int result = maxArea(arr);
       System.out.println(result);
    }
}

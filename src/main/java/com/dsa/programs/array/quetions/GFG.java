package com.dsa.programs.array.quetions;// Java program for the above approach
import java.util.ArrayList;

class GFG {

// Function to split the array
static ArrayList<ArrayList<Integer>> divideArray(int nums[], int K, int N) {
	ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> temp = new ArrayList<Integer>();
	for (int i = 0; i < N; i++) {
	temp.add(nums[i]);
	if (((i + 1) % K) == 0) {
		ans.add(temp);
		temp = new ArrayList<Integer>();
	}
	}
	// If last group doesn't have enough
	// elements then add 0 to it
	if (temp.size() != 0) {
	int a = temp.size();
	while (a != K) {
		temp.add(0);
		a++;
	}
	ans.add(temp);
	}
	return ans;
}

// Function to print answer
static void printArray(ArrayList<ArrayList<Integer>> a) {
	int n = a.size();
	for (int i = 0; i < n; i++) {
	System.out.print("[ ");
	for (int j = 0; j < a.get(i).size(); j++)
		System.out.print(a.get(i).get(j) + " ");
	System.out.print("]");
	}
}

// Driver Code
public static void main(String args[]) {
	int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
	int N = nums.length;
	int K = 3;
	ArrayList<ArrayList<Integer>> ans = divideArray(nums, K, N);
	printArray(ans);
}
}

// This code is contributed by saurabh_jaiswal.

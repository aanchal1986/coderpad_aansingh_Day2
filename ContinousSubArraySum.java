package org.capg.programs;

public class ContinousSubArraySum

{
	private static void printSubArraySum(int[] array, int requiredSum) {
        for (int i = 0; i < array.length; i++) {
            String str = "[ ";
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum = sum + array[j];
                str = str + array[j] + ", ";
                if (sum == requiredSum) {
                    System.out.println(" sum : " + sum + " array : " + str
                            + "]");
                    str = "[ ";
                    sum = 0;
                }
            }
        }
    }

	public static void main(String[] args) {
		int[] a = { 12,7,29,6, 2, 11,4,8 };
		int k = 8;
		printSubArraySum(a, k);
	}
}

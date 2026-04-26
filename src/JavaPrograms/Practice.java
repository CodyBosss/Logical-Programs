package JavaPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Practice {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(findOcc(str));
	}

	public static String findOcc(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;

		int i = n - 2;
		while (i >= 0 && arr[i] >= arr[i + 1]) {
			i--;
		}

		if (i >= 0) {
			int j = n - 1;
			while (arr[j] <= arr[i]) {
				j--;
			}
			swap(arr, i, j);
		}
		reverse(arr, i + 1, n - 1);

		return new String(arr);
	}

	public static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void reverse(char[] arr, int start, int end) {
		while (start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
	}
}

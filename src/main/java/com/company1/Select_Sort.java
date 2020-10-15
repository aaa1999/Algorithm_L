package com.company1;

public class Select_Sort {
    public static void select_sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int flag = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    flag = j;
                }

            }
            if (flag != i) {
                int temp = nums[flag];
                nums[flag] = nums[i];
                nums[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0;i < 5;i++){
            a[i] = (int)(Math.random() * 100);
        }
        for (int a1 :
                a) {
            System.out.println(a1);
        }
        System.out.println();
        Select_Sort.select_sort(a);
        for (int a1 :
                a) {
            System.out.println(a1);
        }

        /*
        int[] nums = {5,4,3,2,1};
        for (int num :
                nums) {
            System.out.println(num);
        }

        Select_Sort.select_sort(nums);

        System.out.println();
        for (int num :
                nums) {
            System.out.println(num);
        }

    }

         */

    }
}

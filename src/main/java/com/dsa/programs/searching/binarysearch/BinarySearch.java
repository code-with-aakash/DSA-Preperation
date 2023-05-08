package com.dsa.programs.searching.binarysearch;


    public  class BinarySearch {

        public static void main(String[] args) {

            int arr[] = { 6,5,4,3,2,1 };
            int target = 2, s = 0, e = arr.length - 1;

            int index = binsearch(arr, target, s, e);

            System.out.println(index);
        }

        // if array is ascending sort
//        private static int binsearch(int[] arr, int target, int s, int e) {
//            while(s<=e) {
//                int m = s + (e-s) / 2;
//                if (arr[m] == target) {
//                    return m;
//                }
//                if (target < arr[m]) {
//                    e = m - 1;
//                } else {
//                    s = m + 1;
//                }
//            }
//            return -1;
//        }


        // if array is descending sort
        private static int binsearch(int[] arr, int target, int s, int e) {
            while(s<=e) {
                int m = s + (e-s) / 2;
                if (arr[m] == target) {
                    return m;
                }
                if (target > arr[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
            return -1;
        }

    }


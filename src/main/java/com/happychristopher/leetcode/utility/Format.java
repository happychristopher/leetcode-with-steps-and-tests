package com.happychristopher.leetcode.utility;

public class Format<E> {
    public StringBuilder toArrayMark(E[] arr, String str, int index) {
        StringBuilder mark = new StringBuilder();

        // 替换"["
        mark.append(new char[1]);

        for (int i = 0; i < arr.length; i++) {
            int finalI = i;
            if (index == finalI) {
                mark.append(str).append(new char[String.valueOf(arr[i]).length() - 1]);
                break;
            } else {
                // 替换元素和", "
                mark.append(new char[String.valueOf(arr[i]).length()]).append(new char[2]);
            }
        }

        return mark;
    }

    public StringBuilder toArrayMarks(E[] arr, String str, int floor, int ceiling) {
        StringBuilder mark = new StringBuilder();

        // 替换"["
        mark.append(new char[1]);

        for (int i = 0; i < arr.length; i++) {
            if (floor <= i && i <= ceiling) {
                mark.append(str).append(new char[String.valueOf(arr[i]).length() - 1]);
            } else {
                mark.append(new char[String.valueOf(arr[i]).length()]);
            }

            // 替换", "
            mark.append(new char[2]);
        }

        return mark;
    }
}

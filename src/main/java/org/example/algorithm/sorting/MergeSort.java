package org.example.algorithm.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public int[] sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (right - left) / 2 + left;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, mid + 1, right);
    }

    private void merge(int[] nums, int ll, int lr, int rl, int rr) {
        int start = ll;
        int[] newArr = new int[lr + rr - ll - rl + 2];
        for (int i = 0; i < newArr.length; i++) {
            if (ll > lr) {
                newArr[i] = nums[rl++];
                continue;
            }

            if (rl > rr) {
                newArr[i] = nums[ll++];
                continue;
            }

            if (nums[ll] <= nums[rl]) {
                newArr[i] = nums[ll++];
            } else {
                newArr[i] = nums[rl++];
            }
        }

        System.arraycopy(newArr, 0, nums, start, newArr.length);
    }

    private List<Integer> mergeSort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        var len = list.size();

        var left = mergeSort(list.subList(0, len / 2));
        var right = mergeSort(list.subList(len / 2, len));

        return merge(left, right);
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        var ret = new ArrayList<Integer>();
        int l = 0, r = 0;
        while (l < left.size() && r < right.size()) {
            if (left.get(l) <= right.get(r)) {
                ret.add(left.get(l));
                l++;

            } else {
                ret.add(right.get(r));
                r++;
            }
        }

        while (l < left.size()) {
            ret.add(left.get(l++));
        }

        while (r < right.size()) {
            ret.add(right.get(r++));
        }

        return ret;
    }
}

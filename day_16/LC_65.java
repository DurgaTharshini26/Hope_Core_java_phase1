package day_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_65 {
     public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            while (i + 1 < intervals.length && intervals[i + 1][0] <= end) {
                end = Math.max(end, intervals[i + 1][1]);
                i++;
            }

            ans.add(new int[]{start, end});
        }

        return ans.toArray(new int[ans.size()][]);
    }
}


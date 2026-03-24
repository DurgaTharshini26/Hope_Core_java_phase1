package day_5;
public class LC_1041 {
   class Solution {
    public boolean isRobotBounded(String instructions) {
        //Directions: N, E, S, W (clockwise order for easy turn math)
        int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int x = 0, y= 0, dir = 0; // start facing north

        for (char c : instructions.toCharArray()) {
            if  (c == 'G') { x += dirs[dir][0]; y += dirs[dir][1]; }
            else if (c == 'L') dir = (dir + 3) % 4; //Left = -90° = +270°
            else               dir = (dir + 1) % 4; //right = 90°
        }

        // Bounded if : back at origin OR not facing north
        // If not facing north, repeating the circle rotates the path → closes into a circle
        return (x == 0 && y == 0) || dir != 0;   
    }
} 
}

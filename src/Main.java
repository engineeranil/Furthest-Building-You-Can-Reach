public class Main {
    public static void main(String[] args) {
        int[] heights = {14,3,19,3};
        int bricks = 17;
        int ladders = 0;
        int position = 0;
       for (int i = 0; i < heights.length - 1; i++) {
            int variance = heights[i + 1] - heights[i];
            if (variance > 0) {
                if (bricks >= variance) {
                    bricks -= variance;
                } else if (ladders > 0) {
                    ladders--;
                } else {
                    break;
                }
            }
            position = i + 1;
        }
        System.out.println(position);
           }
}

package Array;

public class TrapRainWater {
    public static int trappedRainWater(int[] height) {
        // calculate left max boundary
        int n = height.length;
        int[] leftMax = new int[n];
        leftMax[0] = height[0];  // already calculate for 0;
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);    //i-1 we start the start of the boundary
        }
        // calculate right max boundary
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];   // already print for last boundary element
        for (int i = n - 2; i >= 0 ; i--) { // Loop start from last of boundary
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);  // i+1 we start the last of the boundary
        }
        //loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            //water level = min(left max boundary,right max boundary)
            int waterless = Math.min(leftMax[i], rightMax[i]);
            //find Trapped water
            trappedWater = (trappedWater + waterless)-height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(height));
    }
}

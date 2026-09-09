class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1;
        int mw = 0;
        int test = 0;
        while(i<j){
            if(height[i]>height[j]){
                mw = height[j]*(j-i);
                j--;
            }
            else if(height[i]<height[j]){
                mw = height[i]*(j-i); 
                i++;
            }
            else{
                mw=height[i]*(j-i);
                i++;
            }
            if(test<mw){
                test = mw;
            }
        }
        return test;    
    }
}


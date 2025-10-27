class TrappedWater {
    
    public static int trappedwater(int heights[]){
        int n= heights.length;


        //LEFTMAX[]
        int leftmax[]= new int [n];

        leftmax[0] = heights[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(heights[i], leftmax[i-1]);
        }

        //RIGHTMAX[]
        int rightmax[] = new int[n];
        rightmax[n-1] = heights[n-1];

        for(int i= n-2; i>=0; i--){
            rightmax[i]= Math.max(heights[i], rightmax[i+1]);
        }

        //TRAPPED WATER
        int trappedwater = 0;
        for(int i=0; i<n; i++){
            trappedwater += Math.min(leftmax[i], rightmax[i]) - heights[i];
        }
        return trappedwater;
    }

    public static void main(String[] args) {
        int heights[] = {4,2,0,6,3,2,5,8};
        System.out.println("Total trapped water: " + trappedwater(heights));
        
    }
}
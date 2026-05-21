class MoveZeroes {
    public void moveZeroe(int[] nums) {
        int position=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] !=0){
                nums[position] = nums[i];
                position ++;
            }
        }
        while(position < nums.length){
            nums[position++] =0;
        }
        
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        MoveZeroes mz = new MoveZeroes();
        mz.moveZeroe(nums);
    }
}


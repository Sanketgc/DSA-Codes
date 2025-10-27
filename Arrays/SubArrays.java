public class SubArrays {
    public static void  sumSubArray(int numbers[]){
        int currsum=0;
        int Maxvalue = Integer.MIN_VALUE;
        int Minvalue= Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){

            for(int j=i; j<numbers.length; j++){
                currsum=0;
                for(int k=i; k<=j; k++){
                    System.out.print(" "+numbers[k]);
                    currsum += numbers[k];

                }
                System.out.println("   Sum ==>  " + currsum);
                if(Maxvalue < currsum){
                    Maxvalue=currsum;
                } if(Minvalue > currsum){ 
                    Minvalue=currsum;
                }
            }           
    }

    System.out.println("Maxsum: " + Maxvalue);
   System.out.println("MinSum: " + Minvalue);
}

    public static void main(String[] args) {
        int numbers[] ={2, -1, 4, 8, -2, 5, -3};

        sumSubArray(numbers);
    }
    
}

class ArmstrongNumbers {

    
    boolean isArmstrongNumber(int numberToCheck) {
       int digits = String.valueOf(numberToCheck).length();
        int sum =0;
        int temp = numberToCheck;

        while(temp>0){
            int d = temp%10;
            int p =1 ;
            for(int i=0; i<digits; i++){
                p*=d;
            }
            sum+=p;
            temp/=10;
        }
        return sum== numberToCheck;

    }

}

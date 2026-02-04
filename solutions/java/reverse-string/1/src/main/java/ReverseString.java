class ReverseString {

    String reverse(String inputString) {
        String finalS = "";
        for(int i=inputString.length()-1; i>=0; i-- ){
            finalS = finalS + inputString.charAt(i);
        }
        return finalS;
    }
  
}

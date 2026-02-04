class RnaTranscription {

    String transcribe(String dnaStrand) {
       StringBuilder rnaStrand = new StringBuilder();
         for(int i=0; i< dnaStrand.length(); i++){
             char c = dnaStrand.charAt(i);
             switch (c) {
                case 'G':
                rnaStrand.append('C');
                break;

                case 'C':
                     rnaStrand.append('G');
                     break;

                 case 'T':
                     rnaStrand.append('A');
                     break;

                 case 'A':
                     rnaStrand.append('U');
                     break;

                default:
                    throw new IllegalArgumentException("Invalid DNA base: " + c);
             }
         }
        return rnaStrand.toString();
    
    }

}

class RnaTranscription {

    String transcribe(String dnaStrand) {
        if (dnaStrand == null || dnaStrand.length() <= 0) {
            return "";
        }
        String abc = "";
        char a;
        for (int i = 0; i < dnaStrand.length(); i++) {
            if (dnaStrand.charAt(i) == 'G') {
                a = 'C';
            } else if (dnaStrand.charAt(i) == 'C') {
                a = 'G';
            } else if (dnaStrand.charAt(i) == 'T') {
                a = 'A';
            } else a = 'U';
            abc += a;
        }
        return abc;
    }


}

class Proverb {
    String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {

        if (words.length == 0) {
            return "";
        }
        if (words.length == 1) {
            return "And all for the want of a " + words[0] + ".";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                sb.append("And all for the want of a " + words[0]);
                sb.append(".");
                break;
            }
            sb.append("For want of a " + words[i] + " the " + words[i + 1] + " was lost.\n");
        }
        return sb.toString();
    }

}

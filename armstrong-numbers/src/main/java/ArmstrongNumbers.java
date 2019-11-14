

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int sum = 0;
        int copyofnum = numberToCheck;
        int lenOfNum = 0;

        while (numberToCheck > 0) {
            lenOfNum++;
            numberToCheck /= 10;
        }

        numberToCheck = copyofnum;

        while (numberToCheck > 0) {
            sum += Math.pow(numberToCheck % 10, lenOfNum);
            numberToCheck /= 10;
        }

        return sum == copyofnum;
    }



}

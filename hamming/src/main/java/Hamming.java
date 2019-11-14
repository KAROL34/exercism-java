import java.util.stream.IntStream;

class Hamming {

    public Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        this.hammingDistance = getHammingDistance();

    }

    String leftStrand;
    String rightStrand;
    int hammingDistance;

    int getHammingDistance() {
        Hamming hamming;
        if (leftStrand.length() == 0 && rightStrand.length() == 0) {
            return 0;
        }
        if (leftStrand == null || leftStrand.isEmpty() || leftStrand == "") {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if (rightStrand == null || rightStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        return (int) IntStream.range(0, leftStrand.length())
                .filter(i -> leftStrand.charAt(i) != rightStrand.charAt(i))
                .count();

    }

}

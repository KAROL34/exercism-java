import java.util.Arrays;

class Triangle {
    double side1;
    double side2;
    double side3;




    public Triangle(double side1, double side2, double side3) throws TriangleException {
        double[] sides = {side1, side2, side3};
        Arrays.sort(sides);
        this.side1 = sides[0];
        this.side2 = sides[1];
        this.side3 = sides[2];
        if( this.side1 < 0 || this.side1 + this.side2 <= this.side3) {
            throw new TriangleException();
        }
    }



    boolean isEquilateral() {

            return side1 == side2 && side2 == side3;
    }

    boolean isIsosceles() {
       return     side1 == side2 || side2 == side3;
    }

    boolean isScalene() {
        return isEquilateral()==false&&isIsosceles()==false;
    }

}

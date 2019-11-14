class Darts {
    double x;
    double y;



    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {

        if (getCirleField() <= 1 * 1) {
            return 10;
        } else if (getCirleField() <= 5 * 5) {
            return 5;
        } else if (getCirleField() <= 10 * 10) {
            return 1;
        } else return 0;
    }

    private double getCirleField() {
        return (x) * (x) +
                (y) * (y);
    }


}

package com.udemysection3.numbershapes;

public class CheckSquareOrTriangularNumber {
    double number;

    public CheckSquareOrTriangularNumber(double number) {
        this.number = number;
    }

    public boolean isSquareNumber() {
        if (number == Math.floor(Math.sqrt(number))) {
            return true;
        }
        return false;
    }

    public boolean isTriangularNumber() {
        int x = 1;
        int triNumber = 1;
        while (triNumber < (int) number) {
            triNumber += x;
            x++;
        }
        if ((int) number == triNumber) {
            return true;
        }
        return false;
    }
}

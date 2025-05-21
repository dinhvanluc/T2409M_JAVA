package demo3;

public class Fraction extends MyNumber {
    int numerator; // tử số
    int denominator; // mẫu số

    @Override
    public MyNumber add(MyNumber other) {
        Fraction total =  new Fraction();
        Fraction o = (Fraction) other;
        total.denominator = this.denominator * o.denominator;
        total.numerator = this.numerator * o.denominator +  this.denominator * o.numerator;
        return total;
    }

    @Override
    public MyNumber subtract(MyNumber other) {
        Fraction total =  new Fraction();
        Fraction o = (Fraction) other;
        total.denominator = this.denominator * o.denominator;
        total.numerator = this.numerator * o.denominator -  this.denominator * o.numerator;
        return total;
    }

    @Override
    public MyNumber multiply(MyNumber other) {
       Fraction total =  new Fraction();
       Fraction o = (Fraction) other;
       total.denominator = this.denominator * o.denominator;
       total.numerator = this.numerator * o.denominator +  this.denominator * o.numerator;
       return total;
    }

    @Override
    public MyNumber divide(MyNumber other) {
        Fraction total =  new Fraction();
        Fraction o = (Fraction) other;
        total.denominator = this.denominator * o.denominator;
        total.numerator = this.numerator * o.denominator /  this.denominator * o.numerator;
        return total;
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}

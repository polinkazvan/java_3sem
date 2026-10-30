package org.example;

public class Circle {
    private final RationalFraction x;
    private final RationalFraction y;
    private final double r;

    public Circle(RationalFraction x, RationalFraction y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public double area(){
        return Math.PI  *r*r;
    }
    public double perimeter(){
        return 2*Math.PI*r;
    }

    public boolean isOnOneLine(Circle b, Circle c){
        RationalFraction left = b.x.minus(x).times(c.y.minus(y));
        RationalFraction right = b.y.minus(y).times(c.x.minus(x));
        return left.minus(right).isZero();
    }
    @Override
    public String toString(){
        return "Circle(center=("+x+"; "+y+"), r="+r+")";
    }

}

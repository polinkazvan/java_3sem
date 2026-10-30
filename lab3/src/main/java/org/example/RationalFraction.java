//6. Определить класс Точка в пространстве,
// координаты которой задаются с помощью
// Рациональной Дроби. Создать методы
// по определению расстояния между точками
// и расстояния до начала координат.
// Проверить для трех точек возможность
// нахождения на одной прямой.

package org.example;

public  class RationalFraction{
    private final long num; //numerator
    private final long den; //denominator

    public RationalFraction(long num, long den){
        if(den == 0){
            throw new IllegalArgumentException("Denominator is zero");
        }
        if (den<0){
            num = -num;
            den = -den;
        }
        long g = gcd(Math.abs(num), den);
        this.num = num / g;
        this.den = den / g;
    }
    private  static long gcd(long a, long b){
        while (b!=0){
            long t = a%b;
            a=b;
            b=t;
        }
        return a;
    }

    public RationalFraction minus(RationalFraction o){
        return new RationalFraction
                (num*o.den - o.num*den, den*o.den);
    }
    public RationalFraction times(RationalFraction o){
        return new RationalFraction
                (num*o.num, den*o.den);
    }
    public boolean isZero(){
        return num==0;
    }
    @Override
    public  String toString(){
        return den==1 ? String.valueOf(num) : num+"/"+den;
    }

}
package com.example.firstnativeapp;

public class JavaLibrary {
    public long checkPrime(long number) {
        int i;
        int check = 0;
        long tStart = System.currentTimeMillis();

        for(i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                check = 1;
            } else {
                check = 0;
            }
        }

        long tEnd = System.currentTimeMillis();

        return (tEnd-tStart);
    }

    public long squareArea(long number) {
        long acreage = 0;
        long tStart = System.currentTimeMillis();
        acreage =  number * number;
        long tEnd = System.currentTimeMillis();
        return (tEnd-tStart);
    }

    public long calSinAndCos(double radian) {
        double sinValue = 0, cosValue = 0;
        double ra = Math.toRadians(radian);

        long tStart = System.currentTimeMillis();

        sinValue = Math.sin(ra);
        cosValue = Math.cos(ra);

        long tEnd = System.currentTimeMillis();
        return (tEnd-tStart);
    }
    /*
       V = 4/3 x pi x r^3;
     */
    public long calVolumeSphere(double r) {
        double pi = 3.14285714286;
        double volume = 0;

        long tStart = System.currentTimeMillis();
        volume = (4.0/3.0) * pi * r * r * r;
        long tEnd = System.currentTimeMillis();

        return (tEnd-tStart);
    }
}

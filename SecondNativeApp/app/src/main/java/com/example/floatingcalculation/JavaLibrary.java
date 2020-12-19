package com.example.floatingcalculation;

public class JavaLibrary {
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

package com.company;
public class objectPosition {
    double a;
    double t;
    double vi;
    double xi;
    void finalPosition( double a , double t , double vi , double xi){
        System.out.println(" the final position,Xt is "+ 0.5*a*t*t + vi*t + xi + "m");
    }
}
class position{
    public static void main(String[] args){
        objectPosition object1 = new objectPosition();
        object1.finalPosition(-9.81,10,0,  0);
    }

}
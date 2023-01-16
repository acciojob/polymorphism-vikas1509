package com.driver;

import java.util.PrimitiveIterator;

public class Main {
    public  static class Product{
        public static int product(int x, int y ){
            return x*y;
        }
        public static  int product(int x, int y , int z){
            return x*y*z;
        }
        public static double product (double x, double y){
            return  x*y;
        }
    }
    public static void main(String[] args) {
        Product p = new Product();
        p.product(6,7);
        p.product(7,8,9);
        p.product(5.0,4.0);
    }
}
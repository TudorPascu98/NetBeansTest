/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pascu
 */
public class Main {
    public static void main(String[] args) {
        String[] t = {"alpha", "beta", "gamma", "delta"};
        System.out.println(demo(t) + " strings.");
    }

    public static int demo(String[] str) {
        for (String s : str) {
            System.out.println(s);
        }
        return str.length;
    }
}


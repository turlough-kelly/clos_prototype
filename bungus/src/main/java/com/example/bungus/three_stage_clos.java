package com.example.bungus;

public class three_stage_clos
{
    //custom function to round numbers if decimal part >= 0.45
    public static double rounder(double x)
    {
        if(x - (int) x >= 0.45)
        {
            return Math.ceil(x);
        }

        return Math.round(x);
    }
    //calculates best value for n
    public double optimum_n(int big_n)
    {

        return rounder(Math.sqrt(big_n / 2));
    }

    //calculates best value for m
    public double optimum_m(int big_n)
    {
        if(Math.sqrt(big_n * 2) % 1 != 0)
        {
            return rounder(big_n / optimum_n(big_n));
        }

        return Math.sqrt(big_n * 2);
    }

    //calculates max number of crosspoints allowed
    public double max_crosspoints(int big_n)
    {
        return Math.pow(big_n, 2);
    }

    //calculates best number of crosspoints to have
    public double optimum_crosspoints(int big_n)
    {
        return ((2*optimum_m(big_n)*optimum_n(big_n))*((2*optimum_n(big_n)) - 1)
                + ((2*optimum_n(big_n))-1)*(optimum_m(big_n) * optimum_m(big_n)));
    }

    //calculates crosspoint count per switch for stages 1/3
    public double in_out_cross_count(int big_n)
    {
        return (optimum_n(big_n) * ((2 * optimum_n(big_n)) - 1));
    }

    //calculates number of crosspoints in a stage 2 switch
    public double middle_cross_count(int big_n)
    {
        return (Math.pow(optimum_m(big_n), 2));
    }

    //counts number of switches for stages 1/3 (separately)
    public double in_out_switch_count(int big_n)
    {
        return optimum_m(big_n);
    }

    //counts middle switches
    public double middle_switch_count(int big_n)
    {
        return ((2 * optimum_n(big_n)) - 1);
    }

    //prints an overview for a given variable N (big_n)
    public void overview(int big_n)
    {
        System.out.println("Overview of Network, with N = " + big_n);
        System.out.println("Optimum n: " + optimum_n(big_n) +
                "\nOptimum m: " + optimum_m(big_n) +
                "\nMaximum crosspoints: " + max_crosspoints(big_n) +
                "\nOptimum crosspoints: " + optimum_crosspoints(big_n) +
                "\nStage 1/3 crosspoints: " + in_out_cross_count(big_n) +
                "\nStage 1/3 switches: " + in_out_switch_count(big_n) +
                "\nStage 2 crosspoints: " + middle_cross_count(big_n) +
                "\nStage 2 switches: " + middle_switch_count(big_n) +
                "\nInputs/Outputs: " + big_n +
                "\n\nThe above is based on the given input."
        );
    }
}

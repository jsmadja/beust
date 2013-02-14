package com.jsmadja;

import com.google.common.collect.Range;

public class Contest {

    public static void main(String[] args) {
        long t0 = System.currentTimeMillis();
        NombresSansRepetition nombresSansRepetition = new NombresSansRepetition(Range.closed(1, 10000));
        System.err.println("biggest jump: " + nombresSansRepetition.calculerLePlusGrandSaut());
        System.err.println("total count of numbers (with no-rep): " + nombresSansRepetition.calculerLeTotalDeNombresSansRepetition());
        System.err.println("execution time: "+(System.currentTimeMillis()-t0)+" ms");
    }

}

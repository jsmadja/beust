package com.jsmadja;

import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.jsmadja.math.Ensemble;
import com.jsmadja.math.Nombre;

import static java.lang.String.format;

public class Saut {

    private Ensemble ensemble = new Ensemble();

    public void ajouter(Nombre nombre) {
        this.ensemble.ajouter(nombre);
    }

    public int getTaille() {
        return ensemble.getTaille() - 1;
    }

    @Override
    public String toString() {
        return format("%d: %s -> %s", getTaille(), ensemble.premierElement(), ensemble.dernierElement());
    }

    public static Saut max(Saut saut1, Saut saut2) {
        return new Ordering<Saut>() {
            @Override
            public int compare(Saut left, Saut right) {
                return Ints.compare(left.getTaille(), right.getTaille());
            }
        }.max(saut1, saut2);
    }

}

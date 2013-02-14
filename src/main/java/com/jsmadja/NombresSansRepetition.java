package com.jsmadja;

import com.google.common.base.Predicate;
import com.google.common.collect.Range;
import com.jsmadja.math.Ensemble;
import com.jsmadja.math.Nombre;

import static com.jsmadja.Saut.max;

public class NombresSansRepetition {

    private final int debut;
    private final int fin;
    private final Ensemble nombresSansRepetition;

    public NombresSansRepetition(Range<Integer> range) {
        this.debut = range.lowerEndpoint();
        this.fin = range.upperEndpoint();
        nombresSansRepetition = new Ensemble(range).extraire(new Predicate<Nombre>() {
            @Override
            public boolean apply(Nombre nombre) {
                return nombre.estSansRepetition();
            }
        });
    }

    public Saut calculerLePlusGrandSaut() {
        Saut saut = new Saut();
        Saut sautMaximum = saut;
        saut.ajouter(new Nombre(debut));
        for (int i = debut + 1; i <= fin; i++) {
            Nombre nombre = new Nombre(i);
            Nombre nombrePrecedent = new Nombre(i - 1);
            if (nestPasDansUnSaut(nombre, nombrePrecedent)) {
                saut.ajouter(nombre);
                sautMaximum = max(saut, sautMaximum);
                saut = new Saut();
            }
            saut.ajouter(nombre);
        }
        return sautMaximum;
    }

    private boolean nestPasDansUnSaut(Nombre nombre, Nombre nombrePrecedent) {
        return nombre.estSansRepetition() && nombrePrecedent.aUneRepetition();
    }

    @Override
    public String toString() {
        return nombresSansRepetition.toString();
    }

    public int calculerLeTotalDeNombresSansRepetition() {
        return nombresSansRepetition.getTaille();
    }
}

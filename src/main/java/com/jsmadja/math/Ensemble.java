package com.jsmadja.math;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Collections2.transform;

public class Ensemble {

    private List<Nombre> nombres = new ArrayList<Nombre>();

    public Ensemble() {
    }

    public Ensemble(Range<Integer> range) {
        nombres = new ArrayList<Nombre>(transform(asCollection(range), new Function<Integer, Nombre>() {
            @Override
            public Nombre apply(Integer integer) {
                return new Nombre(integer);
            }
        }));
    }

    public Ensemble(Collection<Nombre> nombres) {
        this.nombres.addAll(nombres);
    }

    private ContiguousSet<Integer> asCollection(Range<Integer> range) {
        return ContiguousSet.create(range, DiscreteDomain.integers());
    }

    public void ajouter(Nombre nombre) {
        this.nombres.add(nombre);
    }

    public int getTaille() {
        return nombres.size();
    }

    public Nombre premierElement() {
        return nombres.get(0);
    }

    public Nombre dernierElement() {
        return nombres.get(nombres.size() - 1);
    }

    public Ensemble extraire(Predicate<Nombre> predicate) {
        return new Ensemble(filter(nombres, predicate));
    }

    @Override
    public String toString() {
        return Joiner.on(", ").join(nombres);
    }

}

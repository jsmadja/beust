package com.jsmadja.math;

import com.google.common.collect.Range;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class EnsembleTest {

    @Test
    public void doit_creer_un_ensemble_de_nombres_a_partir_d_un_range() {
        Ensemble ensemble = new Ensemble(Range.closed(0, 3));
        assertThat(ensemble.toString()).isEqualTo("0, 1, 2, 3");
    }

}

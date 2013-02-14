package com.jsmadja.math;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class NombreTest {

    @Test
    public void doit_renvoyer_true_si_le_nombre_a_une_repetition() {
        for (int valeur : new int[]{11, 99, 100, 101, 5433, 5434, 5435}) {
            assertThat(new Nombre(valeur).aUneRepetition()).isTrue();
        }
    }

    @Test
    public void doit_renvoyer_false_si_le_nombre_n_a_pas_de_repetition() {
        for (int valeur : new int[]{8, 9, 10, 12, 98, 102, 103, 5432, 5436, 5437}) {
            assertThat(new Nombre(valeur).aUneRepetition()).isFalse();
        }
    }

    @Test
    public void doit_renvoyer_false_si_le_nombre_est_un_chiffre() {
        for (int valeur : new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}) {
            assertThat(new Nombre(valeur).aUneRepetition()).isFalse();
        }
    }

}

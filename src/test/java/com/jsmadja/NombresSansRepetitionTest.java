package com.jsmadja;

import com.google.common.collect.Range;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class NombresSansRepetitionTest {

    @Test
    public void doit_renvoyer_la_liste_des_nombres_sans_repetition() {
        assertThat(new NombresSansRepetition(Range.closed(8, 12)).toString()).isEqualTo("8, 9, 10, 12");

        assertThat(new NombresSansRepetition(Range.closed(98, 103)).toString()).isEqualTo("98, 102, 103");

        assertThat(new NombresSansRepetition(Range.closed(5432, 5437)).toString()).isEqualTo("5432, 5436, 5437");
    }

    @Test
    public void doit_calculer_le_saut_entre_98_et_102() {
        // 98 99 100 101 102
        assertThat(new NombresSansRepetition(Range.closed(98, 102)).calculerLePlusGrandSaut().toString()).isEqualTo("4: 98 -> 102");
        assertThat(new NombresSansRepetition(Range.closed(98, 102)).calculerLePlusGrandSaut().getTaille()).isEqualTo(4);
    }

    @Test
    public void doit_calculer_le_nombre_de_nombres_sans_repetition() {
        // 98 99 100 101 102
        assertThat(new NombresSansRepetition(Range.closed(98, 102)).calculerLeTotalDeNombresSansRepetition()).isEqualTo(2);
    }

    @Test
    public void doit_calculer_le_saut_entre_1_et_22() {
        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
        assertThat(new NombresSansRepetition(Range.closed(1, 22)).calculerLePlusGrandSaut().toString()).isEqualTo("11: 1 -> 12");
    }

}

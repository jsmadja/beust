package com.jsmadja;

import com.jsmadja.math.Nombre;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class SautTest {

    @Test
    public void doit_ajouter_des_nombres_au_saut() {
        Saut saut = new Saut();
        saut.ajouter(new Nombre(0));
        saut.ajouter(new Nombre(1));
        saut.ajouter(new Nombre(2));

        assertThat(saut.toString()).isEqualTo("2: 0 -> 2");
    }

}

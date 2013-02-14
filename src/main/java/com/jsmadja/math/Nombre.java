package com.jsmadja.math;

public class Nombre {

    private final Integer valeur;

    public Nombre(int valeur) {
        this.valeur = valeur;
    }

    public boolean aUneRepetition() {
        String nombre = valeur.toString();
        for (char chiffre:nombre.toCharArray()) {
            if (aPlusieursFoisLeMemeChiffre(nombre, chiffre)) {
                return true;
            }
        }
        return false;
    }

    private boolean aPlusieursFoisLeMemeChiffre(String nombre, char chiffre) {
        int count = 0;
        int idx = 0;
        while ((idx = nombre.indexOf(chiffre, idx)) != -1) {
            count++;
            if (count > 1) {
                return true;
            }
            idx++;
        }
        return false;
    }

    @Override
    public String toString() {
        return valeur.toString();
    }

    public boolean estSansRepetition() {
        return !aUneRepetition();
    }
}

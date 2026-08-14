package br.com.fiap.main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FiltroSemStream {
    static void main() {
        ArrayList<String> herois = new ArrayList<>(Arrays.asList("Capitão America",
                "Homem de Ferro", "Thor", "Hulk", "Viuva Negra", "Gavião Negra"));
        ArrayList<String> heroisComH = new ArrayList<>();
        for (String heroi : herois) {
            if (heroi.startsWith("H")) {
                heroisComH.add(heroi);
            }
        }
        Collections.sort(heroisComH);

        System.out.println(heroisComH);
    }
}

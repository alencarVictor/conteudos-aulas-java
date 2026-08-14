package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroComStream {
    static void main() {
        ArrayList<String> herois = new ArrayList<>(Arrays.asList("Capitão America",
                "Homem de Ferro", "Thor", "Hulk", "Viuva Negra", "Gavião Negra"));

        List<String> heroisComH = herois.stream()
                .filter(heroi -> heroi.startsWith("H"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(heroisComH);
    }
}

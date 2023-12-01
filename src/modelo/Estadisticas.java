package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Estadisticas {

    public static String ciudadConMasCandidatos(ArrayList<CandidatoMeth> candidatos) {
        Map<String, Integer> conteoCiudades = new HashMap<>();

        for (CandidatoMeth candidato : candidatos) {
            String ciudad = candidato.getCiudad();
            conteoCiudades.put(ciudad, conteoCiudades.getOrDefault(ciudad, 0) + 1);
        }

        String ciudadMasCandidatos = null;
        int maxCandidatos = 0;

        for (Map.Entry<String, Integer> entry : conteoCiudades.entrySet()) {
            if (entry.getValue() > maxCandidatos) {
                maxCandidatos = entry.getValue();
                ciudadMasCandidatos = entry.getKey();
            }
        }

        return ciudadMasCandidatos;
    }

    public static List<String> topTresCiudadesMenosCandidatos(ArrayList<CandidatoMeth> candidatos) {
        Map<String, Integer> conteoCiudades = new HashMap<>();

        for (CandidatoMeth candidato : candidatos) {
            String ciudad = candidato.getCiudad();
            conteoCiudades.put(ciudad, conteoCiudades.getOrDefault(ciudad, 0) + 1);
        }

        List<String> ciudadesMenosCandidatos = conteoCiudades.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return ciudadesMenosCandidatos;
    }
}

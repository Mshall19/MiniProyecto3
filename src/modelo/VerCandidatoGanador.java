package modelo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VerCandidatoGanador extends JFrame {

    public VerCandidatoGanador(ArrayList<Candidato> candidatos) {
        super("Candidato Ganador");

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        Candidato candidatoGanador = obtenerCandidatoGanador(candidatos);

        JTextArea candidatoGanadorTextArea = new JTextArea();
        candidatoGanadorTextArea.setEditable(false);

        String mensaje;
        if (candidatoGanador != null) {
            mensaje = "El candidato ganador es:\n\n" + candidatoGanador.toString();
        } else {
            mensaje = "No hay candidatos registrados.";
        }

        candidatoGanadorTextArea.setText(mensaje);

        JScrollPane scrollPane = new JScrollPane(candidatoGanadorTextArea);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    private Candidato obtenerCandidatoGanador(ArrayList<Candidato> candidatos) {
        Candidato candidatoGanador = null;
        int maxVotos = Integer.MIN_VALUE;

        for (Candidato candidato : candidatos) {
            if (candidato.getVotos() > maxVotos) {
                maxVotos = candidato.getVotos();
                candidatoGanador = candidato;
            }
        }

        return candidatoGanador;
    }

    public static void main(String[] args) {
        ArrayList<Candidato> candidatosEjemplo = new ArrayList<>();
        candidatosEjemplo.add(new Candidato("Candidato1", "123", "Cali", "Derecha", "Partido1", 100, "Propuestas1"));
        candidatosEjemplo.add(new Candidato("Candidato2", "456", "Bogotá", "Izquierda", "Partido2", 150, "Propuestas2"));
        candidatosEjemplo.add(new Candidato("Candidato3", "789", "Medellín", "Derecha", "Partido1", 120, "Propuestas3"));

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VerCandidatoGanador(candidatosEjemplo);
            }
        });
    }
}

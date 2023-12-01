package vista;

import modelo.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VistaGUI extends JFrame {
    public ArrayList<CandidatoMeth> candidatos = new ArrayList<>();

    public VistaGUI() {
        super("Bienvenido al Programa");

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menuInicio = new JMenu("Inicio");
        menuBar.add(menuInicio);

        JMenuItem menuItemCrearCandidato = new JMenuItem("Crear Candidato");
        JMenuItem menuItemMostrarCandidatos = new JMenuItem("Mostrar Candidatos");
        JMenuItem menuItemBuscarCandidato = new JMenuItem("Buscar Candidato");
        JMenuItem menuItemActualizarCandidato = new JMenuItem("Actualizar Candidato");
        JMenuItem menuItemEliminarCandidato = new JMenuItem("Eliminar Candidato");

        menuInicio.add(menuItemCrearCandidato);
        menuInicio.add(menuItemMostrarCandidatos);
        menuInicio.add(menuItemBuscarCandidato);
        menuInicio.add(menuItemActualizarCandidato);
        menuInicio.add(menuItemEliminarCandidato);

  
        JMenu menuEstadisticas = new JMenu("Estadísticas");
        menuBar.add(menuEstadisticas);

        JMenuItem menuItemVerGanador = new JMenuItem("Ver Candidato Ganador");
        JMenuItem menuItemCiudadConMasCandidatos = new JMenuItem("Ciudad con más candidatos");
        JMenuItem menuItemTopTresCiudadesMenosCandidatos = new JMenuItem("Top 3 ciudades con menos candidatos");

        menuEstadisticas.add(menuItemVerGanador);
        menuEstadisticas.add(menuItemCiudadConMasCandidatos);
        menuEstadisticas.add(menuItemTopTresCiudadesMenosCandidatos);

        menuItemCrearCandidato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CandidatoGUI candidatoGUI = new CandidatoGUI(candidatos);
                candidatoGUI.setVisible(true);
            }
        });

        menuItemMostrarCandidatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MostrarCandidatos.mostrarCandidatos(candidatos);
            }
        });

        menuItemBuscarCandidato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarCandidato.buscarCandidato(candidatos);
            }
        });

        menuItemActualizarCandidato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActualizarCandidato ventanaActualizarCandidato = new ActualizarCandidato();
                ventanaActualizarCandidato.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ventanaActualizarCandidato.setVisible(true);
            }
        });

        menuItemEliminarCandidato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EliminarCandidato.eliminarCandidato(candidatos);
            }
        });

        menuItemVerGanador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VerCandidatoGanador ventanaGanador = new VerCandidatoGanador();
                ventanaGanador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ventanaGanador.setVisible(true);
            }
        });

        menuItemCiudadConMasCandidatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarCiudadConMasCandidatos();
            }
        });

        menuItemTopTresCiudadesMenosCandidatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTopTresCiudadesMenosCandidatos();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setContentPane(new imagenFondo());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setVisible(true);
    }

    private void mostrarCiudadConMasCandidatos() {
        String ciudadMasCandidatos = Estadisticas.ciudadConMasCandidatos(candidatos);
        JOptionPane.showMessageDialog(this, "La ciudad con más candidatos es: " + ciudadMasCandidatos);
    }

    private void mostrarTopTresCiudadesMenosCandidatos() {
        java.util.List<String> ciudadesMenosCandidatos = Estadisticas.topTresCiudadesMenosCandidatos(candidatos);
        String mensaje = "Top 3 ciudades con menos candidatos:\n";
        for (int i = 0; i < ciudadesMenosCandidatos.size(); i++) {
            mensaje += (i + 1) + ". " + ciudadesMenosCandidatos.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VistaGUI();
            }
        });
    }

    public class imagenFondo extends JPanel {
        @Override
        public void paint(Graphics g) {
            ImageIcon imagen = new ImageIcon(getClass().getResource("imagen.jpg"));
            g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}

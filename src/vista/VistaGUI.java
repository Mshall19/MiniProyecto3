package vista;

import modelo.*;
import javax.swing.*;

import controlador.Ciudades;
import controlador.Partido;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VistaGUI extends JFrame implements VistaGeneral{
    public ArrayList<Candidato> candidatos = new ArrayList<>();

    public VistaGUI() {
        super("Bienvenido al Programa");

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Menú Inicio
        JMenu menuInicio = new JMenu("Inicio");
        menuBar.add(menuInicio);

        JMenuItem menuItemCrearCandidato = new JMenuItem("Crear Candidato");
        JMenuItem menuItemMostrarCandidatos = new JMenuItem("Mostrar Candidatos");
        JMenuItem menuItemBuscarCandidato = new JMenuItem("Buscar Candidato");
        JMenuItem menuItemActualizarCandidato = new JMenuItem("Actualizar Candidato");

        menuInicio.add(menuItemCrearCandidato);
        menuInicio.add(menuItemMostrarCandidatos);
        menuInicio.add(menuItemBuscarCandidato);
        menuInicio.add(menuItemActualizarCandidato);

        // Menú Estadísticas
        JMenu menuEstadisticas = new JMenu("Estadísticas");
        menuBar.add(menuEstadisticas);

        JMenuItem menuItemVerGanador = new JMenuItem("Ver Candidato Ganador");
        menuEstadisticas.add(menuItemVerGanador);

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

        menuItemVerGanador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verCandidatoGanador();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setContentPane(new imagenFondo());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setVisible(true);
    }

    private void verCandidatoGanador() {
        // Implementar la lógica para ver al candidato ganador
        // Puedes hacerlo en una nueva ventana o de la manera que prefieras
        // Por ahora, solo mostraré un mensaje de prueba
        JOptionPane.showMessageDialog(this, "Implementa la lógica para ver al candidato ganador", "Acción requerida", JOptionPane.INFORMATION_MESSAGE);
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

    @Override
    public void Iniciar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Iniciar'");
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

    @Override
    public String getIdentificacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIdentificacion'");
    }

    @Override
    public Ciudades getCiudadOrigen() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCiudadOrigen'");
    }

    @Override
    public boolean IsDerecha() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'IsDerecha'");
    }

    @Override
    public Partido getPartido() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPartido'");
    }

    @Override
    public String getPropuestas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPropuestas'");
    }
}

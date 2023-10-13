package personas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class VentanaPrincipal extends JFrame {
    private ListaPersonas lista; // El objeto ListaPersonas de la aplicación
    private Container contenedor; /* Un contenedor de elementos gráficos */
    // Etiquetas estáticas para los nombres de los atributos
    private JLabel nombre, apellidos, telefono, direccion;
    // Campos de ingreso de texto
    private JTextField campoNombre, campoApellidos, campoTelefono, campoDireccion;
    private JButton añadir, eliminar, borrarLista; // Botones
    private JList<String> listaNombres; // Lista de personas
    private DefaultListModel<String> modelo; // Objeto que modela la lista
    private JScrollPane scrollLista; // Barra de desplazamiento vertical

    /**
     * Constructor de la clase VentanaPrincipal
     */
    public VentanaPrincipal() {
        // Crea el objeto ListaPersonas
        lista = new ListaPersonas();
        // Crea el contenedor de elementos gráficos
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        // Crea las etiquetas para los nombres de los atributos
        nombre = new JLabel("Nombre:");
        apellidos = new JLabel("Apellidos:");
        telefono = new JLabel("Telefono:");
        direccion = new JLabel("Direccion:");
        // Crea los campos de ingreso de texto
        campoNombre = new JTextField(20);
        campoApellidos = new JTextField(20);
        campoTelefono = new JTextField(20);
        campoDireccion = new JTextField(20);
        // Crea los botones
        añadir = new JButton("Añadir");
        eliminar = new JButton("Eliminar");
        borrarLista = new JButton("Borrar lista");
        // Crea la lista de personas
        modelo = new DefaultListModel<String>();
        listaNombres = new JList<String>(modelo);
        scrollLista = new JScrollPane(listaNombres);
        scrollLista.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollLista.setPreferredSize(new Dimension(250, 80));
        // Agrega los elementos gráficos al contenedor
        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(apellidos);
        contenedor.add(campoApellidos);
        contenedor.add(telefono);
        contenedor.add(campoTelefono);
        contenedor.add(direccion);
        contenedor.add(campoDireccion);
        contenedor.add(añadir);
        contenedor.add(eliminar);
        contenedor.add(borrarLista);
        contenedor.add(scrollLista);

        // Agrega un listener para la lista que actualiza los campos al seleccionar un elemento
        listaNombres.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = listaNombres.getSelectedIndex();
                if (index != -1) {
                    // Obtener la persona seleccionada
                    Persona personaSeleccionada = lista.anadirPersona(index);

                    // Actualizar los campos de texto
                    campoNombre.setText(personaSeleccionada.getNombre());
                    campoApellidos.setText(personaSeleccionada.getApellidos());
                    campoTelefono.setText(personaSeleccionada.getTelefono());
                    campoDireccion.setText(personaSeleccionada.getDireccion());
                } else {
                    // Si no hay selección, limpiar los campos de texto
                    campoNombre.setText("");
                    campoApellidos.setText("");
                    campoTelefono.setText("");
                    campoDireccion.setText("");
                }
            }
        });

        // Agrega los listeners a los botones
        añadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                añadirPersona();
            }
        });
        eliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                eliminarPersona();
            }
        });
        borrarLista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                borrarLista();
            }
        });
        // Configura la ventana
        setTitle("Lista de personas");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Métodos para manejar los eventos de los botones
    private void añadirPersona() {
        String nombre = campoNombre.getText();
        String apellidos = campoApellidos.getText();
        String telefono = campoTelefono.getText();
        String direccion = campoDireccion.getText();
        Persona p = new Persona(nombre, apellidos, telefono, direccion);
        lista.anadirPersona(p);
        modelo.addElement(nombre + " " + apellidos + " " + telefono + " " + direccion);
    }

    private void eliminarPersona() {
        int index = listaNombres.getSelectedIndex();
        if (index != -1) {
            // Eliminar la persona de la lista y del modelo
            lista.eliminarPersona(index);
            modelo.remove(index);
            // Limpiar los campos de ingreso de texto
            campoNombre.setText("");
            campoApellidos.setText("");
            campoTelefono.setText("");
            campoDireccion.setText("");
            
        }
    }

    private void borrarLista() {
        lista.borrarLista();
        modelo.removeAllElements();
    }
    public void mostrarVentana() {
        setVisible(true);
    }
}

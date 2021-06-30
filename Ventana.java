/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pigclassifier;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author RAFAEL Y MIGUEL RAMIREZ
 */
public class Ventana {
    

    JFrame ventana = new JFrame("Clasificador de cerdos de Engorde, Verracos y Parteras");
    JTextField Peso, Nombre, Edad, Expositor, raza, purpose;
    JLabel Weight, Name, Age, Expositioner, info, proposito;
    JButton Ingresar, Imprimir, Borrar, Ordenar, Agregar, Eliminar;
    JComboBox razas;
    String nombrerazas[]={
        /*Aqui iran los nombres de las razas*/
        "Cerdas Duroc Meztizos","Machos Duroc Mestizos",
        "Hembras Duroc Puro","Machos Duroc Puro",
        "Hembras Pietrain Mestizos","Hembras Pietrain Puro",
        "Machos Pietrain Mestizos","Machos Pietrain Puro",
        "Hembras Large White Mestizos","Machos Large White Mestizos",
        "Hembras Large white Puro","Machos Large White Puro"
    };
    
int po;
    ArrayList<String> Razas = new ArrayList<>();
    
    int edades[] = {
        6,9,12,15,18,21,24,27,31,36,42,48,54,60,72 //meses
    };
    
float cantidad_parteras[0];//para numerar y almacenar la cantidad de cerdas para parto
float cantidad_verracos[0];
float cantidad_lechones_para_engorde[0];
float cantidad_lechones_para_cría[0];

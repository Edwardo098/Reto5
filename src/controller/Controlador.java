
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Tripulante;
import model.dao.TripulanteDAO;
import views.Vista;

public class Controlador implements ActionListener {

    TripulanteDAO dao = new TripulanteDAO();
    Tripulante t = new Tripulante();
    Vista vista = new Vista();
    DefaultTableModel modelo = new  DefaultTableModel();
    
    public Controlador(Vista vi){
       this.vista=vi;
       this.vista.btnListar.addActionListener(this);
       this.vista.btnAgregar.addActionListener(this);
       
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vista.btnListar){
            listarT(vista.tabla);
        }
        if (e.getSource()==vista.btnAgregar){
            agregar();
        }
    }
    
    public void listarT(JTable tabla){
        modelo=(DefaultTableModel) tabla.getModel();
        List<Tripulante> lista = dao.listarT();
        Object[] object = new Object[3];
        for (int i=0;i<lista.size();i++){
            object[0]=lista.get(i).getId();
            object[1]=lista.get(i).getApellidos();
            object[2]=lista.get(i).getNombres();
            modelo.addRow(object);
        }
        vista.tabla.setModel(modelo);
    }
    
    public void agregar(){
        int id = Integer.parseInt(vista.txtId.getText());
        String apellidos = vista.txtApellidos.getText();
        String nombres = vista.txtNombres.getText();
        t.setId(id);
        t.setApellidos(apellidos);
        t.setNombres(nombres);
        int r = dao.agregar(t);
        if(r==1){
        JOptionPane.showMessageDialog(vista,"¡¡Tripulante agregado con exito!!");}
        else{
        JOptionPane.showMessageDialog(vista,"¡¡Error al agregar al tripulante!!"); }
    
    }
    
}

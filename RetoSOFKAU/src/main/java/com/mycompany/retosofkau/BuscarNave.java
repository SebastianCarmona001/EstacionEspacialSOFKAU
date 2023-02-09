/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.retosofkau;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PERSONAL
 */
public class BuscarNave extends javax.swing.JFrame {

    Boolean C_Name;
    Boolean C_Type;
    Boolean C_Location;
    
    int aux = 0;      
    
    public BuscarNave() {
        initComponents();
    }
    
    public void obtenerChecks(){
        //Se almacenan los valores de los checkboxs
        C_Name = C_Nombre.isSelected();
        C_Type = C_Tipo_nave.isSelected();
        C_Location = C_Region.isSelected();
        
        
        //Activamos el boton de filtrado, cuando se seleccione al menos un tipo de filtro
        if(C_Name || C_Type || C_Location){
            B_Filtrar.setEnabled(true);
        }else{
            B_Filtrar.setEnabled(false);
        }
        
        //Si se escoge filtrar por nombre, se habilita la casilla de texto, y si se desselecciona se deshabilita
        if(C_Name){
            F_Nombre.setEnabled(true);
        }else{
            F_Nombre.setEnabled(false);
        }
        
        //Si se escoge filtrar por tipo de nave, se habilita la casilla de texto, y si se desselecciona se deshabilita
        if(C_Type){
            F_Tipo.setEnabled(true);
        }else{
            F_Tipo.setEnabled(false);
        }
        
        //Si se escoge filtrar por Region, se habilita la casilla de texto, y si se desselecciona se deshabilita
        if(C_Location){
            F_Region.setEnabled(true);
        }else{
            F_Region.setEnabled(false);
        }
        
        //Se usa el auxiliar para saber de que orden es el filtro a aplicar
        if(C_Name && C_Type && C_Location){
            aux = 3;
        }else if(C_Name && C_Type || C_Location && C_Type ||C_Name && C_Location){
            aux = 2;
        }else{
            aux = 1;
        }
                
    }
    
    
    
    
    private JTable crearTabla(){
        
        //Se crean las variables locales en las que se van a almacenar los valores del formulario de filtros
        String Filtro_Nombre = F_Nombre.getText();
        String Filtro_Tipo = (String) F_Tipo.getSelectedItem();
        String Filtro_Region = (String) F_Region.getSelectedItem();
        
        //Creo una variable con los nombres de los encabezados
        String N_col[] = {"Nombre", "Tipo de Nave", "Tipo de combustible", "Region", "Potencia", "Empuje", "Velocidad", "Peso", "Destino", "Tipo de mision", "Capacidad"};
        
        //Genero una tabla por defecto unicamente con los nombres de las columnas y ningun registro
        DefaultTableModel tablaBase = new DefaultTableModel(N_col,0);
        
        
        
        //Recorro el tamaño de la lista BD_Naves, para saber cuantos registros poner y recupero los valores
        for(int i=0; i < Inicio.BD_Naves.size(); i++){
            String Nombre = Inicio.BD_Naves.get(i).getNombre();
            String Tipo_nave = Inicio.BD_Naves.get(i).getTipo_nave();
            String Tipo_combustible = Inicio.BD_Naves.get(i).getTipo_combustible();
            String Region = Inicio.BD_Naves.get(i).getRegion();
            double Potencia = Inicio.BD_Naves.get(i).getPotencia();
            double Empuje = Inicio.BD_Naves.get(i).getEmpuje();
            double Velocidad = Inicio.BD_Naves.get(i).getVelocidad();
            double Peso = Inicio.BD_Naves.get(i).getPeso();
            String Destino = Inicio.BD_Naves.get(i).getDestino();
            String Tipo_mision = Inicio.BD_Naves.get(i).getTipo_mision();
            int Capacidad = Inicio.BD_Naves.get(i).getCapacidad();
            
            //ALmaceno los vaores en una variable llamada data
            Object[] Datos = {Nombre, Tipo_nave, Tipo_combustible, Region, Potencia, Empuje, Velocidad, Peso, Destino, Tipo_mision, Capacidad};
           
            
            //Se generan los condicionales de filtrado incluyendo que se respete el orden del filtro con la variable aux
            if(C_Name && C_Type && C_Location && Datos[0].equals(Filtro_Nombre) && Datos[1].equals(Filtro_Tipo) && Datos[3].equals(Filtro_Region) && aux == 3){
                //Inserto los valores obtenidos en la tabla
                tablaBase.addRow(Datos);
            }else if(C_Name && C_Type && Datos[0].equals(Filtro_Nombre) && Datos[1].equals(Filtro_Tipo) && aux == 2){
                //Inserto los valores obtenidos en la tabla
                tablaBase.addRow(Datos);
            }else if(C_Name && C_Location && Datos[0].equals(Filtro_Nombre) && Datos[3].equals(Filtro_Region) && aux == 2){
                //Inserto los valores obtenidos en la tabla
                tablaBase.addRow(Datos);
            }else if(C_Type && C_Location && Datos[1].equals(Filtro_Tipo) && Datos[3].equals(Filtro_Region) && aux == 2){
                //Inserto los valores obtenidos en la tabla
                tablaBase.addRow(Datos);
            }else if(C_Name && Datos[0].equals(Filtro_Nombre) && aux == 1){
                //Inserto los valores obtenidos en la tabla
                tablaBase.addRow(Datos);
            }else if(C_Type && Datos[1].equals(Filtro_Tipo) && aux == 1){
                //Inserto los valores obtenidos en la tabla
                tablaBase.addRow(Datos);
            }else if(C_Location && Datos[3].equals(Filtro_Region) && aux == 1){
                //Inserto los valores obtenidos en la tabla
                tablaBase.addRow(Datos);
            }
            
            
        }
        
        //Creo un objeto tipo tabla con los valores obtenidos en tablaBase
        JTable tablaNaves = new JTable(tablaBase);
        tablaNaves.setBounds(40, 40, 100, 300);
        
        return tablaNaves;
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        C_Nombre = new javax.swing.JCheckBox();
        C_Tipo_nave = new javax.swing.JCheckBox();
        C_Region = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        F_Nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        F_Tipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        F_Region = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        B_Filtrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setName("Filtro de naves"); // NOI18N

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        C_Nombre.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        C_Nombre.setText("Nombre");
        C_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_NombreActionPerformed(evt);
            }
        });

        C_Tipo_nave.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        C_Tipo_nave.setText("Tipo de nave");
        C_Tipo_nave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_Tipo_naveActionPerformed(evt);
            }
        });

        C_Region.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        C_Region.setText("Region");
        C_Region.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_RegionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Seleccion");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("de filtros");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(C_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(C_Tipo_nave, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
            .addComponent(C_Region, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(C_Nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C_Tipo_nave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C_Region, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 255, 204));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nombre:");

        F_Nombre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        F_Nombre.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Tipo de nave:");

        F_Tipo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        F_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lanzadera", "Robotica", "Tripulada" }));
        F_Tipo.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Region:");
        jLabel4.setToolTipText("");

        F_Region.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        F_Region.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EEUU", "Rusia", "Ucrania", "Europa", "China", "Japón", "Internacional" }));
        F_Region.setEnabled(false);

        jLabel1.setBackground(new java.awt.Color(0, 255, 204));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Naves");

        B_Filtrar.setBackground(new java.awt.Color(0, 255, 204));
        B_Filtrar.setFont(new java.awt.Font("Stylus BT", 1, 36)); // NOI18N
        B_Filtrar.setText("Filtrar");
        B_Filtrar.setEnabled(false);
        B_Filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_FiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(F_Nombre)
                    .addComponent(F_Tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(F_Region, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B_Filtrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(B_Filtrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(F_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(F_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(F_Region, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_NombreActionPerformed
        obtenerChecks();
    }//GEN-LAST:event_C_NombreActionPerformed

    private void B_FiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_FiltrarActionPerformed
        
        //Se le asigna el valor de la tabla creada pr el metodo a una variable tipo JTable
        JTable tablaNaves = crearTabla();
        
        //Se pone un scrollbar en casod e que hay muchos datos y se requiera moverse de manera facil
        JScrollPane sp = new JScrollPane(tablaNaves);
        
        //Se crea una ventana llamada BD_Filtrada y se le ponen los requerimientos esteticos
        JFrame BD_Filtrada =new JFrame();
        BD_Filtrada.setTitle("Filtro Naves Espaciales");
        BD_Filtrada.setLocationRelativeTo(null);
        BD_Filtrada.add(sp);
        BD_Filtrada.setSize(1000,300);
        BD_Filtrada.setVisible(true);
    }//GEN-LAST:event_B_FiltrarActionPerformed

    private void C_Tipo_naveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_Tipo_naveActionPerformed
        obtenerChecks();
    }//GEN-LAST:event_C_Tipo_naveActionPerformed

    private void C_RegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_RegionActionPerformed
        obtenerChecks();
    }//GEN-LAST:event_C_RegionActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarNave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarNave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarNave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarNave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarNave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Filtrar;
    private javax.swing.JCheckBox C_Nombre;
    private javax.swing.JCheckBox C_Region;
    private javax.swing.JCheckBox C_Tipo_nave;
    private javax.swing.JTextField F_Nombre;
    private javax.swing.JComboBox<String> F_Region;
    private javax.swing.JComboBox<String> F_Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.retosofkau;

//SE IMPORTA ARRAYLIST
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Inicio extends javax.swing.JFrame {

    public static ArrayList<Nave> BD_Naves = new ArrayList();
    
    //Se insertan los datos de las naves por defecto en vectores que almacenan sus valores
    String Nombres[] = {"Saturno V", "H.IIA", "Energia", "Pionero XI", "Cassini-Hyugens", "Vikingo I", "Shenzou", "Apolo XI", "Soyuz"};
    String Naves[] = {"Lanzadera", "Lanzadera", "Lanzadera", "Robotica", "Robotica", "Robotica", "Tripulada", "Tripulada", "Tripulada"};
    String Combustible[] = {"N(Liq) + O(Liq)", "Solido + N(Liq) + O(Liq)", "Queroseno + O(Liq)", "NO4 + MMH", "NO4 + MMH", "N(Comp) + N2H4", "N2O4 + MMH", "NO4 + UDMH", "N2O4 + UDMH"};
    String Region[] = {"EEUU", "Japon", "Rusia", "EEUU", "Internacional", "EEUU", "China", "EEUU", "Rusia"};
    double Potencia[] = {32000,10000,27000,0,0,0,0.04,0.05,0.04};
    double Empuje[] = {3500,226,3060,0.4,0.004539,0.1349,0.125,0.2,0.15};
    double Velocidad[] = {9800,7000,8000,15000,18000,17000,12000,12000,12000};
    double Peso[] = {2900,445,2400,0.258,0.4,0.272,3.240,30.32,6.790};
    String Destino[] = {"Orbita terrestre", "Orbita terrestre", "Orbita terrestre", "Jupiter", "Saturno", "Marte", "Orbita terrestre", "Luna", "Luna"};
    String Mision[] = {"Mision Lunar", "Mision Lunar", "Mision Lunar", " Estudio condiciones ingrávidas", " Estudio condiciones ingrávidas", " Estudio condiciones ingrávidas", "Estudio humano en exterior de capsula", "Mision Lunar", "Mision Lunar"};
    int Capacidad[] = {0,0,0,0,0,0,3,3,3};
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);   
        
        
        //Se crean las 9 primeras naves que estan por defecto en la base de datos
        Nave nuevaNave = new Nave();
        Nave nuevaNave1 = new Nave();
        Nave nuevaNave2 = new Nave();
        Nave nuevaNave3 = new Nave();
        Nave nuevaNave4 = new Nave();
        Nave nuevaNave5 = new Nave();
        Nave nuevaNave6 = new Nave();
        Nave nuevaNave7 = new Nave();
        Nave nuevaNave8 = new Nave();
        
        //Se le ponen valores a las naves dependiendo de cual sea
        nuevaNave.setNombre(Nombres[0]); 
        nuevaNave.setTipo_nave(Naves[0]);
        nuevaNave.setTipo_combustible(Combustible[0]);
        nuevaNave.setRegion(Region[0]);
        nuevaNave.setPotencia(Potencia[0]);
        nuevaNave.setEmpuje(Empuje[0]);
        nuevaNave.setVelocidad(Velocidad[0]);
        nuevaNave.setPeso(Peso[0]);
        nuevaNave.setDestino(Destino[0]);
        nuevaNave.setTipo_mision(Mision[0]);
        nuevaNave.setCapacidad(Capacidad[0]);
                 
        nuevaNave1.setNombre(Nombres[1]); 
        nuevaNave1.setTipo_nave(Naves[1]);
        nuevaNave1.setTipo_combustible(Combustible[1]);
        nuevaNave1.setRegion(Region[1]);
        nuevaNave1.setPotencia(Potencia[1]);
        nuevaNave1.setEmpuje(Empuje[1]);
        nuevaNave1.setVelocidad(Velocidad[1]);
        nuevaNave1.setPeso(Peso[1]);
        nuevaNave1.setDestino(Destino[1]);
        nuevaNave1.setTipo_mision(Mision[1]);
        nuevaNave1.setCapacidad(Capacidad[1]);
            
        nuevaNave2.setNombre(Nombres[2]); 
        nuevaNave2.setTipo_nave(Naves[2]);
        nuevaNave2.setTipo_combustible(Combustible[2]);
        nuevaNave2.setRegion(Region[2]);
        nuevaNave2.setPotencia(Potencia[2]);
        nuevaNave2.setEmpuje(Empuje[2]);
        nuevaNave2.setVelocidad(Velocidad[2]);
        nuevaNave2.setPeso(Peso[2]);
        nuevaNave2.setDestino(Destino[2]);
        nuevaNave2.setTipo_mision(Mision[2]);
        nuevaNave2.setCapacidad(Capacidad[2]);
        
        nuevaNave3.setNombre(Nombres[3]); 
        nuevaNave3.setTipo_nave(Naves[3]);
        nuevaNave3.setTipo_combustible(Combustible[3]);
        nuevaNave3.setRegion(Region[3]);
        nuevaNave3.setPotencia(Potencia[3]);
        nuevaNave3.setEmpuje(Empuje[3]);
        nuevaNave3.setVelocidad(Velocidad[3]);
        nuevaNave3.setPeso(Peso[3]);
        nuevaNave3.setDestino(Destino[3]);
        nuevaNave3.setTipo_mision(Mision[3]);
        nuevaNave3.setCapacidad(Capacidad[3]);
        
        nuevaNave4.setNombre(Nombres[4]); 
        nuevaNave4.setTipo_nave(Naves[4]);
        nuevaNave4.setTipo_combustible(Combustible[4]);
        nuevaNave4.setRegion(Region[4]);
        nuevaNave4.setPotencia(Potencia[4]);
        nuevaNave4.setEmpuje(Empuje[4]);
        nuevaNave4.setVelocidad(Velocidad[4]);
        nuevaNave4.setPeso(Peso[4]);
        nuevaNave4.setDestino(Destino[4]);
        nuevaNave4.setTipo_mision(Mision[4]);
        nuevaNave4.setCapacidad(Capacidad[4]);
        
        nuevaNave5.setNombre(Nombres[5]); 
        nuevaNave5.setTipo_nave(Naves[5]);
        nuevaNave5.setTipo_combustible(Combustible[5]);
        nuevaNave5.setRegion(Region[5]);
        nuevaNave5.setPotencia(Potencia[5]);
        nuevaNave5.setEmpuje(Empuje[5]);
        nuevaNave5.setVelocidad(Velocidad[5]);
        nuevaNave5.setPeso(Peso[5]);
        nuevaNave5.setDestino(Destino[5]);
        nuevaNave5.setTipo_mision(Mision[5]);
        nuevaNave5.setCapacidad(Capacidad[5]);
        
        nuevaNave6.setNombre(Nombres[6]); 
        nuevaNave6.setTipo_nave(Naves[6]);
        nuevaNave6.setTipo_combustible(Combustible[6]);
        nuevaNave6.setRegion(Region[6]);
        nuevaNave6.setPotencia(Potencia[6]);
        nuevaNave6.setEmpuje(Empuje[6]);
        nuevaNave6.setVelocidad(Velocidad[6]);
        nuevaNave6.setPeso(Peso[6]);
        nuevaNave6.setDestino(Destino[6]);
        nuevaNave6.setTipo_mision(Mision[6]);
        nuevaNave6.setCapacidad(Capacidad[6]);
        
        nuevaNave7.setNombre(Nombres[7]); 
        nuevaNave7.setTipo_nave(Naves[7]);
        nuevaNave7.setTipo_combustible(Combustible[7]);
        nuevaNave7.setRegion(Region[7]);
        nuevaNave7.setPotencia(Potencia[7]);
        nuevaNave7.setEmpuje(Empuje[7]);
        nuevaNave7.setVelocidad(Velocidad[7]);
        nuevaNave7.setPeso(Peso[7]);
        nuevaNave7.setDestino(Destino[7]);
        nuevaNave7.setTipo_mision(Mision[7]);
        nuevaNave7.setCapacidad(Capacidad[7]);
        
        nuevaNave8.setNombre(Nombres[8]); 
        nuevaNave8.setTipo_nave(Naves[8]);
        nuevaNave8.setTipo_combustible(Combustible[8]);
        nuevaNave8.setRegion(Region[8]);
        nuevaNave8.setPotencia(Potencia[8]);
        nuevaNave8.setEmpuje(Empuje[8]);
        nuevaNave8.setVelocidad(Velocidad[8]);
        nuevaNave8.setPeso(Peso[8]);
        nuevaNave8.setDestino(Destino[8]);
        nuevaNave8.setTipo_mision(Mision[8]);
        nuevaNave8.setCapacidad(Capacidad[8]);

        
        
        //Se agregan las naves a la lista BD_Naves
        BD_Naves.add(nuevaNave);
        BD_Naves.add(nuevaNave1);
        BD_Naves.add(nuevaNave2);
        BD_Naves.add(nuevaNave3);
        BD_Naves.add(nuevaNave4);
        BD_Naves.add(nuevaNave5);
        BD_Naves.add(nuevaNave6);
        BD_Naves.add(nuevaNave7);
        BD_Naves.add(nuevaNave8);
        
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
        B_Crear = new javax.swing.JButton();
        B_Buscar = new javax.swing.JButton();
        B_Ver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setName("Inicio"); // NOI18N

        B_Crear.setBackground(new java.awt.Color(153, 0, 255));
        B_Crear.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        B_Crear.setText("Crear Nave");
        B_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CrearActionPerformed(evt);
            }
        });

        B_Buscar.setBackground(new java.awt.Color(153, 0, 255));
        B_Buscar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        B_Buscar.setText("Buscar Nave");
        B_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BuscarActionPerformed(evt);
            }
        });

        B_Ver.setBackground(new java.awt.Color(153, 0, 255));
        B_Ver.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        B_Ver.setText("Ver Naves");
        B_Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_VerActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 0, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Estacion espacial SOFKA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(B_Buscar)
                .addGap(18, 18, 18)
                .addComponent(B_Ver, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Ver, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CrearActionPerformed
        CrearNave NuevaNave = new CrearNave();
        NuevaNave.setVisible(true);
        
    }//GEN-LAST:event_B_CrearActionPerformed

    private void B_VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_VerActionPerformed
        //Se crea un objeto tipo tabla
        JTable tablaNaves = crearTabla();
        
        //Se le agrega la barra de scroll en caso de que sea necesario
        JScrollPane sp = new JScrollPane(tablaNaves);
        
        //Se cera una ventana tipo JFrame t se setean los valores de esta
        JFrame BD =new JFrame();
        BD.setTitle("Naves Espaciales");
        BD.setLocationRelativeTo(null);
        BD.add(sp);
        BD.setSize(1000,300);
        BD.setVisible(true);
                
    }//GEN-LAST:event_B_VerActionPerformed

    private void B_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BuscarActionPerformed
        //Se crea el objeto tipo buscarNave y se muestra visible
        BuscarNave NaveFiltrada = new BuscarNave();
        NaveFiltrada.setVisible(true);
    }//GEN-LAST:event_B_BuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        }
        );
    }
    
    private JTable crearTabla(){
        //Creo una variable con los nombres de los encabezados
        String N_col[] = {"Nombre", "Tipo de Nave", "Tipo de combustible", "Region", "Potencia", "Empuje", "Velocidad", "Peso", "Destino", "Tipo de mision", "Capacidad"};
        
        //Genero una tabla por defecto unicamente con los nombres de las columnas y ningun registro
        DefaultTableModel tablaBase = new DefaultTableModel(N_col,0);
        
        //Recorro el tamaño de la lista BD_Naves, para saber cuantos registros poner y recupero los valores
        for(int i=0; i < Inicio.BD_Naves.size(); i++){
            String nNombre = BD_Naves.get(i).getNombre();
            String nTipo_nave = BD_Naves.get(i).getTipo_nave();
            String nTipo_combustible = BD_Naves.get(i).getTipo_combustible();
            String nRegion = BD_Naves.get(i).getRegion();
            double nPotencia = BD_Naves.get(i).getPotencia();
            double nEmpuje = BD_Naves.get(i).getEmpuje();
            double nVelocidad = BD_Naves.get(i).getVelocidad();
            double nPeso = BD_Naves.get(i).getPeso();
            String nDestino = BD_Naves.get(i).getDestino();
            String nTipo_mision = BD_Naves.get(i).getTipo_mision();
            int nCapacidad = BD_Naves.get(i).getCapacidad();
            
            //ALmaceno los vaores en una variable llamada data
            Object[] Datos = {nNombre, nTipo_nave, nTipo_combustible, nRegion, nPotencia, nEmpuje, nVelocidad, nPeso, nDestino, nTipo_mision, nCapacidad};
            
            //Inserto los valores obtenidos en la tabla
            tablaBase.addRow(Datos);
            
        }
        
        //Creo un objeto tipo tabla con los valores obtenidos en tablaBase
        JTable tablaNaves = new JTable(tablaBase);
        tablaNaves.setBounds(40, 40, 100, 300);
        
        return tablaNaves;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Buscar;
    private javax.swing.JButton B_Crear;
    private javax.swing.JButton B_Ver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

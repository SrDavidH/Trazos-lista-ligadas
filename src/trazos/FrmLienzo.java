
package trazos;

import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author dhzea
 */
public class FrmLienzo extends javax.swing.JFrame {

    int x1, y1;
    boolean trazando=false;
     List<Integer> coordenadasX = new ArrayList<>();
    List<Integer> coordenadasY = new ArrayList<>();

    public FrmLienzo() {
        initComponents();
        
        String rutaArchivo = "C:/Users/dhzea/Documents/Estructura de datos/Trazos/src/GuardarTrazo/trazos.txt";

        x1 = -1;
        y1 = -1;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLienzo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCoordenadas = new javax.swing.JTextField();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSeleccion = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlLienzo.setBackground(new java.awt.Color(0, 0, 0));
        pnlLienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlLienzoMouseMoved(evt);
            }
        });
        pnlLienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLienzoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlLienzoLayout = new javax.swing.GroupLayout(pnlLienzo);
        pnlLienzo.setLayout(pnlLienzoLayout);
        pnlLienzoLayout.setHorizontalGroup(
            pnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlLienzoLayout.setVerticalGroup(
            pnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );

        jLabel1.setText("Coordenadas");

        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSeleccion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Trazo", "Circulo", "Cuadrado", " " }));
        btnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(btnAbrir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCoordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                        .addComponent(btnSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCoordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir)
                    .addComponent(btnGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlLienzoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLienzoMouseMoved
        int x = evt.getX();
        int y = evt.getY();

        txtCoordenadas.setText("x=" + x + ", y=" + y);

        //obtener el objeto graficador del contenedor (panel)
        Graphics g = pnlLienzo.getGraphics();
        g.setColor(Color.red);
        if(trazando){
        //g.drawLine(x1, y1, x, y);
        }
    }//GEN-LAST:event_pnlLienzoMouseMoved

    private void pnlLienzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLienzoMouseClicked
         if (trazando) {
        int x2 = evt.getX();
        int y2 = evt.getY();

        Graphics g = pnlLienzo.getGraphics();
        g.setColor(Color.blue);
        
        switch (btnSeleccion.getSelectedIndex()) {
            case 0: // Trazo
                g.drawLine(x1, y1, x2, y2);
                break;
            case 1: // Circulo
                int radius = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                g.drawOval(x1 - radius, y1 - radius, 2 * radius, 2 * radius);
                break;
            case 2: // Cuadrado
                int width = Math.abs(x2 - x1);
                int height = Math.abs(y2 - y1);
                int startX = Math.min(x1, x2);
                int startY = Math.min(y1, y2);
                g.drawRect(startX, startY, width, height);
                break;
            case 3: // Triángulo (puedes implementarlo)
                // Implementa la lógica para dibujar un triángulo
                break;
        }

        guardarTrazo(x1, y1, x2, y2);
    } else {
        x1 = evt.getX();
        y1 = evt.getY();
    }
    trazando = !trazando;

    }//GEN-LAST:event_pnlLienzoMouseClicked

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        String nombreArchivo = Archivo.elegirArchivo();
        BufferedReader br = Archivo.abrirArchivo(nombreArchivo);

        Graphics g = pnlLienzo.getGraphics();
        g.setColor(Color.blue);
         x1 = -1;
        y1 = -1;

        try {
            String linea = br.readLine();
            while (linea != null) {
                String[] textos = linea.split(";");
                int x2 = Integer.parseInt(textos[0]);
                int y2 = Integer.parseInt(textos[1]);
                if (x1 > 0 && y1 > 0) {
                    g.setColor(Color.blue);
                    g.drawLine(x1, y1, x2, y2);
                    

                }
              x1 = x2;
                y1 = y2;

                linea = br.readLine();

            }
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(this, "Error al abrir el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

     private void guardarTrazo(int x1, int y1, int x2, int y2) {
        coordenadasX.add(x1);
        coordenadasY.add(y1);
        coordenadasX.add(x2);
        coordenadasY.add(y2);
    }
     
      private void guardarEnArchivo(String rutaArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (int i = 0; i < coordenadasX.size(); i += 2) {
                writer.write(coordenadasX.get(i) + ";" + coordenadasY.get(i) + ";" +
                             coordenadasX.get(i+1) + ";" + coordenadasY.get(i+1));
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el trazo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       String rutaArchivo = Archivo.elegirArchivo();
        guardarEnArchivo(rutaArchivo);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionActionPerformed
      // Obtener el índice de la opción seleccionada
    int selectedIndex = btnSeleccion.getSelectedIndex();
    
    // Realizar acciones basadas en la selección
    switch (selectedIndex) {
        case 0: // Trazo
            System.out.println("Trazo seleccionado");
            break;
        case 1: // Círculo
            System.out.println("Círculo seleccionado");
            break;
        case 2: // Cuadrado
            System.out.println("Cuadrado seleccionado");
            break;
        case 3: // Triángulo
            System.out.println("Triángulo seleccionado");
            break;
        default:
            System.out.println("Selección inválida");
            break;
    }
    }//GEN-LAST:event_btnSeleccionActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLienzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLienzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLienzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLienzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLienzo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox btnSeleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlLienzo;
    private javax.swing.JTextField txtCoordenadas;
    // End of variables declaration//GEN-END:variables

   
}

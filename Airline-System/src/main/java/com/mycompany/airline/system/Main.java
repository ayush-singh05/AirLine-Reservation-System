/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.airline.system;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Ayush Singh
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocation(320, 50);
        this.setTitle("Airline Reservation System");
//        setLayout(new BorderLayout());
//        JLabel background=new JLabel(new ImageIcon("C:\\Users\\Ayush Singh\\Desktop\\Airline-Reservation-System\\Airline-System\\Icons\\Welcome to Indian Airways!.jpg"));
//        add(background);
//        background.setLayout(new FlowLayout());
        //
//        setLayout(new BorderLayout());
//        setContentPane(new JLabel(new ImageIcon("C:\\Users\\Ayush Singh\\Desktop\\Airline-Reservation-System\\Airline-System\\Icons\\pexels-pixabay-358220.jpg")));
//        setLayout(new FlowLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        searchcustomer = new javax.swing.JMenuItem();
        searchCustomer = new javax.swing.JMenuItem();
        addflight = new javax.swing.JMenu();
        addFlight = new javax.swing.JMenuItem();
        bookflight = new javax.swing.JMenuItem();
        viewticket = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        addadmin = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );

        jMenu1.setText("Customer");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        searchcustomer.setText("Add Customer");
        searchcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcustomerActionPerformed(evt);
            }
        });
        jMenu1.add(searchcustomer);

        searchCustomer.setText("Search Customer");
        searchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerActionPerformed(evt);
            }
        });
        jMenu1.add(searchCustomer);

        jMenuBar1.add(jMenu1);

        addflight.setText("Flight");

        addFlight.setText("Add Flight");
        addFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightActionPerformed(evt);
            }
        });
        addflight.add(addFlight);

        bookflight.setText("Book Flight");
        bookflight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookflightActionPerformed(evt);
            }
        });
        addflight.add(bookflight);

        jMenuBar1.add(addflight);

        viewticket.setText("Ticket");

        jMenuItem5.setText("View Ticket");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        viewticket.add(jMenuItem5);

        jMenuBar1.add(viewticket);

        addadmin.setText("Admin");
        addadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addadminActionPerformed(evt);
            }
        });

        jMenuItem6.setText("Add Admin");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        addadmin.add(jMenuItem6);

        jMenuBar1.add(addadmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(desktop))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcustomerActionPerformed
        // TODO add your handling code here:
        addCustomer addcus = new addCustomer();
        desktop.add(addcus);
        addcus.setVisible(true);
    }//GEN-LAST:event_searchcustomerActionPerformed

    private void addFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightActionPerformed
        // TODO add your handling code here:
        addFlight flight = new addFlight();
        desktop.add(flight);
        flight.setVisible(true);
    }//GEN-LAST:event_addFlightActionPerformed

    private void addadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addadminActionPerformed
        // TODO add your handling code here:
//        addAdmin admin = new addAdmin();
//        desktop.add(admin);
//        admin.setVisible(true);
    }//GEN-LAST:event_addadminActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
         addAdmin admin = new addAdmin();
        desktop.add(admin);
        admin.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void searchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerActionPerformed
        // TODO add your handling code here:
        searchCustomer search = new searchCustomer();
        desktop.add(search);
        search.setVisible(true);
        
        
    }//GEN-LAST:event_searchCustomerActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void bookflightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookflightActionPerformed
        // TODO add your handling code here:
        bookTicket ticket = new bookTicket();
        desktop.add(ticket);
        ticket.setVisible(true);
    }//GEN-LAST:event_bookflightActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        getTicket ticket = new getTicket();
        desktop.add(ticket);
        ticket.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addFlight;
    private javax.swing.JMenu addadmin;
    private javax.swing.JMenu addflight;
    private javax.swing.JMenuItem bookflight;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem searchCustomer;
    private javax.swing.JMenuItem searchcustomer;
    private javax.swing.JMenu viewticket;
    // End of variables declaration//GEN-END:variables
}

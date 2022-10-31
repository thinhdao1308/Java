/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package balo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author hxt
 */
public class Balo1 extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    ArrayList<DoVat> ds = new ArrayList<>();
    ArrayList<DoVat> ds1 = new ArrayList<>();
    HashMap<Integer, DoVat> map = new HashMap<>();
    int chon = -1;

    public Balo1() {
        initComponents();
        ds.add(new DoVat(1, "Kim cuong", 0.02, 100000.0));
        ds.add(new DoVat(2, "Vang", 10.5, 1000.0));
        ds.add(new DoVat(3, "Binh co", 5.0, 15000.0));
        ds.add(new DoVat(4, "Bat co", 0.1, 100500.0));
        updTable();
        tbDoVat.setAutoCreateRowSorter(true);
    }

    public void updTable() {
        tbDoVat.setModel(new BangDoVat(ds));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane8 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tenDo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        khoiLuong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        giaTri = new javax.swing.JTextField();
        them = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        xoa = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbDoVat = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        klBalo = new javax.swing.JTextField();
        tinh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tk1 = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tbCoTheMang = new javax.swing.JScrollPane();
        tbMang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(2, 2));

        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        jLabel1.setText("Ten do vat");
        jPanel1.add(jLabel1);

        tenDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenDoActionPerformed(evt);
            }
        });
        jPanel1.add(tenDo);

        jLabel2.setText("Khoi luong");
        jPanel1.add(jLabel2);
        jPanel1.add(khoiLuong);

        jLabel3.setText("Gia tri");
        jPanel1.add(jLabel3);
        jPanel1.add(giaTri);

        them.setText("Them vat");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });
        jPanel1.add(them);

        jScrollPane4.setViewportView(jPanel1);

        getContentPane().add(jScrollPane4);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Danh sách Do Vat");
        jPanel2.add(jLabel4);

        xoa.setText("Xoa");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });
        jPanel2.add(xoa);

        jPanel3.add(jPanel2);

        tbDoVat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDoVat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDoVatMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tbDoVat);

        jPanel3.add(jScrollPane9);

        jScrollPane5.setViewportView(jPanel3);

        getContentPane().add(jScrollPane5);

        jLabel5.setText("Khoi luong ba lo co the mang");

        tinh.setText("Tinh toan");
        tinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhActionPerformed(evt);
            }
        });

        tk1.setEnabled(false);
        jScrollPane1.setViewportView(tk1);

        jLabel7.setText("Thong ke");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(klBalo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tinh))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(klBalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tinh))
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jScrollPane6.setViewportView(jPanel4);

        getContentPane().add(jScrollPane6);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Danh sach do vat co the mang");
        jPanel5.add(jLabel6);

        tbMang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbCoTheMang.setViewportView(tbMang);

        jPanel5.add(tbCoTheMang);

        jScrollPane7.setViewportView(jPanel5);

        getContentPane().add(jScrollPane7);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tenDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenDoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenDoActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
        DoVat moi = new DoVat();
        try {
            moi.setTen(tenDo.getText());
            int c = 0;
            try {
                if (moi.getTen().isBlank()) {
                    c = 1;
                    throw new Exception();

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        "Ten do vat trong",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            if (c == 0) {
                moi.setKlg(Double.parseDouble(khoiLuong.getText()));
                moi.setGiaTri(Double.parseDouble(giaTri.getText()));
                ds.add(moi);
                updTable();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Sai gia tri hoac khoi luong do vat",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_themActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
        if (chon != -1) {
//            System.out.println(chon);
            ds.remove(chon);
//            System.out.println(ds.size());
            updTable();
        }

    }//GEN-LAST:event_xoaActionPerformed

    private void tbDoVatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDoVatMouseClicked
        // TODO add your handling code here:
        chon = tbDoVat.getSelectedRow();
        if (chon != -1) {
            chon = tbDoVat.convertRowIndexToModel(chon);

        }
    }//GEN-LAST:event_tbDoVatMouseClicked
    

    double max(double a, double b, DoVat x) {
        if (a > b) {
            map.put(x.getId(), x);
        }
        return (a > b) ? a : b;
    }

    double knapSack(double W, ArrayList<DoVat> ds, int n) {
        if (n == 0 || W == 0)
            return 0;
 
        // If weight of the nth item is
        // more than Knapsack capacity W,
        // then this item cannot be included
        // in the optimal solution
        if (ds.get(n - 1).getKlg() > W)
            return knapSack(W, ds, n - 1);
 
        // Return the maximum of two cases:
        // (1) nth item included
        // (2) not included
        else
            return max(ds.get(n - 1).getGiaTri()
                       + knapSack(W - ds.get(n - 1).getKlg(), ds, n - 1),
                       knapSack(W, ds, n - 1), ds.get(n - 1));
    }

    private void tinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinhActionPerformed
        // TODO add your handling code here:
        Double klBalo;
        tbMang.removeAll();
        ds1.clear();
        map.clear();
        Comparator<DoVat> c = new Comparator<DoVat>() {
            @Override
            public int compare(DoVat o1, DoVat o2) {
                return o1.getKlg().compareTo(o2.getKlg());
            }
        };
        Collections.sort(ds, c);

        try {
            klBalo = Double.parseDouble(this.klBalo.getText());

//            ds1 = new ArrayList<>(ds);
            knapSack(klBalo, ds, ds.size());
            double tkl = 0, tgt = 0;
            
            for (Map.Entry<Integer, DoVat> entry : map.entrySet()) {
                
                DoVat val = entry.getValue();
                ds1.add(val);
                tkl += val.getKlg();
                tgt += val.getGiaTri();
                
            }
            tk1.setText(String.format("Tong khoi luong: %f\nTong gia tri: %f\nSo do vat: %d", tkl, tgt, ds1.size()));

            tbMang.setModel(new BangDoVat(ds1));

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Sai gia tri khoi luong balo",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_tinhActionPerformed

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
            java.util.logging.Logger.getLogger(Balo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Balo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Balo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Balo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Balo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField giaTri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField khoiLuong;
    private javax.swing.JTextField klBalo;
    private javax.swing.JScrollPane tbCoTheMang;
    private javax.swing.JTable tbDoVat;
    private javax.swing.JTable tbMang;
    private javax.swing.JTextField tenDo;
    private javax.swing.JButton them;
    private javax.swing.JButton tinh;
    private javax.swing.JTextPane tk1;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
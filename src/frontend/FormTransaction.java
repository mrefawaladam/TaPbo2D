/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author Berryl Radian
 */

import backend.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class FormTransaction extends javax.swing.JFrame {

    /**
     * Creates new form FormTransaksi
     */
    public FormTransaction() {
        initComponents();
        tampilkanData();
        kosongkanForm();
        tampilkanCmbCustomer();
        tampilkanCmbProduk();
        tampilkanCmbAdmin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransaction = new javax.swing.JTable();
        lblAdmin = new javax.swing.JLabel();
        lblProduk = new javax.swing.JLabel();
        txtIdTransaksi = new javax.swing.JTextField();
        lblTransaksi = new javax.swing.JLabel();
        lblTanggal = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        lblJumlah = new javax.swing.JLabel();
        txtTanggal = new javax.swing.JTextField();
        btnTambahBaru = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        lblIdTransaksi = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        cmbAdmin = new javax.swing.JComboBox<>();
        cmbProduk = new javax.swing.JComboBox<>();
        txtTotal = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        lblCustomer = new javax.swing.JLabel();
        cmbCustomer = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tblTransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTransactionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTransaction);

        lblAdmin.setText("Admin");

        lblProduk.setText("Produk");

        txtIdTransaksi.setEditable(false);

        lblTransaksi.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        lblTransaksi.setText("Manage Transaction");

        lblTanggal.setText("Tanggal");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        lblJumlah.setText("Jumlah");

        txtTanggal.setEditable(false);

        btnTambahBaru.setText("Tambah Baru");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        lblIdTransaksi.setText("ID Transaksi");

        cmbAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbProduk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtTotal.setEditable(false);

        lblTotal.setText("Total");

        lblCustomer.setText("Customer");

        cmbCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTransaksi)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdmin)
                            .addComponent(lblIdTransaksi)
                            .addComponent(lblProduk)
                            .addComponent(lblTanggal)
                            .addComponent(lblJumlah)
                            .addComponent(lblTotal)
                            .addComponent(lblCustomer))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTambahBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblTransaksi)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdTransaksi)
                    .addComponent(txtIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdmin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProduk))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTanggal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJumlah))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahBaru)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTransactionMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblTransaction.getModel();
        int row = tblTransaction.getSelectedRow();
        Transaction ts = new Transaction();
        
        ts = ts.getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        
        txtIdTransaksi.setText(String.valueOf(ts.getId_transaction()));
        cmbAdmin.getModel().setSelectedItem(ts.getAdmin());
        cmbProduk.getModel().setSelectedItem(ts.getProduct());
        cmbCustomer.getModel().setSelectedItem(ts.getCustomer());
        txtTanggal.setText(ts.getTanggal());
        txtJumlah.setText(String.valueOf(ts.getQty()));
        txtTotal.setText(String.valueOf(ts.getTotal()));
    }//GEN-LAST:event_tblTransactionMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
       String qty = txtJumlah.getText();
        
        if(!(qty.isEmpty())){
            Transaction ts = new Transaction();
            ts.setId_transaction(Integer.parseInt(txtIdTransaksi.getText()));
//            ts.setAdmin((Admin)cmbAdmin.getSelectedItem());
            ts.setProduct((Product)cmbProduk.getSelectedItem());
            ts.setCustomer((Customer)cmbCustomer.getSelectedItem());
            ts.setTanggal(txtTanggal.getText());
            ts.setQty(Integer.parseInt(qty));
            ts.save();
            
            tampilkanData();
        }else{
            JOptionPane.showMessageDialog(null, "Silahkan isi semua data!");
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        // TODO add your handling code here:
        kosongkanForm();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        Transaction ts = new Transaction();
        ts.setId_transaction(Integer.parseInt(txtIdTransaksi.getText()));
        boolean deleteSuccess = ts.delete();
        
        if(deleteSuccess){
            kosongkanForm();
            tampilkanData();
        }else{
            JOptionPane.showMessageDialog(null, "Perintah Gagal, ulangi lagi");
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

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
            java.util.logging.Logger.getLogger(FormTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JComboBox<String> cmbAdmin;
    private javax.swing.JComboBox<String> cmbCustomer;
    private javax.swing.JComboBox<String> cmbProduk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblIdTransaksi;
    private javax.swing.JLabel lblJumlah;
    private javax.swing.JLabel lblProduk;
    private javax.swing.JLabel lblTanggal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTransaksi;
    private javax.swing.JTable tblTransaction;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdTransaksi;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    public void kosongkanForm(){
        txtIdTransaksi.setText("0");
        cmbAdmin.setSelectedIndex(0);
        cmbProduk.setSelectedIndex(0);
        cmbCustomer.setSelectedIndex(0);
        txtTanggal.setText("");
        txtJumlah.setText("");
        txtTotal.setText("");
    }
    
    public void tampilkanData(){
        Admin sd = new Admin();
        System.out.println(sd.getId_admin());
        String[] kolom = {"id_transaksi", "Admin", "Produk", "Customer", "Tanggal", "Jumlah", "Total"};
        ArrayList<Transaction> list = new Transaction().getAll();
        Object rowData[] = new Object[7];
        
        tblTransaction.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for(int i = 0; i < list.size(); i++){
            rowData[0] = list.get(i).getId_transaction();
            rowData[1] = list.get(i).getAdmin().getNama_lengkap();
            rowData[2] = list.get(i).getProduct().getVersi();
            rowData[3] = list.get(i).getCustomer().getNama_lengkap();
            rowData[4] = list.get(i).getTanggal();
            rowData[5] = list.get(i).getQty();
            rowData[6] = list.get(i).getTotal();
            
            ((DefaultTableModel)tblTransaction.getModel()).addRow(rowData);
        }
    }
    
    public void cari(String keyword){
        String[] kolom = {"id_transaksi", "Admin", "Produk", "Customer", "Tanggal", "Jumlah", "Total"};
        ArrayList<Transaction> list = new Transaction().search(keyword);
        Object rowData[] = new Object[7];
        
        tblTransaction.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for(Transaction ts : list){
            rowData[0] = ts.getId_transaction();
            rowData[1] = ts.getAdmin().getNama_lengkap();
            rowData[2] = ts.getProduct().getVersi();
            rowData[3] = ts.getCustomer().getNama_lengkap();
            rowData[4] = ts.getTanggal();
            rowData[5] = ts.getQty();
            rowData[6] = ts.getTotal();
            
            ((DefaultTableModel)tblTransaction.getModel()).addRow(rowData);
        }
    }
    
    public void tampilkanCmbAdmin(){
        cmbAdmin.setModel(new DefaultComboBoxModel(new Admin().getAll().toArray()));
    }
    
    public void tampilkanCmbProduk(){
        cmbProduk.setModel(new DefaultComboBoxModel(new Product().getAll().toArray()));
    }
    
    public void tampilkanCmbCustomer(){
        cmbCustomer.setModel(new DefaultComboBoxModel(new Customer().getAll().toArray()));
    }
}

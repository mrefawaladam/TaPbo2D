/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author refa
 */
import backend.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class FormSuplier extends javax.swing.JFrame {

    /**
     * Creates new form FormSuplier
     */
    public FormSuplier() {
        initComponents();
        tampilkanData();
        kosongkanForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdPelanggan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        lblSupplier = new javax.swing.JLabel();
        lblIdSupplier = new javax.swing.JLabel();
        txtIdSupplier = new javax.swing.JTextField();
        lblNamaPerusahaan = new javax.swing.JLabel();
        txtNamaPerusahaan = new javax.swing.JTextField();
        lblAlamatPerusahaan = new javax.swing.JLabel();
        txtAlamatPerusahaan = new javax.swing.JTextField();
        lblContactPerson = new javax.swing.JLabel();
        txtContactPerson = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnTambahBaru = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();

        jLabel1.setText("ID Pelanggan");

        txtIdPelanggan.setEditable(false);

        jLabel3.setText("Username");

        jLabel5.setText("Alamat");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSupplier.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        lblSupplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSupplier.setText("Manage Supplier");

        lblIdSupplier.setText("ID Supplier");

        txtIdSupplier.setEditable(false);

        lblNamaPerusahaan.setText("Nama Perusahaan");

        lblAlamatPerusahaan.setText("Alamat Perusahaan");

        txtAlamatPerusahaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatPerusahaanActionPerformed(evt);
            }
        });

        lblContactPerson.setText("Contact Person");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

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

        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSupplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSupplier);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSupplier)
                .addGap(146, 146, 146))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNamaPerusahaan)
                    .addComponent(lblIdSupplier)
                    .addComponent(lblAlamatPerusahaan)
                    .addComponent(lblContactPerson))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAlamatPerusahaan)
                    .addComponent(txtIdSupplier)
                    .addComponent(txtNamaPerusahaan)
                    .addComponent(txtContactPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblSupplier)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdSupplier)
                    .addComponent(txtIdSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamaPerusahaan)
                    .addComponent(txtNamaPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlamatPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlamatPerusahaan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContactPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactPerson))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
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

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String nama_perusahaan = txtNamaPerusahaan.getText();
        String alamat_perusahaan = txtAlamatPerusahaan.getText();
        String contact_person = txtContactPerson.getText();
        
        if(!(nama_perusahaan.isEmpty()&& alamat_perusahaan.isEmpty() && contact_person.isEmpty())){
            Supplier spl = new Supplier();
            spl.setId_supplier(Integer.parseInt(txtIdSupplier.getText()));
            spl.setNama_perusahaan(nama_perusahaan);
            spl.setAlamat_perusahaan(alamat_perusahaan);
            spl.setContact_person(contact_person);
            spl.save();
            
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
        Supplier spl = new Supplier();
        spl.setId_supplier(Integer.parseInt(txtIdSupplier.getText()));
        boolean deleteSuccess = spl.delete();
        
        if(deleteSuccess){
            kosongkanForm();
            tampilkanData();
        }else{
            JOptionPane.showMessageDialog(null, "Terdapat data Produk pada Supplier tersebut");
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

    private void tblSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSupplierMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblSupplier.getModel();
        int row = tblSupplier.getSelectedRow();
        Supplier spl = new Supplier();
        
        spl = spl.getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        
        txtIdSupplier.setText(String.valueOf(spl.getId_supplier()));
        txtNamaPerusahaan.setText(spl.getNama_perusahaan());
        txtAlamatPerusahaan.setText(spl.getAlamat_perusahaan());
        txtContactPerson.setText(spl.getContact_person());
    }//GEN-LAST:event_tblSupplierMouseClicked

    private void txtAlamatPerusahaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatPerusahaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatPerusahaanActionPerformed

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
            java.util.logging.Logger.getLogger(FormSuplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSuplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSuplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSuplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSuplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlamatPerusahaan;
    private javax.swing.JLabel lblContactPerson;
    private javax.swing.JLabel lblIdSupplier;
    private javax.swing.JLabel lblNamaPerusahaan;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JTable tblSupplier;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtAlamatPerusahaan;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtContactPerson;
    private javax.swing.JTextField txtIUsername;
    private javax.swing.JTextField txtIdPelanggan;
    private javax.swing.JTextField txtIdSupplier;
    private javax.swing.JTextField txtNamaPerusahaan;
    // End of variables declaration//GEN-END:variables
    
    public void kosongkanForm(){
        txtIdSupplier.setText("0");
        txtNamaPerusahaan.setText("");
        txtAlamatPerusahaan.setText("");
        txtContactPerson.setText("");
    }
    
    public void tampilkanData(){
        String[] kolom = {"id_supplier", "nama_perusahaan", "alamat_perusahaan", "contact_person"};
        ArrayList<Supplier> list = new Supplier().getAll();
        Object rowData[] = new Object[4];
        
        tblSupplier.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for(int i = 0; i < list.size(); i++){
            rowData[0] = list.get(i).getId_supplier();
            rowData[1] = list.get(i).getNama_perusahaan();
            rowData[2] = list.get(i).getAlamat_perusahaan();
            rowData[3] = list.get(i).getContact_person();
            
            ((DefaultTableModel)tblSupplier.getModel()).addRow(rowData);
        }
    }
    
    public void cari(String keyword){
        String[] kolom = {"id_supplier", "nama_perusahaan", "alamat_perusahaan", "contact_person"};
        ArrayList<Supplier> list = new Supplier().search(keyword);
        Object rowData[] = new Object[4];
        
        tblSupplier.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for(Supplier spl : list){
            rowData[0] =  spl.getId_supplier();
            rowData[1] =  spl.getNama_perusahaan();
            rowData[2] =  spl.getAlamat_perusahaan();
            rowData[3] =  spl.getContact_person();
            
            ((DefaultTableModel)tblSupplier.getModel()).addRow(rowData);
        }
    }
}

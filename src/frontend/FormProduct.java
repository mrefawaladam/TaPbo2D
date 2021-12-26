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

public class FormProduct extends javax.swing.JFrame {

    /**
     * Creates new form Product
     */
    public FormProduct() {
        initComponents();
        tampilkanData();
        kosongkanForm();
        tampilkanCmbSupplier();
        tampilkanCmbBrand();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbBrand = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        txtRam = new javax.swing.JTextField();
        lblStorage = new javax.swing.JLabel();
        lblRam = new javax.swing.JLabel();
        txtVersi = new javax.swing.JTextField();
        btnTambahBaru = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        btnHapus = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        lblSupplier = new javax.swing.JLabel();
        btnCari = new javax.swing.JButton();
        lblBrand = new javax.swing.JLabel();
        lblIdProduk = new javax.swing.JLabel();
        txtIdProduk = new javax.swing.JTextField();
        txtStorage = new javax.swing.JTextField();
        lblTransaksi = new javax.swing.JLabel();
        cmbSupplier = new javax.swing.JComboBox<>();
        lblVersi = new javax.swing.JLabel();
        txtProcessor = new javax.swing.JTextField();
        lblProcessor = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        lblHarga = new javax.swing.JLabel();
        lblStok = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        lblStorage.setText("Storage");

        lblRam.setText("RAM");

        btnTambahBaru.setText("Tambah Baru");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduct);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        lblSupplier.setText("Supplier");

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        lblBrand.setText("Brand");

        lblIdProduk.setText("ID Produk");

        txtIdProduk.setEditable(false);

        lblTransaksi.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        lblTransaksi.setText("Manage Product");

        cmbSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblVersi.setText("Versi");

        lblProcessor.setText("Processor");

        lblHarga.setText("Harga");

        lblStok.setText("Stok");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
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
                                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSupplier)
                                    .addComponent(lblIdProduk)
                                    .addComponent(lblBrand)
                                    .addComponent(lblVersi)
                                    .addComponent(lblStorage)
                                    .addComponent(lblRam)
                                    .addComponent(lblProcessor)
                                    .addComponent(lblHarga)
                                    .addComponent(lblStok))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVersi, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStorage, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProcessor, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblTransaksi))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTransaksi)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdProduk)
                    .addComponent(txtIdProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSupplier))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBrand))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVersi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVersi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStorage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStorage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRam))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcessor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProcessor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHarga))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStok)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
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
        String versi = txtVersi.getText();
        String storage = txtStorage.getText();
        String ram = txtRam.getText();
        String processor = txtProcessor.getText();
        String harga = txtHarga.getText();
        String stok = txtStok.getText();
        
        if(!(versi.isEmpty() && storage.isEmpty() && ram.isEmpty() && processor.isEmpty() && harga.isEmpty() && stok.isEmpty())){
            Product pd = new Product();
            pd.setProductId(Integer.parseInt(txtIdProduk.getText()));
            pd.setSuplier((Supplier)cmbSupplier.getSelectedItem());
            pd.setBrand((Brand)cmbBrand.getSelectedItem());
            pd.setVersi(versi);
            pd.setStorage(Integer.parseInt(storage));
            pd.setRam(Integer.parseInt(ram));
            pd.setProcessor(processor);
            pd.setHarga(Integer.parseInt(harga));
            pd.setStok(Integer.parseInt(stok));
            pd.save();
            
            tampilkanData();
        }else{
            JOptionPane.showMessageDialog(null, "Silahkan isi semua data!");
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        // TODO add your handling code here:
        kosongkanForm();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblProduct.getModel();
        int row = tblProduct.getSelectedRow();
        Product pd = new Product();
        
        pd = pd.getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        
        txtIdProduk.setText(String.valueOf(pd.getProductId()));
        cmbSupplier.getModel().setSelectedItem(pd.getSuplier());
        cmbBrand.getModel().setSelectedItem(pd.getBrand());
        txtVersi.setText(pd.getVersi());
        txtStorage.setText(String.valueOf(pd.getStorage()));
        txtRam.setText(String.valueOf(pd.getRam()));
        txtProcessor.setText(pd.getProcessor());
        txtHarga.setText(String.valueOf(pd.getHarga()));
        txtStok.setText(String.valueOf(pd.getStok()));
    }//GEN-LAST:event_tblProductMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        Product pd = new Product();
        pd.setProductId(Integer.parseInt(txtIdProduk.getText()));
        boolean deleteSuccess = pd.delete();
        
        if(deleteSuccess){
            kosongkanForm();
            tampilkanData();
        }else{
            JOptionPane.showMessageDialog(null, "Terdapat data Transaksi pada Produk tersebut");
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
            java.util.logging.Logger.getLogger(FormProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JComboBox<String> cmbBrand;
    private javax.swing.JComboBox<String> cmbSupplier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblIdProduk;
    private javax.swing.JLabel lblProcessor;
    private javax.swing.JLabel lblRam;
    private javax.swing.JLabel lblStok;
    private javax.swing.JLabel lblStorage;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JLabel lblTransaksi;
    private javax.swing.JLabel lblVersi;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIdProduk;
    private javax.swing.JTextField txtProcessor;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtStorage;
    private javax.swing.JTextField txtVersi;
    // End of variables declaration//GEN-END:variables
    
    public void kosongkanForm(){
        txtIdProduk.setText("0");
        cmbSupplier.setSelectedIndex(0);
        cmbBrand.setSelectedIndex(0);
        txtVersi.setText("");
        txtStorage.setText("");
        txtRam.setText("");
        txtProcessor.setText("");
        txtHarga.setText("");
        txtStok.setText("");
    }
    
    public void tampilkanData(){
        String[] kolom = {"id_produk", "Supplier", "Brand", "Versi", "Storage", "RAM", "Processor", "Harga", "Stok"};
        ArrayList<Product> list = new Product().getAll();
        Object rowData[] = new Object[9];
        
        tblProduct.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for(int i = 0; i < list.size(); i++){
            rowData[0] = list.get(i).getProductId();
            rowData[1] = list.get(i).getSuplier().getNama_perusahaan();
            rowData[2] = list.get(i).getBrand().getNama_brand();
            rowData[3] = list.get(i).getVersi();
            rowData[4] = list.get(i).getStorage();
            rowData[5] = list.get(i).getRam();
            rowData[6] = list.get(i).getProcessor();
            rowData[7] = list.get(i).getHarga();
            rowData[8] = list.get(i).getStok();
            
            ((DefaultTableModel)tblProduct.getModel()).addRow(rowData);
        }
    }
    
    public void cari(String keyword){
        String[] kolom = {"id_produk", "Supplier", "Brand", "Versi", "Storage", "RAM", "Processor", "Harga", "Stok"};
        ArrayList<Product> list = new Product().search(keyword);
        Object rowData[] = new Object[9];
        
        tblProduct.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for(Product pd : list){
            rowData[0] = pd.getProductId();
            rowData[1] = pd.getSuplier().getNama_perusahaan();
            rowData[2] = pd.getBrand().getNama_brand();
            rowData[3] = pd.getVersi();
            rowData[4] = pd.getStorage();
            rowData[5] = pd.getRam();
            rowData[6] = pd.getProcessor();
            rowData[7] = pd.getHarga();
            rowData[8] = pd.getStok();
            
            ((DefaultTableModel)tblProduct.getModel()).addRow(rowData);
        }
    }
    
    public void tampilkanCmbBrand(){
        cmbBrand.setModel(new DefaultComboBoxModel(new Brand().getAll().toArray()));
    }
    
    public void tampilkanCmbSupplier(){
        cmbSupplier.setModel(new DefaultComboBoxModel(new Supplier().getAll().toArray()));
    }
}

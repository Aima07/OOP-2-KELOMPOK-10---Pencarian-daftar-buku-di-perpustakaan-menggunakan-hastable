/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookfinder;


import javax.swing.*;
import java.util.Hashtable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ihsanfrr
 */
public class HomeScreen extends javax.swing.JFrame {

    /**
     * Creates new form HomeScreen
     */
    public HomeScreen() {
        initComponents();
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
        txtSearch = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBuku = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Cari Buku");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        tableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "JUDUL", "PENGARANG", "PENERBIT", "RAK", "STOK"
            }
        ));
        jScrollPane1.setViewportView(tableBuku);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed
    Hashtable<Integer, Buku> hashtable = new Hashtable<>();
    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        String keyword = txtSearch.getText().trim();
        if(keyword.isEmpty()){
            JOptionPane.showMessageDialog(this, "Kata kunci tidak boleh kosong !.");
            return;
        }
        
        StringBuilder result = new StringBuilder();
        for (Integer key : hashtable.keySet()) {
            Buku buku = hashtable.get(key);
            if (buku.getIsbn().contains(keyword) ||
                buku.getJudul().toLowerCase().contains(keyword.toLowerCase()) ||
                buku.getPengarang().toLowerCase().contains(keyword.toLowerCase()) ||
                buku.getPenerbit().toLowerCase().contains(keyword.toLowerCase())) {
                result.append("ISBN: ").append(buku.getIsbn()).append("\n")
                      .append("Judul: ").append(buku.getJudul()).append("\n")
                      .append("Pengarang: ").append(buku.getPengarang()).append("\n")
                      .append("Penerbit: ").append(buku.getPenerbit()).append("\n")
                      .append("Rak: ").append(buku.getRak()).append("\n")
                      .append("Stok: ").append(buku.getStok()).append("\n\n");
            }
        }

        if (result.length() == 0) {
            JOptionPane.showMessageDialog(this, "Tidak ada hasil yang ditemukan.");
        } else {
            JOptionPane.showMessageDialog(this, result.toString());
        }
        
    }//GEN-LAST:event_btnCariActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        
        hashtable.put(1, new Buku("9780061120084", "The Alchemist", "Paulo Coelho", "HarperOne", "A1", 5));
        hashtable.put(2, new Buku("9780142437209", "To Kill a Mockingbird", "Harper Lee", "Harper Perennial", "B2", 3));
        hashtable.put(3, new Buku("9780544003415", "The Lord of the Rings", "J.R.R. Tolkien", "Mariner Books", "C3", 7));
        hashtable.put(4, new Buku("9780140283334", "1984", "George Orwell", "Signet Classics", "D4", 2));
        hashtable.put(5, new Buku("9780140449334", "Pride and Prejudice", "Jane Austen", "Penguin Classics", "E5", 4));
        hashtable.put(6, new Buku("9780679720201", "Norwegian Wood", "Haruki Murakami", "Vintage Books", "F6", 6));
        hashtable.put(7, new Buku("9780062315007", "The Great Gatsby", "F. Scott Fitzgerald", "Scribner", "A2", 1));
        hashtable.put(8, new Buku("9780060935467", "Beloved", "Toni Morrison", "Vintage", "B3", 8));
        hashtable.put(9, new Buku("9780743273565", "The Catcher in the Rye", "J.D. Salinger", "Little, Brown", "C4", 3));
        hashtable.put(10, new Buku("9780061120084", "The Alchemist", "Paulo Coelho", "HarperOne", "D5", 5));
        hashtable.put(11, new Buku("9780374530874", "The Road", "Cormac McCarthy", "Vintage", "E6", 2));
        hashtable.put(12, new Buku("9781400032716", "The Kite Runner", "Khaled Hosseini", "Riverhead Books", "F1", 6));
        hashtable.put(13, new Buku("9780385484510", "Slaughterhouse-Five", "Kurt Vonnegut", "Dial Press", "A3", 3));
        hashtable.put(14, new Buku("9780062073488", "The Bell Jar", "Sylvia Plath", "Harper Perennial", "B4", 7));
        hashtable.put(15, new Buku("9781400033416", "A Thousand Splendid Suns", "Khaled Hosseini", "Riverhead Books", "C5", 4));
        hashtable.put(16, new Buku("9780143105985", "The Picture of Dorian Gray", "Oscar Wilde", "Penguin Classics", "D6", 5));
        hashtable.put(17, new Buku("9780143039433", "One Hundred Years of Solitude", "Gabriel Garcia Marquez", "Harper Perennial", "E1", 9));
        hashtable.put(18, new Buku("9780062315007", "The Great Gatsby", "F. Scott Fitzgerald", "Scribner", "F2", 1));
        hashtable.put(19, new Buku("9781594480003", "The Road", "Cormac McCarthy", "Vintage", "A4", 4));
        hashtable.put(20, new Buku("9780446310789", "To Kill a Mockingbird", "Harper Lee", "Warner Books", "B5", 2));

        DefaultTableModel model = (DefaultTableModel) tableBuku.getModel();

        for (Integer key : hashtable.keySet()) {
            Buku buku = hashtable.get(key);
            Object[] rowData = {buku.getIsbn(), buku.getJudul(), buku.getPengarang(), buku.getPenerbit(), buku.getRak(), buku.getStok()};
            model.addRow(rowData);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
          // inisiasi data buku
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomeScreen homeScreen = new HomeScreen();
                homeScreen.setVisible(true);
              
                
            
            }
        });
        
        
       
        
        
                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBuku;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

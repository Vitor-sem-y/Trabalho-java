/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.PEPN_model;
import model.PEPN_tableModel;




public class FormPEPN extends javax.swing.JFrame {
    
    
    PEPN_tableModel tabelmodel = new PEPN_tableModel();
    
     String pathFile = "db.txt";
     String pathFileTemp = "dbTemp.txt";
     String readFile = "";
     
     List <PEPN_model> listRegistroMedico = new ArrayList<>();
     private final TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabelmodel);
    


    
    public FormPEPN() {
        initComponents();
        //Centralizando a janela
        this.setLocationRelativeTo(null);
        // Impede que a janela seja redimencionada 
        this.setResizable(false);
        // Trocando cursor para HAND CURSOR(Maozinha)
        // jButtonRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        // Variavel con recebendo a conexao
        //carregarTable(null);
    }
    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbcapital = new javax.swing.JLabel();
        txtCapital = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        lbcliente = new javax.swing.JLabel();
        lbendereco = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEndereco = new javax.swing.JTextArea();
        lbJuros = new javax.swing.JLabel();
        txtJuros = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTempo = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        lbtel = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbcapital.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbcapital.setText("Capital Inicial:");
        getContentPane().add(lbcapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapitalActionPerformed(evt);
            }
        });
        getContentPane().add(txtCapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 160, -1));

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 180, -1));

        lbcliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbcliente.setText("Cliente:");
        getContentPane().add(lbcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        lbendereco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbendereco.setText("Endereco:");
        getContentPane().add(lbendereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txtEndereco.setColumns(20);
        txtEndereco.setRows(5);
        jScrollPane2.setViewportView(txtEndereco);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 180, 60));

        lbJuros.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbJuros.setText("Juros:");
        getContentPane().add(lbJuros, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, 20));

        txtJuros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJurosActionPerformed(evt);
            }
        });
        txtJuros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJurosKeyTyped(evt);
            }
        });
        getContentPane().add(txtJuros, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 210, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Tempo a pagar (em dias):");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 230, -1));
        getContentPane().add(txtTempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 160, 20));

        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 90, 40));

        btnDeletar.setText("Deletar");
        btnDeletar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 90, 40));

        btnAtualizar.setText("Buscar");
        btnAtualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 90, 40));

        lbtel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbtel.setText("Tel:");
        getContentPane().add(lbtel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 160, -1));

        tbClientes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Capital Inicial", "Cliente", "Endereco", "Juros", "Tempo a pagar", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 690, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Programa de emprestimos para pessoas necessitadas.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 770, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJurosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJurosKeyTyped
        
    }//GEN-LAST:event_txtJurosKeyTyped

    private void txtJurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJurosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJurosActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        SalvarAtualizar();  

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:

        try {
            Deletar();
            limpardados();
            AtualizacaoDoRegistroMedico();
            btnDeletar.setEnabled(false);
            btnSalvar.setText("Salvar");
            dialog("Dado Deletado");
        } catch (IOException e) {
          //  JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        limpardados();
        btnDeletar.setEnabled(false);
        try {
            // btnSimpan.setText("Atualizar");
            AtualizacaoDoRegistroMedico();
            // TODO add your handling code here:
            // btnSimpan.setText("Atualizar");
        } catch (IOException ex) {
            Logger.getLogger(FormPEPN.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
    int click = tbClientes.rowAtPoint(evt.getPoint());
        txtCapital.setText(tbClientes.getModel().getValueAt(click, 0).toString().replace("ReM-", ""));
        txtCliente.setText((String) tbClientes.getModel().getValueAt(click, 1));
        txtEndereco.setText((String) tbClientes.getModel().getValueAt(click, 2));
        txtJuros.setText(tbClientes.getModel().getValueAt(click, 3).toString());
        txtTempo.setText((String) tbClientes.getModel().getValueAt(click, 4));
        txtTel.setText((String) tbClientes.getModel().getValueAt(click, 5));
        btnSalvar.setText("Salvar");
        btnDeletar.setEnabled(true);    
    // TODO add your handling code here:

    }//GEN-LAST:event_tbClientesMouseClicked

    private void txtCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapitalActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPEPN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbJuros;
    private javax.swing.JLabel lbcapital;
    private javax.swing.JLabel lbcliente;
    private javax.swing.JLabel lbendereco;
    private javax.swing.JLabel lbtel;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtCapital;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextArea txtEndereco;
    private javax.swing.JTextField txtJuros;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTempo;
    // End of variables declaration//GEN-END:variables

    
    private void limpardados(){
    
        txtCapital.setText("");
        txtCliente.setText("");
        txtEndereco.setText("");
        txtJuros.setText("");
        txtTempo.setText("");
        txtTel.setText("");
    
    }

private void mostrardados() {
        try {
            listRegistroMedico.clear();
            String readLine;
            File file = new File(pathFile);
            if (!file.exists()) {
                file.createNewFile();
            }
              
            BufferedReader bufReader;
            try (FileReader reader = new FileReader(file)) {
                bufReader = new BufferedReader(reader);
           
              while ((readLine = bufReader.readLine()) != null) {
                    if (readLine.equals("")) {
                        
                        continue;
                    }
                    System.out.println(readLine);
                    String[] splitData = readLine.split(";");
                    
                    
                    PEPN_model rm = new PEPN_model();
                    rm.setCapital(splitData[0]);
                    rm.setCliente(splitData[1]);
                    rm.setEndereco(splitData[2]);
                    rm.setJuros(splitData[3]);
                    rm.setTempo(splitData[4]);
                    rm.setTel(splitData[5]);
                    listRegistroMedico.add(rm);
                }
             
                tabelmodel.setList(listRegistroMedico);
                tbClientes.setModel(tabelmodel);
            }
            bufReader.close();
        } catch (IOException ex) {
            Logger.getLogger(FormPEPN.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

private void AtualizacaoDoRegistroMedico() throws IOException {
        String ID, record2;
        File db = new File(pathFile);
        File tempDB = new File(pathFileTemp);
        BufferedReader br2;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB))) {
            ID = "RM-"+txtCapital.getText();
            br2 = new BufferedReader(new FileReader(db));
            while ((record2 = br2.readLine()) != null) {
                if (record2.contains(ID)) {
                    bw.write("Négocio Ruim-"+txtCapital.getText()+";" + txtCliente.getText() + ";" + txtEndereco.getText() + ";" + txtJuros.getText() + ";" + txtTempo.getText() + ";" + txtTel.getText());
                } else {
                    bw.write(record2);
                }
                bw.flush();
                bw.newLine();
            }
        }
        br2.close();
        db.delete();
        tempDB.renameTo(db);
    }

private void SalvarAtualizar(){
        if (btnSalvar.getText().equals("Salvar")) {
            String save = "\n" + "RM-" + txtCapital.getText() + ";" + txtCliente.getText() + ";" + txtEndereco.getText() + ";" + txtJuros.getText() + ";" + txtTempo.getText() + ";" + txtTel.getText();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile, true))) {
                bw.write(save);
                bw.flush();
                bw.newLine();
                bw.close();
                limpardados();
                mostrardados();
                dialog("Dados salvos com sucesso");
            } catch (IOException e) {
            }
        } else {
            try {
                AtualizacaoDoRegistroMedico();
                limpardados();
                mostrardados();
                btnDeletar.setEnabled(false);
                btnSalvar.setText("Salvar");
                System.out.print("Olá mundo dos salvado");
            } catch (IOException e) {
            }
        }
    }
    
    
    private void mostrardos() {
        try {
        
            listRegistroMedico.clear();
        
            String readLine;
        
            File file = new File(pathFile);
        
            if (!file.exists()) {
        
                file.createNewFile();
        
            }
        
            BufferedReader bufReader;
        
            try (FileReader reader = new FileReader(file)) {
        
                bufReader = new BufferedReader(reader);
        
                while ((readLine = bufReader.readLine()) != null) {
        
                    if (readLine.equals("")) {
        
                        continue;
                    }
                    String[] splitData = readLine.split(";");
                    PEPN_model rm = new PEPN_model();
                    rm.setCapital(splitData[0]);
                    rm.setCliente(splitData[1]);
                    rm.setEndereco(splitData[2]);
                    rm.setJuros(splitData[3]);
                    rm.setTempo(splitData[4]);
                    rm.setTel(splitData[5]);
                    listRegistroMedico.add(rm);
                }
        
                tabelmodel.setList(listRegistroMedico);
        
                tbClientes.setModel(tabelmodel);
                
                bufReader.close();
        
            }
        
            
        
        } catch (IOException ex) {
        
            Logger.getLogger(FormPEPN.class.getName()).log(Level.SEVERE, null, ex);
        
        }

    }
    
    private void dialog(String text){
        JOptionPane.showMessageDialog(rootPane, text);
    }
    
    private void clear(){
        txtCapital.setText("");
        txtCliente.setText("");
        txtEndereco.setText("");
        txtJuros.setText("");
        txtTempo.setText("");
    }
    
    private void tampilData() {
        try {
            listRegistroMedico.clear();
            String readLine;
            File file = new File(pathFile);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufReader;
            try (FileReader reader = new FileReader(file)) {
                bufReader = new BufferedReader(reader);
                while ((readLine = bufReader.readLine()) != null) {
                    if (readLine.equals("")) {
                        continue;
                    }
                    String[] splitData = readLine.split(";");
                    PEPN_model rm = new PEPN_model();
                    rm.setCapital(splitData[0]);
                    rm.setCliente(splitData[1]);
                    rm.setEndereco(splitData[2]);
                    rm.setJuros(splitData[3]);
                    rm.setTempo(splitData[4]);
                    rm.setTel(splitData[5]);
                    listRegistroMedico.add(rm);
                }
                tabelmodel.setList(listRegistroMedico);
                tbClientes.setModel(tabelmodel);
            }
            bufReader.close();
        } catch (IOException ex) {
            Logger.getLogger(FormPEPN.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

private void Deletar() throws IOException {

        String ID, record;
        File tempDB = new File(pathFileTemp);
        File db = new File(pathFile);
        BufferedWriter bw;
        try (BufferedReader br = new BufferedReader(new FileReader(db))) {
            bw = new BufferedWriter(new FileWriter(tempDB));
            ID = "RM-"+txtCliente.getText();
            while ((record = br.readLine()) != null) {
                if (record.contains(ID)) {
                    continue;
                }
                bw.write(record);
                bw.flush();
                bw.newLine();
            }
        }
        bw.close();
        db.delete();
        tempDB.renameTo(db);
    }


}





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AddChild extends javax.swing.JFrame {
int ID;
AddNewRecord rec;
ViewALLDETAILS view;
public boolean isUpdate=false;


    /**
     * Creates new form AddChild
     * @param rec
     */
    public AddChild(AddNewRecord rec) {
        initComponents();
        this.rec=rec;
       
    }
    
     public AddChild(ViewALLDETAILS rec) {
        initComponents();
        this.view=rec;
    }
    public AddChild() {
        initComponents();
       
    }
    
    public  void setUpdate(){
     if (isUpdate==true) {
           jButton1.setText("Update");
        }
        else{
            jButton1.setText("Add");
          
        }
    
    
    }
    public  void setADD(){
     if (isUpdate==false) {
           jButton1.setText("Add");
        }
        else{
            jButton1.setText("Update");
          
        }
   
    }
    
    public  void loadChildDetails() throws ParseException {
    try {
        Date dateD;
        Connection c =DBConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        ps=c.prepareStatement("Select * from child where idChild like(?)");
        ps.setString(1,String.valueOf(ID));
        rs=ps.executeQuery();
        if (rs.next()) {
            ChildName.setText(rs.getString(2));
            if (rs.getString(3).equals("")) {
                dateD=null;
            }
            else{
            dateD = new SimpleDateFormat("MMMMMMM d, yyyy").parse(rs.getString(3));
            C_Bdate.setDate(dateD);
        }}
        
    } catch (SQLException ex) {
        System.out.println(ex);
    }
    
    
    
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
        jLabel57 = new javax.swing.JLabel();
        ChildName = new javax.swing.JTextField();
        C_Bdate = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Child");
        setBounds(new java.awt.Rectangle(528, 274, 0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel57.setText("*Name");

        ChildName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        C_Bdate.setDateFormatString("MMMMMMMMM d, yyyy");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/Create.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/Close.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("*Birth Date");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Chiild Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel57)
                                .addComponent(jLabel22))
                            .addGap(11, 11, 11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ChildName)
                                .addComponent(C_Bdate, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(ChildName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(C_Bdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.out.println(getBounds());
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if (isUpdate) {
            UpdateChild();
             if (this.rec!=null) {
                    this.rec.LoadChild();
                }
                
                if (this.view!=null) {
                 this.view.LoadChild();
                }
        }
        else{
         
        if (ChildName.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Empty Name");
        }else {
            
            try {
                
                AddChild();
                if (this.rec!=null) {
                    this.rec.LoadChild();
                }
                
                if (this.view!=null) {
                 this.view.LoadChild();
                }
              
            } catch (ParseException ex) {
                System.out.println(ex);
            }
}}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddChild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddChild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddChild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddChild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddChild().setVisible(true);
            }
        });
    }
      String dateBday;
    public void AddChild() throws ParseException{
    try {
        DBConnection.init();
        Connection c =DBConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        SimpleDateFormat df = new SimpleDateFormat("MMMMMMM d, yyyy");
        if (C_Bdate.getDate()==null) {
          dateBday = "";
//          dateBday = String.valueOf(df.format(C_Bdate.getDate()));
        }else{
        dateBday = String.valueOf(df.format(C_Bdate.getDate()));
        }
        
        //Date myDate=df.parse(dateBday);
       //System.out.println(dateBday);
        
        ps=c.prepareStatement("Insert into child (Name,Bdate,Father_ID)values"+"('"+this.ChildName.getText()+"','"+dateBday+"','"+ID+"')"); 
        ps.execute();
        JOptionPane.showMessageDialog(this,"Child Added");
        ChildName.setText("");
        C_Bdate.setDate(null);
        dispose();
    } catch (SQLException ex) {
        System.out.println(ex);
    }
    
    }
    
    
    
    public void UpdateChild(){
    
    try {
        DBConnection.init();
        Connection c =DBConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        
        SimpleDateFormat df = new SimpleDateFormat("MMMMMMM d, yyyy");
        if (C_Bdate.getDate()==null) {
            dateBday = "";
//          dateBday = String.valueOf(df.format(C_Bdate.getDate()));
        }else{
            dateBday = String.valueOf(df.format(C_Bdate.getDate()));
        }
        ps=c.prepareStatement("Update child set Name=(?),Bdate=(?) where idChild like(?)");
          ps.setString(1,ChildName.getText());
          ps.setString(2, dateBday);
          ps.setString(3, String.valueOf(ID));
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this,"Child Updated");
          ChildName.setText("");
          C_Bdate.setDate(null);
          dispose();
    } catch (SQLException ex) {
        System.out.println(ex);
    }
       
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JDateChooser C_Bdate;
    public javax.swing.JTextField ChildName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

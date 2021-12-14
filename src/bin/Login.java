/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin;

import static bin.MainForm.TEMPLATE_PROPERTY;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPTemplate;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Login extends javax.swing.JFrame {

    String User, pass;
    MainFrame main;
    public boolean ChangeUser = false, userlog = false, Verification = false;
    String status = "";
    Splash splash;
    MainForm mainForm;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        // onLoad();
        login.requestFocus();
        //loginBut.requestFocusInWindow();
        if (mainForm == null) {
            mainForm = new MainForm();
            //mainForm.setVisible(false);
            mainForm.onLoad();

        } else {
            mainForm.onLoad();

        }
    }

    public Login(MainFrame mainFrame) {
        initComponents();
        login.requestFocus();
        main = mainFrame;
        //loginBut.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        loginBut = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIN System Login");
        setBounds(new java.awt.Rectangle(550, 188, 0, 0));
        setMaximumSize(new java.awt.Dimension(305, 228));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Username:");

        login.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Password:");

        password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        loginBut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        loginBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/Accept.png"))); // NOI18N
        loginBut.setText("OK");
        loginBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/Cancel.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.setIconTextGap(3);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(loginBut, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(password)
                    .addComponent(login))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(loginBut))
                .addGap(27, 27, 27))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/login3.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "System shutdown.Do you want to continue?", "System Shutdown", JOptionPane.YES_NO_OPTION);
        if (i == 0) {

            if (userlog) {

                LogLOGUUT();
                System.exit(0);
            }
            System.out.println(getBounds());
            dispose();

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    @SuppressWarnings("deprecation")
    private void loginButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButActionPerformed
        // TODO add your handling code here:
        User = login.getText();
        pass = password.getText();
        // System.out.println(pass);
        if (!ChangeUser) {

            LoadNameOnlyData();

        } else {
            LoadNameOnlyData_ChangeUSER(main);

        }

    }//GEN-LAST:event_loginButActionPerformed

    @SuppressWarnings("deprecation")
    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
        User = login.getText();
        pass = password.getText();
        // System.out.println(pass);
        if (!ChangeUser) {
            LoadNameOnlyData();

        } else {
            LoadNameOnlyData_ChangeUSER(main);

        }
    }//GEN-LAST:event_passwordActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    VerificationForm verificationForm;
    public static String TEMPLATE_PROPERTY = "template";
    private DPFPTemplate template;

    public DPFPTemplate getTemplate() {
        return template;
    }

    public void setTemplate(DPFPTemplate template) {
        DPFPTemplate old = this.template;
        this.template = template;
        firePropertyChange(TEMPLATE_PROPERTY, old, template);
    }

    private void onLoad() {

        try {
            FileInputStream stream = new FileInputStream(System.getProperty("user.dir") + "\\lib\\credentials.fpt");
            byte[] data = new byte[stream.available()];
            stream.read(data);
            stream.close();
            DPFPTemplate t = DPFPGlobal.getTemplateFactory().createTemplate();
            t.deserialize(data);
            setTemplate(t);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getLocalizedMessage(), "Fingerprint loading", JOptionPane.ERROR_MESSAGE);

        }
    }

    public final void LoadNameOnlyData() {
        try {

            DBConnection.init();
            Connection c = DBConnection.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            String admin = "admin";
            ps = c.prepareStatement("Select * from  useracc");
            rs = ps.executeQuery();
            while (rs.next()) {

                if (rs.getString(5).equals(pass) && rs.getString(6).equals(User) && rs.getString(9).equals("admin")) {
                    System.out.println(System.getProperty("user.dir"));
                    mainForm.onVerify();
                    Verification = mainForm.getResult();
                    //verificationForm = null;
                    if (Verification) {
                        System.out.println("Admin login");
                        main = new MainFrame();
                        main.isUser = false;
                        main.mainForm = mainForm;
                        main.User.setText(login.getText());
                        main.UserId = Integer.parseInt(rs.getString("idUserAcc"));
                        main.setVisible(true);
                        LogLOGIN();
                        this.setVisible(false);
                        System.out.println("is mainform here?" + (mainForm == null));

                    } else {
                        System.out.println(mainForm.getResult());
                    }

                } else if (rs.getString(5).equals(pass) && rs.getString(6).equals(User) && rs.getString(9).equals("user")) {
                    System.out.println("User login");
                    String user = rs.getString("Fname") + rs.getString("Mname") + rs.getString("Lname") + "_" + rs.getString("Username");
                    System.out.println(user);
                    mainForm.onLoad_user(user);
                    mainForm.onVerify();

                    Verification = mainForm.getResult();

                    if (Verification) {

                        main = new MainFrame();
                        main.isUser = true;
                        main.mainForm = mainForm;
                        main.jButton1.setEnabled(false);
                        main.jButton6.setEnabled(true);
                        main.jButton7.setEnabled(false);
                        main.jMenuItem2.setEnabled(false);
                        // main.jMenuItem11.setEnabled(false);
                        //  main.jMenuItem5.setEnabled(false);
                        main.jMenu2.setVisible(false);
                        // main.op.jButton3.setEnabled(false);
                        // main.op.jButton1.setEnabled(false);
                        // main.jButton3.setEnabled(false);
                        //main.jMenuItem3.setEnabled(false);
                        main.User.setText(login.getText());
                        main.setVisible(true);
                        LogLOGIN();
                        dispose();

                    }
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public final void LoadNameOnlyData_ChangeUSER(MainFrame main) {
        try {
            System.out.println("Change USer");
            DBConnection.init();
            Connection c = DBConnection.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            String admin = "admin";
            ps = c.prepareStatement("Select * from  useracc");
            rs = ps.executeQuery();
            while (rs.next()) {

                if (rs.getString(5).equals(pass) && rs.getString(6).equals(User) && rs.getString(9).equals("admin")) {
                    System.out.println("Admin login");

                    // main=new MainFrame();
                    main.mainForm.onLoad();
                    main.mainForm.onVerify();
                    Verification = main.mainForm.getResult();
                    //verificationForm = null;
                    if (Verification) {
                        main.isUser = false;
                        main.User.setText(login.getText());
                        main.jButton1.setEnabled(true);
                        main.jButton6.setEnabled(true);
                        main.jButton7.setEnabled(true);
                        main.jMenuItem2.setEnabled(true);
//            main.jMenuItem5.setEnabled(true);
                        main.jMenu2.setVisible(true);
                        LogLOGIN();
                        main.setVisible(true);
                        main.setEnabled(true);
                        login.setText(null);
                        password.setText(null);

                        dispose();
                    }
                } else if (rs.getString(5).equals(pass) && rs.getString(6).equals(User) && rs.getString(9).equals("user")) {
                    System.out.println("User login");

                    // main=new MainFrame();
                    String user = rs.getString("Fname") + rs.getString("Mname") + rs.getString("Lname") + "_" + rs.getString("Username");
                    System.out.println(user);
                    main.mainForm.onLoad_user(user);
                    main.mainForm.onVerify();

                    Verification = main.mainForm.getResult();

                    if (Verification) {
                        main.isUser = true;
                        main.jButton1.setEnabled(false);
                        main.jButton6.setEnabled(true);
                        main.jButton7.setEnabled(false);
                        main.jMenuItem2.setEnabled(false);
                        // main.jMenuItem11.setEnabled(false);
                        // main.jMenuItem5.setEnabled(false);
                        // main.op.jButton3.setEnabled(false);
                        //main.op.jButton1.setEnabled(false);
                        main.jMenu2.setVisible(false);
                        // main.jButton3.setEnabled(false);
                        LogLOGIN();
                        //main.jMenuItem3.setEnabled(false);
                        main.User.setText(login.getText());
                        main.setEnabled(true);
                        login.setText(null);
                        password.setText(null);
                        main.setVisible(true);

                        dispose();
                    }
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void LogLOGIN() {
        try {
            Calendar cal = Calendar.getInstance();
            String Time, Date;
            SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/d");
            SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
            Date = date.format(cal.getTime());
            Time = time.format(cal.getTime());

            DBConnection.init();
            Connection c = DBConnection.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            //ps=c.prepareStatement("Insert into informant_info (F_Name,M_Name,L_Name,B_Date,Age,Nationality,Religion,Mar_status,Education,Alias,Place_Birth,P_Adrress,Per_Adrress,Zipcode,S_Codification,Status,B_PAdrress,B_PreAdress,SpouseName,Gender,PictureFilePath,EntryTime,EntryDate,D_Recuitment,Provice,Mun_City,BirthCounty,E_Date,E_Time,Mode_Con,Mob_no,Email,P_Con,P_Con_num)values"+"('"+this.f_name.getText()+"','"+this.M_Name.getText()+"','"+this.Lname.getText()+"','"+dateString+"','"+this.age.getText()+"','"+this.nationalilty.getText()+"','"+this.religion.getText()+"','"+this.cb_maritals_status.getSelectedItem().toString()+"','"+this.education.getText()+"','"+this.alias.getText()+"','"+this.place_birth.getText()+"','"+this.presentADD.getText()+"','"+this.PermaentADD.getText()+"','"+this.ZipCode.getText()+"','"+this.S_Codification.getText()+"','"+this.Status_Codification.getSelectedItem().toString()+"','"+this.P_Barangay.getSelectedItem().toString()+"','"+this.Permanet_Barangay.getSelectedItem().toString()+"','"+this.Spouse.getText()+"','"+this.CBgender.getSelectedItem().toString()+"','"+imagePath+"','"+Time+"','"+Date+"','"+dateRec+"','"+Province.getText()+"','"+CbCityMun.getSelectedItem().toString()+"','"+BirthCountry.getText()+"','"+Date+"','"+Time+"','"+Mode_Contanct.getText()+"','"+Mobile_Num.getText()+"','"+Email.getText()+"','"+ContactPersonm.getText()+"','"+Mobile_Num.getText()+"')");
            ps = c.prepareStatement("Insert into logs(Act,Time,Date)values" + "('Login " + login.getText() + "','" + Time + "','" + Date + "')");
            ps.execute();
            // ps=c.prepareStatement("Select * from  informant_info");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void LogLOGUUT() {
        try {
            Calendar cal = Calendar.getInstance();
            String Time, Date;
            SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/d");
            SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
            Date = date.format(cal.getTime());
            Time = time.format(cal.getTime());

            DBConnection.init();
            Connection c = DBConnection.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            //ps=c.prepareStatement("Insert into informant_info (F_Name,M_Name,L_Name,B_Date,Age,Nationality,Religion,Mar_status,Education,Alias,Place_Birth,P_Adrress,Per_Adrress,Zipcode,S_Codification,Status,B_PAdrress,B_PreAdress,SpouseName,Gender,PictureFilePath,EntryTime,EntryDate,D_Recuitment,Provice,Mun_City,BirthCounty,E_Date,E_Time,Mode_Con,Mob_no,Email,P_Con,P_Con_num)values"+"('"+this.f_name.getText()+"','"+this.M_Name.getText()+"','"+this.Lname.getText()+"','"+dateString+"','"+this.age.getText()+"','"+this.nationalilty.getText()+"','"+this.religion.getText()+"','"+this.cb_maritals_status.getSelectedItem().toString()+"','"+this.education.getText()+"','"+this.alias.getText()+"','"+this.place_birth.getText()+"','"+this.presentADD.getText()+"','"+this.PermaentADD.getText()+"','"+this.ZipCode.getText()+"','"+this.S_Codification.getText()+"','"+this.Status_Codification.getSelectedItem().toString()+"','"+this.P_Barangay.getSelectedItem().toString()+"','"+this.Permanet_Barangay.getSelectedItem().toString()+"','"+this.Spouse.getText()+"','"+this.CBgender.getSelectedItem().toString()+"','"+imagePath+"','"+Time+"','"+Date+"','"+dateRec+"','"+Province.getText()+"','"+CbCityMun.getSelectedItem().toString()+"','"+BirthCountry.getText()+"','"+Date+"','"+Time+"','"+Mode_Contanct.getText()+"','"+Mobile_Num.getText()+"','"+Email.getText()+"','"+ContactPersonm.getText()+"','"+Mobile_Num.getText()+"')");
            ps = c.prepareStatement("Insert into logs(Act,Time,Date)values" + "('System Closed','" + Time + "','" + Date + "')");
            ps.execute();

            System.out.println("");
            // ps=c.prepareStatement("Select * from  informant_info");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField login;
    private javax.swing.JButton loginBut;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.InternalFrameUI;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MainFrame extends javax.swing.JFrame {

    AddNewRecord add;
    Records rec;
    Users user;
    Statictics stat;
    Sample sam;
    Opis op;
    Users users;
    Login log;
    public boolean isUser;
    String Status = "";
    logs logges;
    Legacy legacy;
    Legacy_Final legacy_Final;
    AdminUpdate adminUpdate;
    int UserId;

    /**
     * Creates new form Main
     */
    public MainFrame() {
        initComponents();
        RefreshTime();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Barangay Intelligence Network Information System");
        setBackground(new java.awt.Color(51, 51, 51));
        setBounds(new java.awt.Rectangle(130, 20, 0, 0));
        setIconImages(null);
        setResizable(false);

        jToolBar1.setRollover(true);
        jToolBar1.setToolTipText("Staticstis");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/mps3.png"))); // NOI18N
        jButton6.setToolTipText(" Sulop MPS Barangay Intelligence Network");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/new informant.png"))); // NOI18N
        jButton1.setToolTipText("New Informant");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/search.png"))); // NOI18N
        jButton2.setToolTipText("Search Records");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/stat.png"))); // NOI18N
        jButton5.setToolTipText("Staticstics");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/users.png"))); // NOI18N
        jButton7.setToolTipText("User Accounts");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/abount.png"))); // NOI18N
        jButton4.setToolTipText("About");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(1166, 566));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(1166, 566));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/mainframe3.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, Short.MAX_VALUE)
        );

        Date.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        Time.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("User:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        User.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        User.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/Logout.png"))); // NOI18N
        jMenuItem9.setText("Log Out");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/Sync.png"))); // NOI18N
        jMenuItem10.setText("Activity Log");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/Close.png"))); // NOI18N
        jMenuItem8.setText("Exit");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Information");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/mps3.png"))); // NOI18N
        jMenuItem7.setText("Office Information");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/new informant.png"))); // NOI18N
        jMenuItem2.setText("New Informant");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/search.png"))); // NOI18N
        jMenuItem3.setText("Search Records");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/stat.png"))); // NOI18N
        jMenuItem6.setText("BIN Staticstics");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/About.png"))); // NOI18N
        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Settings");

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/users.png"))); // NOI18N
        jMenuItem11.setText("User Accounts");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin/images/Settings.png"))); // NOI18N
        jMenuItem12.setText("Administrator ");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1158, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(User, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void dispose() {
        System.out.println("exit");

        int i = JOptionPane.showConfirmDialog(this, "System close. Do you want to continue?", "System close", JOptionPane.YES_NO_OPTION);
        System.out.println(i);
        if (i == 0) {
            // JOptionPane.showMessageDialog(this,"System Closing......");
            Status = "System Close";
            LogLOGUUT();
            System.exit(0);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            if (legacy_Final == null || legacy_Final.isClosed()) {
                legacy_Final = new Legacy_Final();
                jDesktopPane1.add(legacy_Final);
            }
            if (isUser) {
                legacy_Final.isUser = true;
            }

            //  legacy.setBounds(2,50,0,0);
            legacy_Final.setMaximum(true);
            // legacy_Final.setClosable(true);
            legacy_Final.setVisible(true);
        } catch (PropertyVetoException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if (rec == null || rec.isClosed()) {
                rec = new Records();
                rec.UserID = UserId;
                jDesktopPane1.add(rec);
            }
            if (isUser) {
                rec.isUser = true;
            }

            rec.setMaximum(true);
            rec.Search.requestFocus();
            rec.setVisible(true);
        } catch (PropertyVetoException | ParseException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            if (legacy_Final == null || legacy_Final.isClosed()) {
                legacy_Final = new Legacy_Final();
                jDesktopPane1.add(legacy_Final);
            }
            if (isUser) {
                legacy_Final.isUser = true;
            }

            //  legacy.setBounds(2,50,0,0);
            legacy_Final.setMaximum(true);
            // legacy_Final.setClosable(true);
            legacy_Final.setVisible(true);
        } catch (PropertyVetoException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        try {
            if (rec == null || rec.isClosed()) {
                rec = new Records();
                jDesktopPane1.add(rec);
            }
            if (isUser) {
                rec.isUser = true;
            }

            rec.setMaximum(true);
            rec.Search.requestFocus();
            rec.setVisible(true);
        } catch (PropertyVetoException ex) {
            System.out.println(ex);
        } catch (ParseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:

        if (stat == null) {
            stat = new Statictics();
        }
        stat.isUser = isUser;
        stat.LoadNameToUPDATE_INFOMANT_NUMBER(stat.LoadNames());
        stat.LoadNameOnlyData();
        stat.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    About about;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (about == null) {
            about = new About();

        }
        about.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (stat == null) {
            stat = new Statictics();
        }
        stat.isUser = isUser;
        stat.LoadNameToUPDATE_INFOMANT_NUMBER(stat.LoadNames());
        stat.LoadNameOnlyData();
        stat.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (op == null) {
            op = new Opis();
        }

        if (isUser) {
            op.jButton3.setEnabled(false);
        } else {
            op.jButton3.setEnabled(true);
        }
        op.Loaddata();
        op.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if (user == null) {
            user = new Users();
            user.mainForm = mainForm;
        }
        user.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        if (op == null) {
            op = new Opis();
        }

        if (isUser) {
            op.jButton3.setEnabled(false);
        } else {
            op.jButton3.setEnabled(true);
        }

        if (op.isVisible()) {
            System.out.println(op.isVisible());
            op.setVisible(false);
        } else {
            System.out.println(op.isVisible());
            op.Loaddata();
            op.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        if (about == null) {
            about = new About();

        }
        about.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        if (log == null) {
            log = new Login(this);
        }
        // int i=JOptionPane.showConfirmDialog(this,"User log out. Do you want to continue?");
        int i = JOptionPane.showConfirmDialog(this, "User logout, all unsaved work will be closed. Do you want to continue?", "Logout", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            LogLOGUUT();

            if (add != null) {
                add.ClearField();
                add.dispose();
            }
            if (legacy_Final != null) {
                legacy_Final.dispose();
            }
            if (about != null) {
                about.dispose();
            }

            if (rec != null) {
                if (rec.view != null) {
                    rec.view.dispose();
                }
                if (rec.iaps != null) {
                    rec.iaps.dispose();

                }
                if (rec.sdcsds != null) {
                    rec.sdcsds.dispose();

                }
                if (rec.leg_up != null) {
                    rec.leg_up.dispose();
                }
                rec.dispose();
            }

            if (stat != null) {
                if (stat.barangayDetails != null) {
                    if (stat.barangayDetails.iaps != null) {
                        stat.barangayDetails.iaps.dispose();
                    }
                    if (stat.barangayDetails.sdcsds != null) {
                        stat.barangayDetails.sdcsds.dispose();
                    }
                    if (stat.barangayDetails.view != null) {
                        stat.barangayDetails.view.dispose();
                    }
                    stat.barangayDetails.dispose();
                }
                stat.dispose();

            }
            if (user != null) {

                user.dispose();
            }
            if (op != null) {
                op.dispose();
            }

            if (adminUpdate != null) {
                adminUpdate.dispose();
                adminUpdate.adminpass.dispose();

            }

            log.setVisible(true);
            log.ChangeUser = true;
            setEnabled(false);
            log.userlog = true;
        }
        if (logges != null) {
            logges.dispose();
        }

    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu1ActionPerformed

    public void LogLOGUUT() {
        try {
            Calendar cal = Calendar.getInstance();
            String Time, Date;
            SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/d");
            SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
            Date = date.format(cal.getTime());
            Time = time.format(cal.getTime());

            DBConnection.init();
            Connection c = DBConnection.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            //ps=c.prepareStatement("Insert into informant_info (F_Name,M_Name,L_Name,B_Date,Age,Nationality,Religion,Mar_status,Education,Alias,Place_Birth,P_Adrress,Per_Adrress,Zipcode,S_Codification,Status,B_PAdrress,B_PreAdress,SpouseName,Gender,PictureFilePath,EntryTime,EntryDate,D_Recuitment,Provice,Mun_City,BirthCounty,E_Date,E_Time,Mode_Con,Mob_no,Email,P_Con,P_Con_num)values"+"('"+this.f_name.getText()+"','"+this.M_Name.getText()+"','"+this.Lname.getText()+"','"+dateString+"','"+this.age.getText()+"','"+this.nationalilty.getText()+"','"+this.religion.getText()+"','"+this.cb_maritals_status.getSelectedItem().toString()+"','"+this.education.getText()+"','"+this.alias.getText()+"','"+this.place_birth.getText()+"','"+this.presentADD.getText()+"','"+this.PermaentADD.getText()+"','"+this.ZipCode.getText()+"','"+this.S_Codification.getText()+"','"+this.Status_Codification.getSelectedItem().toString()+"','"+this.P_Barangay.getSelectedItem().toString()+"','"+this.Permanet_Barangay.getSelectedItem().toString()+"','"+this.Spouse.getText()+"','"+this.CBgender.getSelectedItem().toString()+"','"+imagePath+"','"+Time+"','"+Date+"','"+dateRec+"','"+Province.getText()+"','"+CbCityMun.getSelectedItem().toString()+"','"+BirthCountry.getText()+"','"+Date+"','"+Time+"','"+Mode_Contanct.getText()+"','"+Mobile_Num.getText()+"','"+Email.getText()+"','"+ContactPersonm.getText()+"','"+Mobile_Num.getText()+"')");
            ps = c.prepareStatement("Insert into logs(Act,Time,Date)values" + "('Logout " + User.getText() + Status + "','" + Time + "','" + Date + "')");
            ps.execute();
            // ps=c.prepareStatement("Select * from  informant_info");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "System Close. Do you want to continue?", "System Close", JOptionPane.YES_NO_OPTION);

        if (i == 0) {
            JOptionPane.showMessageDialog(this, "Thank you for using BINIS");

            System.exit(0);

        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        if (logges == null || logges.isClosed()) {
            logges = new logs();
            jDesktopPane1.add(logges);
            logges.setClosable(true);

        }
        logges.setVisible(true);

    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        if (users == null) {
            users = new Users();
            user.mainForm = mainForm;
        }
        users.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed
    MainForm mainForm;
    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        //System.out.println("is mainform log here?" + (log == null));
        // log.mainForm.onVerify();

        System.out.println("is mainform here?" + (mainForm == null));
        //mainForm.onVerify();
        if (adminUpdate == null) {
            adminUpdate = new AdminUpdate();
            adminUpdate.mainForm = mainForm;

        }
        adminUpdate.LoadAdminprofile();
        adminUpdate.mainForm = mainForm;
        // mainForm = null;
        adminUpdate.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public void DateandTime() {
        Calendar cal = Calendar.getInstance();
        cal.getTime();
        SimpleDateFormat date = new SimpleDateFormat("MMMM dd, yyyy");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        this.Date.setText(date.format(cal.getTime()));
        Time.setText(time.format(cal.getTime()));
    }

    public void RefreshTime() {
        TimerTask TT = new TimerTask() {
            @Override
            public void run() {
                DateandTime();
            }
        };

        Timer t = new Timer();
        t.scheduleAtFixedRate(TT, 1000, 1000);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Time;
    public javax.swing.JLabel User;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    public javax.swing.JMenuItem jMenuItem2;
    public javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}

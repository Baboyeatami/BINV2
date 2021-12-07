package bin;

import java.io.*;
import java.beans.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.digitalpersona.onetouch.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainForm extends JFrame {

    public static String TEMPLATE_PROPERTY = "template";
    private DPFPTemplate template;
    boolean updatedAdmin, Template_status = false;

    public class TemplateFileFilter extends javax.swing.filechooser.FileFilter {

        @Override
        public boolean accept(File f) {
            return f.getName().endsWith(".fpt");
        }

        @Override
        public String getDescription() {
            return "Fingerprint Template File (*.fpt)";
        }
    }

    MainForm() {
        setState(Frame.NORMAL);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Fingerprint Enrollment and Verification Sample");
        setResizable(false);

        final JButton enroll = new JButton("Fingerprint Enrollment");
        enroll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onEnroll();
            }
        });

        final JButton verify = new JButton("Fingerprint Verification");
        verify.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onVerify();
            }
        });

        final JButton save = new JButton("Save Fingerprint Template");
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onSave();
            }
        });

        final JButton load = new JButton("Read Fingerprint Template");
        load.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onLoad();
            }
        });

        final JButton quit = new JButton("Close");
        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.addPropertyChangeListener(TEMPLATE_PROPERTY, new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                verify.setEnabled(template != null);
                save.setEnabled(template != null);
                if (evt.getNewValue() == evt.getOldValue()) {
                    return;
                }
                if (template != null) {
                    // JOptionPane.showMessageDialog(MainForm.this, "The fingerprint template is ready for fingerprint verification.", "Fingerprint Enrollment", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(4, 1, 0, 5));
        center.setBorder(BorderFactory.createEmptyBorder(20, 20, 5, 20));
        center.add(enroll);
        center.add(verify);
        center.add(save);
        center.add(load);

        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        bottom.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 20));
        bottom.add(quit);

        setLayout(new BorderLayout());
        add(center, BorderLayout.CENTER);
        add(bottom, BorderLayout.PAGE_END);

        pack();
        setSize((int) (getSize().width * 1.6), getSize().height);
        setLocationRelativeTo(null);
        setTemplate(null);
        //setVisible(true);
    }

    public void onEnroll() {
        EnrollmentForm form = new EnrollmentForm(this);
        form.setVisible(true);

        if (updatedAdmin) {
            onSave();
            updatedAdmin = false;
        }
    }

    public void onVerify() {
        VerificationForm form = new VerificationForm(this);
        form.mainform = this;
        form.setVisible(true);

    }

    public void onVerify_String(String user) {
        VerificationForm form = new VerificationForm(this);
        form.mainform = this;
        form.setVisible(true);

    }

    void onSave() {

        try {

            if (Files.exists(Paths.get(System.getProperty("user.dir") + "\\lib\\credentials.fpt"))) {

                FileOutputStream stream = new FileOutputStream(System.getProperty("user.dir") + "\\lib\\credentials.fpt");
                stream.write(getTemplate().serialize());
                stream.close();
                System.out.println("fingerPrint saved");
                JOptionPane.showMessageDialog(this, "Biometric Credentials Updated!");
            } else if (!Files.exists(Paths.get(System.getProperty("user.dir") + "\\lib\\credentials.fpt"))) {

                FileOutputStream stream = new FileOutputStream(System.getProperty("user.dir") + "\\lib\\credentials.fpt");
                stream.write(getTemplate().serialize());
                stream.close();
                System.out.println("fingerPrint saved");
                JOptionPane.showMessageDialog(this, "Biometric Credentials Saved!");
            }

        } catch (IOException ex) {
            Logger.getLogger(adminPass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void UserOnSave(String name) {

        try {

            if (Files.exists(Paths.get(System.getProperty("user.dir") + "\\lib\\verification\\" + name + ".fpt"))) {

                FileOutputStream stream = new FileOutputStream(System.getProperty("user.dir") + "\\lib\\verification\\" + name + ".fpt");
                stream.write(getTemplate().serialize());
                stream.close();
                System.out.println("fingerPrint updated user");
                JOptionPane.showMessageDialog(this, "Biometric Credentials Updated!", "User Biometics", JOptionPane.INFORMATION_MESSAGE);
            } else if (!Files.exists(Paths.get(System.getProperty("user.dir") + "\\lib\\verification\\" + name + ".fpt"))) {

                FileOutputStream stream = new FileOutputStream(System.getProperty("user.dir") + "\\lib\\verification\\" + name + ".fpt");
                stream.write(getTemplate().serialize());
                stream.close();
                System.out.println("fingerPrint saved user ");
                JOptionPane.showMessageDialog(this, "Biometric Credentials Saved!", "User Biometics", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (IOException ex) {
            Logger.getLogger(adminPass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    boolean result = false;

    public void setResult(boolean res) {
        this.result = res;
    }

    public boolean getResult() {
        return this.result;
    }

    void onLoad() {
        try {
            if (Files.exists(Paths.get(System.getProperty("user.dir") + "\\lib\\credentials.fpt"))) {

                FileInputStream stream = new FileInputStream(System.getProperty("user.dir") + "\\lib\\credentials.fpt");
                byte[] data = new byte[stream.available()];
                stream.read(data);
                stream.close();
                DPFPTemplate t = DPFPGlobal.getTemplateFactory().createTemplate();
                t.deserialize(data);
                setTemplate(t);
                System.out.println("Templete Loaded on administrator");
            } else {
                updatedAdmin = true;
                onEnroll();
                onSave();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getLocalizedMessage(), "Fingerprint loading", JOptionPane.ERROR_MESSAGE);

        }
    }

    void onLoad_user(String user) {
        try {
            if (Files.exists(Paths.get(System.getProperty("user.dir") + "\\lib\\verification\\" + user + ".fpt"))) {
                System.out.println("User to Load " + user);
                FileInputStream stream = new FileInputStream(System.getProperty("user.dir") + "\\lib\\verification\\" + user + ".fpt");
                byte[] data = new byte[stream.available()];
                stream.read(data);
                stream.close();
                DPFPTemplate t = DPFPGlobal.getTemplateFactory().createTemplate();
                t.deserialize(data);
                setTemplate(t);
                System.out.println("Templete Loaded " + user);

            } else {
                System.out.println("User to Load " + user);
                System.out.println("No Biometric Data Exist for this login Credentials ");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getLocalizedMessage(), "Fingerprint loading", JOptionPane.ERROR_MESSAGE);

        }
    }

    public DPFPTemplate getTemplate() {
        return template;
    }

    public void setTemplate(DPFPTemplate template) {
        DPFPTemplate old = this.template;
        this.template = template;
        if (template != null) {
            Template_status = true;
        }

        firePropertyChange(TEMPLATE_PROPERTY, old, template);
    }

    boolean get_template_status() {
        return Template_status;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainForm();
            }
        });
    }

}

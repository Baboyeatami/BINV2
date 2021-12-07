package bin;

import com.digitalpersona.onetouch.*;
import com.digitalpersona.onetouch.verification.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class VerificationForm extends CaptureForm {

    private DPFPVerification verificator = DPFPGlobal.getVerificationFactory().createVerification();
    private boolean result;
    MainForm mainform;

    VerificationForm(Frame owner) {
        super(owner);
    }

    @Override
    protected void init() {
        super.init();
        this.setTitle("Fingerprint verification");
        updateStatus(0);
        setBounds(857, 169, 612, 396);
    }

    @Override
    protected void process(DPFPSample sample) {
        super.process(sample);

        // Process the sample and create a feature set for the enrollment purpose.
        DPFPFeatureSet features = extractFeatures(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);

        // Check quality of the sample and start verification if it's good
        if (features != null) {
            // Compare the feature set with our template
            DPFPVerificationResult result
                    = verificator.verify(features, ((MainForm) getOwner()).getTemplate());
            updateStatus(result.getFalseAcceptRate());
            if (result.isVerified()) {

                makeReport("The fingerprint was VERIFIED.");
                this.result = true;
                mainform.result = true;
                this.result = false;
                this.setVisible(false);

                //JOptionPane.showMessageDialog(this, "Biometric Credentials Accepted!...");
            } else {
                makeReport("The fingerprint was NOT VERIFIED.");
                this.result = false;
                JOptionPane.showMessageDialog(this, "Biometric Credentials not Accepted....", "No valid credentials", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    boolean getResult() {
        return this.result;
    }

    private void updateStatus(int FAR) {
        // Show "False accept rate" value
        setStatus("Sulop MPS BINIS Finger Print Reader");
    }

}

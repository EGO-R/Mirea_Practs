package Pract22;
import javax.swing.*;

public class ControllerStack {
    private ModelStack model;
    private ViewStack view;

    public ControllerStack(ModelStack model, ViewStack view) {
        this.model = model;
        this.view = view;
        this.view.Is.addActionListener(e->{
            String expression = this.view.textArea.getText().trim();
            System.out.println(expression);
            try {
                double result = model.getResult(expression);
                this.view.textArea.setText(String.valueOf(result));
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"Error in expression","Error",JOptionPane.ERROR_MESSAGE);
            }
        });
        view.setVisible(true);
    }

}

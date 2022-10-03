import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LabFourFive extends Component {
    JRadioButton radioBTN1, radioBTN2, radioBTN3;
    JLabel label1, label2, label3, errLabel;
    JButton button1;
    JTextField textField1;
    JCheckBox checkbox1;

    private void run() {
        JFrame window = createWindow();
        window.setVisible(true);
    }

    private JFrame createWindow() {
        JFrame frame = new JFrame();
        frame.setTitle("Мінаєва Вероніка ПП-41");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(createPanel());
        frame.pack();
        frame.setSize(600, 650);
        frame.getContentPane().setBackground(new Color(255, 212, 180));
        return frame;
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setLayout(null);
        panel.setBackground(new Color(255, 212, 180));

        //LABEL1
        label1 = new JLabel("Конвертація Документів");
        label1.setBounds(30, 10, 300, 40);
        label1.setForeground(Color.red.darker());
        label1.setFont(new Font("Serif", Font.ITALIC, 20));
        panel.add(label1);

        //LABEL2
        label2 = new JLabel("Оберіть завдання:");
        label2.setBounds(30, 50, 300, 40);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Serif", Font.PLAIN, 16));
        panel.add(label2);

        //RADIO BTNS
        radioBTN1 = new JRadioButton("Конвертувати в PDF", new ImageIcon("C:\\Users\\Nika\\IdeaProjects\\lab4\\src\\ad.png"));
        radioBTN2 = new JRadioButton("Конвертувати в Microsoft Word", new ImageIcon("C:\\Users\\Nika\\IdeaProjects\\lab4\\src\\wordpng.png"));
        radioBTN3 = new JRadioButton("Конвертувати в Microsoft Excel", new ImageIcon("C:\\Users\\Nika\\IdeaProjects\\lab4\\src\\exelpng.png"));
        radioBTN1.setBounds(70, 100, 300, 40);
        radioBTN2.setBounds(70, 150, 300, 40);
        radioBTN3.setBounds(70, 200, 300, 40);
        radioBTN1.setBackground(new Color(255, 212, 180));
        radioBTN2.setBackground(new Color(255, 212, 180));
        radioBTN3.setBackground(new Color(255, 212, 180));
        radioBTN1.setFont(new Font("SansSerif", Font.PLAIN, 18));
        radioBTN2.setFont(new Font("SansSerif", Font.PLAIN, 18));
        radioBTN3.setFont(new Font("SansSerif", Font.PLAIN, 18));
        panel.add(radioBTN1);
        panel.add(radioBTN2);
        panel.add(radioBTN3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioBTN1);
        buttonGroup.add(radioBTN2);
        buttonGroup.add(radioBTN3);
        buttonGroup.clearSelection();

        //LABEL3
        label3 = new JLabel("Ім'я файлу");
        label3.setBounds(30, 280, 300, 30);
        label3.setForeground(Color.black);
        label3.setFont(new Font("Serif", Font.ITALIC, 16));
        panel.add(label3);

        //TEXT FIELD
        textField1 = new JTextField("test.txt");
        textField1.setBounds(130, 280, 200, 30);
        panel.add(textField1);

        //CHECKBOX
        checkbox1 = new JCheckBox("Я погоджуюсь з умовами");
        checkbox1.setBounds(30, 350, 250, 50);
        checkbox1.setBackground(new Color(255, 212, 180));
        panel.add(checkbox1);

        //ERROR LABEL
        errLabel=new JLabel();
        errLabel.setBounds(40,400, 250,30);
        errLabel.setForeground(Color.red);
        errLabel.setFont(new Font("Serif", Font.ITALIC, 16));
        panel.add(errLabel);


        //BUTTON
        button1 = new JButton("Далі");
        button1.setBounds(300, 400, 95, 30);
        button1.setBackground(Color.red.darker());
        button1.setForeground(Color.white);
        button1.setFont(new Font("Serif", Font.PLAIN, 18));
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Pattern pattern1 = Pattern.compile("^[a-zA-Z0-9_.-]*.txt$");
                Matcher matcher1 = pattern1.matcher(textField1.getText());
                System.out.println(matcher1.find());
                System.out.println(textField1.getText());

                if (textField1.getText().trim().isEmpty()) {
                    errLabel.setText("Заповніть текстове поле!");
                } else if (!textField1.getText().contains(".txt")) {
                    errLabel.setText("Потрібне розширення .txt");
                } else if (!checkbox1.isSelected()) {
                    errLabel.setText("Потрібно погодитися з правилами!");
                } else if (!matcher1.matches()) {
                    errLabel.setText("Некоретний ввод!");
                } else if (!radioBTN1.isSelected() && !radioBTN2.isSelected() && !radioBTN3.isSelected()) {
                    errLabel.setText("Оберіть варіант конвертації!");
                } else {
                    errLabel.setText("");
                    JOptionPane.showMessageDialog(LabFourFive.this,
                            "Очікую",
                            "Конвертація...",
                            JOptionPane.PLAIN_MESSAGE);
                    System.exit(0);
                }
            }
        });
        panel.add(button1);

        return panel;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new LabFourFive().run());
    }
}
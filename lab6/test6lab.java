//public class test6lab {
//}
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class test6lab extends Canvas{
    static JFrame frame;
    static boolean drawPainting = true;
    static boolean deletePainting = false;
    static boolean separatePainting = false;
    private static Color squareColor = Color.green;
    private static Color circleColor = Color.red;
    public void paint(Graphics g) {
        super.paint(g);
        if (drawPainting){
            g.drawRect(50,50,100,100);
            g.setColor(squareColor);
            g.fillRect(50,50,100,100);

            g.setColor(circleColor);
            g.drawOval(50,50,100,100);
            g.fillOval(50,50,100,100);
        }
        if (deletePainting){
        g.clearRect(0,0,500,500);
        }
        if(separatePainting){
//            g.clearRect(0,0,500,500);

            g.drawRect(5,5,100,100);
            g.setColor(squareColor);
            g.fillRect(5,5,100,100);

            g.setColor(circleColor);
            g.drawOval(5,110,100,100);
            g.fillOval(5,110,100,100);
        }
    }
//    test6lab(){
//
//    }
    public static void main(String[] args) {
        test6lab rect = new test6lab();
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.white);

        JMenuBar menuBar = new JMenuBar();
        JMenu programa = new JMenu("Програма");
        JMenu pravka = new JMenu("Правка");

        JMenuItem zminiti = new JMenuItem("Змінити колір круга");
        JMenuItem obchisliti = new JMenuItem("Обчислити");
        JMenuItem exit = new JMenuItem("Вийти");

        programa.add(zminiti);
        programa.add(obchisliti);
        programa.addSeparator();
        programa.add(exit);

        //PRAVKA MENU
        JMenuItem copy = new JMenuItem("Копіювати");
        JMenuItem paste = new JMenuItem("Вставити");

        pravka.add(copy);
        pravka.add(paste);

        menuBar.add(programa);
        menuBar.add(pravka);

        frame.add(menuBar);
        frame.setJMenuBar(menuBar);

        //POle vvoda
        JLabel inputLabel = new JLabel("Введіть сторону: ");
        inputLabel.setBounds(250,150,250,50);
        frame.add(inputLabel);

        JTextField inputField = new JTextField("4");
        inputField.setBounds(250, 200,150,30);
        frame.add(inputField);

        JButton getArea = new JButton("Get area");
        getArea.setBounds(250,250,120,30);
        getArea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.print("next window good");
//                new Hello();
                int squareSide = Integer.parseInt(inputField.getText());
                int squareArea = squareSide * squareSide;
                double pi = Math.PI;
                double radius = (double) squareSide / 2;
                double circleArea = pi * Math.pow(radius, 2);
                JOptionPane.showMessageDialog(frame,"Square area = " + squareArea + "\nCircle are = " + circleArea,"Result",JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
        });
        frame.add(getArea);

        //Result area label
        JLabel resultAreaLabel = new JLabel("Circle area");
        resultAreaLabel.setBounds(30,300,220,40);
        frame.add(resultAreaLabel);

        JLabel resultAreaLabel2 = new JLabel("Square area");
        resultAreaLabel2.setBounds(30, 350, 220, 40);
        frame.add(resultAreaLabel2);

        //FUNCTIONAL
//      zminiti.addActionListener(changeColorCircle);
        zminiti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circleColor = Color.BLACK;
                frame.invalidate();
                frame.validate();
                frame.repaint();
                //frame.repaint();
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        obchisliti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int squareSide = Integer.parseInt(inputField.getText());
                int squareArea = squareSide * squareSide;
                double pi = Math.PI;
                double radius = (double) squareSide / 2;
                double circleArea = pi * Math.pow(radius, 2);
                if (!inputField.getText().trim().isEmpty()){
                    System.out.print("work input");
//                    resultAreaLabel.setText("result is good");
                    resultAreaLabel.setText("Circle area is = " + Double.toString(circleArea));
                    resultAreaLabel2.setText("Square area is = " + squareArea);
                } else {
                    resultAreaLabel.setText("ERROR!");
                }
            }
        });

        //Hidden label
        JLabel hiddenLabel = new JLabel("⠀⠀⠀⠀⠀⠀⠀⠀");
        hiddenLabel.setBounds(200,50,200,50);
        frame.add(hiddenLabel);

        //POPOUP
        JPopupMenu popup = new JPopupMenu();
        JMenuItem repaintAll = new JMenuItem("Перефарбувати");
        JMenuItem deleteAll = new JMenuItem("Видалити");
        JMenuItem separateAll = new JMenuItem("Розділити");
        popup.add(repaintAll);
        popup.add(deleteAll);
        popup.add(separateAll);

        //MENU POPUP FUNCTIONAL
        repaintAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circleColor = Color.YELLOW;
                squareColor = Color.MAGENTA;
                frame.repaint();
            }
        });

        deleteAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPainting = false;
                deletePainting = true;
                separatePainting = false;
                frame.repaint();
            }
        });

        separateAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPainting = false;
                deletePainting = true;
                separatePainting = true;
                frame.repaint();
            }
        });
        frame.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
//                showPopup(me); // showPopup() is our own user-defined method
                if(me.isPopupTrigger())popup.show(me.getComponent(), me.getX(), me.getY());
            }
        }) ;

        frame.add(rect);

        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().setBackground(Color.white);
    }
}

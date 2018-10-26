//package com.test.redis.main;
//
//import java.awt.Font;
//import java.awt.Point;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//import javax.swing.JButton;
//import javax.swing.JFileChooser;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//
//public class Regular extends JFrame {
//
//  private static final long serialVersionUID = 1L;
//  static String regex = null;
//  static String testString = null;
//  final static Font font = new Font("宋体", Font.BOLD, 11);
//  static List lableList = new
//
//  public static void main(final String[] args) {
//
//    // 画出窗口
//    final JFrame frame = new Regular();
//    frame.setLayout(null);
//    frame.setTitle("myFrame");
//    frame.setSize(400, 370);
//    frame.setLocation(new Point(800, 400));
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    // 添加按钮
//    final JButton btn1 = new JButton("测试");
//    btn1.setBounds(140, 80, 60, 25);
//    btn1.setVisible(true);
//    frame.add(btn1);
//
//    // 设置字体
//
//    btn1.setFont(font);
//
//    // 添加显示框
//    final JLabel label = new JLabel("正则表达式:");
//    label.setBounds(60, 20, 180, 25);
//    label.setVisible(true);
//    label.setFont(font);
//    frame.add(label);
//
//    // 添加文本框
//    final JTextField textField = new JTextField();
//    textField.setBounds(140, 20, 190, 22);
//    textField.setVisible(true);
//    frame.add(textField);
//
//    // 添加显示框
//    final JLabel testLabel = new JLabel("待测字符串:");
//    testLabel.setBounds(60, 50, 180, 25);
//    testLabel.setVisible(true);
//    testLabel.setFont(font);
//    frame.add(testLabel);
//
//    // 添加文本框
//    final JTextField testField = new JTextField();
//    testField.setBounds(140, 50, 190, 22);
//    testField.setVisible(true);
//    frame.add(testField);
//    frame.setVisible(true);
//
//    // 为按钮添加事件
//    btn1.addActionListener(new ActionListener() {
//
//      @Override
//      public void actionPerformed(final ActionEvent e) {
//        final JLabel testLabel = new JLabel("待测字符串:");
//        testLabel.setBounds(60, 100, 180, 25);
//        testLabel.setVisible(true);
//        testLabel.setFont(font);
//        frame.add(testLabel);
//        frame.setVisible(true);
//      }
//    });
//
//    // 为文本框添加事件
//    textField.addActionListener(new ActionListener() {
//      @Override
//      public void actionPerformed(final ActionEvent e) {
//        regex = textField.getText();
//      }
//    });
//    testField.addActionListener(new ActionListener() {
//      @Override
//      public void actionPerformed(final ActionEvent e) {
//        testString = testField.getText();
//      }
//    });
//  }
//
//  public static void add(JFrame frame, int y, int text) {
//    // 添加显示框
//    final JLabel label = new JLabel("正则表达式:");
//    label.setBounds(60, 20, 180, 25);
//    label.setVisible(true);
//    label.setFont(font);
//    frame.add(label);
//
//
//
//    // 添加文本框
//    final JTextField textField = new JTextField();
//    textField.setBounds(140, 20, 190, 22);
//    textField.setVisible(true);
//    frame.add(textField);
//  }
//}

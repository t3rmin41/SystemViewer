package com.simple.system.viewer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class SystemViewerApp {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SystemViewerApp window = new SystemViewerApp();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public SystemViewerApp() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        BorderLayout borderLayout = (BorderLayout) frame.getContentPane().getLayout();
        borderLayout.setVgap(102);
        borderLayout.setHgap(100);
        
        String javaVersion = System.getProperty("java.version");
        String bitWise = System.getProperty("sun.arch.data.model");
        
        JLabel lblNewLabel = new JLabel("Java version : " + javaVersion);
        frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
        
        JLabel lblNewLabel_1 = new JLabel("Architecture : " + bitWise);
        frame.getContentPane().add(lblNewLabel_1, BorderLayout.SOUTH);
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

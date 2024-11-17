package br.com.richmont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InitialWindow extends JFrame {
    private JButton searchProfileBtn;
    private JLabel searchProfileBtnLabel;
    private JTextField searchProfileUsernameInput;
    private String username;

    public InitialWindow() throws HeadlessException {
        setTitle("Search Github profile");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initializeComponents();

    }

    private void initializeComponents() {

        searchProfileBtn = new JButton("Search profile");
        searchProfileBtnLabel = new JLabel("Type username");
        searchProfileUsernameInput = new JTextField(20);

        JPanel initialPanel = new JPanel();
        initialPanel.setLayout(new GridBagLayout());
        JPanel usernameInputPanel = new JPanel();

        GridBagConstraints gbcBtnLabel = new GridBagConstraints();
        GridBagConstraints gbcBtn = new GridBagConstraints();
        GridBagConstraints gbcInput = new GridBagConstraints();

        gbcInput.gridx = 3; // Coluna 0
        gbcInput.gridy = 0; // Linha 0
        gbcInput.gridwidth = 1; // Largura de 1 célula
        gbcInput.gridheight = 2; // Altura de 1 célula
        gbcInput.fill = GridBagConstraints.VERTICAL; // Preenchimento horizontal

        gbcBtn.gridx = 3; // Coluna 0
        gbcBtn.gridy = 0; // Linha 0
        gbcBtn.gridwidth = 1; // Largura de 1 célula
        gbcBtn.gridheight = 2; // Altura de 1 célula
        gbcBtn.fill = GridBagConstraints.VERTICAL; // Preenchimento horizontal


        gbcBtnLabel.gridx = 0; // Coluna 0
        gbcBtnLabel.gridy = 2; // Linha 0
        gbcBtnLabel.gridwidth = 3; // Largura de 1 célula
        gbcBtnLabel.gridheight = 2; // Altura de 1 célula
        gbcBtnLabel.fill = GridBagConstraints.VERTICAL; // Preenchimento horizontal

        usernameInputPanel.add(searchProfileBtnLabel,gbcBtnLabel);
        usernameInputPanel.add(searchProfileUsernameInput,gbcInput);
        usernameInputPanel.add(searchProfileBtn,gbcBtn);


        initialPanel.add(usernameInputPanel);
        add(initialPanel, BorderLayout.PAGE_START);
        searchProfileBtn.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    username = searchProfileUsernameInput.getText();
                    System.out.println(username);

                    }
                });
        GithubUserPanel userPanel = new GithubUserPanel(username);
        userPanel.setPreferredSize(new Dimension(300, 0)); // 20% da largura (800 * 0.2 = 160)
        add(userPanel, BorderLayout.WEST);


    }

    private void setupGridBagLayout(){

    }
}
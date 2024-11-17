package br.com.richmont;

import javax.swing.*;
import java.awt.*;

public class GithubUserPanel extends JPanel {
    private String GithubUserUsername;
    private String GithubUserName;
    private Integer Followers;
    private Integer Following;
    private String Email;

    // Labels with content
    private final JLabel UsernameLabelContent = new JLabel();
    private final JLabel NameLabelContent = new JLabel();
    private final JLabel FollowersLabelContent = new JLabel();
    private final JLabel FollowingLabelContent = new JLabel();
    private final JLabel EmailLabelContent = new JLabel();

    // GridBagConstraints
    private final GridBagConstraints gbcUsername = new GridBagConstraints();
    private final GridBagConstraints gbcNameLabel = new GridBagConstraints();
    private final GridBagConstraints gbcFollowersLabel = new GridBagConstraints();
    private final GridBagConstraints gbcFollowingLabel = new GridBagConstraints();
    private final GridBagConstraints gbcEmailLabel = new GridBagConstraints();

    public GithubUserPanel(String username) {
        fetchGithubData(username);
        fillContent();
        initComponents();
    }
    private void initComponents(){
        this.setupLayout();
        this.add(UsernameLabelContent,gbcUsername);
        this.add(NameLabelContent,gbcNameLabel);
        this.add(FollowersLabelContent,gbcFollowersLabel);
        this.add(FollowingLabelContent,gbcFollowingLabel);
        this.add(EmailLabelContent,gbcEmailLabel);
    };

    private void setupLayout(){
        this.setLayout(new GridBagLayout());
        gbcUsername.gridx = 0;
        gbcUsername.gridy = 0;
        gbcUsername.gridwidth = 20;
        gbcUsername.gridheight = 1;
        gbcUsername.fill = GridBagConstraints.VERTICAL;

        gbcNameLabel.gridx = 0;
        gbcNameLabel.gridy = 1;
        gbcNameLabel.gridwidth = 20;
        gbcNameLabel.gridheight = 1;
        gbcNameLabel.fill = GridBagConstraints.VERTICAL;

        gbcFollowersLabel.gridx = 0;
        gbcFollowersLabel.gridy = 2;
        gbcFollowersLabel.gridwidth = 20;
        gbcFollowersLabel.gridheight = 1;
        gbcFollowersLabel.fill = GridBagConstraints.VERTICAL;

        gbcFollowingLabel.gridx = 0;
        gbcFollowingLabel.gridy = 3;
        gbcFollowingLabel.gridwidth = 20;
        gbcFollowingLabel.gridheight = 1;
        gbcFollowingLabel.fill = GridBagConstraints.VERTICAL;

        gbcEmailLabel.gridx = 0;
        gbcEmailLabel.gridy = 4;
        gbcEmailLabel.gridwidth = 20;
        gbcEmailLabel.gridheight = 1;
        gbcEmailLabel.fill = GridBagConstraints.VERTICAL;


    }
    private void fillContent(){
        UsernameLabelContent.setText(GithubUserUsername);
        NameLabelContent.setText(GithubUserName);
        FollowersLabelContent.setText(Followers.toString());
        FollowingLabelContent.setText(Following.toString());
        EmailLabelContent.setText(Email);
    }
    private void fetchGithubData(String username){
        // Dummy data to setup layout
        GithubUserUsername = "java";
        GithubUserName = "Java Developer Relations";
        Followers = 741;
        Following = 0;
        Email = "java_devrel_grp@oracle.com";
    }
}

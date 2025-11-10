package view;

import java.awt.CardLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class InitialWindow extends JFrame{
	
	private static final long serialVersionUID = 8550167698088645448L;
	private String username;
	
	public InitialWindow() throws HeadlessException {
		setBase();
	}
	
	private void setBase() {
		setTitle("Search Github profile");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        CardLayout cl = new CardLayout();
        JPanel panel = new JPanel(cl);
        
        
        GithubUserPanel ghup = new GithubUserPanel("java");
        JButton btn1 = new JButton("Voltar para Tela 2");
        ghup.add(new JLabel("Esta é a Tela 1"));
        ghup.add(btn1);
        panel.add(ghup,"t1");
        
        GithubUserPanel ghup2 = new GithubUserPanel("java");
        JButton btn2 = new JButton("Voltar para Tela 1");
        ghup2.add(new JLabel("Esta é a Tela 2"));
        ghup2.add(btn2);
        panel.add(ghup2,"t2");
        
        
        
        add(panel);
        
        btn1.addActionListener(e -> cl.show(panel, "t2"));
        //btn1.addActionListener(e -> System.out.println("aaaa"));
        //btn2.addActionListener(e -> System.out.println("bbbbb"));
        btn2.addActionListener(e -> cl.show(panel, "t1"));
        
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}

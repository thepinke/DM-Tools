import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Gui extends JFrame {
	private JPanel panel;
	private JPanel panel2;
	private JLabel messageLabel;
	private JLabel messageLabel2;
	private JComboBox classBox;
	private JComboBox raceBox;
	private JButton generate;
	private String pickClass, pickRace;
	private String[] classes = {" ", "Fighter", "Barbarian"};
	private String[] races = {" ", "Human", "Elf"};
	private final int WINDOW_WIDTH = 350;
	private final int WINDOW_HEIGHT = 250;
	public Gui()
	{
		
		setTitle("DM's Tools");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		buildPanel();
		buildPanel2();
		
		add(panel, BorderLayout.CENTER);
		add(panel2, BorderLayout.NORTH);
		pack();
		setVisible(true);
	}
	
	private void buildPanel()
	{
		messageLabel = new JLabel("Later this will be filled in. For now it's pretty empty.");
		messageLabel2 = new JLabel("For now let's generate a lvl 19 fighter");
		generate = new JButton("Generate");
		generate.addActionListener(new GenerateListener());
		panel = new JPanel();
		panel2 = new JPanel();
		panel.add(messageLabel);
		panel.add(generate);
		//panel2.add();
	}
	private void buildPanel2()
	{
		panel2 = new JPanel();
		classBox = new JComboBox(classes);
		classBox.addActionListener(new ClassBoxListener());
		raceBox = new JComboBox(races);
		raceBox.addActionListener(new RaceBoxListener());
		panel2.add(classBox);
		panel2.add(raceBox);
	}
	private class GenerateListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (pickClass == "Fighter")
			{
				Fighter fighter = new Fighter(19, pickRace);
				fighter.setStats();
				fighter.setFeats();
				//fighter.setHp();
				fighter.setSkills();
				fighter.setSaves();
				fighter.display();
			}
			else
				JOptionPane.showMessageDialog(null, "In Development");
		}
	}
	private class ClassBoxListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String selection = (String) classBox.getSelectedItem();
			pickClass = selection;
		}
	}
	private class RaceBoxListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String selection = (String) raceBox.getSelectedItem();
			pickRace = selection;
		}
	}
}

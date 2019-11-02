package lambdaSample;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingOne extends JPanel{

	public JLabel titleLabel;
	public JLabel nameLabel;
	public JLabel outputLabel;
	public JTextField nameField;
	public JButton sendButton;

	public SwingOne() {
		super(new GridBagLayout());
		setPreferredSize(new Dimension(300,250));

		GridBagConstraints cstr = new GridBagConstraints();

		titleLabel = new JLabel("名前を入力してください");
		titleLabel.setFont(
				new Font(Font.SANS_SERIF,Font.PLAIN,20));

		cstr.gridx = 0;
		cstr.gridy = 0;
		cstr.insets = new Insets(10, 10, 0, 10);
		cstr.gridwidth = 3;
		add(titleLabel,cstr);

		nameLabel = new JLabel("Name: ");
		cstr.gridx=0;
		cstr.gridy=1;
		cstr.insets=new Insets(10, 10, 0, 5);
		cstr.gridwidth=1;
		add(nameLabel,cstr);

		nameField = new JTextField();

		cstr.gridx=1;
		cstr.gridy=1;
		cstr.insets=new Insets(10, 0, 0, 10);
		cstr.gridwidth=2;
		cstr.fill=GridBagConstraints.HORIZONTAL;
		add(nameField,cstr);

		//ここがボタンとクリックイベント
		sendButton = new JButton("確定");
		sendButton.addActionListener(
				(e)->{
					outputLabel.setText(
							"こんにちは"+nameField.getText()+"さん");
				});

		cstr.gridx=1;
		cstr.gridy=2;
		cstr.insets=new Insets(0, 10, 0, 10);
		cstr.anchor = GridBagConstraints.EAST;
		cstr.fill=GridBagConstraints.NONE;
		add(sendButton,cstr);

		outputLabel=new JLabel("こんにちは");

		cstr.gridx=0;
		cstr.gridy=3;
		cstr.gridwidth=3;
		cstr.insets=new Insets(10, 10, 10, 10);
		cstr.anchor = GridBagConstraints.CENTER;
		add(outputLabel,cstr);
	}

	public static void buildApp() {
		JFrame frame = new JFrame("SwingOne");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JComponent myPanel = new SwingOne();
		frame.setContentPane(myPanel);
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(
				SwingOne::buildApp);
	}
}

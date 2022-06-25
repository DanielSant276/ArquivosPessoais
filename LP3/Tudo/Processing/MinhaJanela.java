import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MinhaJanela extends JFrame implements ActionListener {

	public MinhaJanela(String title) {
		super(title);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Clicou!");
	}

	public static void main(String[] args) {
		MinhaJanela minha = new MinhaJanela("Olá!");
		JButton meuBotão1 = new JButton("Me clica");
		JButton meuBotão2 = new JButton("Não me clica");
		BorderLayout l = new BorderLayout();

		meuBotão1.addActionListener(minha);

		minha.setMinimumSize(new Dimension(500, 500));

		minha.setLayout(l);

		minha.add(meuBotão1, BorderLayout.NORTH);
		minha.add(meuBotão2, BorderLayout.SOUTH);

		minha.setType(Window.Type.POPUP);
		//minha.pack();
		minha.setVisible(true);
	}
}

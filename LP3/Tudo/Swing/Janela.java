// Importar as biblioteca de Swing, Awt e Awt.event
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//A classe Janela estende JFrame, que é a janela básica do swing
// e implementa a interface MouseListener para poder escutar eventos de mouse
public class Janela extends JFrame implements MouseListener {

	//Construtor que fornece o título da janela
	public Janela(String title) {
		super(title);
		b3 = new JButton();
		l3 = new JLabel();
	}

	//Contador de cliques nos botões b1 e b2
	private int cont = 0;

	//Botão não local, que está vsisível em qualquer lugar da classe
	private JButton b3;

	//Mesma coisa para label
	private JLabel l3;

	//Método do Mouse listener executa ao clique do mouse
	public void mouseClicked(MouseEvent e) {
		cont++;
		l3.setText("Você me clicou " + cont);

	}

	//Quando o mouse entra
	public void mouseEntered(MouseEvent e) {
		b3.setText("Entrou");
	}

	//Quando o mouse sai
	public void mouseExited(MouseEvent e) {
		b3.setText("Saiu");
	}

	//Quando o mouse é apertado
	public void mousePressed(MouseEvent e) { }

	//Quando o mouse é solta
	public void mouseReleased(MouseEvent e) {}

	//Classe interna que implementa ActionListener
	public class NãoClica implements ActionListener {
		//actionPerformed é qualquer evento padrao
		public void actionPerformed(ActionEvent e) {
			b3.setText("Para de me clicar");
		}
	}

	//Gambiarra para colocar a classe em contexto estático
	public NãoClica retornaNãoClica() {
		return new NãoClica();
	}


	public static void main(String[] args) {
		//Criamos um objeto pois o método main é estático
		Janela minhaJanela = new Janela("Minha Janela");

		//Seta o layout para uma tabela de 3 linhas e 2 colunas
		minhaJanela.setLayout(new GridLayout(3, 2));

		//Componente locais, não são são visíveis pela classe
		JButton b1, b2;
		JLabel l1, l2;

		//Criação dos componentes
		b1 = new JButton("Me clica!");
		b2 = new JButton("Não me clica!");

		l1 = new JLabel("Botão 1");
		l2 = new JLabel("Botão 2");

		//Adiciona minhaJanela como listener de mouse para b1 e b2
		b1.addMouseListener(minhaJanela);

		NãoClica nc = minhaJanela.retornaNãoClica();
		b2.addActionListener(nc);

		//Criação de uma classe anônima para b2
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2.setText("PARA DE ME CLICAR");
			 }
		}
		);

		//Adicionamos os componente à minhaJanela
		minhaJanela.add(l1);
		minhaJanela.add(b1);
		minhaJanela.add(l2);
		minhaJanela.add(b2);
		minhaJanela.add(minhaJanela.l3);
		minhaJanela.add(minhaJanela.b3);

		//Instrução para fechar a janela quando visualmente fazemos isso
		minhaJanela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		//Estabele o tamanho da janela
		minhaJanela.setSize(300,300);
		//Torna a janela visível
		minhaJanela.setVisible(true);
	}
}

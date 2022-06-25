/* Essa classe representa um personagem de um jogo
/* da forma mais geral possível
**************************************************/
public class Boneco {
    // O protected permite que as subclasses tenham acesso aos atributos/métodos
    // Nome do boneco
    protected String nome = "";

    protected int hp = 1000;

    public void setaNome(String nome) {
        this.nome = nome;
    }

    public String pegaNome() {
        return this.nome;
    }

    public int pegaHP() {
        return this.hp;
    }

    // Construtor para gerar um boneco simples sem atributo novo nenhum
    public Boneco() {
    }

    // Contrutor para gerar um boneco com nome
    public Boneco(String nome) {
        this.nome = nome;
    }

    public void ataca(Boneco inimigo) {
        inimigo.hp = inimigo.hp - 1;
	if (inimigo.hp <= 0) {
	    inimigo.morre();
	}
    }

    protected void morre() {
        System.out.printf("%s morreu\n", this.nome);
    }
}

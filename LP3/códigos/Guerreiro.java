public class Guerreiro extends Boneco {

    // Esse construtor chama o contrutor da classe mãe
    public Guerreiro(String nome) {
        super(nome);
	// Aqui podemos colocar o que diferencia
    }

    @Override
    public void morre() {
	System.out.printf("O guerreiro %s morreu com honra!\n", this.nome);
    }

    @Override
    public void ataca(Boneco inimigo) {
	// Se inimigo já estiver morto, não ataca
	if (inimigo.hp > 0) {
	    inimigo.hp = inimigo.hp - 10;
	    // Se o inimigo morrer, avisa
	    if (inimigo.hp <= 0) {
	        inimigo.morre();
	    }
	}
    }
}

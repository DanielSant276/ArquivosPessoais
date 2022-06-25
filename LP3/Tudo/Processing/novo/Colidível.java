public interface Colidível {

	// Esse método retorna uma caixa retangular paralela aos eixos
	public Caixa retornaCaixa();

	public Velocidade retornaVelocidade();

	// Esse método deve retorna verdadeiro se e somente
	// o objeto estiver colidindo com "outro"
	public boolean colidiuCom(Colidível outro);

}

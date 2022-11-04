package org.example;

/**
 * Representa um Jogador de um time de futebol.
 * @author Prof. Diego Augusto Barros
 * @version %I%, %G%
 */
public class Jogador {

    private String nome;
    private byte idade;
    private float altura;
    private float peso;

    public static final byte IDADE_MIN_ANOS = 18;

    /**
     * Inicializa um novo jogador de futebol.
     */
    public Jogador() {
        nome = "";
        idade = IDADE_MIN_ANOS;
        altura = 0.0f;
        peso = 0.0f;
    }

    /**
     * Inicializa um novo jogador de futebol.
     * @param nome o nome do jogador
     * @param idade a idade do jogador
     * @param altura a altura em metros (m)
     * @param peso o peso em quilos (kg)
     */
    public Jogador(String nome, byte idade, float altura, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    /**
     * Obtém o nome do jogador
     * @return o nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera o nome do jogador
     * @param nome o nome atualizado do jogador.
     * @throws IllegalArgumentException se o nome for null ou possuir caracteres inválidos
     */
    public void setNome(String nome) throws IllegalArgumentException {

        if (nome == null)
            throw new IllegalArgumentException("O nome não pode ser null.");

        if (nome.matches("^(\\d*)$"))
            throw new IllegalArgumentException("O nome possui caracteres inválidos! Não são aceitos números.");

        this.nome = nome.trim();
    }

    /**
     * Obtém a idade do jogador
     * @return idade
     */
    public byte getIdade() {
        return idade;
    }

    /**
     * Atualiza a idade do jogador.
     * @param idade nova idade do jogador superior à {@link Jogador#IDADE_MIN_ANOS}.
     * @throws IllegalArgumentException se a idade for menor do que à {@link Jogador#IDADE_MIN_ANOS}.
     * @see Jogador#IDADE_MIN_ANOS
     */
    public void setIdade(byte idade) throws IllegalArgumentException {

        if (idade < IDADE_MIN_ANOS)
            throw new IllegalArgumentException(String.format("A idade deve ser superior à %s anos", IDADE_MIN_ANOS));

        this.idade = idade;
    }

    /**
     * Obtém o peso do jogador.
     * @return o peso do jogador em quilos (kg)
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Atualiza o peso do jogador
     * @param peso peso do jogador em quilos (kg)
     * @throws IllegalArgumentException Se o peso for negativo.
     */
    public void setPeso(float peso) throws IllegalArgumentException {

        if (peso < 0.0)
            throw new IllegalArgumentException("O peso não pode ser negativo.");

        this.peso = peso;
    }

    /**
     * Obtém a altura do jogador
     * @return altura em metros (m)
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Atualiza a altura do jogador.
     * @param altura altura em metros (m)
     * @throws IllegalArgumentException se a altura for negativa
     */
    public void setAltura(float altura) throws IllegalArgumentException {

        if (altura < 0.0)
            throw new IllegalArgumentException("A altura não pode ser negativa");

        this.altura = altura;
    }

} // Fim da classe Jogador

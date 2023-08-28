package br.edu.ifpb.progdist.lab2_apirest.model;

public class Usuario {

    private int codigo;
    private String nome;
    private int idade;

    public Usuario() {
    }
    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Usuario(int codigo, String nome, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



}

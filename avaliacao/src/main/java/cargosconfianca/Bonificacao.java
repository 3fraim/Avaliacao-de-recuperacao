/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package cargosconfianca;

/**
 *
 * @author Aluno
 */
public enum Bonificacao {
    GERENTE(0.35),
    DIRETOR(0.45);
    
    protected double valor;
    
//    CONSTRUTOR

    private Bonificacao(double valor) {
        this.valor = valor;
    }
    
//    GETTER

    public double getValor() {
        return valor;
    }
    
}

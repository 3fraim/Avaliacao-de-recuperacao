/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package funcionario;

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO('M',"Masculino"),
    FEMININO('F',"Feminino");
    
    protected char caractere;
    protected String texto;
    
    
//    CONSTRUTOR

    private Genero(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }
    
    
//    GETTER

    public char getCaractere() {
        return caractere;
    }

    public String getTexto() {
        return texto;
    }
    
}

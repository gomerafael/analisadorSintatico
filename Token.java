/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compsintático;

/**
 *
 * @author Gome
 */
public class Token {

    private String token;
    private String lexema;
    private String tipo;
    private int linha;

    public Token (String token, String lexema, String tipo) {
        super();
        this.token = token;
        this.lexema = lexema;
        this.tipo = tipo;
    }

    public Token (String token, String lexema, String tipo, int linha) {
        super();
        this.token = token;
        this.lexema = lexema;
        this.tipo = tipo;
        this.linha = linha;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    @Override
    public String toString() {
		return String.format("token= %-50s lexema= %-50s tipo= %-50s\n", token, lexema, tipo);
    }
}

package Backend.Juego;

public class Tablero {

    private int filas;
    private int columnas;
    private int pocisionXInicial;
    private int posicionYInicial;
    private int posicionXFinal;
    private int posicionYFinal;

    /*
    GETTERS
     */
    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public int getPocisionXInicial() {
        return pocisionXInicial;
    }

    public int getPosicionYInicial() {
        return posicionYInicial;
    }

    public int getPosicionXFinal() {
        return posicionXFinal;
    }

    public int getPosicionYFinal() {
        return posicionYFinal;
    }

    /*
        SETTERS
         */
    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public void setPocisionXInicial(int pocisionXInicial) {
        this.pocisionXInicial = pocisionXInicial;
    }

    public void setPosicionYInicial(int posicionYInicial) {
        this.posicionYInicial = posicionYInicial;
    }

    public void setPosicionXFinal(int posicionXFinal) {
        this.posicionXFinal = posicionXFinal;
    }

    public void setPosicionYFinal(int posicionYFinal) {
        this.posicionYFinal = posicionYFinal;
    }
}

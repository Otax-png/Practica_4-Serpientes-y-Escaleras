package Backend.Juego;

import Backend.Juego.Casillas.Normal;
import Frontend.Botones;

import java.awt.*;

public class Tablero {

    private int filas;
    private int columnas;
    public Botones[] casillas;

    private int pocisionXInicial;
    private int posicionYInicial;
    private int posicionXFinal;
    private int posicionYFinal;

    public Tablero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        CrearCasilla();
    }

    public void CrearCasilla(){
        for (int i = 0; i < this.filas * this.columnas; i++) {
            casillas[i] = new Botones(new Normal(Color.RED));
        }
    }

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

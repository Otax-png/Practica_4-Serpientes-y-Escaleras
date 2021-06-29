package Backend.Juego;

import Backend.Juego.Casillas.Final;
import Backend.Juego.Casillas.Inicio;
import Backend.Juego.Casillas.Normal;
import Frontend.GraficCasilla;

import java.awt.*;

public class Tablero {

    private int filas;
    private int columnas;
    public GraficCasilla[] casillas;


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
        int contador = 0;

        casillas = new GraficCasilla[this.filas * this.columnas];

        casillas[0] = new GraficCasilla(new Inicio(Color.WHITE),0,0);

        for (int i = 1; i < this.filas * this.columnas - 1; i++) {
            casillas[i] = new GraficCasilla(new Normal(Color.RED), contador, i);
            contador++;
            if(contador == this.columnas){
                contador = 0;
            }
        }

        casillas[casillas.length - 1] = new GraficCasilla(new Final(Color.LIGHT_GRAY),this.columnas - 1, this.filas - 1);

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

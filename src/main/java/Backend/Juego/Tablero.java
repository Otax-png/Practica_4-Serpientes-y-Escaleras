package Backend.Juego;

import Backend.Juego.Casillas.*;
import Backend.Jugador.Jugador;
import Frontend.GraficCasilla;
import Frontend.GraficJugador;

import java.awt.*;

public class Tablero {

    private int filas;
    private int columnas;
    public static GraficCasilla[] casillas;
    public GraficJugador[] jugadores;
    public GraficJugador turnoActual;


    private int pocisionXInicial;
    private int posicionYInicial;
    private int posicionXFinal;
    private int posicionYFinal;

    public Tablero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        CrearCasilla();
        jugadores = new GraficJugador[2];
        jugadores[0] = new GraficJugador(new Jugador("Osvaldo"),Color.CYAN);
        jugadores[0].setReferencia(casillas[0]);
        jugadores[1] = new GraficJugador(new Jugador("Erwin"),Color.BLUE);
        jugadores[1].setReferencia(casillas[0]);

        turnoActual = jugadores[0];
    }

    public void CrearCasilla(){
        int contador = 1;
        int contadory = 0;

        casillas = new GraficCasilla[this.filas * this.columnas];

        casillas[0] = new GraficCasilla(new Inicio(Color.WHITE),0,0,0);

        for (int i = 1; i < this.filas * this.columnas - 1; i++) {
            casillas[i] = new GraficCasilla(new Normal(Color.RED), contador, contadory, i);
            contador++;
            if(contador == this.columnas){
                contadory++;
                contador = 0;
            }
        }
        //Creando Serpientes
        casillas[30] = new GraficCasilla(new Serpiente(Color.BLACK), 5,5,30);
        casillas[95] = new GraficCasilla(new Serpiente(Color.BLACK),5,5,95);
        casillas[65] = new GraficCasilla(new Serpiente(Color.BLACK),5,5,65);

        //Creando Escaleras
        casillas[50] = new GraficCasilla(new Escalera(Color.MAGENTA),5,5,50);
        casillas[10] = new GraficCasilla(new Escalera(Color.MAGENTA),5,5,10);
        casillas[80] = new GraficCasilla(new Escalera(Color.MAGENTA),5,5,80);


        casillas[casillas.length - 1] = new GraficCasilla(new Final(Color.LIGHT_GRAY),this.columnas - 1, this.filas - 1, casillas.length - 1);

    }

    public void moverJugador(int cantidadCasillas){
        int turno = turnoActual.referencia.index;
        if(turno + cantidadCasillas < casillas.length){
            GraficCasilla aux = casillas[turno + cantidadCasillas];
            turnoActual.setReferencia(aux);
        }

        if(turnoActual == jugadores[0]){
            turnoActual = jugadores[1];
        } else {
            turnoActual = jugadores[0];
        }

    }

    public void Ganador(){

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

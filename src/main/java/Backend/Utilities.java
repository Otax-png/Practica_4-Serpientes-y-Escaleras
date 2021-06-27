package Backend;

public interface Utilities {

    default int generarRandom(int rangoMax, int rangoMin){
        int aleatorio = (int)Math.floor(Math.random()*(rangoMax - rangoMin + 1) + rangoMin);
        return aleatorio;
    }

}

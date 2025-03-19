public class SintonizadorFm {
    //La frecuencia se incrementará de 0.5 a 0.5
private double Frecuencia;

    public SintonizadorFm(double frecuencia) {
        //Debe estar comprendida entre 80Mhz y 108Mhz
        if (frecuencia < 80) {
            this.Frecuencia = 108;
        } else if (frecuencia > 108) {
            this.Frecuencia = 80;
        } else {
            this.Frecuencia = frecuencia;
        }
    }
    public void comprobarFrecuencia() {
        if (Frecuencia < 80) {
            this.Frecuencia = 108;
        } else if (Frecuencia > 108) {
            this.Frecuencia = 80;
        }else {
            this.Frecuencia=Frecuencia;
        }
    }
    //Metoso para bajar de frecuencia
    public double bajarFrecuencia() {
        this.Frecuencia -= 0.5;
        comprobarFrecuencia();
        return this.Frecuencia;
    }
    public double subirFrecuencia() {
        this.Frecuencia += 0.5;
        comprobarFrecuencia();
        return this.Frecuencia;
    }
    public void mostrarFrecuencia() {
        System.out.println("Sintonizando.... " + Frecuencia + "MHz");
    }
}


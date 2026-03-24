public class PabellonCirugia {
public static void main (String[] args){}
    private int numero;
    private String especialidad;
    private Estado estado;

    public enum Estado {
        OCUPADO,
        DISPONIBLE
    }

    public PabellonCirugia(int numero, String especialidad) {
        this.numero = numero;
        this.especialidad = especialidad;
        this.estado = Estado.DISPONIBLE;
    }

    public int getNumero() {
        return numero;
    }

    public String toString() {

        String est;

        if (estado == Estado.OCUPADO) {
            est = "ocupado";
        } else {
            est = "disponible";
        }

        return numero + "," + especialidad + "," + est;
    }

    public boolean equals(Object obj) {

        if (obj instanceof PabellonCirugia) {
            PabellonCirugia otro = (PabellonCirugia) obj;
            return this.numero == otro.numero;
        }

        return false;
    }
}

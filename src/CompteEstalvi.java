
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CompteEstalvi extends CompteBancari {

    private double quotaManteniment;

    public CompteEstalvi(String nomPropietari, String numCompte, double saldo,
            double tipusInteres, double quotaManteniment) {
        super(nomPropietari, numCompte, saldo, tipusInteres);
        this.quotaManteniment = quotaManteniment;
    }

    public CompteEstalvi() {
        
    }
    
   /* public void setNomPropietari(String nomPropietari) {
        super.setNomPropietari(super.getNomPropietari() + "FILLA");
    }*/

    public void setQuotaManteniment(double quotaManteniment) {
        if (quotaManteniment < 0) {
            System.out.println("Error: quantitat negativa");
            return;
        }
        this.quotaManteniment = quotaManteniment;
    }

    public double getQuotaManteniment() {
        return this.quotaManteniment;
    }

    public void cobrarComissions() {
        // S'apliquen mensualment pel mantenimient del compte
        GregorianCalendar fechaActual = new GregorianCalendar();
        int dia = fechaActual.get(Calendar.DAY_OF_MONTH);

        if (dia == 1) {
            this.extreure(this.quotaManteniment);
        }
    }

    public double calcularInteressos() {
        GregorianCalendar fechaActual = new GregorianCalendar();
        int dia = fechaActual.get(Calendar.DAY_OF_MONTH);

        if (dia != 1) {
            return 0.0;
        }

        //Acumular els interessos per mes només els dies 1 de cada mes
        double interessosProduits = 0.0;
        interessosProduits = this.getSaldo() + this.getTipusInteres() / 1200.0;
        this.ingressar(interessosProduits);

        // Retornar l'interés mensual per si fos necessari
        return interessosProduits;
    }

}

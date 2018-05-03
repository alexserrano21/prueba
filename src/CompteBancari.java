
public class CompteBancari {

    protected String nomPropietari = "";
    private String numCompte = "";
    private double saldo;
    private double tipusInteres;

    public CompteBancari(String nomPropietari, String numCompte, double saldo,
            double tipusInteres) {
        this.nomPropietari = nomPropietari;
        this.numCompte = numCompte;
        this.saldo = saldo;
        this.tipusInteres = tipusInteres;
    }

    public CompteBancari() {
        this("", "", 0,0);
    }

    public void setNomPropietari(String nomPropietari) {
        this.nomPropietari = nomPropietari;
    }

    public String getNomPropietari() {
        return this.nomPropietari;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public String getNumCompte() {
        return this.numCompte;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void ingressar(double quantitat) {
        if (quantitat < 0) {
            System.out.println("Error: quantitat negativa");
            return;
        }
        this.saldo += quantitat;
    }

    public void extreure(double quantitat) {
        if (saldo - quantitat < 0) {
            System.out.println("Error: no disposa de saldo");
            return;
        }
        this.saldo -= quantitat;
    }

    public void setTipusInteres(double tipusInteres) {
        this.tipusInteres = tipusInteres;
    }

    public double getTipusInteres() {
        return this.tipusInteres;
    }

    public void cobrarComissions() {
        System.out.println("Hola comissions!!");
    }

    public double calcularInteressos() {
        return 0;
    }

}

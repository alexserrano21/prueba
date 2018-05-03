
public class Aplicacio {
    public static void main(String[] args) {
		CompteEstalvi cliente01 = new CompteEstalvi();
		//CompteEstalvi cliente02 = new CompteEstalvi("Pepe Perez", "1234567890", 1000000, 3.5, 300);
		    cliente01.setNomPropietari("Pepe Perez");
		    cliente01.setNumCompte("1234567890");
	   	    cliente01.setTipusInteres(2.5);
		    cliente01.setQuotaManteniment(300);
	    
		    cliente01.ingressar(1000000);
		    cliente01.extreure(500000);
		    cliente01.cobrarComissions();
	    
	   	    System.out.println(cliente01.getNomPropietari());
		    System.out.println(cliente01.getNumCompte());
		    System.out.println(cliente01.getSaldo());
		    System.out.println(cliente01.getTipusInteres());
	}

}

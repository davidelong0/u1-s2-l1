package Esercizio3;

public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    @Override
    public void preleva(double x) throws BancaException {
        if (x > maxPrelievo) {
            throw new BancaException("Il prelievo non è disponibile");
        }
        super.preleva(x);
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + titolare);
        System.out.println("Saldo: " + saldo);
        System.out.println("Num movimenti: " + nMovimenti);
        System.out.println("Massimo movimenti: " + maxMovimenti);
        System.out.println("Massimo prelievo possibile: " + maxPrelievo);
    }
}

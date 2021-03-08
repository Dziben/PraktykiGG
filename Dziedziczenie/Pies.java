public class Pies extends Zwierze{
    private String siersc;
    private int dlugoscOgonu;

    public Pies(int wiek, int ilosckonczyn, String nazwa, String siersc, int dlugoscOgonu){
        super(wiek, ilosckonczyn, nazwa);
        this.siersc = siersc;
        this.dlugoscOgonu = dlugoscOgonu;
    }

    @Override
    public void dajGlos()
    {
        System.out.println("Hau Hau");
    }

    public void setSiersc(String siersc)
    {
        this.siersc = siersc;
    }

    public String getSiersc()
    {
        return siersc;
    }

}
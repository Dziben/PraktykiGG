public class Pies extends Zwierze implements ZwierzeDomowe
{
    @Override
    public void rokUrodzenia()
    {
        System.out.println("2006.");
    }

    @Override
    public void wielkosc()
    {
        System.out.println("Wielki.");
    }

    @Override
    public void rasa()
    {
        System.out.println("Golden Retriever.");
    }

    @Override
    public void badzMilutki()
    {
        System.out.println("Piesek jest bardzo milutki :) ");
    }
    @Override
    public void bawSie()
    {
        System.out.println("Bawi się swoją ulubioną zabawką");
    }
}
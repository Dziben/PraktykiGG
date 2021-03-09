public class Komputer extends Laptop
{

    @Override
    public void kartasieciowa()
    {
        System.out.println("Posiada");
    }

    @Override
    public void dyskSSD() {
        System.out.println("Tak, 256GB");
    }

    public void RokZlozenia ()
    {
        System.out.println("2007");
    }

    public void SzklanaObudowa()
    {
        System.out.println("Tak, szkło hartowane.");
    }

}
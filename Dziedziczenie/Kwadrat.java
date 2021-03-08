public class Kwadrat extends Figura
{
    public double policzPole()
    {
        return  getBokA() * getBokA();
    }

    public Kwadrat(double bokA)
    {
        super(bokA);
    }
}
public class Figura
{

    public void setBokA(double bokA)
    {
        this.bokA = bokA;
    }

    public double getBokA()
    {
        return bokA;
    }

    private double bokA;

    public Figura(double bokA)
    {
        this.bokA = bokA;
    }

    public double policzPole()
    {
        return bokA * bokA;
    }

}
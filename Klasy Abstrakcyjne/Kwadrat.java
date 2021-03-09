public class Kwadrat implements ObliczeniaDlaFigur
{
    private int bokA;

    @Override
    public int obliczPole()
    {
        return bokA * bokA;
    }

    @Override
    public int obliczObwod()
    {
        return 4 * bokA;
    }

    public void setBokA(int bokA)
    {
        this.bokA = bokA;
    }

    public double getBokA()
    {
        return bokA;
    }

    public Kwadrat(int bokA)
    {
        this.bokA = bokA;
    }

}
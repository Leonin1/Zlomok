import javax.naming.PartialResultException;
import java.util.Scanner;

public class Zlomok
{
    private int citatel;
    private int menovatel;
    public Zlomok plus(Zlomok other)
    {
        return new Zlomok(citatel*other.menovatel+other.citatel*menovatel , citatel+other.citatel);
    }

    private int NSD(int c1, int c2)
    {
        return 0;
    }


    Zlomok(int pCitatel , int pMenovatel)
    {
        citatel = pCitatel;
        menovatel = pMenovatel;
    }

    Zlomok(int pCitatel)
    {
        citatel = pCitatel;
        menovatel = 1;
    }

    public Zlomok()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj menovatela: ");
        menovatel = sc.nextInt();
        System.out.println("Zadaj citatela: ");
        citatel = sc.nextInt();

    }


    @Override
    public String toString()
    {

        return (menovatel!=0)?citatel+"/"+menovatel:Integer.toString(citatel);
        /*if(menovatel != 1 )
    {
        return citatel+"/"+menovatel;
    }
    else
        {
            return citatel+"";
    }*/
    }
}

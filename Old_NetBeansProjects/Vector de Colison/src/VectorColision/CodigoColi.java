package VectorColision;

public class CodigoColi {

private long a,b,c,d,e,f,g,h,i,j,k,m;
private long resu,resu2,resu3;    

    public void cody(){
        System.out.println("\ntiene: ");
        System.out.println("1");
        System.out.println("10");
        System.out.println("100\n");

    } 

    public void Codigo(){
{
        a = 1000;
        resu = 1100;
            b = resu;
            resu = 1110;
                c  = resu;
                resu = 1111;
                    d = b;
                    resu = 1111;

        }
        {
        e = a;
        resu2 = 1010;
            f = resu2;
            resu2 = 1111;
                g = f;
                resu2 = 1011;
                    h = resu2;
                    resu2 = 1011;
        }
        {
        i = a;
        resu3 = 1001;
            j = resu3;
            resu3 = 1011;
                k = resu3;
                resu3 = 1011;
                    m = j;
                    resu3 = 1001;
        }
        {
        System.out.println("Vector de colision\n");

        System.out.println("P(1) = " + b);
            System.out.println("P(1,1) = " + c);
                System.out.println("P(1,1,1) = " + resu);

        System.out.println("P(1,2) = " + resu);

        System.out.println("P(2) = " + f);
            System.out.println("P(2,1) = " + resu);

        System.out.println("P(2,3) = " + resu2);
            System.out.println("P(2,3,3) = " + resu2);

        System.out.println("P(3) = " + j);
            System.out.println("P(3,2) = " + k);
                System.out.println("P(3,2,3) = " + k);

        System.out.println("P(3,3) = " + resu3 + "\n");
        }
    }
}

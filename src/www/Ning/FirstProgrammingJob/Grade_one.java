package www.Ning.FirstProgrammingJob;
/*
auto	break	case	char	const	continue	default	do
double	else	enum	extern	float	for	goto	if
int	long	register	return	short	signed	sizeof	static
struct	switch	typedef	union	unsigned	void	volatile	while
 */

public class Grade_one {
    public void OUT1(String str){
        int sum = 0;
        String[] aut = str.split("auto");
        if (aut.length != 1){
            sum=sum+ aut.length-1;
            System.out.println("auto num："+(aut.length - 1));
        }


        String[] brea = str.split("break");
        if (brea.length != 1){
            sum=sum+ brea.length-1;
            System.out.println("break num："+(brea.length - 1));
        }


        String[] cas = str.split("case");
        if (cas.length != 1){
            sum=sum+ cas.length-1;
            System.out.println("case num："+(cas.length - 1));
        }


        String[] cha = str.split("char");
        if (cha.length != 1){
            sum=sum+ cha.length-1;
            System.out.println("char num："+(cha.length - 1));
        }


        String[] cons = str.split("const");
        if (cons.length != 1){
            sum=sum+ cons.length-1;
            System.out.println("const num："+(cons.length - 1));
        }


        String[] contin = str.split("continue");
        if (contin.length != 1){
            sum=sum+ contin.length-1;
            System.out.println("continue num："+(contin.length - 1));
        }


        String[] defaul = str.split("default");
        if (defaul.length != 1){
            sum=sum+ defaul.length-1;
            System.out.println("default num："+(defaul.length - 1));
        }


        String[] d = str.split("do");
        if (d.length != 1){
            sum=sum+ d.length-1;
            System.out.println("do num："+(d.length - 1));
        }


        String[] doubl = str.split("double");
        if (doubl.length != 1){
            sum=sum+ doubl.length-1;
            System.out.println("double num："+(doubl.length - 1));
        }


        String[] els = str.split("else");
        if (els.length != 1){
            sum=sum+ els.length-1;
            System.out.println("else num："+(els.length - 1));
        }


        String[] enu = str.split("enum");
        if (enu.length != 1){
            sum=sum+ enu.length-1;
            System.out.println("enum num："+(enu.length - 1));
        }


        String[] exter = str.split("extern");
        if (exter.length != 1){
            sum=sum+ exter.length-1;
            System.out.println("extern num："+(exter.length - 1));
        }


        String[] floa = str.split("float");
        if (floa.length != 1){
            sum=sum+ floa.length-1;
            System.out.println("float num："+(floa.length - 1));
        }


        String[] fo = str.split("for");
        if (fo.length != 1){
            sum=sum+ fo.length-1;
            System.out.println("for num："+(fo.length - 1));
        }


        String[] got = str.split("goto");
        if (got.length != 1){
            sum=sum+ got.length-1;
            System.out.println("goto num："+(got.length - 1));
        }


        String[] ifo = str.split("if");
        if (ifo.length != 1){
            sum=sum + ifo.length-1;
            System.out.println("if num："+(ifo.length - 1));
        }


        String[] in = str.split("int");
        if (in.length != 1){
            sum=sum+ in.length-1;
            System.out.println("int num："+(in.length - 1));
        }


        String[] lon = str.split("long");
        if (lon.length != 1){
            sum=sum+ lon.length-1;
            System.out.println("long num："+(lon.length - 1));
        }


        String[] registe = str.split("register");
        if (registe.length != 1){
            sum=sum+ registe.length-1;
            System.out.println("register num："+(registe.length - 1));
        }
        String[] retur = str.split("return");
        if (retur.length != 1){
            sum=sum+ retur.length-1;
            System.out.println("return num："+(retur.length - 1));
        }


        String[] shor = str.split("short");
        if (shor.length != 1){
            sum=sum+ shor.length-1;
            System.out.println("short num："+(shor.length - 1));
        }


        String[] signe = str.split("signed");
        if (signe.length != 1){
            sum=sum+ signe.length-1;
            System.out.println("signed num："+(signe.length - 1));
        }


        String[] sizeo = str.split("sizeof");
        if (sizeo.length != 1){
            sum=sum+ sizeo.length-1;
            System.out.println("sizeof num："+(sizeo.length - 1));
        }


        String[] stati = str.split("static");
        if (stati.length != 1){
            sum=sum+ stati.length-1;
            System.out.println("static num："+(stati.length - 1));
        }


       String[] struc = str.split("struct");
        if (struc.length != 1){
            sum=sum+ struc.length-1;
            System.out.println("struct num："+(struc.length - 1));
        }


        String[] switc = str.split("switch");
        if (switc.length != 1){
            sum=sum+ switc.length-1;
            System.out.println("switch num："+(switc.length - 1));
        }


        String[] typede = str.split("typedef");
        if (typede.length != 1){
            sum=sum+ typede.length-1;
            System.out.println("typedef num："+(typede.length - 1));
        }


        String[] unio = str.split("union");
        if (unio.length != 1){
            sum=sum+ unio.length-1;
            System.out.println("union num："+(unio.length - 1));
        }


        String[] unsigne = str.split("unsigned");
        if (unsigne.length != 1){
            sum=sum+ unsigne.length-1;
            System.out.println("unsigned num："+(unsigne.length - 1));
        }


        String[] voi = str.split("void");
        if (voi.length != 1){
            sum=sum+ voi.length-1;
            System.out.println("void num："+(voi.length - 1));
        }


        String[] volatil = str.split("volatile");
        if (volatil.length != 1){
            sum=sum+ volatil.length-1;
            System.out.println("volatile num："+(volatil.length - 1));
        }


        String[] whil = str.split("while");
        if (whil.length != 1){
            sum=sum+ whil.length-1;
            System.out.println("while num："+(whil.length - 1));
        }
        System.out.println("total num:"+(sum-1));


    }
}

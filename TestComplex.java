import java.util.regex.*;

public class TestComplex {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Need more args: 1 or 3 to run the program (z1 +/- z2 or only z)!");
            System.exit(0);
        }

        Complex t1 = new Complex(0, 0);
        String num = args[0];

        if(num.contains("i")){
            Pattern pat1=Pattern.compile("[-]?[0-9]+([.][0-9]+)?[+-]?");
            Matcher matcher1=pat1.matcher(num);
            while (matcher1.find()) {
                t1.x = Float.parseFloat(num.substring(matcher1.start(),matcher1.end() - 1));
            };

            Pattern pat2=Pattern.compile("[-]?[0-9]+([.,][0-9]+)?[i]");
            Matcher matcher2=pat2.matcher(num);
            while (matcher2.find()) {
                t1.y = Float.parseFloat(num.substring(matcher2.start(),matcher2.end() - 1));
            };
        }

        else {
            t1.x = Float.parseFloat(num);
        }

        

        System.out.println("Modulus of z_1 = " + t1.x + " + " + t1.y + "i = " + t1.modulus());
        System.out.println("Argument = " + t1.argument());

        if(args.length >= 2) {
            Complex t2 = new Complex(0, 0);
            if(args.length == 2) {num = args[1];}
            if(args.length == 3) {num = args[2];}

            if(num.contains("i")){
                Pattern pat3=Pattern.compile("[-]?[0-9]+([.][0-9]+)?[+-]?");
                Matcher matcher3 = pat3.matcher(num);
                while (matcher3.find()) {
                    t2.x = Float.parseFloat(num.substring(matcher3.start(),matcher3.end() - 1));
                };

                Pattern pat4=Pattern.compile("[-]?[0-9]+([.,][0-9]+)?[i]");
                Matcher matcher4=pat4.matcher(num);
                while (matcher4.find()) {
                    t2.y = Float.parseFloat(num.substring(matcher4.start(),matcher4.end() - 1));
                };
            }
            else {
                t2.x = Float.parseFloat(num);
            }

            System.out.println("Modulus of z_2 = " + t2.x + " + " + t2.y + "i = " + t2.modulus());
            System.out.println("Argument = " + t2.argument());

            if(args[1].contains("+") | args.length == 2) {
                Complex t3 = Complex.sum(t1, t2);
                System.out.println("z_1 + z_2 = " + t3.x + " + " + t3.y + "i");
            }
            else {
                Complex t4 = Complex.sub(t1, t2, 1);
                System.out.println("z_1 - z_2 = " + t4.x + " + " + t4.y + "i"); 
            }
        }
    }
}
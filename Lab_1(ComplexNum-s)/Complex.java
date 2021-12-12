public class Complex {
    float x;
    float y;

    public Complex(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static Complex sum(Complex t1, Complex t2) {
        return new Complex(t1.x + t2.x, t1.y + t2.y);
    }

    public static Complex sub(Complex t1, Complex t2, int a) {
        return new Complex(t1.x - t2.x, t1.y - t2.y);
    }

    public float modulus(){
        return (float) Math.sqrt(x*x + y*y);
    }

    public float argument(){
        //return (float) Math.atan(y / x);
        if(y >= 0) {
            if(x < 0) {
                return (float) Math.PI - (float) Math.atan(y / x);
            }
            else if(x > 0) {
                return (float) Math.atan(y / x);
            }
            else if(x == 0 && y > 0) {
                return (float) Math.PI / 2;
            }
        }
        else {
            if(x < 0) {
                return (float) Math.PI + (float) Math.atan(y / x);
            }
            else if(x > 0) {
                return 2 * (float) Math.PI - (float) Math.atan(y / x);
            }
            else if(x == 0 && y < 0) {
                return 3 * (float) Math.PI / 2;
            }
        }
        return 0;
    }
}
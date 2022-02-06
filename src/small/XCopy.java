package small;

public class XCopy {
    public void XC(){
        int orig = 42;
        XCopy x  = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }
    int go (int arg){
        arg = arg * 2;
        return arg;
    }
}

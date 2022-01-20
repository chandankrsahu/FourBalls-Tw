import processing.core.PApplet;

public class fourBalls extends PApplet {
    public static final int DIAMETER = 20;
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int x1=0,x2=0,x3=0,x4=0;
    public static final  int Height5=HEIGHT/5;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        getBall1();
        getBall2();
        getBall3();
        getBall4();
    }

    private void getBall4() {
        ellipse(x4+=4,Height5*4,DIAMETER, DIAMETER);
    }

    private void getBall3() {
        ellipse(x3+=3,Height5*3,DIAMETER, DIAMETER);
    }

    private void getBall2() {
        ellipse(x2+=2,Height5*2,DIAMETER, DIAMETER);
    }

    private void getBall1() {
        ellipse(x1++,Height5,DIAMETER, DIAMETER);
    }

    public static void main(String[] args) {
        PApplet.main("fourBalls",args);

    }
}

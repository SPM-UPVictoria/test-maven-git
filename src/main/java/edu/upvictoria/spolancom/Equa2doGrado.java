package edu.upvictoria.spolancom;

public class Equa2doGrado {

    private float A;
    private float B;
    private float C;

    public Equa2doGrado(float a, float b, float c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    public void resuelveGrado() {


        float interno = ((this.B*this.B) - (4 * this.A * this.C));
        float r1 = ((-1 * this.B) + (float) Math.sqrt(interno)) / (2 * this.A);
        float r2 = ((-1 * this.B) - (float) Math.sqrt(interno)) / (2 * this.A);

        System.out.println("R1: " + r1 + " R2: " + r2);
    }
}

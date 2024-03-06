public class Circulo {
    private Ponto p;
    private double raio;


    public Circulo() {
        this.p = new Ponto();
        this.raio = 0;
    }
    public void setX(int x) {
        this.p.setX(x);
    }

    public int getX() {
        return this.p.getX();
    }

    public void setY(int y) {
        this.p.setY(y);
    }

    public int getY() {
        return this.p.getY();
    }
    public double getRaio() {
        return this.raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }
    public void alteraCentro(int x, int y) {
        this.p.setX(x);
        this.p.setY(y);
    }
    public double caclulaArea()
    {
        return Math.PI * (this.raio * this.raio);
    }
    public double calculaPerimetro()
    {
        return 2 * Math.PI * this.raio;
    }
}

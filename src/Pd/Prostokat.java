package Pd;

import java.util.Objects;

public class Prostokat implements MoznaWyznaczycWielokrotnoscPrzekatnej, MoznaWyznaczycWysokosc {

    int bok;
    int podstawa;

    public Prostokat(int i, int i1) {
        this.bok = i;
        this.podstawa = i1;

    }

    @Override
    public double podstawa() {
        return podstawa;
    }

    @Override
    public double katNachylenia() {
        return Math.PI / 2;

    }

    @Override
    public double bok() {
        return bok;
    }

    @Override
    public double przekatna() {
        return Math.sqrt((bok() * bok()) + (podstawa() * podstawa()));
    }

    @Override
    public double wysokosc() {
        return (podstawa()*bok())/2;
    }

    @Override
    public int wielokrotnoscPrzekatnej(int v){return (int)(przekatna() * v);
    }

    @Override
    public double wielokrotnoscPrzekatnej(double v) {
        return przekatna() * v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MaWlasnosciRownolegloboku)) return false;
        MaWlasnosciRownolegloboku figura = (MaWlasnosciRownolegloboku) o;
        //System.out.println("=======================================");
        //System.out.println("Kat nachylenia this: " + this.katNachylenia());
        //System.out.println(("Kąt nachylenia figura: " + figura.katNachylenia()));
        //System.out.println("=======================================");
        return bok == figura.bok() && podstawa == figura.podstawa() && this.katNachylenia() == figura.katNachylenia();
    }

    @Override
    public int hashCode() {
        return Objects.hash(bok, podstawa);
    }

    @Override
    public String toString() {
        return "prostokat";
    }

}


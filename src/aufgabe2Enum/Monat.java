package aufgabe2Enum;

public enum Monat {
    JAN(31), FEB(28), MAR(31), APR(30), JUN(31), JUL(30), AUG(31), SEP(30), OKT(31), NOV(30), DEZ(31);

    int tage;

    Monat(int tage) {
        tage = tage;
    }

    public boolean gibtEsDiesenTagImMonatThis(int tag) {
        boolean ergebnis = true;
        if (tag > this.tage || tag <=0) {
            ergebnis = false;
        }
        return ergebnis;
    }
}

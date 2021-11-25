package Mentoring_OmerOzdemir._11_Enum.Days;

public enum Months {
    OCAK(1),
    SUBAT(2),
    MART(3),
    NİSAN(4),
    MAYIS(5),
    HAZİRAN(6),
    TEMMUZ(7),
    AGUSTOS(8),
    EYLUL(9),
    EKİM(10),
    KASİM(11),
    ARALİK(12);
    private final int ay;

    Months(int i) {

        ay=i;
    }
    public int getAy(){
        return ay;
    }
}

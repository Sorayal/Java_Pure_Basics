package arrays.object_class;

public class C {
    private int zahl;
    private String wort;

    public C(int zahl) {
        this.zahl = zahl;
        this.wort = "a";
    }

    public int getZahl() {
        return zahl;
    }

    public String getWort() {
        return wort;
    }

    public void methC(int k) {
        for (int i = 0; i < k; i++) {
            wort = wort + "a";
        }
    }
}

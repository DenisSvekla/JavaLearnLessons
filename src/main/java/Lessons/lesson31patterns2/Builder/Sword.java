package Lessons.lesson31patterns2.Builder;

public class Sword {
    private int dlina;
    private String color;
    private String metal;
    private String vladelec;
    private String rykoyatkaMaterial;
    private String formaRykoyatki;
    private double weight;

    public static class Builder {
        private Sword sword;

        public Builder() {
            this.sword = new Sword();
        }

        Builder setColor(String color) {
            sword.color = color;
            return this;
        }

        Builder setDlina(int dlina) {
            sword.dlina = dlina;
            return this;
        }

        Builder setMetal(String metal) {
            sword.metal = metal;
            return this;
        }

        Builder setVladelec(String vladelec) {
            sword.vladelec = vladelec;
            return this;
        }

        Sword build() {
            return sword;
        }
    }
}

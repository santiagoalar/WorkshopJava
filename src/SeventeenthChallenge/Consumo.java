package SeventeenthChallenge;
//blancos, negro, rojo, azul y gris
public enum Consumo {
        A(100), B(80), C(60), D(50), E(30), F(10);
        private final int consumo;

        Consumo(int consumo) {
                this.consumo = consumo;
        }

        public int getConsumo() {
                return consumo;
        }
}


public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento(150.0f, 20);
        Computador computador = new Computador(2500.0f, 10, "Lenovo", "Preto");

        System.out.println(equipamento);
        System.out.println(computador);
    }
}
public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento perifericos = new Equipamento("logitech Q203", "RedDragon Kumara Pro");
        Computador pc = new Computador(perifericos.getMouse(), perifericos.getTeclado(), "Ryzen 5 5600u", "Rtx 3060 6GB");
        System.out.println(perifericos);
        System.out.println("\n" + pc);
    }
    
}
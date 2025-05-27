public class DemoTupla {
    public static void main(String[] args) {
        Double d = 2.5;
        String s = "UFERSA";
        Float f = 3.5F;
        Tupla <Double,String> t1 = new Tupla<>(d,s);
        System.out.println("V1: " + t1.getV1() + "\t\tClasse: " + t1.getV1().getClass());
        System.out.println("V2: " + t1.getV2() + "\tClasse: " + t1.getV2().getClass());
        System.out.println();
        Tupla <String,Float> t2 = new Tupla<>(s,f);
        System.out.println("V1: " + t2.getV1() + "\tClasse: " + t2.getV1().getClass());
        System.out.println("V2: " + t2.getV2() + "\t\tClasse: " + t2.getV2().getClass());
    }
}
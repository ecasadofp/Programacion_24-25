public class UsoBici {

    public static void main(String[] args) {

        Bici bici1 = new Bici("rojo", 'M', "BTT");

        Bici bici2 = new Bici('S', "eléctrica");

        bici1.pintarla("naranja");

        bici2.acelerar(35);
        bici2.frenar(5);


        System.out.println("Esta es la bici1: " + bici1);

        System.out.println("Esta es la bici2: " + bici2);


    }


}

public class EjemploStrings {

    public static void main(String[] args) {

        String palabra1 = "hola";
        String palabra2 = "hola";
        String palabra3 = new String("hola");

        System.out.println(palabra1);
        System.out.println(palabra2);
        System.out.println(palabra3);

        System.out.println(palabra1.equals(palabra2));
        System.out.println(palabra1.equals(palabra3));

        System.out.println("\nSiguiente prueba\n");

        System.out.println(palabra1);
        System.out.println(palabra1.hashCode());
        palabra1 += " caracola";
        System.out.println(palabra1);
        System.out.println(palabra1.hashCode());

        System.out.println("\nSiguiente prueba\n");


        // Lo siguiente funcionaría exactamente igual con StringBuffer (entonces sería "seguro en hilos")

        StringBuilder palabra4 = new StringBuilder("hola");
        System.out.println(palabra4);
        System.out.println(palabra4.hashCode());
        palabra4.append(" caracola");
        System.out.println(palabra4);
        System.out.println(palabra4.hashCode());

    }

}

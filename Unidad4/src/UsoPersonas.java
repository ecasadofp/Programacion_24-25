public class UsoPersonas {

    public static void main(String[] args) {

        Persona[] personas = new Persona[10];

        personas[0] = new Persona("Pepito",34);
        personas[1] = new Persona("Josefina", 67);
        personas[2] = new Persona("Marta",2);
        personas[3] = new Persona("Julio",3);

        personas[8] = new Persona("Fernando",33);

        System.out.println("Van a presentarse todos");
try {
    for (Persona p : personas)
        p.presentarse();
}catch(NullPointerException e){
    System.out.println("No hay persona");

}

for(Persona p: personas){
    if(p != null)
        p.presentarse();
}
    }

}

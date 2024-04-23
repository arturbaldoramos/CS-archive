public class prova3 {

    public static void main(String[] args) {

        String animal = "buldog";
        String especie = "cachorro";

        if(especie == "" && animal == ""){
            System.out.println("Nao é possível informar os dados");
            System.out.println("Vazio");
            System.out.println("FIM");
            System.exit(0);
        }
        else{
            System.out.println("animal: "+animal);
            if(especie == ""){
                System.out.println("Especie Vazio");
                System.out.println("FIM");
                System.exit(0);
            }
            else{
                System.out.println("especie: "+especie);
            }
        }
    }
}

package desafioJavaSpring.subsistemaCliente;

public class SubsistemaCliente {
    private SubsistemaCliente(){
    super();
}
    public static void gravarCliente(String nome,String cep,String cidade, String estado){
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}


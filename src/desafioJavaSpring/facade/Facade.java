package desafioJavaSpring.facade;

import desafioJavaSpring.subsistemaCep.CepApi;
import desafioJavaSpring.subsistemaCliente.SubsistemaCliente;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        SubsistemaCliente.gravarCliente(nome,cep,cidade,estado);
    }
}

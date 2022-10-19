package desafioJavaSpring;

import desafioJavaSpring.facade.Facade;
import desafioJavaSpring.singleton.Singleton;
import desafioJavaSpring.singleton.SingletonAvechado;
import desafioJavaSpring.singleton.SingletonHolder;
import desafioJavaSpring.strategy.*;

//Testes relacionados ao design pattern Singleton:
public class Test {
    public static void main (String[]args){
        //singleton
        Singleton singleton = Singleton.getInstancia();
        System.out.println(singleton);
        singleton = Singleton.getInstancia();
        System.out.println(singleton);

        SingletonAvechado singletonAvechado = SingletonAvechado.getInstancia();
        System.out.println(singletonAvechado);
        singletonAvechado = SingletonAvechado.getInstancia();
        System.out.println(singletonAvechado);

        SingletonHolder singletonHolder = SingletonHolder.getInstancia();
        System.out.println(singletonHolder);
        singletonHolder = SingletonHolder.getInstancia();
        System.out.println(singletonHolder);

        //Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Vhinny","51170150");

    }
}

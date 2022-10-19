package Singleton;

public class SingletonAvechado {

        private static SingletonAvechado instancia = new SingletonAvechado();
        private SingletonAvechado(){
            super();
        }
        public static SingletonAvechado getInstancia(){


            return instancia;
        }
    }



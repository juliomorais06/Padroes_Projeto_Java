import ProjetoSingleton.SingletonEager;
import ProjetoSingleton.SingletonLazy;
import ProjetoSingleton.SingletonLazyHolder;
import ProjetoStrategy.Comportamento;
import ProjetoStrategy.ComportamentoAgressivo;
import ProjetoStrategy.ComportamentoDefensivo;
import ProjetoStrategy.ComportamentoNormal;
import ProjetoStrategy.Robo;

public class Testes {
    public static void main(String[] args) {
        
        //Singleton
        //Testes relacionados ao Design Pattern Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
    }
}

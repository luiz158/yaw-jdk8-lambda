
/**
 * Exemplo de inteface com uma implementacao (default) para metodo.
 */
public interface CriterioAprovacao {

	Integer getNota();

	//metodo com comportamento padrao
	boolean isAprovado() default {
		return getNota() > 6;
	};

}

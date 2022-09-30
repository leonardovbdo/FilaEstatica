//Interface => definindo o conjunto de operações (métodos) que
//uma fila deve ter para que seja considerada uma fila.

package filaEstatica;

public interface Enfileiravel {
    //Todas as classes que implementarem essa interface vão ter
    //que obrigatóriamente implementar esses métodos:

    //métodos principais
    void enfileirar(Object elemento);
    Object desenfileirar();
    Object verificar();

    //métodos auxiliares:
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();

    //Para um elemento se considerar uma fila, ele tem que
    //ter um comportamento enfileirável, ou seja, tem que ter
    //pelo menos esses métodos acima
}

public class Matematica {

    //Atributos Locais
    int A, B;

    //Construtor da classe, que recebe dois valores (X e Y) e atribui
    //aos valores locais (A e B);
    public Matematica (int X, int Y){
        A = X;
        B = Y;
    }

    //Metodo de Soma
    public int Soma(){
        return A + B;
    }

    //Metodo de Subtracao
    public int Subtracao(){
        return A - B;
    }

    //Metodo de Multiplicacao
    public int Multiplicacao(){
        return A* B;
    }

    //Metodo de Divisao
    public int Divisao(){
        return A / B;
    }

}

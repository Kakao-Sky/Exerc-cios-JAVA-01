public class Matrizes_01 {
    public static void main(String[] args) {
        //Criando uma matriz.
        //Esta matriz será do tipo "inteiro".
        //Os valores que ficam dentro dos "[]" indicam a quantidade de Linhas e Colunas que esta matriz irá possuir.
        //O primeiro "[]" indica o N°de Linhas e o segundo, o N°de Colunas.
        int Matriz[][] = new int[5][3];
        
        //Primeiramente, a matriz será completamente preenchida com 1's.
        for (int L = 0; L < Matriz.length; L++) {
            for (int C = 0; C < Matriz[0].length; C++) {
                Matriz[L][C] = 1;
            }
        }
        
        for (int L = 0; L < Matriz.length; L++) {
            for (int C = 0; C < Matriz[0].length; C++) {
                System.out.print(Matriz[L][C] + "\t");
                System.out.println(Matriz[L][C] + "\t");
            }
        }
    }
}

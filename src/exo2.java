import java.util.Random;
public class exo2 {
    //genetati o matrice random de la tastatura si adaugati in ea valori random apoi afisati matricea
    static int[][] generate(){
        int[][] mat = new int[3][3];
        int row = mat.length;
        int col = mat[0].length;
        Random rd = new Random();
        int i,j;
        for (i = 0;i < row; i++){
            for (j = 0;j < col; j++){
                mat[i][j] = rd.nextInt(10);
            }
        }
        return mat;
    }

    static void affiche(int[][] mat){
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0;i < row;i++){
            for (int j = 0;j < col;j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }

    /*      folosind exercitiul 2 si generati 2 matrici (ex: matrix1, matrix2) si faceti operatii de:
            -adunare a 2 matrici si afisarea rezultatului
            -inmultirea a 2 matrici si afisarea rezultatului
            -adunati diagonalelor a 2 matrici si afisati rezultatul*/

    static int[][] add(int[][] mat1, int[][] mat2){
        //presupunem ca matricile au aceeasi dimensiune
        int row = mat1.length;
        int col = mat1[0].length;
        int[][] matAdd = new int[row][col];
        for (int i = 0;i < row;i++){
            for (int j = 0;j < col; j++){
                matAdd[i][j]=mat1[i][j] + mat2[i][j];
            }
        }
        return matAdd;
    }

    static int[][] produs(int[][] mat1, int[][] mat2){
        //presupunem ca matricile au aceeasi dimensiune + patratice
        int row = mat1.length;
        int col = mat1[0].length;
        int[][] matProd = new int[row][col];
        for (int i = 0;i < row; i++){
            for (int j = 0;j < col; j++){
                matProd[i][j] = 0;
                for (int m = 0;m < col;m++){
                    matProd[i][j]+= mat1[i][m]*mat2[m][j];
                }
            }
        }
        return matProd;
    }

    static int[][] addDiag(int[][] mat1, int[][] mat2){
        //presupunem ca au aceeasi dim + sunt patratice
        int len = mat1.length;
        int[][] matDiag = new int[len][len];
        for (int i = 0;i < len;i++){
            matDiag[i][i] = mat1[i][i] + mat2[i][i];
        }
        return matDiag;
    }

    public static void main(String[] args){
        //generare
        int[][] mat1 = generate();
        affiche(mat1);
        System.out.println();
        int[][] mat2 = generate();
        affiche(mat2);
        System.out.println();
        int[][] matAdd = add(mat1,mat2);
        affiche(matAdd);
        System.out.println();
        int [][] matProd = produs(mat1,mat2);
        affiche(matProd);
        System.out.println();
        int[][] matDiag = addDiag(mat1,mat2);
        affiche(matDiag);
        System.out.println();
    }
}

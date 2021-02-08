package matrizadjacente2;

public class Grafo {

    private int n_vertice;
    private int[][] aresta = new int[10][10];

    Grafo(int v) {
        this.n_vertice = v;
    }

    public void imprimeMatriz() {
        System.out.print("\n\n Matriz:");

        for (int i = 0; i < n_vertice; ++i) {
            System.out.println();
            for (int j = 0; j < n_vertice; ++j) {
                System.out.print(" " + aresta[i][j]);
            }
        }
    }

    public void addAresta(int v1, int v2) {
        aresta[v2][v1] = 1;
        aresta[v1][v2] = 1;
    }

    public void addVertice() {
        n_vertice++;
        int i;

        for (i = 0; i < n_vertice; ++i) {
            aresta[i][n_vertice - 1] = 0;
            aresta[n_vertice - 1][i] = 0;
        }
    }

    public void removeVertice(int x) {

        int i;

        while (x < n_vertice) {

            for (i = 0; i < n_vertice; ++i) {
                aresta[i][x] = aresta[i][x + 1];
            }

            for (i = 0; i < n_vertice; ++i) {
                aresta[x][i] = aresta[x + 1][i];
            }
            x++;
        }

        n_vertice--;
    }

    public int calculaGrau(int v) {
        int grau = 0;
        for (int i = 0; i < n_vertice; i++) {
                if (aresta[v][i] == 1) {
                    grau++;
                }
                 if (aresta[i][v] == 1) {
                    grau++;
                }
            
        }
        return grau;
    }

    public int calculaOrdem() {
        return n_vertice;
    }
}

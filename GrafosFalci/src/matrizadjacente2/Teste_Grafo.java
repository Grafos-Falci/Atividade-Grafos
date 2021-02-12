package matrizadjacente2;
import java.util.Scanner;

public class Teste_Grafo {
        public static void main(String[] args) 
    { 
        Grafo grafo = new Grafo(); 
        Scanner leitor = new Scanner(System.in);
        
        Vertice v1 = new Vertice("v1");
        Vertice v2 = new Vertice("v2");
        Vertice v3 = new Vertice("v3");
        Vertice v4 = new Vertice("v4");
        
        Aresta a1 = new Aresta(v1, v2);
        Aresta a2 = new Aresta(v2, v3);
        Aresta a3 = new Aresta(v3, v4);
        Aresta a4 = new Aresta(v4, v1);
        
        grafo.addAresta(a1);
        grafo.addAresta(a2);
        grafo.addAresta(a3);
        grafo.addAresta(a4);
        
        grafo.addVertice(v1);
        grafo.addVertice(v2);
        grafo.addVertice(v3);
        grafo.addVertice(v4);
   
        grafo.imprimeMatriz();
        
        System.out.println(grafo.Ordem());
        System.out.println(grafo.Grau(v4));
    } 
}

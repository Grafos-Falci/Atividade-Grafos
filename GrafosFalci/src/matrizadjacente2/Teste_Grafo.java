package matrizadjacente2;
import java.util.Scanner;

public class Teste_Grafo {
        public static void main(String[] args) 
    { 
        Grafo grafo = new Grafo(4); 
        
        Scanner leitor = new Scanner(System.in);
        int vertice;
        
        grafo.addAresta(0, 1); // função que adiciona uma aresta entre dois vértices
        grafo.addAresta(0, 2); 
        grafo.addAresta(1, 2); 
        grafo.addAresta(2, 3); 
           
        grafo.imprimeMatriz();  // função que imprime a matriz de um grafo 
        
        grafo.addVertice(); // função que adiciona um vértice
        grafo.addAresta(4, 1);  
        grafo.addAresta(4, 3); 

          
        grafo.imprimeMatriz(); 

        grafo.removeVertice(1); // função que remove um vértice da matriz
    
        grafo.imprimeMatriz(); 
        
        System.out.println("\n\nOrdem do grafo: "+grafo.calculaOrdem());
        System.out.println("\nColoque o numero do vertice: "); // v1 = 0; v2=1; v3=2; v4=3
        vertice = leitor.nextInt(); 
        System.out.println("Grau do vertice v"+(vertice+1)+" = "+grafo.calculaGrau(vertice));
        
    } 
}

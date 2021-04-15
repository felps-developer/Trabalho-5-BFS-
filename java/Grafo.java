import java.util.ArrayList;

// ui ui bixo gréfi
public class Grafo {
    private ArrayList<No> conexoes;

    public ArrayList<No> getConexoes() {
        return conexoes;
    }

    public Grafo() {
        this.conexoes = new ArrayList<>();
    }

    public void adicionar(No n) {
        if(!contains(n)) conexoes.add(n);
    }

    public boolean contains(No n) {
        for(No no: conexoes)
            if(no.id.equals(n.id)) return true;

        return false;
    }

    public void adicionar(String no) {
        // Infinito
        adicionar(new No(no));
    }

    public void conectarNo(String origem, String destino) {
        No ORIGEM, DESTINO;
        ORIGEM = DESTINO = null;

        // Percorrer nós existentes e, caso ambos existam com os nomes fornecidos, ele cria a conexão
        for(No n: conexoes) {
            if(n.id.equals(origem)) ORIGEM = n;
            if(n.id.equals(destino)) DESTINO = n;
        }

        if(ORIGEM != null && DESTINO != null) {
            ORIGEM.adicionar(DESTINO);
        }
    }

    public No getNode(String s) {
        for(No n: conexoes)
            if(n.id.equals(s))
                return n;

        return null;
    }
}

package regras;

import java.util.List;

/**
 *
 * @author Thanyla
 */
public interface ExportadorListaProduto {

    public String abrirTabela();

    public String fecharTabela();

    public String abrirLinha();

    public String fecharLinha();

    public String fecharLinhaTitulo();

    public String abrirColuna();

    public String fecharColuna();

    public String exportar(List<Produto> listaProduto);
    
}

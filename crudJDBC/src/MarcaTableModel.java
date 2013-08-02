
import br.com.modelo.negocio.Marca;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leticia_macena
 */
public class MarcaTableModel extends AbstractTableModel {
    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private List<Marca> linhas;
    private String[]colunas ={"id","nome"};

    public MarcaTableModel() {
        linhas = new ArrayList<Marca>();
    }

    public MarcaTableModel(List<Marca> marcas) {
        linhas = new ArrayList<Marca>(marcas);
    }
    
    
    
    public int getRowCount() {
        return linhas.size();
      
    }
    /**
     * Retorna a quantidade de colunas
     * @return 
     */
    public String getCollumname(int columnIndex){
        return colunas [columnIndex];
        
    }
    /**
     * Retorna a classe de cada coluna
     */
    public Class getColumnClass(int columnindex){
        if(columnindex == COL_ID){
            return Integer.class;
        }else if ( columnindex == COL_NOME){
            return String.class;
        }
        return null;
        
        
       
    }

    public int getColumnCount() {
        return colunas.length;
        /**
         * Retorna os dados do objeto da linha
         */

    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Marca m = linhas.get(rowIndex);
        
        if(columnIndex == COL_ID){
            return m.getId();
        }else if (columnIndex== COL_NOME){
        return m.getNome();
        }
        return " ";
        

    }
    /**
     * Altera os dados de uma linha
     */
    public void setValuAt(Object aValue,int rowIndex,int columnIndex){
        Marca m =linhas.get(rowIndex);
        if (columnIndex == COL_ID){
            m.setId((Integer)aValue);
        }else if (columnIndex == COL_NOME ){
            m.setNome(aValue.toString());
        }
    }
    //indice se a célula é editável
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return false;
    }
    /**
     * Retorna a marca referente a linha especificada
     * @param indiceLinha
     * @return 
     */
    public Marca getMarca(int indiceLinha){
        return linhas.get(indiceLinha);
    }
    /*
     * Adciona a marca especificada ao modelo
     */
    public void addMarca (Marca marca){
        //adciona o registro
        linhas.add(marca);
        
        //pega a quantidade de registros (os registro começam com zero)
        int ultimoIndice = getRowCount() - 1 ;
        //Notifica a mudança
        fireTableRowsInserted(ultimoIndice, ultimoIndice);

    }
    
    /*
     * Atualiza uma linha
     */
    public void updateMarca(int indiceLinha,Marca marca){
        linhas.set(indiceLinha,marca);
        fireTableRowsUpdated(indiceLinha,indiceLinha);
    }
    /*
     * Remove uma linha
     */
    public void removeMarca(int indiceLinha){
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha,indiceLinha);
                
    }
    /*
     * Romove todos os registros 
     */
    public void limpar(){
        linhas.clear();
    }
}

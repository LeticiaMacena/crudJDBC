
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
    
    
    public int getRowCount() {
        return linhas.size();
      
    }
    /**
     * Retorna a quantidade de colunas
     * @return 
     */

    public int getColumnCount() {
        return colunas.length;
        /**
         * Retorna os dados do objeto da linha
         */

    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Marca m = linhas.getC(row);
        
        if(columnIndex == COL_ID){
            return m.getId();
        }else (COL_NOME == COL_NOME){
        return m.getNome();
        }
        

    }
    
}

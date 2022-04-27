
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.PEPN_tableModel;
import model.PEPN_model;

/**
 *
 * @author aluno
 */
public class PEPN_dao {
    
    PEPN_tableModel tabelmodel = new PEPN_tableModel();
    
     String pathFile = "db.txt";
     String pathFileTemp = "dbTemp.txt";
     String readFile = "";
     
     List <PEPN_model> listRegistroMedico = new ArrayList<>();
     private final TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabelmodel);
    
}

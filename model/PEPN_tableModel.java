/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aluno
 */
public class PEPN_tableModel extends AbstractTableModel{
    
     private List<PEPN_model> list = new ArrayList<>();
     private final String[] columnNames = {"Capital inicial", "Cliente", "Endereco", "Juros", "Tempo a pagar", "Telefone"};
     
     public void setList(List<PEPN_model> list) {
        this.list = list;
        fireTableDataChanged();
    }
     
    @Override
    public String getColumnName(int column) {
        return columnNames[column]; 
    }
     

    @Override
    public int getRowCount() {
        return list.size();
        
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
        
    }

    @Override // retrno do método aplicado
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch (columnIndex) {
        case 0:
            return list.get(rowIndex).getCapital();
        case 1:
            return list.get(rowIndex).getCliente();
        case 2:
            return list.get(rowIndex).getEndereco();
        case 3:
            return list.get(rowIndex).getJuros();
        case 4:
            return list.get(rowIndex).getTempo();
        case 5:
            return list.get(rowIndex).getTel();
        default:
            return null;
        }
    
    }
     
     
     
    
}

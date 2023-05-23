package inmemoryMySQL.data;

import inmemoryMySQL.constraint.Constraint;
import inmemoryMySQL.constraint.ConstraintType;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Table {

    public String getName() {
        return name;
    }

    public Set<Column> getColumns() {
        return columns;
    }

    public List<Row> getRows() {
        return rows;
    }

    public List<Constraint> getConstraints() {
        return constraints;
    }

    private final String name;
    private final Set<Column> columns;
    private final List<Row> rows;
    private final List<Constraint> constraints;


    public Table(String name, Set<Column> columns) {
        this.name = name;
        this.columns = columns;
        this.rows = new ArrayList<>();
        this.constraints = new ArrayList<>();
    }

    public void addColumn(String colName, String colDescription) {

    }

    public void deleteColumn(String colName) {

    }

    public Column getColumn(String colName) {
        Column col = null;
        for (Column column : columns) {
            if (column.getName().equals(colName)) {
                col = column;
                break;
            }
        }
        if (col==null)
            throw new RuntimeException("col not exists");
        return col;
    }

    public void addRow(Row row) {
        for (Constraint constraint : constraints) {
            constraint.applyOnInsertRow(row);
        }
        this.rows.add(row);
    }

    public void deleteRow(Row row) {
        if (!this.rows.contains(row))
            throw new RuntimeException("Row not exists");
        for (Constraint constraint : constraints) {
            constraint.applyOnDeleteRow(row);
        }
        this.rows.remove(row);
    }

    public List<Constraint> getConstraintsByType(ConstraintType constraintType) {
        List<Constraint> constraintsOfType = new ArrayList<>();
        for (Constraint constraint : constraints) {
            if (constraint.getConstraintType().equals(constraintType))
                constraintsOfType.add(constraint);
        }
        return constraintsOfType;
    }

    public void removeConstraint(ConstraintType constraintType, Table relatedTable) {
        List<Constraint> removables = new ArrayList<>();
        for (Constraint constraint : constraints) {
            if (constraint.getConstraintType().equals(constraintType) &&
            constraint.isRelated(relatedTable))
                removables.add(constraint);
        }
        for (Constraint constraint: removables) {
            constraints.remove(constraint);
        }
    }

    public void addConstraint(Constraint constraint) {
        this.constraints.add(constraint);
    }

}

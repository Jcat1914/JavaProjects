import com.sun.source.tree.IfTree;

import javax.swing.table.DefaultTableModel;
import java.awt.print.Printable;

public class Professor {
    private String Name;
    private String Last_name;
    static  DefaultTableModel Courses;

    Professor(){
        Courses = new DefaultTableModel();
        Courses.addColumn("idCourse");
        Courses.addColumn("CourseName");
        Courses.addColumn ("Fee");
    }
    public static void Add(int id, String Course_name, Double Fee ){
       int Old_rowCount = Courses.getRowCount();
        Object[] Datos = new Object[]{
                id,
                Course_name,
                Fee
        };

        Courses.addRow(Datos);

        if(Courses.getRowCount()> Old_rowCount) {
            System.out.println("Row Added Correctly");
        } else
            System.out.println("Something went run");

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

}


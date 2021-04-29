
package todolist;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class todo extends javax.swing.JFrame
{
    private String user = null;
    private String pwd= null;
   
    Connection con = null;
    public todo(String user,String pwd) {
        this.user = user;
        this.pwd = pwd;
        con = Dbcon.dbconnect();
        initComponents();
    }

    private todo() {
        initComponents();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" To-Do List");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Important Task");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Other Task");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Add Task");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Edit Task");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sno", "Important", "Other"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setText("Delete Task");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Display Task");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(22, 22, 22))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(delete)
                                        .addGap(59, 59, 59)
                                        .addComponent(jButton2))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                            .addComponent(jButton1))
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton3)))))
                        .addGap(0, 168, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(delete)
                    .addComponent(jButton2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37)
                .addComponent(jButton4)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    //Insertion operation
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            try
            {
                 String imp = jTextField1.getText();
                 String other = jTextArea1.getText();
                 //insert data in database
                 
                 PreparedStatement pst = con.prepareStatement("insert into todo(important,other,user,pass)values(?,?,?,?)");
                
                 pst.setString(1, imp);
                 pst.setString(2,other);
                 pst.setString(3, this.user);
                 pst.setString(4,this.pwd);
                 
                 pst.executeUpdate();
                 //show dialog msg
                 JOptionPane.showMessageDialog(null, "Task Added!!!!!");
                 
                 //Set blank in textfield
                 jTextField1.setText("");
                 jTextArea1.setText("");
                 //Display data in tabular form
                 int colCount;
                 PreparedStatement pst1 = con.prepareStatement("select * from todo where user = ? and pass = ?");
                 pst1.setString(1, this.user);
                 pst1.setString(2,this.pwd);
                 ResultSet rs = pst1.executeQuery();
                 ResultSetMetaData rd = rs.getMetaData();
                 colCount = rd.getColumnCount();
                 DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
                 df.setRowCount(0);
                 while(rs.next())
                 {
                     Vector v2 = new Vector();
                     for(int i = 1;i<=colCount;i++)
                     {
                         v2.add(rs.getString("id"));
                         v2.add(rs.getString("important"));
                         v2.add(rs.getString("other")); 
                     }
                     df.addRow(v2);
                 }
            }
            catch(SQLException | HeadlessException ex)
            {
                System.out.println(ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
       int row = jTable1.getSelectedRow();//select the row in the table
       if(row == -1)
       {
           JOptionPane.showMessageDialog(null,"Select Item First");
       }
       else
       {
           try
       {
                 int id  = Integer.parseInt(df.getValueAt(row,0).toString());
                 String imp = jTextField1.getText();
                 String other = jTextArea1.getText();
                 
                 PreparedStatement  pst = con.prepareStatement("update todo set important=?,other=? where id = ?");
                 pst.setString(1, imp);
                 pst.setString(2, other);
                 pst.setInt(3, id );
                 
                 pst.executeUpdate();
                 JOptionPane.showMessageDialog(null, "List Updated!!!!");
                 //Set blank in textfield
                 jTextField1.setText("");
                 jTextArea1.setText("");
                 
                 int col;
                 pst = con.prepareStatement("select * from todo where user = ? and pass = ? ");//
                 pst.setString(1, this.user);
                 pst.setString(2,this.pwd);
                 ResultSet rs = pst.executeQuery();
                 ResultSetMetaData rd = rs.getMetaData();
                 col = rd.getColumnCount();//no of column
                 DefaultTableModel df1 = (DefaultTableModel) jTable1.getModel();
                 df1.setRowCount(0);
                 while(rs.next())
                 {
                     Vector v2 = new Vector();
                     for(int i = 1;i<=col;i++)//
                     {   //if(rs.getString("user").equals(this.user) && rs.getString("pass").equals(this.pwd))
                        {
                          v2.add(rs.getString("id"));
                          v2.add(rs.getString("important"));
                          v2.add(rs.getString("other"));
                        }
                     }
                     df.addRow(v2);
                 }
                 jButton1.setEnabled(true);
                 
       }
       catch(Exception ex)
       {
                System.out.println(ex);
       }
       }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        int selected =  jTable1.getSelectedRow();
        int id = Integer.parseInt(df.getValueAt(selected,0).toString());
        jTextField1.setText(df.getValueAt(selected, 1).toString());//
        jTextArea1.setText(df.getValueAt(selected, 2).toString());//
         jButton1.setEnabled(false);//hide add button
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getSelectedRow();//select the row in the table
        
        
        if(row==-1)//if no one select any row
        {
            JOptionPane.showMessageDialog(null,"Select Item First");
        }
        else
        {
            try
            {       
               int id =    Integer.parseInt(df.getValueAt(row,0).toString()); // selected row id
               String imp = jTextField1.getText(); 
               String other = jTextArea1.getText();
                 
               PreparedStatement  pst = con.prepareStatement("delete from todo where id = ?");//deletetion query
               pst.setInt(1, id);//set id which is selected by table
                 
               pst.executeUpdate();
               JOptionPane.showMessageDialog(null, "Deleted!!!!");//when deletion successfull
                 //Set blank in textfield
               jTextField1.setText("");//set blank
               jTextArea1.setText("");//set blank
                 
               int col;
               pst = con.prepareStatement("select * from todo where user = ? and pass = ?");//Retreive all the data which has log in
               pst.setString(1, this.user);//set user name
               pst.setString(2,this.pwd);//set pass
               ResultSet rs = pst.executeQuery();
               ResultSetMetaData rd = rs.getMetaData();
               col = rd.getColumnCount();//no of column
               DefaultTableModel df1 = (DefaultTableModel) jTable1.getModel();
               df1.setRowCount(0);
               while(rs.next())//Extract values from database to swings table
               {
                  Vector v2 = new Vector();
                  for(int i = 1;i<=col;i++)//
                  {
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("important"));
                    v2.add(rs.getString("other"));
                  }
                  df.addRow(v2);
               }
               jButton1.setEnabled(true);
        }
        catch(NumberFormatException | SQLException | HeadlessException ex)
        {
            System.out.println(ex);
        }
        
        }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
               DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
               int col;
               
        try  
        {
               PreparedStatement pst;
               pst = con.prepareStatement("select * from todo where user = ? and pass = ?"); //Retreive all the data which has log in
               pst.setString(1, this.user);//set user name
               pst.setString(2,this.pwd);//set pass
               ResultSet rs = pst.executeQuery();
               ResultSetMetaData rd = rs.getMetaData();
               col = rd.getColumnCount();//no of column
               DefaultTableModel df1 = (DefaultTableModel) jTable1.getModel();
               df1.setRowCount(0);
               while(rs.next())//Extract values from database to swings table
               {
                  Vector v2 = new Vector();
                  for(int i = 1;i<=col;i++)//
                  {
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("important"));
                    v2.add(rs.getString("other"));
                  }
                  df.addRow(v2);
               }
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(todo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(todo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(todo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(todo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new todo().setVisible(true);
            }
        });
    }
    //jb1,jb3,jb4

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

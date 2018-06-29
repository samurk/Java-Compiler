/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package myide;



import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.io.*;

import java.util.ArrayList;

import javax.swing.*;

import javax.swing.event.UndoableEditEvent;

import javax.swing.event.UndoableEditListener;

import javax.swing.undo.CannotRedoException;

import javax.swing.undo.UndoManager;





class CustomFilter extends javax.swing.filechooser.FileFilter {

    @Override

    public boolean accept(File file) {

        // Allow only directories, or files with ".java" extension

        return file.isDirectory() || file.getAbsolutePath().endsWith(".java");

    }



    @Override

    public String getDescription() {

        // This description will be displayed in the dialog,

        return "Java Files (*.java)";

    }

}



/**

 *

 * @author Sami-Ur-Rehman Khan

 */



public class IDE extends javax.swing.JFrame {

    ArrayList<JTextArea> array=new ArrayList<JTextArea>();

    UndoManager undo = new UndoManager();

    int i=1;

    String file_Name;

    File file;

    public static JTextArea jTextArea2 = new javax.swing.JTextArea();

    

    public IDE() {

        initComponents();

        setLocationRelativeTo(null);

        array.add(jTextArea1);

        focus().getDocument().addUndoableEditListener(

                new UndoableEditListener() {

                    public void undoableEditHappened(UndoableEditEvent e) {

                        undo.addEdit(e.getEdit());

                        

                    }

                });

    }





    /**

     * This method is called from within the constructor to initialize the form.

     * WARNING: Do NOT modify this code. The content of this method is always

     * regenerated by the Form Editor.

     */

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents

    private void initComponents() {



        fileChooser = new javax.swing.JFileChooser();

        jPanel1 = new javax.swing.JPanel();

        jTabbedPane1 = new javax.swing.JTabbedPane();

        jScrollPane2 = new javax.swing.JScrollPane();

        //jTextArea2 = new javax.swing.JTextArea();

        jTabbedPane2 = new javax.swing.JTabbedPane();

        jScrollPane1 = new javax.swing.JScrollPane();

        jTextArea1 = new javax.swing.JTextArea();

        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu1 = new javax.swing.JMenu();

        newItem = new javax.swing.JMenuItem();

        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        openItem = new javax.swing.JMenuItem();

        jSeparator2 = new javax.swing.JPopupMenu.Separator();

        saveItem = new javax.swing.JMenuItem();

        jSeparator3 = new javax.swing.JPopupMenu.Separator();

        exitItem = new javax.swing.JMenuItem();

        jMenu2 = new javax.swing.JMenu();

        undoItem = new javax.swing.JMenuItem();

        jSeparator4 = new javax.swing.JPopupMenu.Separator();

        redoItem = new javax.swing.JMenuItem();

        jSeparator5 = new javax.swing.JPopupMenu.Separator();

        copyItem = new javax.swing.JMenuItem();

        jSeparator6 = new javax.swing.JPopupMenu.Separator();

        pasteItem = new javax.swing.JMenuItem();

        jSeparator7 = new javax.swing.JPopupMenu.Separator();

        cutItem = new javax.swing.JMenuItem();

        jMenu3 = new javax.swing.JMenu();

        jMenuItem9 = new javax.swing.JMenuItem();

        jMenu4 = new javax.swing.JMenu();

        runItem = new javax.swing.JMenuItem();



        fileChooser.setDialogTitle("Open Dialog");

        fileChooser.setFileFilter(new CustomFilter());



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setTitle("IDE");

        setBackground(new java.awt.Color(255, 255, 255));



        jPanel1.setBackground(new java.awt.Color(255, 204, 204));



        jTextArea2.setColumns(20);

        jTextArea2.setRows(5);

        jScrollPane2.setViewportView(jTextArea2);



        jTabbedPane1.addTab("Output", jScrollPane2);



        jTextArea1.setColumns(20);

        jTextArea1.setRows(5);

        jScrollPane1.setViewportView(jTextArea1);



        jTabbedPane2.addTab("tab1", jScrollPane1);



        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);

        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(

            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(jPanel1Layout.createSequentialGroup()

                .addContainerGap()

                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)

                    .addComponent(jTabbedPane2))

                .addContainerGap())

        );

        jPanel1Layout.setVerticalGroup(

            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(jPanel1Layout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)

                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addContainerGap())

        );



        jMenuBar1.setBackground(new java.awt.Color(51, 255, 153));



        jMenu1.setText("File");



        newItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));

        newItem.setBackground(new java.awt.Color(51, 255, 153));

        newItem.setText("New");

        newItem.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                newItemActionPerformed(evt);

            }

        });

        jMenu1.add(newItem);



        jSeparator1.setBackground(new java.awt.Color(51, 255, 153));

        jMenu1.add(jSeparator1);



        openItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));

        openItem.setBackground(new java.awt.Color(51, 255, 153));

        openItem.setText("Open");

        openItem.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                openItemActionPerformed(evt);

            }

        });

        jMenu1.add(openItem);

        jMenu1.add(jSeparator2);



        saveItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));

        saveItem.setText("Save");

        saveItem.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                saveItemActionPerformed(evt);

            }

        });

        jMenu1.add(saveItem);

        jMenu1.add(jSeparator3);



        exitItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));

        exitItem.setText("Exit");

        exitItem.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                exitItemActionPerformed(evt);

            }

        });

        jMenu1.add(exitItem);



        jMenuBar1.add(jMenu1);



        jMenu2.setText("Edit");



        undoItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));

        undoItem.setText("Undo");

        undoItem.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                undoItemActionPerformed(evt);

            }

        });

        jMenu2.add(undoItem);

        jMenu2.add(jSeparator4);



        redoItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));

        redoItem.setText("Redo");

        redoItem.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                redoItemActionPerformed(evt);

            }

        });

        jMenu2.add(redoItem);

        jMenu2.add(jSeparator5);



        copyItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));

        copyItem.setText("Copy");

        copyItem.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                copyItemActionPerformed(evt);

            }

        });

        jMenu2.add(copyItem);

        jMenu2.add(jSeparator6);



        pasteItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));

        pasteItem.setText("Paste");

        pasteItem.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                pasteItemActionPerformed(evt);

            }

        });

        jMenu2.add(pasteItem);

        jMenu2.add(jSeparator7);



        cutItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));

        cutItem.setText("Cut");

        cutItem.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                cutItemActionPerformed(evt);

            }

        });

        jMenu2.add(cutItem);



        jMenuBar1.add(jMenu2);



        jMenu3.setText("Compile");



        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));

        jMenuItem9.setText("Compiler");

        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jMenuItem9ActionPerformed(evt);

            }

        });

        jMenu3.add(jMenuItem9);



        jMenuBar1.add(jMenu3);



        jMenu4.setText("Run");

        jMenu4.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jMenu4ActionPerformed(evt);

            }

        });



        runItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));

        runItem.setText("Run");

        runItem.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                runItemActionPerformed(evt);

            }

        });

        jMenu4.add(runItem);



        jMenuBar1.add(jMenu4);



        setJMenuBar(jMenuBar1);



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(layout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                .addContainerGap())

        );

        layout.setVerticalGroup(

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

        );



        pack();

    }// </editor-fold>//GEN-END:initComponents



    

    private void openItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openItemActionPerformed

        fileChooser.setDialogTitle("OPEN :");

        int openVal = fileChooser.showOpenDialog(this);

        

        if (openVal == JFileChooser.APPROVE_OPTION) 

        {

            file = fileChooser.getSelectedFile();

            file_Name=file.toString();

            try 

            {

                this.focus().read(new FileReader(file.getAbsolutePath()), null);

            } 

            catch (IOException ex) 

            {

                System.out.println("CANNOT ACCESS FILE" + file.getAbsolutePath());

            }

        } 

        else 

        {

            System.out.println("USER HAS CANCELLED THE FILE ACCESS");

        }

        file_Name=JOptionPane.showInputDialog("ENTER THE NAME OF YOUR FILE AGAIN WITHOUT .java EXTENSION:");

       

    }//GEN-LAST:event_openItemActionPerformed



    private void saveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveItemActionPerformed

        

        //System.out.print(focus().getText());

        fileChooser.setDialogTitle("SAVE AS :");

        

        int saveValue=fileChooser.showSaveDialog(this);

        if (saveValue == JFileChooser.APPROVE_OPTION)

        {

            file = fileChooser.getSelectedFile();

             

            file_Name=file.toString();

            try 

            {

               this.focus().write(new FileWriter(file_Name));

            } 

            catch (IOException ex) 

            {

               System.out.println("SOME PROBLEM WITH ACCESSING FILE" + file.getAbsolutePath());

            }

        } 

        else

        {

            System.out.println("USER HAS CANCELLED THE FILE ACCESS");

        }

        file_Name=JOptionPane.showInputDialog("ENTER THE NAME OF YOUR FILE AGAIN WITHOUT .java EXTENSION:");

        

    }//GEN-LAST:event_saveItemActionPerformed



    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed



         System.exit(0);

    }//GEN-LAST:event_exitItemActionPerformed



    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed

        // TODO add your handling code here:

        CompilerClass c=new CompilerClass();

        try

        {

            c.runProcess("javac "+file_Name);

        }

        catch(Exception e)

        {

            

        }

    }//GEN-LAST:event_jMenuItem9ActionPerformed



    private void newItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemActionPerformed

        JTextArea textArea=new JTextArea();

        JScrollPane scrollPanel=new JScrollPane();

        

        textArea.setColumns(20);

        textArea.setRows(5);

        scrollPanel.setViewportView(textArea);

        jTabbedPane2.addTab("tab "+ ++i, scrollPanel);

        array.add(textArea);

        

    }//GEN-LAST:event_newItemActionPerformed



    private void undoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoItemActionPerformed

        if(!(undo.canUndo()))

            JOptionPane.showMessageDialog(this,"CANNOT UNDO");

        else

        {

            try

            {

                undo.undo();

            } 

            catch (CannotRedoException cre)

            {

                cre.printStackTrace();

            }

        }

        

    }//GEN-LAST:event_undoItemActionPerformed



    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu4ActionPerformed

    

    public JTextArea focus()

    {

        int index=0,returnVal=0;

        for(; index<array.size(); index++)

        {

            if(array.get(index).isShowing())

            {

                returnVal=index;

                break;

            }

                

        }

        return array.get(returnVal);

    }



    private void runItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runItemActionPerformed

        

        if(focus().getText().equals(""))

            JOptionPane.showMessageDialog(this,"TEXT AREA IS EMPTY");

        CompilerClass c=new CompilerClass();

        try

        {

        c.runProcess("javac "+file_Name+".java");

        c.runProcess("java "+file_Name);

        }

        catch(Exception e)

        {

            

        }

       

        

    }//GEN-LAST:event_runItemActionPerformed



    private void redoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoItemActionPerformed

        if(!(undo.canRedo()))

            JOptionPane.showMessageDialog(this,"CANNOT REDO");

        else

        {

            try 

            {

              undo.redo();

            } catch (CannotRedoException cre)

            {

                cre.printStackTrace();

            }

        }

    }//GEN-LAST:event_redoItemActionPerformed



    private void pasteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteItemActionPerformed

        

        focus().paste();

    }//GEN-LAST:event_pasteItemActionPerformed



    private void copyItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyItemActionPerformed



        if(focus().getText().equals(""))

            JOptionPane.showMessageDialog(this,"TEXT AREA IS EMPTY");

        else

            focus().copy();

    }//GEN-LAST:event_copyItemActionPerformed



    private void cutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutItemActionPerformed

        // TODO add your handling code here:

        if(focus().getText().equals(""))

            JOptionPane.showMessageDialog(this,"TEXT AREA IS EMPTY");

        else

            focus().cut();

    }//GEN-LAST:event_cutItemActionPerformed



    /**

     * @param args the command line arguments

     */

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

            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {

            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {

            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        //</editor-fold>



        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new IDE().setVisible(true);

            }

            

        });

        

    }



    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JMenuItem copyItem;

    private javax.swing.JMenuItem cutItem;

    private javax.swing.JMenuItem exitItem;

    private javax.swing.JFileChooser fileChooser;

    private javax.swing.JMenu jMenu1;

    private javax.swing.JMenu jMenu2;

    private javax.swing.JMenu jMenu3;

    private javax.swing.JMenu jMenu4;

    private javax.swing.JMenuBar jMenuBar1;

    private javax.swing.JMenuItem jMenuItem9;

    private javax.swing.JPanel jPanel1;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JScrollPane jScrollPane2;

    private javax.swing.JPopupMenu.Separator jSeparator1;

    private javax.swing.JPopupMenu.Separator jSeparator2;

    private javax.swing.JPopupMenu.Separator jSeparator3;

    private javax.swing.JPopupMenu.Separator jSeparator4;

    private javax.swing.JPopupMenu.Separator jSeparator5;

    private javax.swing.JPopupMenu.Separator jSeparator6;

    private javax.swing.JPopupMenu.Separator jSeparator7;

    private javax.swing.JTabbedPane jTabbedPane1;

    private javax.swing.JTabbedPane jTabbedPane2;

    private javax.swing.JTextArea jTextArea1;

    //private javax.swing.JTextArea jTextArea2;

    private javax.swing.JMenuItem newItem;

    private javax.swing.JMenuItem openItem;

    private javax.swing.JMenuItem pasteItem;

    private javax.swing.JMenuItem redoItem;

    private javax.swing.JMenuItem runItem;

    private javax.swing.JMenuItem saveItem;

    private javax.swing.JMenuItem undoItem;

    // End of variables declaration//GEN-END:variables

}

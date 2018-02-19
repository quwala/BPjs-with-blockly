/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iot_proj.iot_proj.gui;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JComboBox;

import com.iot_proj.iot_proj.blocklyeditor.BlocklyRunner;



/**
 *
 * @author omri basch
 */
public class MainFrame extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MainFrameFuncs funcs;
    private String javaFolderAbsPath;
	private final String relPathJsFolder;
    private String currFileName; 
  

	public String getJavaFolderAbsPath() {
		return javaFolderAbsPath;
	}

	public void setJavaFolderAbsPath(String javaFolderAbsPath) {
		this.javaFolderAbsPath = javaFolderAbsPath;
	}

	public String getCurrFileName() {
		return currFileName;
	}

	public void setCurrFileName(String currFileName) {
		this.currFileName = currFileName;
	}

	public String getRelPathJsFolder() {
		return relPathJsFolder;
	}

	public MainFrameFuncs getFuncs() {
		return funcs;
	}
        
        
        //updates the file list 
        private void updateFileList(){
            //the designated js files folder
            File folder = new File(this.javaFolderAbsPath + relPathJsFolder);
            
            //iterate over the files in the folder and add them to the file list
            for (final File fileEntry : folder.listFiles()) {
                fileList.addItem(fileEntry.getName());
            }
        }
        
	
	//the empty constructor
	public MainFrame() {
        initComponents();
        this.funcs = new MainFrameFuncs(logTextArea,eventsList);
        this.javaFolderAbsPath = System.getProperty("user.dir") + "/src/main/java/";
        this.relPathJsFolder = "our_resources/examples/";
        this.currFileName = "";
        
        
        //update the file list
        updateFileList();
        
        }
	

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   // <editor-fold defaultstate="collapsed" desc="Generated Code">
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        runButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fileList = new javax.swing.JComboBox<>();
        createButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        logTextArea = new javax.swing.JTextArea();
        logLabel = new javax.swing.JLabel();
        eventLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eventsList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground"));
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(600, 444));
        setMinimumSize(new java.awt.Dimension(600, 444));
        setName("MainFrame"); // NOI18N
        setResizable(false);

        runButton.setBackground(new java.awt.Color(255, 255, 255));
        runButton.setText("Run");
        runButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Behavioral Programming with Blockly");

        fileList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        fileList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileListActionPerformed(evt);
            }
        });

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					createButtonActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        logTextArea.setEditable(false);
        logTextArea.setColumns(20);
        logTextArea.setRows(5);
        jScrollPane1.setViewportView(logTextArea);

        logLabel.setText("Log");

        eventLabel.setText("Events");

        eventsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(eventsList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(fileList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(runButton)
                        .addGap(18, 18, 18)
                        .addComponent(createButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 40, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(eventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(runButton)
                    .addComponent(fileList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 176, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //action listener to the file list
    private void fileListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileListActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        
        //getting the selected file's name 
        String fileName = (String)cb.getSelectedItem();
        setCurrFileName(fileName);
    }//GEN-LAST:event_fileListActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_createButtonActionPerformed
        funcs.openBlockly();
    }//GEN-LAST:event_createButtonActionPerformed
    
    
    
   /* private void chooseButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    		//open the dialog box
            int returnVal = fc.showOpenDialog(MainFrame.this);
            
            //check that the file selection succeeded  
            if (returnVal == JFileChooser.APPROVE_OPTION) {
            	File file = fc.getSelectedFile();
                
                System.out.println("Chosen file: " + file.getAbsolutePath());
                
                //update the chosen file's name
                setCurrFileName(file.getName());
                jLabel2.setText(getCurrFileName());
                
            } else {
                System.out.println("Open command cancelled by user." );
            }
        }
    */

    //click event listener for the run button
    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
    	if(!getCurrFileName().equals("")){
    	
    		try {
    			//run the chosen js file 
    			getFuncs().runBprog(relPathJsFolder + currFileName);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
			}
    	}
    	
    }


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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private javax.swing.JLabel eventLabel;
    private javax.swing.JList<String> eventsList;
    private javax.swing.JComboBox<String> fileList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logLabel;
    private javax.swing.JTextArea logTextArea;
    private javax.swing.JButton runButton;
    // End of variables declaration//GEN-END:variables
}

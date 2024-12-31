/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.quizly.Dashboard;

import com.formdev.flatlaf.FlatLightLaf;
import com.quizly.API.DBConnection;
import com.quizly.Components.AddQuestionComponent;
import com.quizly.Components.AddUserComponent;
import com.quizly.Components.UpdateUserComponent;
import com.quizly.Main;
import com.quizly.Util.Cinzel;
import com.quizly.Util.CinzelB;
import com.quizly.Util.Mono;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author itsth
 */
public class DashboardL extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
  
    /**
     * Creates new form aDashboard
     */
    public DashboardL() {
        initComponents();
        
        setTitle("Quiz7 >> Dashboard");
        
        // Fonts
        
        jLabel1.setFont(CinzelB.getFont(20));
        dashboardClick.setFont(Cinzel.getFont(16));
        reportsClick.setFont(Cinzel.getFont(16));
        QuizClick.setFont(Cinzel.getFont(16));
        jLabel7.setFont(Cinzel.getFont(10));
        jLabel2.setFont(Cinzel.getFont(13));
        jLabel3.setFont(Cinzel.getFont(13));
        jLabel4.setFont(Cinzel.getFont(13));
        jLabel5.setFont(Cinzel.getFont(13));
        jLabel6.setFont(Cinzel.getFont(18));
        jLabel8.setFont(Cinzel.getFont(18));
        jLabel9.setFont(Cinzel.getFont(18));
        jLabel10.setFont(CinzelB.getFont(16));
        jLabel11.setFont(Cinzel.getFont(12));
        jLabel12.setFont(Cinzel.getFont(12));
        jLabel16.setFont(Cinzel.getFont(12));
        quizNameField.setFont(Mono.getFont(10));
        quizDescArea.setFont(Mono.getFont(10));
        logoutButton.setFont(CinzelB.getFont(12));
        usersCount.setFont(CinzelB.getFont(20));
        quizCount.setFont(CinzelB.getFont(20));
        qt.setFont(CinzelB.getFont(12));
        reportsCount.setFont(CinzelB.getFont(20));
        addButton.setFont(Cinzel.getFont(12));
        createQuizButton.setFont(Cinzel.getFont(12));
        addQuestionsButton.setFont(Cinzel.getFont(12));
        deleteButton.setFont(Cinzel.getFont(12));
        lf.setFont(CinzelB.getFont(12));
        updateButton.setFont(Cinzel.getFont(12));
        rRefreshButton.setFont(Cinzel.getFont(12));
        genReportButton.setFont(Cinzel.getFont(12));
        deleteQuizButton.setFont(Cinzel.getFont(12));
        
        // Table Things :)
        
        // User Table
        
        DefaultTableModel tableModel = new DefaultTableModel(new String[]{"ID", "USERNAME", "ROLE"}, 0);
        usersTable.setModel(tableModel);
        JTableHeader tableHeader = usersTable.getTableHeader();
        tableHeader.setFont(CinzelB.getFont(11));
        
        // Cell Centering + Cell Fonts
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        for (int i = 0; i < usersTable.getColumnCount(); i++) {
            usersTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        usersTable.setFont(Mono.getFont(12));
        
        // Table Options
        
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tableModel = (DefaultTableModel) usersTable.getModel();
        tableModel.setRowCount(0);
        loadTableData();
        updateUsersCount();
        
        // Quiz Table
        
        DefaultTableModel quizTableModel = new DefaultTableModel(new String[]{"QUIZ CODE", "QUIZ NAME"}, 0);
        quizTable.setModel(quizTableModel);
        JTableHeader quizTableHeader = quizTable.getTableHeader();
        quizTableHeader.setFont(CinzelB.getFont(11));

        // Cell Centering + Cell Fonts for Quiz Table
        DefaultTableCellRenderer quizCenterRenderer = new DefaultTableCellRenderer();
        quizCenterRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < quizTable.getColumnCount(); i++) {
            quizTable.getColumnModel().getColumn(i).setCellRenderer(quizCenterRenderer);
        }
        quizTable.setFont(Mono.getFont(12));
        quizTableModel.setRowCount(0);
        loadQuizTable();
        updateQuizCount();
        
        
        
        
        
        
        DefaultTableModel tableModel2 = new DefaultTableModel(new String[]{"Quiz Code", "Quiz Name"}, 0);
        quizResultTable.setModel(tableModel2);
        JTableHeader tableHeader2 = quizResultTable.getTableHeader();
        tableHeader2.setFont(CinzelB.getFont(11));
        
        // Cell Centering + Cell Fonts
        
        DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer();
        for (int i = 0; i < quizResultTable.getColumnCount(); i++) {
            quizResultTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer2);
        }
        quizResultTable.setFont(Mono.getFont(12));
        
        // Table Options
        
        centerRenderer2.setHorizontalAlignment(JLabel.CENTER);
        tableModel2 = (DefaultTableModel) quizResultTable.getModel();
        tableModel2.setRowCount(0);
        qloadTableData();

        
        
        
        
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DashboardPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usersCount = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        quizCount = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        reportsCount = new javax.swing.JLabel();
        UsersPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        lf = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        QuizPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        quizNameField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        createQuizButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        quizDescArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        quizTable = new javax.swing.JTable();
        deleteQuizButton = new javax.swing.JButton();
        addQuestionsButton = new javax.swing.JButton();
        qt = new javax.swing.JLabel();
        ReportsPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        quizResultTable = new javax.swing.JTable();
        genReportButton = new javax.swing.JButton();
        rRefreshButton = new javax.swing.JButton();
        Container = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dashboardClick = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        QuizClick = new javax.swing.JLabel();
        reportsClick = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        TAB = new javax.swing.JTabbedPane();

        jLabel2.setText("Dashboard");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("USERS");

        usersCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usersCount.setText("NaN");
        usersCount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersCountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usersCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(usersCount)
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("QUIZ");

        quizCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quizCount.setText("NaN");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quizCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(quizCount)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("REPORTS");

        reportsCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportsCount.setText("1");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reportsCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(reportsCount)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout DashboardPanelLayout = new javax.swing.GroupLayout(DashboardPanel);
        DashboardPanel.setLayout(DashboardPanelLayout);
        DashboardPanelLayout.setHorizontalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardPanelLayout.createSequentialGroup()
                .addContainerGap(286, Short.MAX_VALUE)
                .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DashboardPanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
        DashboardPanelLayout.setVerticalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Users");

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        usersTable.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(usersTable);

        jScrollPane2.setViewportView(jScrollPane1);

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        lf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lf.setForeground(new java.awt.Color(255, 51, 51));
        lf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UsersPanelLayout = new javax.swing.GroupLayout(UsersPanel);
        UsersPanel.setLayout(UsersPanelLayout);
        UsersPanelLayout.setHorizontalGroup(
            UsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsersPanelLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addGroup(UsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UsersPanelLayout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addButton))
                    .addComponent(lf, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsersPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(UsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        UsersPanelLayout.setVerticalGroup(
            UsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsersPanelLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UsersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lf, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLabel4.setText("Quiz");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setText("Quiz Details");

        jLabel11.setText("Provide the basic information about your quiz");

        jLabel12.setText("Quiz Title");

        jLabel16.setText("Quiz Description");

        createQuizButton.setText("Create Quiz");
        createQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createQuizButtonActionPerformed(evt);
            }
        });

        quizDescArea.setColumns(20);
        quizDescArea.setRows(5);
        jScrollPane3.setViewportView(quizDescArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(quizNameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)))
                    .addComponent(createQuizButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quizNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createQuizButton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        quizTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(quizTable);

        deleteQuizButton.setText("Delete Quiz");
        deleteQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteQuizButtonActionPerformed(evt);
            }
        });

        addQuestionsButton.setText("Add Questions");
        addQuestionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuestionsButtonActionPerformed(evt);
            }
        });

        qt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout QuizPanelLayout = new javax.swing.GroupLayout(QuizPanel);
        QuizPanel.setLayout(QuizPanelLayout);
        QuizPanelLayout.setHorizontalGroup(
            QuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanelLayout.createSequentialGroup()
                .addContainerGap(412, Short.MAX_VALUE)
                .addGroup(QuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuizPanelLayout.createSequentialGroup()
                        .addGroup(QuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qt, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(QuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(QuizPanelLayout.createSequentialGroup()
                                .addComponent(addQuestionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteQuizButton))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuizPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(498, 498, 498))))
        );
        QuizPanelLayout.setVerticalGroup(
            QuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanelLayout.createSequentialGroup()
                .addGroup(QuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuizPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuizPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(QuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(QuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteQuizButton)
                        .addComponent(addQuestionsButton)))
                .addContainerGap(415, Short.MAX_VALUE))
        );

        jLabel5.setText("Reports");

        quizResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(quizResultTable);

        genReportButton.setText("GENERATE REPORT");
        genReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genReportButtonActionPerformed(evt);
            }
        });

        rRefreshButton.setText("REFRESH");
        rRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rRefreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReportsPanelLayout = new javax.swing.GroupLayout(ReportsPanel);
        ReportsPanel.setLayout(ReportsPanelLayout);
        ReportsPanelLayout.setHorizontalGroup(
            ReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsPanelLayout.createSequentialGroup()
                .addGroup(ReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportsPanelLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(ReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(ReportsPanelLayout.createSequentialGroup()
                                .addComponent(rRefreshButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(genReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ReportsPanelLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(355, Short.MAX_VALUE))
        );
        ReportsPanelLayout.setVerticalGroup(
            ReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genReportButton)
                    .addComponent(rRefreshButton))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz7 >> Lecturer Dashboard");
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quiz7");

        dashboardClick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardClick.setText("Dashboard");
        dashboardClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardClickMouseClicked(evt);
            }
        });

        QuizClick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizClick.setText("Quiz");
        QuizClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuizClickMouseClicked(evt);
            }
        });

        reportsClick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportsClick.setText("Reports");
        reportsClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsClickMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("All Rights Reserved.");

        logoutButton.setBackground(new java.awt.Color(51, 153, 255));
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(logoutButton)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                        .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reportsClick, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(QuizClick, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dashboardClick, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dashboardClick, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuizClick, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reportsClick)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        TAB.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        TAB.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        TAB.addTab("", DashboardPanel);
        TAB.addTab("", UsersPanel);
        TAB.addTab("", QuizPanel);
        TAB.addTab("", ReportsPanel);

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContainerLayout.createSequentialGroup()
                    .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 592, Short.MAX_VALUE)))
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TAB, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TAB, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardClickMouseClicked
        // TODO add your handling code here:
        TAB.setSelectedIndex(0);
    }//GEN-LAST:event_dashboardClickMouseClicked

    private void QuizClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizClickMouseClicked
        // TODO add your handling code here:
        TAB.setSelectedIndex(2);
    }//GEN-LAST:event_QuizClickMouseClicked

    private void reportsClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsClickMouseClicked
        // TODO add your handling code here:
        TAB.setSelectedIndex(3);
    }//GEN-LAST:event_reportsClickMouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
//        addUser();
        // Instantiate the AddUserComponent
        AddUserComponent addUserComponent = new AddUserComponent();
        // Set it to visible
        addUserComponent.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        updateUser();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        deleteUser();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void usersCountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersCountMouseClicked
        // TODO add your handling code here:
        updateUsersCount();
    }//GEN-LAST:event_usersCountMouseClicked

    private void createQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createQuizButtonActionPerformed
        // TODO add your handling code here:
        try {
            // Check if either the quiz name or description fields are empty
            String quizName = quizNameField.getText().trim();
            String quizDesc = quizDescArea.getText().trim();

            if (quizName.isEmpty() || quizDesc.isEmpty()) {
                // If any field is empty, show a warning message and return
//                JOptionPane.showMessageDialog(this, "Both quiz name and description are required.", "Error", JOptionPane.WARNING_MESSAGE);
                qt.setText("\" Both quiz name and description are required! \"");
                return; // Exit the method if fields are empty
            }

            // Call the createQuiz method if validation passes
            createQuiz(quizName, quizDesc);
        } catch (Exception e) {
            e.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Error creating quiz: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_createQuizButtonActionPerformed

    private void deleteQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteQuizButtonActionPerformed
        // TODO add your handling code here:
        deleteQuiz();
    }//GEN-LAST:event_deleteQuizButtonActionPerformed

    private void addQuestionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuestionsButtonActionPerformed
        // TODO add your handling code here:
        openAddQuestionsFrame();
    }//GEN-LAST:event_addQuestionsButtonActionPerformed

    private void genReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genReportButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = quizResultTable.getSelectedRow();

        // Ensure a row is selected
        if (selectedRow == -1) {
//            qr.setText("\" Please select a quiz to print the report! \"");
            return;
        }

        // Get the quizCode from the selected row (assuming it's in the first column)
        String quizCode = (String) quizResultTable.getValueAt(selectedRow, 0);

        // Now proceed with generating the report
        try {
            Connection conn = DBConnection.getConnection();

            // Define the report path
            String reportPath = "src/main/resources/reports/"
                    + "QuizResult.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(reportPath);

            // Set the parameters for the report
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("quizCode", quizCode);  // Pass the selected quizCode

            // Fill the report with data from the database
            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, conn);

            // Close the connection
            conn.close();

            // Display the report
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            e.printStackTrace();
//            lf.setText("An error occurred while generating the report!");
        }
    }//GEN-LAST:event_genReportButtonActionPerformed

    private void rRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rRefreshButtonActionPerformed
        // TODO add your handling code here:
        qloadTableData();
    }//GEN-LAST:event_rRefreshButtonActionPerformed
    
    // >>>>>>>>>>>>    Reports    <<<<<<<<<<<
    
    public void qloadTableData() {
        // Ensure the DefaultTableModel is linked to the JTable
        DefaultTableModel tableModel = (DefaultTableModel) quizResultTable.getModel();

        // Clear existing rows in the table
        tableModel.setRowCount(0);

        // Load data from the database
        try (Connection conn = DBConnection.getConnection()) {
            // Updated query to select all quiz_codes and quiz_names
            String query = "SELECT q.quiz_code, q.quiz_name " +
                           "FROM quizzes q";

            PreparedStatement pst = conn.prepareStatement(query);

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String quizCode = rs.getString("quiz_code");
                    String quizName = rs.getString("quiz_name");
                    tableModel.addRow(new Object[]{quizCode, quizName});
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // >>>>>>>>>>>>    Dashboard    <<<<<<<<<<<
    
    
    private void updateUsersCount() {
        DefaultTableModel tableModel = (DefaultTableModel) usersTable.getModel();
        int rowCount = tableModel.getRowCount();
        usersCount.setText("" + rowCount);
    }
    
    private void updateQuizCount() {
        DefaultTableModel quizTableModel = (DefaultTableModel) quizTable.getModel();
        int rowCount = quizTableModel.getRowCount();
        quizCount.setText("" + rowCount);
    }

    
    private void updateUser() {
        DefaultTableModel tableModel = (DefaultTableModel) usersTable.getModel();

        // Ensure there is a model attached to the table
        if (tableModel == null) {
//      JOptionPane.showMessageDialog(this, "Table model is not initialized!");
            lf.setText("\" Table model is not initialized! \"");
            return;
        }

        // Check if a row is selected
        int selectedRow = usersTable.getSelectedRow();
        if (selectedRow == -1) {
            lf.setText("Please select a user to update!");
            return;
        }

        // Retrieve the current user details
        int userId = (int) tableModel.getValueAt(selectedRow, 0); // ID column
        String currentUsername = (String) tableModel.getValueAt(selectedRow, 1); // Username column
        String currentRole = (String) tableModel.getValueAt(selectedRow, 2); // Role column

        // Open the UpdateUserFrame and pass the user details
        UpdateUserComponent uuc = new UpdateUserComponent(userId, currentUsername, currentRole);
        uuc.setVisible(true);
    }
    
    private void deleteUser() {
        DefaultTableModel tableModel = (DefaultTableModel) usersTable.getModel();

        // Ensure there is a model attached to the table
        if (tableModel == null) {
        // JOptionPane.showMessageDialog(this, "Table model is not initialized!");
            lf.setText("\" Table model is not initialized! \"");
            return;
        }

        // Check if a row is selected
        int selectedRow = usersTable.getSelectedRow();
        if (selectedRow == -1) {
            lf.setText("Please select a user to delete!");
            return;
        }

        // Retrieve the current user details
        int userId = (int) tableModel.getValueAt(selectedRow, 0); // ID column
        String currentUsername = (String) tableModel.getValueAt(selectedRow, 1); // Username column
        String currentRole = (String) tableModel.getValueAt(selectedRow, 2); // Role column
        
        // Confirmation popup with custom font
        JLabel confirmationLabel = new JLabel("Are you sure you want to delete the user?");
        confirmationLabel.setFont(CinzelB.getFont(12));
        int result = JOptionPane.showConfirmDialog(
                this,
                confirmationLabel,
                "Quiz7 >> Delete User",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        // If user confirms deletion
        if (result == JOptionPane.YES_OPTION) {
            try (Connection conn = DBConnection.getConnection()) {
                // Delete query
                String query = "DELETE FROM users WHERE user_id = ?";
                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                    stmt.setInt(1, userId);
                    stmt.executeUpdate();
                }

                // Remove row from the table
                tableModel.removeRow(selectedRow);

                // Show success message
                JLabel successLabel = new JLabel("User deleted successfully!");
                successLabel.setFont(CinzelB.getFont(12));
                JOptionPane.showMessageDialog(this, successLabel, "Quiz7 >> Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                ex.printStackTrace();
                JLabel errorLabel = new JLabel("Error deleting user: " + ex.getMessage());
                errorLabel.setFont(CinzelB.getFont(12));
                JOptionPane.showMessageDialog(this, errorLabel, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private String generateRandomPassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < length; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }
        return password.toString();
    }
    
    private void addUser() {
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JComboBox<String> roleComboBox = new JComboBox<>(new String[]{"Admin", "Student", "Lecturer"});
 
        Object[] fields = {
            "Username:", usernameField,
            "Password:", passwordField,
            "Role:", roleComboBox
        };
 
        int result = JOptionPane.showConfirmDialog(this, fields, "Add User", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String role = (String) roleComboBox.getSelectedItem();
            
            usernameField.setFont(Cinzel.getFont(12));
            roleComboBox.setFont(Cinzel.getFont(12));
 
            try (Connection conn = DBConnection.getConnection()) {
                String query = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, username);
                stmt.setString(2, password); // Store as plain text (encryption can be added later)
                stmt.setString(3, role);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "User added successfully!");
                loadTableData();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error adding user!");
            }
        }
    }
    
    public void loadTableData() {
        // Ensure the DefaultTableModel is linked to the JTable
        DefaultTableModel tableModel = (DefaultTableModel) usersTable.getModel();

        // Clear existing rows in the table
        tableModel.setRowCount(0);

        // Load data from the database
        try (Connection conn = DBConnection.getConnection()) {
            String query = "SELECT user_id, username, role FROM users";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Iterate through the ResultSet and add rows to the table model
            while (rs.next()) {
                int id = rs.getInt("user_id");
                String username = rs.getString("username");
                String role = rs.getString("role");
                tableModel.addRow(new Object[]{id, username, role});      
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Error loading data into the table!");
        }
    }
    

    // >>>>>>>>>>>>    Quiz    <<<<<<<<<<<
    
    
    public String generateQuizCode() {
        int randomDigits = (int) (Math.random() * 900000) + 100000; 
        return "QZ" + randomDigits;
    }
    
    public void createQuiz(String quizName, String quizDesc) {
        String quizCode = generateQuizCode(); // Generate unique code
        try (Connection conn = DBConnection.getConnection()) {
            String query = "INSERT INTO quizzes (quiz_code, quiz_name, quiz_desc) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, quizCode);
            stmt.setString(2, quizName);
            stmt.setString(3, quizDesc); 
            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Quiz created! Code: " + quizCode);
            qt.setText("\" Quiz created! Code: \"" + quizCode);
            loadQuizTable();
        } catch (Exception ex) {
            ex.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error creating quiz!");
        }
    }
    
    public void loadQuizzes(DefaultTableModel tableModel) {
        tableModel.setRowCount(0); 
        try (Connection conn = DBConnection.getConnection()) {
            String query = "SELECT quiz_code, quiz_name, quiz_desc FROM quizzes";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String quizCode = rs.getString("quiz_code");
                String quizName = rs.getString("quiz_name");
//                String quizDesc = rs.getString("quiz_desc");
                tableModel.addRow(new Object[]{quizCode, quizName});
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading quizzes!");
        }
    }
    
    private void openAddQuestionsFrame() {
        DefaultTableModel tableModel1 = (DefaultTableModel) quizTable.getModel();

        // Ensure there is a model attached to the table
        if (tableModel1 == null) {
            qt.setText("\" Table model is not initialized! \"");
            return;
        }

        // Check if a row is selected
        int selectedRow = quizTable.getSelectedRow();
        if (selectedRow == -1) {
            qt.setText("\" Please select a quiz to add questions! \"");
            return;
        }

        // Retrieve the selected quiz details
        String quizCode = (String) tableModel1.getValueAt(selectedRow, 0); // QUIZ CODE column
        String quizName = (String) tableModel1.getValueAt(selectedRow, 1); // QUIZ CODE column

        // Open the AddQuestionsFrame and pass the quizCode
        AddQuestionComponent aqf = new AddQuestionComponent(quizCode, quizName);
        aqf.setVisible(true);
}


//    private void loadQuizTable() {
//        DefaultTableModel tableModel1 = (DefaultTableModel) quizTable.getModel();
//        tableModel.setRowCount(0); // Clear existing rows
//
//        try (Connection conn = DBConnection.getConnection()) {
//            String query = "SELECT quiz_code, quiz_name, quiz_desc FROM quizzes";
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//
//            while (rs.next()) {
//                String quizCode = rs.getString("quiz_code");
//                String quizName = rs.getString("quiz_name");
//                String quizDesc = rs.getString("quiz_desc");
//                tableModel.addRow(new Object[]{quizCode, quizName, quizDesc});
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Error loading quizzes: " + ex.getMessage());
//        }
//    }

    public void loadQuizTable() {
        // Ensure the DefaultTableModel is linked to the JTable
        DefaultTableModel tableModel1 = (DefaultTableModel) quizTable.getModel();

        // Clear existing rows in the table
        tableModel1.setRowCount(0);

        // Load data from the database
        try (Connection conn = DBConnection.getConnection()) {
            String query = "SELECT quiz_code, quiz_name, quiz_desc FROM quizzes";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Iterate through the ResultSet and add rows to the table model
            while (rs.next()) {
                String quizCode = rs.getString("quiz_code");
                String quizName = rs.getString("quiz_name");
                tableModel1.addRow(new Object[]{quizCode, quizName});     
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading data into the table!");
        }
    }
    
    private void deleteQuiz() {
    // Retrieve the table model
    DefaultTableModel tableModel1 = (DefaultTableModel) quizTable.getModel();

    // Ensure the table model is initialized
    if (tableModel1 == null) {
//        JOptionPane.showMessageDialog(this, "Table model is not initialized!", "Error", JOptionPane.ERROR_MESSAGE);
        qt.setText("\" Table model is not initialized! \"");
        return;
    }

    // Check if a row is selected
    int selectedRow = quizTable.getSelectedRow();
    if (selectedRow == -1) {
//        JOptionPane.showMessageDialog(this, "Please select a quiz to delete!", "Error", JOptionPane.WARNING_MESSAGE);
        qt.setText("\" Please select a quiz to delete! \"");
        return;
    }

    // Retrieve quiz details from the selected row
    String quizCode = (String) tableModel1.getValueAt(selectedRow, 0); // QUIZ CODE column
    String quizName = (String) tableModel1.getValueAt(selectedRow, 1); // QUIZ NAME column

    // Confirm deletion
    JLabel confirmationLabel1 = new JLabel("Are you sure you want to delete the quiz \"" + quizName + "\"?");
    confirmationLabel1.setFont(CinzelB.getFont(12));
    int result = JOptionPane.showConfirmDialog(
            this,
            confirmationLabel1,
            "Quiz7 >> Delete Quiz",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
    );

    if (result == JOptionPane.YES_OPTION) {
        try (Connection conn = DBConnection.getConnection()) {
            // Execute delete query
            String query = "DELETE FROM quizzes WHERE quiz_code = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, quizCode);
                stmt.executeUpdate();
            }

            // Remove the row from the table
            tableModel1.removeRow(selectedRow);

            // Success message
            JLabel successLabel1 = new JLabel("Quiz \"" + quizName + "\" deleted successfully!");
            successLabel1.setFont(CinzelB.getFont(12));
            JOptionPane.showMessageDialog(this, successLabel1, "Quiz7 >> Success", JOptionPane.INFORMATION_MESSAGE);
            loadQuizTable();
        } catch (Exception ex) {
            ex.printStackTrace();
            JLabel errorLabel1 = new JLabel("Error deleting quiz: " + ex.getMessage());
            errorLabel1.setFont(CinzelB.getFont(12));
            JOptionPane.showMessageDialog(this, errorLabel1, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


    
    
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel DashboardPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel QuizClick;
    private javax.swing.JPanel QuizPanel;
    private javax.swing.JPanel ReportsPanel;
    public javax.swing.JTabbedPane TAB;
    private javax.swing.JPanel UsersPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton addQuestionsButton;
    private javax.swing.JButton createQuizButton;
    private javax.swing.JLabel dashboardClick;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteQuizButton;
    private javax.swing.JButton genReportButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lf;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel qt;
    private javax.swing.JLabel quizCount;
    private javax.swing.JTextArea quizDescArea;
    private javax.swing.JTextField quizNameField;
    private javax.swing.JTable quizResultTable;
    private javax.swing.JTable quizTable;
    private javax.swing.JButton rRefreshButton;
    private javax.swing.JLabel reportsClick;
    private javax.swing.JLabel reportsCount;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel usersCount;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}

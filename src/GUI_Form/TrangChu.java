/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author phanb
 */
public class TrangChu extends javax.swing.JPanel {

    /**
     * Creates new form TrangChu
     */
    public TrangChu() {
        initComponents();
        setNgayGio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTieuDe = new javax.swing.JLabel();
        txtTieuDe = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        lblTieuDe.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(204, 0, 102));
        lblTieuDe.setText("Ngày làm việc");
        add(lblTieuDe);
        lblTieuDe.setBounds(20, 50, 150, 28);

        txtTieuDe.setEditable(false);
        txtTieuDe.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        add(txtTieuDe);
        txtTieuDe.setBounds(200, 50, 382, 34);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_big/j3.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1117,676 );
        
//        Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
//        setMaximumSize(DimMax);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }// </editor-fold>//GEN-END:initComponents

    private void setNgayGio(){
//        Date date=java.util.Calendar.getInstance().getTime(); 
    //	Date date = new Date(System.currentTimeMillis());
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
    //	SimpleDateFormat timeFormat = new SimpleDateFormat("dd/MM/yyyy"); 
    	SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss aaa   dd/MM/yyyy ");
    	String s = timeFormat.format(date);
        txtTieuDe.setText(""+s);
        
    }
    
    
//	lbl_ngayHT.setBounds(35, 6, 90, 20);
//	pn_Tong.add(lbl_gtngayHT = new JLabel());
//	Date today=new Date(System.currentTimeMillis()); // lấy thời gian thực
//    SimpleDateFormat timeFormat = new SimpleDateFormat("dd/MM/yyyy");   // định dạng kiểu ngày	
//	String s=timeFormat.format(today.getTime());
//	pn_Tong.add(lbl_gtngayHT = new JLabel(s));
//	lbl_gtngayHT.setForeground(Color.BLUE);
//	lbl_gtngayHT.setBounds(128, 6, 90, 20);
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JTextField txtTieuDe;
    // End of variables declaration//GEN-END:variables
}
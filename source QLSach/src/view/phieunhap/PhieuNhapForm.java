/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.phieunhap;

import controller.db;
import controller.quanliphieunhap;
import controller.quanliphieunhapsach;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.nhapmasach;
import model.phieunhap;

/**
 *
 * @author thien
 */
public class PhieuNhapForm extends javax.swing.JFrame {

    /**
     * Creates new form PhieuNhapForm
     */
    public PhieuNhapForm() throws SQLException {
        initComponents();
        laydulieuvaobang();
    }
    public void check_emty()
    {
        if(ma_phieu_nhap.getText().equalsIgnoreCase("")==true||nxb.getText().equalsIgnoreCase("")==true||ma_nv.getText().equalsIgnoreCase("")==true||soluong.getText().equalsIgnoreCase("")==true||masachnhap.getText().equalsIgnoreCase("")==true||gianhap.getText().equalsIgnoreCase("")==true||tensachnhap.getText().equalsIgnoreCase("")==true||ngaynhap.getText().equalsIgnoreCase("")==true)
        {
        
            JOptionPane.showMessageDialog(this, "Bạn phải nhập đầy đủ thông tin");
        }
    }
     public void resetTable()
    {
     DefaultTableModel dm = (DefaultTableModel)phieunhap_table.getModel();
while(dm.getRowCount() > 0)
{
    dm.removeRow(0);
}
    
    }
      public void laydulieuvaobang() throws SQLException
    {
        quanliphieunhapsach ql =new quanliphieunhapsach();
        ArrayList<phieunhap> nms =ql.get_maphieunhap();
        DefaultTableModel nhapsach =(DefaultTableModel) phieunhap_table.getModel();
        for(phieunhap a :nms)
        {
            Object b[]={a.getMaphieunhap(),a.getManv(),a.getMasach(),a.getTensach(),a.getNxb(),a.getSoluong(),a.getGianhap(),a.getNgaynhap()};
            nhapsach.addRow(b);
            
        }
        
        
        
    
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ma_phieu_nhap = new javax.swing.JTextField();
        masachnhap = new javax.swing.JTextField();
        tensachnhap = new javax.swing.JTextField();
        soluong = new javax.swing.JTextField();
        gianhap = new javax.swing.JTextField();
        ngaynhap = new javax.swing.JTextField();
        ma_nv = new javax.swing.JTextField();
        nxb = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        them = new javax.swing.JButton();
        sua = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        datlai = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        phieunhap_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("PHIẾU NHẬP");

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setText("Mã phiếu nhập");

        jLabel3.setText("Mã nhân viên");

        jLabel4.setText("Mã sách nhập");

        jLabel5.setText("Tên sách nhập");

        jLabel6.setText("NXB");

        jLabel7.setText("Số lượng");

        jLabel8.setText("Giá nhập");

        jLabel9.setText("Ngày nhập");

        masachnhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                masachnhapKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(masachnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ma_phieu_nhap)
                        .addComponent(tensachnhap, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                    .addComponent(nxb, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(soluong)
                    .addComponent(gianhap)
                    .addComponent(ngaynhap, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(ma_nv))
                .addGap(115, 115, 115))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ma_phieu_nhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(masachnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ma_nv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(soluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(gianhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(jLabel8))))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel9)
                        .addComponent(ngaynhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tensachnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        them.setText("Thêm ");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        sua.setText("Sửa");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });

        xoa.setText("Xóa");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        datlai.setText("Đặt lại");
        datlai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datlaiActionPerformed(evt);
            }
        });

        jButton6.setText("Đóng");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setText("reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(sua, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(datlai, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(them, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(datlai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(xoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        phieunhap_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu nhập", "Mã nhân viên", "Mã  sách nhập", "Tên sách nhập", "NXB", "Số lượng", "Giá nhập", "Ngày nhập"
            }
        ));
        phieunhap_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phieunhap_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(phieunhap_table);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
        
        check_emty();
        db db =new db();
        quanliphieunhap ql =new quanliphieunhap();
       
        try {
            if(db.check_nv(ma_nv.getText())==true)
            {
                JOptionPane.showMessageDialog(this, "Bạn đã nhập sai mã nhân viên!");
                
            }
            else{
                
                
                if(ql.check_masach(masachnhap.getText())==true)
                {
                    JOptionPane.showMessageDialog(this, "Bạn đã nhập sai mã sách!");
                    
                }
                else{
                    quanliphieunhapsach qlpns =new quanliphieunhapsach();
                    
                    qlpns.them_phieunhap(ma_phieu_nhap.getText(), masachnhap.getText(), ma_nv.getText(), soluong.getText(), gianhap.getText(), ngaynhap.getText());
                    
                    resetTable();
                    
                    laydulieuvaobang();
                    JOptionPane.showMessageDialog(this, "thêm thành công");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_themActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        // TODO add your handling code here:
        
         check_emty();
        db db =new db();
         quanliphieunhap ql =new quanliphieunhap();
        quanliphieunhapsach qls =new quanliphieunhapsach();
        try {
            if(db.check_nv(ma_nv.getText())==true)
            {
                JOptionPane.showMessageDialog(this, "Bạn đã nhập sai mã nhân viên!");
            }
            else{
                if(ql.check_masach(masachnhap.getText())==true)
                {
                    JOptionPane.showMessageDialog(this, "Bạn đã nhập sai mã sách!");
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "Bạn chỉ sửa được số lượng,giá nhập ,ngày nhập");
                    qls.sua_phieunhap(ma_phieu_nhap.getText(), soluong.getText(), gianhap.getText(), ngaynhap.getText());
                   resetTable();
                    laydulieuvaobang();
                    JOptionPane.showMessageDialog(this, "Sửa thành công");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapForm.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            
       
        
    }//GEN-LAST:event_suaActionPerformed

    private void masachnhapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_masachnhapKeyReleased
        // TODO add your handling code here:
        quanliphieunhapsach db =new quanliphieunhapsach();
        quanliphieunhap ql =new quanliphieunhap();
        try {
            if(ql.check_masach(masachnhap.getText())==false)
            {
                ArrayList<nhapmasach> nms= db.tim_sach(masachnhap.getText());
                for(nhapmasach a : nms)
                {
                    tensachnhap.setText(a.getTensachnhap());
                    nxb.setText(a.getNxb());
                }
                
                
            }
            else
            {
                tensachnhap.setText("");
                nxb.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_masachnhapKeyReleased

    private void phieunhap_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phieunhap_tableMouseClicked
       
            // TODO add your handling code here:
            int row=phieunhap_table.getSelectedRow();
            ma_phieu_nhap.setText(phieunhap_table.getValueAt(row, 0)+"");
               ma_nv.setText(phieunhap_table.getValueAt(row, 1)+"");
                masachnhap.setText(phieunhap_table.getValueAt(row, 2)+"");
                tensachnhap.setText(phieunhap_table.getValueAt(row, 3)+"");
                nxb.setText(phieunhap_table.getValueAt(row, 4)+"");
                soluong.setText(phieunhap_table.getValueAt(row, 5)+"");
                
               
                gianhap.setText(phieunhap_table.getValueAt(row, 6)+"");
                ngaynhap.setText(phieunhap_table.getValueAt(row, 7)+"");
                
            
//            quanliphieunhapsach ql =new quanliphieunhapsach();
//            
//            
//            
//            
//            ArrayList<phieunhap>    pn = ql.timkiem_phieunhap(ma_phieu_nhap.getText());
//            
//            
//            
//            resetTable();
//            for(phieunhap m :pn)
//            {
//                ma_phieu_nhap.setText(m.getMaphieunhap());
//                ma_nv.setText(m.getManv());
//                nxb.setText(m.getNxb());
//                soluong.setText(m.getSoluong());
//                tensachnhap.setText(m.getTensach());
//                masachnhap.setText(m.getMasach());
//                gianhap.setText(m.getGianhap());
//                ngaynhap.setText(m.getNgaynhap());
//                ma_nv.setText(m.getManv());
//                
//                
//            }
//            laydulieuvaobang();
//        } catch (SQLException ex) {
//            Logger.getLogger(PhieuNhapForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
       
    }//GEN-LAST:event_phieunhap_tableMouseClicked

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
        check_emty();
        db db =new db();
        quanliphieunhap ql =new quanliphieunhap();
        quanliphieunhapsach qls =new quanliphieunhapsach();
        try {
            if(db.check_nv(ma_nv.getText())==true)
            {
                JOptionPane.showMessageDialog(this, "Bạn đã nhập sai mã nhân viên!");
            }
            else{
                if(ql.check_masach(masachnhap.getText())==true)
                {
                    JOptionPane.showMessageDialog(this, "Bạn đã nhập sai mã sách!");
                    
                }
                else
                {
                    try {
                        qls.xoa_phieunhap(ma_phieu_nhap.getText()+"");
                        JOptionPane.showMessageDialog(this, "Xóa thành công");
                        resetTable();
                        laydulieuvaobang();
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(PhieuNhapForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_xoaActionPerformed

    private void datlaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datlaiActionPerformed
        // TODO add your handling code here:
        resetTable();
        try {
            laydulieuvaobang();
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_datlaiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ma_phieu_nhap.setText("");
                ma_nv.setText("");
                nxb.setText("");
                soluong.setText("");
                tensachnhap.setText("");
                masachnhap.setText("");
                gianhap.setText("");
                ngaynhap.setText("");
                
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PhieuNhapForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhieuNhapForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhieuNhapForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhieuNhapForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PhieuNhapForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PhieuNhapForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton datlai;
    private javax.swing.JTextField gianhap;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ma_nv;
    private javax.swing.JTextField ma_phieu_nhap;
    private javax.swing.JTextField masachnhap;
    private javax.swing.JTextField ngaynhap;
    private javax.swing.JTextField nxb;
    private javax.swing.JTable phieunhap_table;
    private javax.swing.JTextField soluong;
    private javax.swing.JButton sua;
    private javax.swing.JTextField tensachnhap;
    private javax.swing.JButton them;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
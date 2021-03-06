/*
 * Author: Phan Xuân Bách
 */
package Jpanel_Form_QuanLy;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Entities.KhachHang_entity;
import Entities.NhanVien_entity;
import Jpanel_Form_NhanVien.QuanLyKH;
import Model.NhanVien_model;

/**
 *
 * @author phanb
 */
public class QuanLyNV extends javax.swing.JPanel {

	/**
	 * Creates new form QuanLyNV
	 */
	Connection conn;
	PreparedStatement stmt;
	DefaultTableModel md = new DefaultTableModel();
	NhanVien_model nv_md = new NhanVien_model();
	ArrayList<NhanVien_entity> nv_en = new ArrayList<>();

	public QuanLyNV() {
		initComponents();
		getdl();
	}

	public void getdl() {
		nv_en = nv_md.getData();
		Vector col = new Vector();
		int i = 1;
		col.addElement("Mã nhân viên");
		col.addElement("Họ tên");
		col.addElement("Số CMND");
		col.addElement("Giới tính");
		col.addElement("Ngày sinh");
		col.addElement("Email");
		col.addElement("Số điện thoại");
		col.addElement("Địa chỉ");
		col.addElement("Chức vụ");
		col.addElement("Tài khoản");
		col.addElement("Mật khẩu");

		Vector data = new Vector();
		for (NhanVien_entity obs : nv_en) {
			Vector row = new Vector();
			row.add(obs.getMaNV());
			row.add(obs.getHoTen());
			row.add(obs.getSoCMND());
			if (obs.isGioiTinh() == true) {
				row.add("Nam");
			} else {
				row.add("Nữ");
			}
			row.add(obs.getNgaySinh());
			row.add(obs.getEmail());
			row.add(obs.getSoDienThoai());
			row.add(obs.getDiachi());
			row.add(obs.getChucVu());
			row.add(obs.getTaiKhoan());
			row.add(obs.getMatKhau());

			data.add(row);
		}
		md = new DefaultTableModel(data, col);

		jTable1.setModel(md);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		pnlChiTiet = new javax.swing.JPanel();
		lblMaNV = new javax.swing.JLabel();
		txtMaNV = new javax.swing.JTextField();
		lblHoTen = new javax.swing.JLabel();
		txtHoTen = new javax.swing.JTextField();
		lblSoCMND = new javax.swing.JLabel();
		txtCMND = new javax.swing.JTextField();
		lblSoDT = new javax.swing.JLabel();
		txtSoDT = new javax.swing.JTextField();
		lblTaiKhoan = new javax.swing.JLabel();
		txtTaiKhoan = new javax.swing.JTextField();
		lblDiaChi = new javax.swing.JLabel();
		txtDiaChi = new javax.swing.JTextField();
		lblMatKhau = new javax.swing.JLabel();
		txtMatKhau1 = new javax.swing.JTextField();
		lblEmail = new javax.swing.JLabel();
		txtEmail = new javax.swing.JTextField();
		lblGioiTinh = new javax.swing.JLabel();
		radNam = new javax.swing.JRadioButton();
		radNu = new javax.swing.JRadioButton();
		lblNamSinh = new javax.swing.JLabel();
		lblChucVu = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox<String>();
		jDateChooser1 = new com.toedter.calendar.JDateChooser();
		pnlChucNang = new javax.swing.JPanel();
		btnThem = new javax.swing.JButton();
		btnCapNhat = new javax.swing.JButton();
		btnXoa = new javax.swing.JButton();
		btnXoaTrang = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		pnlChiTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		lblMaNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		lblMaNV.setText("Mã nhân viên");

		txtMaNV.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				// txtMaNVActionPerformed(evt);
			}
		});

		lblHoTen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		lblHoTen.setText("Họ tên");

		txtHoTen.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtHoTenActionPerformed(evt);
			}
		});

		lblSoCMND.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		lblSoCMND.setText("Số CMND");

		txtCMND.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtCMNDActionPerformed(evt);
			}
		});

		lblSoDT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		lblSoDT.setText("Số điện thoại");

		txtSoDT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtSoDTActionPerformed(evt);
			}
		});

		lblTaiKhoan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		lblTaiKhoan.setText("Tài khoản");

		txtTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtTaiKhoanActionPerformed(evt);
			}
		});

		lblDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		lblDiaChi.setText("Địa chỉ");

		txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtDiaChiActionPerformed(evt);
			}
		});

		lblMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		lblMatKhau.setText("Mật khẩu");

		lblEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		lblEmail.setText("Email");

		txtEmail.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtEmailActionPerformed(evt);
			}
		});

		lblGioiTinh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		lblGioiTinh.setText("Giới tính");

		radNam.setText("Nam");

		radNu.setText("Nữ");

		lblNamSinh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		lblNamSinh.setText("Ngày sinh");

		lblChucVu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
		lblChucVu.setText("Chức vụ");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nhân viên bán hàng", "Quản lý" }));

		pnlChucNang.setBorder(new javax.swing.border.MatteBorder(null));

		btnThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/btn_add.png"))); // NOI18N
		btnThem.setText("Thêm");
		btnThem.setBorder(new javax.swing.border.MatteBorder(null));

		btnCapNhat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		btnCapNhat.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/image/icon/Actions-document-edit-icon.png"))); // NOI18N
		btnCapNhat.setText("Cập nhật");
		btnCapNhat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCapNhatActionPerformed(evt);
			}
		});

		btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/btn_delete.png"))); // NOI18N
		btnXoa.setText("Xóa");
		btnXoa.setBorder(new javax.swing.border.MatteBorder(null));
		btnXoa.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnXoaActionPerformed(evt);
			}
		});

		btnXoaTrang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		btnXoaTrang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/edit-clear.png"))); // NOI18N
		btnXoaTrang.setText("Xóa trắng");
		btnXoaTrang.setBorder(new javax.swing.border.MatteBorder(null));
		btnXoaTrang.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnXoaTrangActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout pnlChucNangLayout = new javax.swing.GroupLayout(pnlChucNang);
		pnlChucNang.setLayout(pnlChucNangLayout);
		pnlChucNangLayout.setHorizontalGroup(
				pnlChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						pnlChucNangLayout.createSequentialGroup().addContainerGap().addGroup(pnlChucNangLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
								.addGap(52, 52, 52)
								.addGroup(pnlChucNangLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(btnXoaTrang, javax.swing.GroupLayout.DEFAULT_SIZE, 132,
												Short.MAX_VALUE)
										.addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		btnThem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnThemActionPerformed(evt);
			}
		});
		pnlChucNangLayout.setVerticalGroup(pnlChucNangLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlChucNangLayout.createSequentialGroup().addGap(22, 22, 22)
						.addGroup(
								pnlChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 60,
												Short.MAX_VALUE)
										.addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(pnlChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(26, 26, 26)));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null } },
				new String[] { "Mã nhân viên", "Họ tên", "Số CMND", "Giới tính", "Năm sinh", "Email", "Số điện thoại",
						"Địa chỉ", "Chức vụ", "Tài khoản", "Mật khẩu" }));

		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tblKhMouseClicked(evt);
			}
		});

		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout pnlChiTietLayout = new javax.swing.GroupLayout(pnlChiTiet);
		pnlChiTiet.setLayout(pnlChiTietLayout);
		pnlChiTietLayout.setHorizontalGroup(pnlChiTietLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlChiTietLayout.createSequentialGroup().addContainerGap().addGroup(pnlChiTietLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jScrollPane1)
						.addGroup(pnlChiTietLayout.createSequentialGroup().addGroup(pnlChiTietLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(pnlChiTietLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(lblNamSinh, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(pnlChiTietLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(pnlChiTietLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(lblSoCMND, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 92,
																Short.MAX_VALUE)
														.addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addComponent(lblSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 67,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(pnlChiTietLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(pnlChiTietLayout.createSequentialGroup().addComponent(txtDiaChi)
												.addGap(252, 252, 252))
										.addGroup(pnlChiTietLayout.createSequentialGroup().addGroup(pnlChiTietLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE,
														169, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(txtCMND, javax.swing.GroupLayout.DEFAULT_SIZE, 200,
														Short.MAX_VALUE)
												.addComponent(txtHoTen).addComponent(txtMaNV).addComponent(txtSoDT))
												.addGap(29, 29, 29)
												.addGroup(pnlChiTietLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(lblMatKhau,
																javax.swing.GroupLayout.PREFERRED_SIZE, 110,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(lblTaiKhoan,
																javax.swing.GroupLayout.PREFERRED_SIZE, 110,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
																110, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(lblGioiTinh,
																javax.swing.GroupLayout.PREFERRED_SIZE, 110,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(lblChucVu, javax.swing.GroupLayout.PREFERRED_SIZE,
																110, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(pnlChiTietLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(pnlChiTietLayout.createSequentialGroup()
																.addGap(6, 6, 6).addComponent(radNam).addGap(28, 28, 28)
																.addComponent(radNu))
														.addGroup(pnlChiTietLayout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jComboBox1,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 230,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(pnlChiTietLayout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(pnlChiTietLayout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(txtMatKhau1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				230,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(txtEmail,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				230,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(txtTaiKhoan,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				230,
																				javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addGap(8, 8, 8)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pnlChucNang, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(22, 22, 22)));
		pnlChiTietLayout
				.setVerticalGroup(pnlChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(pnlChiTietLayout.createSequentialGroup().addContainerGap()
								.addGroup(pnlChiTietLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(pnlChucNang, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlChiTietLayout
												.createSequentialGroup().addGroup(pnlChiTietLayout.createParallelGroup(
														javax.swing.GroupLayout.Alignment.LEADING).addComponent(
																txtTaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(pnlChiTietLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(lblMaNV).addComponent(txtMaNV,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(lblTaiKhoan)))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(pnlChiTietLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(lblHoTen)
														.addGroup(pnlChiTietLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(txtHoTen,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(lblMatKhau).addComponent(txtMatKhau1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(pnlChiTietLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(pnlChiTietLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(lblSoCMND).addComponent(
																		txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(pnlChiTietLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(lblEmail)
																.addComponent(txtEmail,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(pnlChiTietLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(lblSoDT)
														.addGroup(pnlChiTietLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(txtSoDT,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(lblGioiTinh).addComponent(radNam)
																.addComponent(radNu)))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(pnlChiTietLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(lblNamSinh)
														.addComponent(
																jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(pnlChiTietLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(lblChucVu).addComponent(jComboBox1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(pnlChiTietLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(lblDiaChi).addComponent(txtDiaChi,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
								.addContainerGap()));

		ButtonGroup group = new ButtonGroup();
		group.add(radNam);
		group.add(radNu);
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(pnlChiTiet,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap().addComponent(pnlChiTiet,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
	}// </editor-fold>//GEN-END:initComponents

	private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtMaNVActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtMaNVActionPerformed

	private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtHoTenActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtHoTenActionPerformed

	private void txtCMNDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCMNDActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtCMNDActionPerformed

	private void txtSoDTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtSoDTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtSoDTActionPerformed

	private void txtTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtTaiKhoanActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtTaiKhoanActionPerformed

	private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDiaChiActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtDiaChiActionPerformed

	private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtEmailActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtEmailActionPerformed

	private void tblKhMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		txtMaNV.setEditable(false);
		txtMaNV.setForeground(Color.red);
		txtMaNV.setBackground(new java.awt.Color(153, 153, 153));
		Locale locale = new Locale("vi", "VN");
		NumberFormat fmx = NumberFormat.getCurrencyInstance(locale);
		NumberFormat fm = new DecimalFormat("#,###,###");
		nv_en = nv_md.getData();
		int row = jTable1.getSelectedRow();
		String manv = md.getValueAt(row, 0).toString();
		String hoten = md.getValueAt(row, 1).toString();
		String cmnd = md.getValueAt(row, 2).toString();
		String gioiTinh = md.getValueAt(row, 3).toString();
		Date date = null;
		try {
			date = new SimpleDateFormat("dd-MM-yyyy").parse((String) nv_en.get(row).getNgaySinh());
			jDateChooser1.setDate(date);
		} catch (ParseException ex) {
			Logger.getLogger(QuanLyKH.class.getName()).log(Level.SEVERE, null, ex);
		}
		String email = md.getValueAt(row, 5).toString();
		String sdt = md.getValueAt(row, 6).toString();
		String dc = md.getValueAt(row, 7).toString();
		String chucvu = md.getValueAt(row, 8).toString();
		String taikhoan = md.getValueAt(row, 9).toString();
		String matkhau = md.getValueAt(row, 10).toString();

		txtMaNV.setText(manv);
		txtHoTen.setText(hoten);
		txtCMND.setText(cmnd);
		txtEmail.setText(email);
		txtDiaChi.setText(dc);
		txtSoDT.setText(sdt);
		if (gioiTinh.equalsIgnoreCase("Nam")) {
			radNam.setSelected(true);

		} else {
			radNu.setSelected(true);
		}
		txtTaiKhoan.setText(taikhoan);
		txtMatKhau1.setText(matkhau);
		jComboBox1.setSelectedItem(chucvu);

	}// GEN-LAST:event_tblKhMouseClicked

	private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		boolean check = true;
		NhanVien_entity nv_en = new NhanVien_entity();
		String ma_nv = txtMaNV.getText();
		String ho_Ten = txtHoTen.getText();
		String cmnd = txtCMND.getText();
		boolean gioiTinh;
		if (radNam.isSelected()) {
			gioiTinh = true;
		} else {
			gioiTinh = false;
		}
		Date ngaySinh = jDateChooser1.getDate();
		String ngaySinh_input = new SimpleDateFormat("yyyy-MM-dd").format(ngaySinh);
		String email = txtEmail.getText();
		String soDT = txtSoDT.getText();
		String dc = txtDiaChi.getText();
		String cv = jComboBox1.getSelectedItem().toString();
		String tk = txtTaiKhoan.getText();
		String mk = txtMatKhau1.getText();
		if (ho_Ten.equals("") || cmnd.equals("") || ngaySinh.equals("") || email.equals("") || soDT.equals("")
				|| dc.equals("") || tk.equals("") || mk.equals("")) {
			JOptionPane.showMessageDialog(null, "hãy nhập đầy đủ thông tin", "LỖI!!!", JOptionPane.ERROR_MESSAGE);
			check = false;
		} else {
			if (kiemTraDL()) {
				if (check = true) {
					nv_en.setMaNV(ma_nv);
					nv_en.setHoTen(ho_Ten);
					nv_en.setSoCMND(cmnd);
					nv_en.setGioiTinh(gioiTinh);
					nv_en.setNgaySinh(ngaySinh_input);
					nv_en.setEmail(email);
					nv_en.setSoDienThoai(soDT);
					nv_en.setTaiKhoan(tk);
					nv_en.setMatKhau(mk);
					nv_en.setDiachi(dc);
					nv_en.setChucVu(cv);

				}
				try {
					if (nv_md.themNhanVien(nv_en)) {
						JOptionPane.showMessageDialog(null, "Thêm thành công", "THÀNH CÔNG",
								JOptionPane.INFORMATION_MESSAGE);
						getdl();
					}
				} catch (SQLException ex) {
					Logger.getLogger(QuanLyKH.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}

	}

	private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaActionPerformed
		// TODO add your handling code here:
		boolean check = true;
		nv_en = nv_md.getData();
		int row = jTable1.getSelectedRow();
		if (row == -1) {
			JOptionPane.showMessageDialog(null, "Chọn nhân viên cần xóa", "LỖI", JOptionPane.ERROR_MESSAGE);
			check = false;
		} else if (check = true) {
			int click = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn xóa", "THÔNG BÁO",
					JOptionPane.YES_NO_OPTION);

			if (click == JOptionPane.YES_OPTION) {
				nv_md.xoaNhanVien(nv_en.get(row).getMaNV());
				btnXoaTrangActionPerformed(evt);
				getdl();
				JOptionPane.showMessageDialog(null, "Xóa thành công", "THÀNH CÔNG", JOptionPane.INFORMATION_MESSAGE);
			} else if (click == JOptionPane.NO_OPTION)
				JOptionPane.showMessageDialog(null, "Xóa thất bại", "THẤT BẠI", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Chọn nhân viên cần xóa", "LỖI", JOptionPane.ERROR_MESSAGE);

		}
	}// GEN-LAST:event_btnXoaActionPerformed

	private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		nv_en = nv_md.getData();
		NhanVien_entity nv_ent1 = new NhanVien_entity();
		String ten = txtHoTen.getText();
		String cmnd = txtCMND.getText();
		boolean gioiTinh;
		if (radNam.isSelected()) {
			gioiTinh = true;
		} else {
			gioiTinh = false;
		}
		Date ngaySinh = jDateChooser1.getDate();
		String ngaySinh_input = new SimpleDateFormat("yyyy-MM-dd").format(ngaySinh);
		String email = txtEmail.getText();
		String soDT = txtSoDT.getText();
		String dc = txtDiaChi.getText();
		String tk = txtTaiKhoan.getText();
		String mk = txtMatKhau1.getText();
		String cv = jComboBox1.getSelectedItem().toString();
		boolean check = true;
		int row = jTable1.getSelectedRow();
		if (row == -1) {
			JOptionPane.showMessageDialog(null, "Bạn cần chọn nhân viên cần thay đổi thông tin", "LỖI",
					JOptionPane.ERROR_MESSAGE);
			check = false;
		} else {
			if (kiemTraDL()) {
				if (check == true) {
					nv_ent1.setHoTen(ten);
					nv_ent1.setSoCMND(cmnd);
					nv_ent1.setGioiTinh(gioiTinh);
					nv_ent1.setNgaySinh(ngaySinh_input);
					nv_ent1.setEmail(email);
					nv_ent1.setSoDienThoai(soDT);
					nv_ent1.setTaiKhoan(tk);
					nv_ent1.setMatKhau(mk);
					nv_ent1.setDiachi(dc);
					nv_ent1.setChucVu(cv);
					nv_ent1.setMaNV(nv_en.get(row).getMaNV());
					try {
						if (nv_md.capNhatNhanVien(nv_ent1)) {
							JOptionPane.showMessageDialog(null, "Cập nhật thành công", "THÀNH CÔNG",
									JOptionPane.INFORMATION_MESSAGE);
							btnXoaTrangActionPerformed(evt);
							getdl();
						} else {
							JOptionPane.showMessageDialog(null, "Lỗi sai thông tin nhân viên", "LỖI",
									JOptionPane.ERROR_MESSAGE);

						}
					} catch (SQLException ex) {
						Logger.getLogger(QuanLyKH.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
			}
		}

	}

	private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		txtMaNV.setEditable(true);
		txtMaNV.setForeground(Color.BLACK);
		txtMaNV.setBackground(new java.awt.Color(255, 255, 255));
		txtMaNV.setText("");
		txtHoTen.setText("");
		txtCMND.setText("");
		txtEmail.setText("");// email
		txtSoDT.setText("");
		txtTaiKhoan.setText("");
		txtMatKhau1.setText("");
		txtDiaChi.setText("");
	}

	/**
	 * KIỂM TRA DỮ LIỆU.
	 * 
	 * @return
	 */
	public boolean kiemTraDL() {
		String sdt = txtSoDT.getText().trim();
		String cmnd = txtCMND.getText().trim();
		String email = txtEmail.getText().trim();
		String pw = txtMatKhau1.getText().trim();
		if (!(cmnd.length() > 0 && cmnd.matches("\\d{9}"))) {
			JOptionPane.showMessageDialog(null,
					"Lỗi : Nhập số Chứng minh nhân dân sai định dạng!!!\n Chứng minh nhân dân gồm 9 chữ số");
			return false;
		}
		// Số điện thoại gồm 10 chữ số
		if (!(sdt.length() > 0 && sdt.matches("\\d{10}"))) {
			JOptionPane.showMessageDialog(null, "Lỗi : Nhập số điện thoại sai định dạng!!!\n Điện thoại gồm 10 chữ số");
			return false;
		}
		String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		if (!(email.length() > 0 && email.matches(EMAIL_REGEX))) {
			JOptionPane.showMessageDialog(null,
					"Lỗi : Nhập địa chỉ email sai định dạng!!!\nĐịa chỉ Email theo mẫu sau: xxx@xxx.com");
			return false;
		}
		String pass = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
		if (!(pw.length() > 0 && pw.matches(pass))) {
			JOptionPane.showMessageDialog(null,
					"Lỗi : Nhập sai định dạng mật khẩu!!!\nMật khẩu chứa ít nhất là 8 ký tự\nTrong đó có ít nhất 1 ký tự số từ 0-9, 1 ký tự chữ thường\n1 ký tự chữ hoa, 1 ký tự đặc biệt như: @#$%^");
			return false;
		}
		return true;
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnCapNhat;
	private javax.swing.JButton btnThem;
	private javax.swing.JButton btnXoa;
	private javax.swing.JButton btnXoaTrang;
	private javax.swing.JComboBox<String> jComboBox1;
	private com.toedter.calendar.JDateChooser jDateChooser1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JLabel lblChucVu;
	private javax.swing.JLabel lblDiaChi;
	private javax.swing.JLabel lblEmail;
	private javax.swing.JLabel lblGioiTinh;
	private javax.swing.JLabel lblHoTen;
	private javax.swing.JLabel lblMaNV;
	private javax.swing.JLabel lblMatKhau;
	private javax.swing.JLabel lblNamSinh;
	private javax.swing.JLabel lblSoCMND;
	private javax.swing.JLabel lblSoDT;
	private javax.swing.JLabel lblTaiKhoan;
	private javax.swing.JPanel pnlChiTiet;
	private javax.swing.JPanel pnlChucNang;
	private javax.swing.JRadioButton radNam;
	private javax.swing.JRadioButton radNu;
	private javax.swing.JTextField txtCMND;
	private javax.swing.JTextField txtDiaChi;
	private javax.swing.JTextField txtHoTen;
	private javax.swing.JTextField txtMaNV;
	private javax.swing.JTextField txtMatKhau1;
	private javax.swing.JTextField txtSoDT;
	private javax.swing.JTextField txtTaiKhoan;
	// End of variables declaration//GEN-END:variables
}

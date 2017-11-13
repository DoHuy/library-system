/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.librarian;

import common.controller.BookController;
import common.controller.BookRelaController;
import common.controller.CardController;
import common.controller.TaskController;
import entity.Book;
import entity.Borrower;
import entity.Card;
import entity.Copy;
import entity.RegistrationInfo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import user.controller.BorrowerController;

/**
 * Lớp bao cho nghiệp vụ mượn sách
 *
 * @author Raph
 */
public class LentForm extends javax.swing.JPanel {

    /**
     * Creates new form LentForm
     */
    public LentForm() {
        initComponents();
        lblStatusSearch.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldCardId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonSearchCardId = new javax.swing.JButton();
        lblStatusSearch = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelContact = new javax.swing.JLabel();
        jLabelStudentId = new javax.swing.JLabel();
        jLabelPeriod = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jTextFieldCardId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCardIdKeyTyped(evt);
            }
        });

        jLabel1.setText("Nhập mã thẻ mượn:");

        jButtonSearchCardId.setText("Tìm kiếm");
        jButtonSearchCardId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchCardIdActionPerformed(evt);
            }
        });

        lblStatusSearch.setForeground(new java.awt.Color(251, 0, 0));
        lblStatusSearch.setText("jLabel");

        jLabel2.setText("Tên người mượn:");

        jLabel3.setText("Giới tính:");

        jLabel4.setText("MSSV (nếu có):");

        jLabel5.setText("Email:");

        jLabel6.setText("Liên hệ:");

        jLabel7.setText("Giai đoạn học:");

        jLabel8.setText("Số tiền đặt cọc:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã số sách", "Mã số bản sao", "Số thứ tự", "Tiêu đề", "Thể loại", "Tác giả", "NPH", "Trạng thái", "Thời gian ĐK", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel9.setText("Danh sách đăng ký:");

        jLabelName.setText("null");

        jLabelGender.setText("null");

        jLabelEmail.setText("null");

        jLabelContact.setText("null");

        jLabelStudentId.setText("null");

        jLabelPeriod.setText("null");

        jLabelPrice.setText("null");

        jLabel10.setFont(new java.awt.Font("UTM Copperplate", 1, 24)); // NOI18N
        jLabel10.setText("Mượn sách");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelGender)
                                    .addComponent(jLabelName)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jLabelContact))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPeriod)
                            .addComponent(jLabelStudentId)
                            .addComponent(jLabelPrice))
                        .addGap(255, 255, 255))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldCardId, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jButtonSearchCardId)
                                .addGap(88, 88, 88)
                                .addComponent(lblStatusSearch)))
                        .addContainerGap(365, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCardId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearchCardId)
                    .addComponent(lblStatusSearch))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabelName)
                    .addComponent(jLabelStudentId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabelGender)
                    .addComponent(jLabelPeriod))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelPrice))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelContact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchCardIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchCardIdActionPerformed
        // TODO add your handling code here:
        update();

        String cardValue = jTextFieldCardId.getText();      // xem lại định dạng input
        if (Card.validateCardId(cardValue)) {
            JOptionPane.showMessageDialog(this, "Định dạng mã thẻ không chính xác", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (cardValue.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô tìm kiếm trống", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
        } else {
            int cardId = Integer.valueOf(cardValue);
            try {
                if (!CardController.getInstance().checkCard(cardId)) {
                    lblStatusSearch.setText("Không tồn tại mã thẻ");
                    lblStatusSearch.setVisible(true);
                } else {
                    int cardStatus = CardController.getInstance().getCardStatus(cardId);
                    switch (cardStatus) {
                        case Card.EXPIRED:
                            lblStatusSearch.setText("Thẻ này quá hạn sử dụng");
                            lblStatusSearch.setVisible(true);
                            break;
                        case Card.ACTIVE:
                            int borrowerId = CardController.getInstance().getBorrowerIdById(cardId);
                            if (borrowerId != Card.CARD_FREE) {
                                configLabel(borrowerId);  // find borrower over cardID
                                configTable(cardId);  // find registraton info
                            } else {
                                lblStatusSearch.setText("Thẻ này chưa được kích hoạt");
                                lblStatusSearch.setVisible(true);
                            }
                            break;
                        default:
                            lblStatusSearch.setText("Thẻ này bị hủy khả dụng");
                            lblStatusSearch.setVisible(true);
                            break;
                    }

                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(LentForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonSearchCardIdActionPerformed

    private void jTextFieldCardIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCardIdKeyTyped
        // TODO add your handling code here:
        lblStatusSearch.setVisible(false);
    }//GEN-LAST:event_jTextFieldCardIdKeyTyped

    /**
     * Mồi lần click vào hàng (1 cuốn bản sao) sẽ cho phép thực hiện mượn
     *
     * @param evt
     */
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        // here
        int row = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        if (!model.getValueAt(row, 7).equals("Borrowed")) {
            String copyId = model.getValueAt(row, 1).toString();
            try {
                // do smt here
                BookController.getInstance().updateCopyStatus(copyId, Copy.BORROWED);  // borrowed
                TaskController.getInstance().addBorrowedInfor(listRegisterId.get(row));
                model.setValueAt("Borrowed", row, 7); // set status to the table
                JOptionPane.showMessageDialog(this, "Mượn sách thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(LentForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Đã mượn cuốn sách này", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jTable1MouseClicked

    // need to check smt :v
    /**
     * Hàm kiểm tra bản copy đã quá hạn mượn hay chưa
     *
     * @param dateValue : ngày đăng ký
     * @return true nếu quá hạn (2 ngày), ngược lại trả về false (0, 1, 2 ngày
     * :v)
     */
    private boolean isExpiredCopy(Date dateValue) {
        Calendar cal1 = new GregorianCalendar();
        Calendar cal2 = new GregorianCalendar();

        long milis = System.currentTimeMillis();
        Date currentDate = new Date(milis);

        cal1.setTime(dateValue);
        cal2.setTime(currentDate);

        return daysBetween(cal1.getTime(), cal2.getTime()) > 2;
    }

    /**
     * Hàm tính toán số ngày giữa 2 thời điểm
     *
     * @param d1 : thời điểm 1
     * @param d2 : thời điểm 2
     * @return
     */
    private int daysBetween(Date d1, Date d2) {
        return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }

    /**
     * Hàm cấu hình lable hiển thị
     *
     * @param borrowerId : mã người mượn
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    private void configLabel(int borrowerId) throws ClassNotFoundException, SQLException {
        Borrower borrower = BorrowerController.getInstance().getBorrowerInfor(borrowerId);
        jLabelName.setText(borrower.getName());
        jLabelGender.setText(borrower.isIsFemale() ? "Nữ" : "Nam");
        jLabelEmail.setText(borrower.getEmail());
        jLabelContact.setText(borrower.getContact());
        jLabelStudentId.setText(borrower.getStudentId());
        jLabelPeriod.setText(borrower.getPeriod());
        jLabelPrice.setText(String.valueOf(borrower.getDeposit()));
    }

    /**
     * Hàm cấu hình bảng để hiển thị các thông tin cần thiết
     *
     * @param cardId : mã thẻ
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    private void configTable(int cardId) throws ClassNotFoundException, SQLException {
        ArrayList<RegistrationInfo> listRegistration = new ArrayList<>();
        Vector<Object> row;
        listRegistration = TaskController.getInstance().findRegistrationInfoOverCardId(cardId);

        if (!listRegistration.isEmpty()) {

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            for (RegistrationInfo r : listRegistration) {

                row = new Vector<>();
                int registerId = r.getRegisterId();
                String copyId = r.getCopyId();
                Date registerDate = r.getRegisterDate();

                // khi load dữ liệu, nếu cuốn sách mà bạn đăng ký đã quá hạn thì sẽ tự động xóa dữ liệu đăng ký đó + cập nhật trạng thái cho bản sao
                if (isExpiredCopy(registerDate)) {
                    TaskController.getInstance().deleteRegistrationInfor(registerId);
                    BookController.getInstance().updateCopyStatus(copyId, Copy.AVAILABLE);
                    continue;
                }

                listRegisterId.add(registerId);

                Copy copy = BookController.getInstance().searchCopyInforById(copyId);
                int orderNumber = copy.getOrderNumber();
                String copyStatus = translateCopyStatus(copy.getStatus());
                String bookId = copy.getBookId();
                double price = copy.getPrice();

                Book book = BookController.getInstance().getBookInfor(bookId);
                String bookName = book.getNameOfBook();
                int categoryID = book.getCategoryID();
                String category = BookRelaController.getInstance().getCategoryByID(categoryID);
                int publisherID = book.getPublisherID();
                String publisher = BookRelaController.getInstance().getPublisherByID(publisherID);
                String author = book.getAuthor();

                row.add(bookId);
                row.add(copyId);
                row.add(orderNumber);
                row.add(bookName);
                row.add(category);
                row.add(author);
                row.add(publisher);
                row.add(copyStatus);
                row.add(registerDate);
                row.add(price);

                model.addRow(row);
            }
        }
    }

    /**
     * Hàm chuyển đổi trạng thái (trong csdl là kiểu int) sang kiểu chuỗi
     *
     * @param status : trạng thái
     * @return String : chuỗi
     */
    private String translateCopyStatus(int status) {
        String s = null;
        switch (status) {
            case Copy.AVAILABLE:
                s = "Available";
                break;
            case Copy.PENDING:
                s = "Pending";
                break;
            case Copy.BORROWED:
                s = "Borrowed";
                break;
            case Copy.LENT:
                s = "Lent";
                break;
        }

        return s;
    }

    /**
     * Hàm update dữ liệu mỗi khi ấn tìm kiếm
     */
    private void update() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        jLabelName.setText("null");
        jLabelGender.setText("null");
        jLabelEmail.setText("null");
        jLabelContact.setText("null");
        jLabelStudentId.setText("null");
        jLabelPeriod.setText("null");
        jLabelPrice.setText("null");
    }

    private ArrayList<Integer> listRegisterId = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSearchCardId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelContact;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPeriod;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelStudentId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCardId;
    private javax.swing.JLabel lblStatusSearch;
    // End of variables declaration//GEN-END:variables
}

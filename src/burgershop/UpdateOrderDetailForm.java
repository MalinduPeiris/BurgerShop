package burgershop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
 
public class UpdateOrderDetailForm extends javax.swing.JFrame {

    private BurgerList burgerList;

    public UpdateOrderDetailForm() {
        this.burgerList = new BurgerList(new Burger[0]);
        initComponents();
        setLocationRelativeTo(null);
        orderStatusCmb.setEnabled(false);
        custIdTxt.setEditable(false);
        custNameTxt.setEditable(false);
        orderQtyTxt.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        orderStatusCmb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        orderIdTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        custIdTxt = new javax.swing.JTextField();
        custNameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        orderQtyTxt = new javax.swing.JTextField();
        totalLbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        updateOrderBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Orders");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jLabel1)
                .addContainerGap(327, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        exitBtn.setBackground(new java.awt.Color(204, 51, 0));
        exitBtn.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel2.setText("Order Status   :");

        orderStatusCmb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        orderStatusCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending...", "Delivered...", "Canceled..." }));
        orderStatusCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderStatusCmbActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel3.setText("Order ID               :");

        orderIdTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        orderIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIdTxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel4.setText("Customer ID        :");

        custIdTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        custNameTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel5.setText("Customer Name  : ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel6.setText("Order QTY            : ");

        orderQtyTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        orderQtyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderQtyTxtActionPerformed(evt);
            }
        });

        totalLbl.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel8.setText("Total                     : ");

        searchBtn.setBackground(new java.awt.Color(0, 204, 51));
        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        updateOrderBtn.setBackground(new java.awt.Color(0, 204, 51));
        updateOrderBtn.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        updateOrderBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateOrderBtn.setText("Update Order");
        updateOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOrderBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateOrderBtn)
                .addGap(37, 37, 37)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(orderIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(searchBtn))
                            .addComponent(custIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(46, 46, 46)
                                .addComponent(orderStatusCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(9, 9, 9)
                                .addComponent(custNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalLbl)
                                    .addComponent(orderQtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 447, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(orderStatusCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(orderIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(custIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(custNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(orderQtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLbl)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBtn)
                    .addComponent(updateOrderBtn))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        dispose();
        new MainPage().setVisible(true);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void orderStatusCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderStatusCmbActionPerformed
        
    }//GEN-LAST:event_orderStatusCmbActionPerformed

    private void orderIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIdTxtActionPerformed
        String orderId = orderIdTxt.getText();
        if (orderId.length()!=0) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("BurgerShopData.txt"));
                String line = br.readLine();
                burgerList = new BurgerList(new Burger[0]);
                while (line != null) {
                    String[] array = line.split(",");
                    Burger burger = new Burger(array[0].trim(), array[1].trim(), array[2].trim(), Integer.parseInt(array[3].trim()), Double.parseDouble(array[4].trim()), Integer.parseInt(array[5].trim()));
                    burgerList.addDataToArray(burger);
                    line = br.readLine();
                }

                Burger[] burgerArray = burgerList.getArray();
                for (int i = 0; i < burgerArray.length; i++) {
                    if (burgerArray[i].getOrderId().equalsIgnoreCase(orderId)) {
                        if (burgerArray[i].getOrderStatus()==0) {
                            orderStatusCmb.setEnabled(true);
                            custIdTxt.setEditable(true);
                            custNameTxt.setEditable(true);
                            orderQtyTxt.setEditable(true);
                            orderIdTxt.setEditable(false);
                            
                            orderStatusCmb.setSelectedIndex(0);
                            custIdTxt.setText(burgerArray[i].getCustomerId());
                            custNameTxt.setText(burgerArray[i].getCustomerName());
                            orderQtyTxt.setText(burgerArray[i].getOrderQty()+"");
                            totalLbl.setText(burgerArray[i].getTotal()+"");
                            
                        }else if(burgerArray[i].getOrderStatus()==1){ 
                            orderStatusCmb.setSelectedIndex(1);
                            custIdTxt.setText(burgerArray[i].getCustomerId());
                            custNameTxt.setText(burgerArray[i].getCustomerName());
                            orderQtyTxt.setText(burgerArray[i].getOrderQty()+"");
                            totalLbl.setText(burgerArray[i].getTotal()+"");
                            
                            orderStatusCmb.setEnabled(false);
                            custIdTxt.setEditable(false);
                            custNameTxt.setEditable(false);
                            orderQtyTxt.setEditable(false);
                            JOptionPane.showMessageDialog(this, orderId+" Order Is Already Delivered..\n You Cannot Edit this Order!!");
                            clearAll();
                        }else{
                            orderStatusCmb.setSelectedIndex(2);
                            custIdTxt.setText(burgerArray[i].getCustomerId());
                            custNameTxt.setText(burgerArray[i].getCustomerName());
                            orderQtyTxt.setText(burgerArray[i].getOrderQty()+"");
                            totalLbl.setText(burgerArray[i].getTotal()+"");
                            
                            orderStatusCmb.setEnabled(false);
                            custIdTxt.setEditable(false);
                            custNameTxt.setEditable(false);
                            orderQtyTxt.setEditable(false);
                            JOptionPane.showMessageDialog(this, orderId+" Order Is Already Canceled..\n You Cannot Edit this Order!!");
                            clearAll();
                        }
                    }
                }

            } catch (IOException ex) {
                System.getLogger(UpdateOrderDetailForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
    }//GEN-LAST:event_orderIdTxtActionPerformed

    public void clearAll(){
        orderStatusCmb.setSelectedIndex(0);
        orderIdTxt.setText("");
        custIdTxt.setText("");
        custNameTxt.setText("");
        orderQtyTxt.setText("");
        totalLbl.setText("");
    }
    
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        orderIdTxtActionPerformed(evt);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void updateOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOrderBtnActionPerformed
        String orderId=orderIdTxt.getText();
        Burger[] burgerArray = burgerList.getArray();
            for (int i = 0; i < burgerArray.length; i++) {
                if (burgerArray[i].getOrderId().equalsIgnoreCase(orderId)) {
                    if (burgerArray[i].getOrderStatus()==0) {
                        try {
                            String custID=custIdTxt.getText();
                            String custName=custNameTxt.getText();
                            int orderQty=Integer.parseInt(orderQtyTxt.getText());
                            double total=orderQty*burgerList.eachPrice;
                            totalLbl.setText(total+"");

                            Burger burger=new Burger(orderId, custID, custName, orderQty, total, orderStatusCmb.getSelectedIndex());
                            burgerArray[i]=burger;

                            FileWriter fw = new FileWriter("BurgerShopData.txt", false);
                            fw.write("");


                            fw=new FileWriter("BurgerShopData.txt", true);
                            for (int j = 0; j < burgerArray.length; j++) {
                                fw.write(burgerArray[j].getOrderId()+","+burgerArray[j].getCustomerId()+","+burgerArray[j].getCustomerName()+","+burgerArray[j].getOrderQty()+","+burgerArray[j].getTotal()+","+burgerArray[j].getOrderStatus()+"\n");
                                System.out.println(j);
                            }
                            fw.close();
                            JOptionPane.showMessageDialog(this, orderId+" Updated Success..");
                            orderIdTxt.setEditable(false);
                            orderStatusCmb.setEnabled(false);
                            custIdTxt.setEditable(false);
                            custNameTxt.setEditable(false);
                            orderQtyTxt.setEditable(false);
                            clearAll();
                        } catch (IOException ex) {
                            System.getLogger(UpdateOrderDetailForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                        }
                    }
                }
            }
    
        
    }//GEN-LAST:event_updateOrderBtnActionPerformed

    private void orderQtyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderQtyTxtActionPerformed
        
    }//GEN-LAST:event_orderQtyTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField custIdTxt;
    private javax.swing.JTextField custNameTxt;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField orderIdTxt;
    private javax.swing.JTextField orderQtyTxt;
    private javax.swing.JComboBox<String> orderStatusCmb;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel totalLbl;
    private javax.swing.JButton updateOrderBtn;
    // End of variables declaration//GEN-END:variables
}

package the_atlas_pos;

/**
 *
 * @author Karots77
 */
public class datechooser extends javax.swing.JFrame {

    /**
     * Creates new form datechooser
     */
    public datechooser() {
        initComponents();
        setLocationRelativeTo(null);
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
        jButton1 = new javax.swing.JButton();
        mon = new com.toedter.calendar.JMonthChooser();
        days = new com.toedter.calendar.JDayChooser();
        year = new com.toedter.calendar.JYearChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Date"));

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jButton1.setText("Confirm");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(days, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mon, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    int a = mon.getMonth();
    int b = days.getDay();
    int ca = year.getYear();
    String month;
    String day;
    String yearr = String.valueOf(ca);

    if(a == 0){
        month = "01";
            if(b == 1){
                day = "01";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 2){
                day = "02";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 3){
                day = "03";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 4){
                day = "04";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 5){
                day = "05";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 6){
                day = "06";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 7){
                day = "07";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 8){
                day = "08";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 9){
                day = "09";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else{
                int c = days.getDay();
                String line = yearr+"-"+c+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
    }
    else if(a == 1){
        month = "02";
            if(b == 1){
                day = "01";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 2){
                day = "02";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 3){
                day = "03";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 4){
                day = "04";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 5){
                day = "05";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 6){
                day = "06";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 7){
                day = "07";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 8){
                day = "08";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 9){
                day = "09";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else{
                int c = days.getDay();
                String line = yearr+"-"+c+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
    }
    else if(a == 2){
        month = "03";
            if(b == 1){
                day = "01";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 2){
                day = "02";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 3){
                day = "03";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 4){
                day = "04";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 5){
                day = "05";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 6){
                day = "06";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 7){
                day = "07";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 8){
                day = "08";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 9){
                day = "09";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else{
                int c = days.getDay();
                String line = yearr+"-"+c+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
    }
    else if(a == 3){
        month = "04";
            if(b == 1){
                day = "01";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 2){
                day = "02";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 3){
                day = "03";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 4){
                day = "04";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 5){
                day = "05";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 6){
                day = "06";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 7){
                day = "07";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 8){
                day = "08";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 9){
                day = "09";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else{
                int c = days.getDay();
                String line = yearr+"-"+c+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
    }
    else if(a == 4){
        month = "05";
            if(b == 1){
                day = "01";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 2){
                day = "02";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 3){
                day = "03";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 4){
                day = "04";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 5){
                day = "05";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 6){
                day = "06";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 7){
                day = "07";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 8){
                day = "08";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 9){
                day = "09";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else{
                int c = days.getDay();
                String line = yearr+"-"+c+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
    }
    else if(a == 5){
        month = "06";
            if(b == 1){
                day = "01";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 2){
                day = "02";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 3){
                day = "03";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 4){
                day = "04";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 5){
                day = "05";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 6){
                day = "06";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 7){
                day = "07";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 8){
                day = "08";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 9){
                day = "09";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else{
                int c = days.getDay();
                String line = yearr+"-"+c+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
    }
    else if(a == 6){
        month = "07";
            if(b == 1){
                day = "01";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 2){
                day = "02";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 3){
                day = "03";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 4){
                day = "04";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 5){
                day = "05";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 6){
                day = "06";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 7){
                day = "07";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 8){
                day = "08";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 9){
                day = "09";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else{
                int c = days.getDay();
                String line = yearr+"-"+c+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
    }
    else if(a == 7){
        month = "08";
            if(b == 1){
                day = "01";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 2){
                day = "02";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 3){
                day = "03";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 4){
                day = "04";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 5){
                day = "05";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 6){
                day = "06";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 7){
                day = "07";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 8){
                day = "08";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 9){
                day = "09";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else{
                int c = days.getDay();
                String line = yearr+"-"+c+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
    }
    else if(a == 8){
        month = "09";
            if(b == 1){
                day = "01";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 2){
                day = "02";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 3){
                day = "03";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 4){
                day = "04";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 5){
                day = "05";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 6){
                day = "06";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 7){
                day = "07";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 8){
                day = "08";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 9){
                day = "09";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else{
                int c = days.getDay();
                String line = yearr+"-"+c+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
    }
    else if(a == 9){
        month = "10";
            if(b == 1){
                day = "01";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 2){
                day = "02";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 3){
                day = "03";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 4){
                day = "04";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 5){
                day = "05";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 6){
                day = "06";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 7){
                day = "07";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 8){
                day = "08";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 9){
                day = "09";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else{
                int c = days.getDay();
                String line = yearr+"-"+c+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
    }
    else if(a == 10){
        month = "11";
            if(b == 1){
                day = "01";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 2){
                day = "02";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 3){
                day = "03";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 4){
                day = "04";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 5){
                day = "05";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 6){
                day = "06";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 7){
                day = "07";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 8){
                day = "08";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 9){
                day = "09";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else{
                int c = days.getDay();
                String line = yearr+"-"+c+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
    }
    else if(a == 11){
        month = "12";
            if(b == 1){
                day = "01";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 2){
                day = "02";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 3){
                day = "03";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 4){
                day = "04";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 5){
                day = "05";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 6){
                day = "06";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 7){
                day = "07";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 8){
                day = "08";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else if(b == 9){
                day = "09";
                String line = yearr+"-"+day+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
            else{
                int c = days.getDay();
                String line = yearr+"-"+c+"-"+month;
                mainmenu.dailydate.setText(line);  
            }
    }
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
            java.util.logging.Logger.getLogger(datechooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datechooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datechooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datechooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datechooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDayChooser days;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JMonthChooser mon;
    private com.toedter.calendar.JYearChooser year;
    // End of variables declaration//GEN-END:variables
}

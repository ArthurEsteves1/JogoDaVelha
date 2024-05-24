
 package com.mycompany.testejogodavelha;

/**
 *
 * @author Athur
 */
public class Jogo extends javax.swing.JFrame {
public boolean aluno=true;
public boolean professor=true;
public int contpos=0;
public int k=0, i=0;
int op;
public String linha1,linha2,linha3,coluna1,coluna2,coluna3,diagonal1,diagonal2;

String[][]posvetor=new String[3][3];

    public Jogo() {initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botão1 = new javax.swing.JButton();
        botão2 = new javax.swing.JButton();
        botão3 = new javax.swing.JButton();
        botão4 = new javax.swing.JButton();
        botão5 = new javax.swing.JButton();
        botão6 = new javax.swing.JButton();
        botão7 = new javax.swing.JButton();
        botão8 = new javax.swing.JButton();
        botão9 = new javax.swing.JButton();
        botãoreiniciar = new javax.swing.JButton();
        txtvisor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(405, 460));

        botão1.setFont(new java.awt.Font("Segoe UI", 1, 90)); // NOI18N
        botão1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão1ActionPerformed(evt);
            }
        });

        botão2.setFont(new java.awt.Font("Segoe UI", 1, 90)); // NOI18N
        botão2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão2ActionPerformed(evt);
            }
        });

        botão3.setFont(new java.awt.Font("Segoe UI", 1, 90)); // NOI18N
        botão3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão3ActionPerformed(evt);
            }
        });

        botão4.setFont(new java.awt.Font("Segoe UI", 1, 90)); // NOI18N
        botão4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão4ActionPerformed(evt);
            }
        });

        botão5.setFont(new java.awt.Font("Segoe UI", 1, 90)); // NOI18N
        botão5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão5ActionPerformed(evt);
            }
        });

        botão6.setFont(new java.awt.Font("Segoe UI", 1, 90)); // NOI18N
        botão6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão6ActionPerformed(evt);
            }
        });

        botão7.setFont(new java.awt.Font("Segoe UI", 1, 90)); // NOI18N
        botão7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão7ActionPerformed(evt);
            }
        });

        botão8.setFont(new java.awt.Font("Segoe UI", 1, 90)); // NOI18N
        botão8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão8ActionPerformed(evt);
            }
        });

        botão9.setFont(new java.awt.Font("Segoe UI", 1, 90)); // NOI18N
        botão9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão9ActionPerformed(evt);
            }
        });

        botãoreiniciar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botãoreiniciar.setText("REINICIAR");
        botãoreiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoreiniciarActionPerformed(evt);
            }
        });

        txtvisor.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtvisor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(botão1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botão4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(botão5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(botão6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(botão2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(botão3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botão7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botão8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botão9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtvisor)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(botãoreiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botão2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botão1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botão3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botão6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botão4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botão5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botão7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botão8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botão9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(txtvisor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botãoreiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botãoreiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoreiniciarActionPerformed
        // Reiniciar botoes
        botão1.setText("");
        botão1.setEnabled(true);
        botão2.setText("");
        botão2.setEnabled(true);
        botão3.setText("");
        botão3.setEnabled(true);
        botão4.setText("");
        botão4.setEnabled(true);
        botão5.setText("");
        botão5.setEnabled(true);
        botão6.setText("");
        botão6.setEnabled(true);
        botão7.setText("");
        botão7.setEnabled(true);
        botão8.setText("");
        botão8.setEnabled(true);
        botão9.setText("");
        botão9.setEnabled(true);
        Limpaposicoes();
        txtvisor.setText("");
        aluno=true;
        professor=true;
    }//GEN-LAST:event_botãoreiniciarActionPerformed
 public void verificaJogadordavez() {
    if (aluno && professor) {
        this.op = 1;
        aluno = false;
        professor = true;
        txtvisor.setText("vez do professor");
    } else if (aluno && !professor) {
        this.op = 1;
        aluno = false;
        professor = true;
        txtvisor.setText("vez do professor");
    } else {
        this.op = 2;
        aluno = true;
        professor = false;
        txtvisor.setText("vez do aluno");
    }
}
 public void Limpaposicoes(){
     for(i=0;i<3;i++){
         for(k=0;k<3;k++){
             posvetor[i][k]="";
             System.out.println(posvetor[i][k]);
         }
 }
 }    
 public void desativaBotoes(){
     botão1.setEnabled(false);
     botão2.setEnabled(false);
     botão3.setEnabled(false);
     botão4.setEnabled(false);
     botão5.setEnabled(false);
     botão6.setEnabled(false);
     botão7.setEnabled(false);
     botão8.setEnabled(false);
     botão9.setEnabled(false);
 }
 public void Verificapos(){
     contpos=0;
     for(i=0;i<3;i++){
         for(k=0;k<3;k++){
           if(posvetor[i][k]=="x"|posvetor[i][k]=="o"){  
               contpos+=1;
           }
           }
 }
 }
 
         
         
         public void VerificaVencedor(){
    linha1=posvetor[0][0]+posvetor[0][1]+posvetor[0][2];
    linha2=posvetor[1][0]+posvetor[1][1]+posvetor[1][2];
    linha3=posvetor[2][0]+posvetor[2][1]+posvetor[2][2];
    
    coluna1=posvetor[0][0]+posvetor[1][0]+posvetor[2][0];
    coluna2=posvetor[0][1]+posvetor[1][1]+posvetor[2][1];
    coluna3=posvetor[0][2]+posvetor[1][2]+posvetor[2][2];
    
    diagonal1=posvetor[0][0]+posvetor[1][1]+posvetor[2][2];
    diagonal2=posvetor[0][2]+posvetor[1][1]+posvetor[2][0];
    
    if(linha1.equals("xxx")|linha2.equals("xxx")|linha3.equals("xxx")|coluna1.equals("xxx")|coluna2.equals("xxx")|coluna3.equals("xxx")|diagonal1.equals("xxx")|diagonal2.equals("xxx")){
        
        txtvisor.setText("O vencedor é o aluno");
        desativaBotoes();
        
    }else if(linha1.equals("ooo")|linha2.equals("ooo")|linha3.equals("ooo")|coluna1.equals("ooo")|coluna2.equals("ooo")|coluna3.equals("ooo")|diagonal1.equals("ooo")|diagonal2.equals("ooo")){
            
        txtvisor.setText("O vencedor é o professor");
        desativaBotoes();
}else if (contpos==9){
       txtvisor.setText("Não houve Vencedor");
    }
 }
    private void botão1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão1ActionPerformed
        //botao1 
        verificaJogadordavez();
        if(op==1){
        botão1.setText("X");
        posvetor[0][0]=("x");
        }else{
        botão1.setText("O");
        posvetor[0][0]=("o");
        }
        botão1.setEnabled(false);
        Verificapos();
        VerificaVencedor();
        
    }//GEN-LAST:event_botão1ActionPerformed

    private void botão2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão2ActionPerformed
        //botao2 
        verificaJogadordavez();
        if(op==1){
        botão2.setText("X");
        posvetor[0][1]=("x");
        }else{
        botão2.setText("O");
        posvetor[0][1]=("o");
        }
        botão2.setEnabled(false);
        Verificapos();
        VerificaVencedor();
        
    }//GEN-LAST:event_botão2ActionPerformed

    private void botão3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão3ActionPerformed
       //botao3 
        verificaJogadordavez();
        if(op==1){
        botão3.setText("X");
        posvetor[0][2]=("x");
        }else{
        botão3.setText("O");
        posvetor[0][2]=("o");
        }
        botão3.setEnabled(false);
        Verificapos();
        VerificaVencedor();
        
    }//GEN-LAST:event_botão3ActionPerformed

    private void botão4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão4ActionPerformed
       //botao4
        verificaJogadordavez();
        if(op==1){
        botão4.setText("X");
        posvetor[1][0]=("x");
        }else{
        botão4.setText("O");
        posvetor[1][0]=("o");
        }
        botão4.setEnabled(false);
        Verificapos();
        VerificaVencedor();        
        

    }//GEN-LAST:event_botão4ActionPerformed

    private void botão5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão5ActionPerformed
       //botao5
        verificaJogadordavez();
        if(op==1){
        botão5.setText("X");
        posvetor[1][1]=("x");
        }else{
        botão5.setText("O");
        posvetor[1][1]=("o");
        }
        botão5.setEnabled(false);
        Verificapos();
        VerificaVencedor();
        

    }//GEN-LAST:event_botão5ActionPerformed

    private void botão6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão6ActionPerformed
        //botao6
        verificaJogadordavez();
        if(op==1){
        botão6.setText("X");
        posvetor[1][2]=("x");
        }else{
        botão6.setText("O");
        posvetor[1][2]=("o");
        }
        botão6.setEnabled(false); 
        Verificapos();
        VerificaVencedor();
        

    }//GEN-LAST:event_botão6ActionPerformed

    private void botão7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão7ActionPerformed
       //botao7
        verificaJogadordavez();
        if(op==1){
        botão7.setText("X");
        posvetor[2][0]=("x");
        }else{
        botão7.setText("O");
        posvetor[2][0]=("o");
        }
        botão7.setEnabled(false); 
        Verificapos();
        VerificaVencedor();
        

    }//GEN-LAST:event_botão7ActionPerformed

    private void botão8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão8ActionPerformed
        //botao8
        verificaJogadordavez();
        if(op==1){
        botão8.setText("X");
        posvetor[2][1]=("x");
        }else{
        botão8.setText("O");
        posvetor[2][1]=("o");
        }
        botão8.setEnabled(false); 
        Verificapos();
        VerificaVencedor();
        

    }//GEN-LAST:event_botão8ActionPerformed

    private void botão9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão9ActionPerformed
        //botao9
        verificaJogadordavez();
        if(op==1){
        botão9.setText("X");
        posvetor[2][2]=("x");
        }else{
        botão9.setText("O");
        posvetor[2][2]=("o");
        }
        botão9.setEnabled(false);
        Verificapos();
        VerificaVencedor();
        

    }//GEN-LAST:event_botão9ActionPerformed

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(() -> {
            new Jogo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botão1;
    private javax.swing.JButton botão2;
    private javax.swing.JButton botão3;
    private javax.swing.JButton botão4;
    private javax.swing.JButton botão5;
    private javax.swing.JButton botão6;
    private javax.swing.JButton botão7;
    private javax.swing.JButton botão8;
    private javax.swing.JButton botão9;
    private javax.swing.JButton botãoreiniciar;
    private javax.swing.JTextField txtvisor;
    // End of variables declaration//GEN-END:variables
}

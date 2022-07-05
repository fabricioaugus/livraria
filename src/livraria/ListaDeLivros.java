/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package livraria;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author fabri
 */
public class ListaDeLivros extends JFrame {

    private Object strings;

    public ListaDeLivros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaLivros = new javax.swing.JList<>();
        btn_jaLI = new javax.swing.JButton();
        txtCampo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(780, 500));
        setSize(new java.awt.Dimension(780, 500));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista de Livros");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 40, 238, 48);

        listaLivros.setBorder(new javax.swing.border.MatteBorder(null));
        listaLivros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Orgulho e Preconceito - Jane Austen", "1984 - George Orwell", "Dom Quixote de la Mancha - Miguel de Cervantes", "Dom Casmurro - Machado de Assis", "O Bandolim do Capitão Corelli - Louis de Bernières", "O Conde de Monte Cristo - Alexandre Dumas", "Um Estudo em Vermelho - Arthur Conan Doyle", "O Processo - Franz Kafka", "Cem Anos de Solidão - Gabriel García Márquez" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaLivros.setToolTipText("");
        jScrollPane1.setViewportView(listaLivros);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 100, 470, 190);

        btn_jaLI.setBackground(new java.awt.Color(0, 153, 51));
        btn_jaLI.setText("Esse eu já li!");
        btn_jaLI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jaLIActionPerformed(evt);
            }
        });
        getContentPane().add(btn_jaLI);
        btn_jaLI.setBounds(310, 310, 120, 22);

        txtCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCampo);
        txtCampo.setBounds(130, 360, 480, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livraria/img/livros-que-vão-ajudar-na-sua-application-768x512.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, -10, 830, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_jaLIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jaLIActionPerformed

        if(listaLivros.getSelectedIndex()== -1){
                 JFrame jFrame = new JFrame();
                 JOptionPane.showMessageDialog(jFrame, "nenhum Livro foi selecionado, Seleciona algum Livros!!");
        }else{ 
                String novoString = mostrarLivro();
                txtCampo.setText(novoString);
        }
       
    }//GEN-LAST:event_btn_jaLIActionPerformed
 public String mostrarLivro(){
               String selecionaLivro;
               return selecionaLivro = ""+ listaLivros.getSelectedValue();
                
 }
    private void txtCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_jaLI;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaLivros;
    private javax.swing.JTextField txtCampo;
    // End of variables declaration//GEN-END:variables


    
}

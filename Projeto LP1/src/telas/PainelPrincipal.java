package telas;

import estruturas.Persistencia;
import estruturas.Arte;
import java.util.*;
import java.io.*;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;


/** Painel Principal
 *    Descrição:
 *      Esse painel contém o menu e todas as ligações para os demais paíneis
 *      sendo, em linhas gerais, a própria main.
 * 
 *    @author Grupo 06
 *      Alunos: Armando Neto, Douglas Lima
 *              Drayton Corrêa, Ewerton Santos
 */
public class PainelPrincipal extends javax.swing.JFrame {
     
     /** Construtor do Painel Principal:
      *    Descrição:
      *      Painel padrão da interface em conjunto com os métodos da
      *      persistência que copiam todos os objetos do arquivo Arte.ser
      *      para a coleção no aplicativo.
      */
    public PainelPrincipal() {
        p.setupLer();
        if (p.getContinua() == true) {
            p.readRecords();
            p.cleanupLer();
            cad = p.getCad();
        }
        initComponents();
        this.setIconImage(new ImageIcon("src/imagens/museu.png").getImage());//Coloca o icone no painel principal
        this.setLocationRelativeTo(null);//Faz o programa iniciar no centro da tela
    }

   //MÉTODOS:
     /** Método de Testar se Existe na Lista
      *    Descrição:
      *      O método percorre a coleção e checa se existe o tombo enviado
      *      no parâmetro, retornando um valor do tipo boolean que é:
      *          - True: quando o tombo recebido como parâmetro é igual ao de
      *            outro na coleção.
      *              ou
      *          - False: quando não há um tombo igual na coleção.
      */
    private boolean existe_na_lista(int tomb) {
        for (Arte a : cad) {
            if (a.getTombo() == tomb) {
                return true;
            }
        }
        return false;
    }
    
     /** Método que Muda a Imagem do Bem Vindo
      *    Descrição:
      *      Ao ser chamado, ele troca a imagem do texto de bem vindo para
      *      uma vazia com objetivo de, assim, tirar da tela algo que não
      *      é mais obrigatoriamente necessário.
      * 
      */
    private void bem_vindo_vazio(){
         // Criando um objeto do tipo ImageIcon e pegando o caminho no projeto
         // aonde está a imagem que será mudada.
        ImageIcon icone = new ImageIcon(getClass().getResource("/imagens/imagem_vazia.png"));
         // Criando um objeto do tipo Image que recebe a imagem do icone com a largura e altura do Label do Bem Vindo
         // com o objetivo de dimensioná-la e deixar preparada para ser jogada no Label.
        Image imagem = icone.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT);
         // Mudando o icone do Label do Bem Vindo para a imagem recém dimensionada.
        jLabel1.setIcon(new ImageIcon(imagem));
    }
    
                 
     /**
      * This method is called from within the constructor to initialize the form.
      * WARNING: Do NOT modify this code. The content of this method is always
      * regenerated by the Form Editor.
      */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        // Instanciação de um objeto do tipo ImageIcon aonde no construtor está
        // sendo pego como parâmetro o local nos packages onde está a Tela de
        // Fundo.
        ImageIcon icone = new ImageIcon(getClass().getResource("/imagens/tela_de_fundo.png"));

        //Objeto do tipo Image que recebe a imagem do icone.
        Image imagem = icone.getImage();
        jTelaPrincipal = new javax.swing.JDesktopPane(){
            /** Método Paint Component
            *    Descrição:
            *      Tal método sobreescreve a tela de fundo padrão do Painel da Área
            *      de Trabalho do NetBeans.
            */
            public void paintComponent(Graphics g){
                g.drawImage(imagem,0,0,getWidth(),getHeight(),this);
            }

        };
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBarra = new javax.swing.JMenuBar();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItemCadastrar = new javax.swing.JMenuItem();
        jMenuItemPesquisar = new javax.swing.JMenuItem();
        jMenuItemEditar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Museu de Arte Moderna de São Paulo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTelaPrincipal.setPreferredSize(new java.awt.Dimension(1320, 750));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bem_vindo.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu_hexagonal_editar.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu_hexagonal_editar_afundado.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu_hexagonal_editar_destacado.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu_hexagonal_pesquisar.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu_hexagonal_pesquisar_afundado.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu_hexagonal_pesquisar_destacado.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu_hexagonal_cadastrar.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu_hexagonal_cadastrar_afundado.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu_hexagonal_cadastrar_destacado.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTelaPrincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTelaPrincipal.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTelaPrincipal.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTelaPrincipal.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jTelaPrincipalLayout = new javax.swing.GroupLayout(jTelaPrincipal);
        jTelaPrincipal.setLayout(jTelaPrincipalLayout);
        jTelaPrincipalLayout.setHorizontalGroup(
            jTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTelaPrincipalLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel1)
                .addContainerGap(343, Short.MAX_VALUE))
            .addGroup(jTelaPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jTelaPrincipalLayout.setVerticalGroup(
            jTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTelaPrincipalLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuOpcoes.setMnemonic('c');
        jMenuOpcoes.setText("Opções");
        jMenuOpcoes.setToolTipText("Exibir Opções... (Alt + C)");

        jMenuItemCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/application_form_add.png"))); // NOI18N
        jMenuItemCadastrar.setText("Cadastrar Novas Obras");
        jMenuItemCadastrar.setToolTipText("Lançar o Obra de Arte no sistema");
        jMenuItemCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItemCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemCadastrar);

        jMenuItemPesquisar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/application_form_magnify.png"))); // NOI18N
        jMenuItemPesquisar.setText("Pesquisar Registros");
        jMenuItemPesquisar.setToolTipText("Pesquisa e exibe Obras de Arte.");
        jMenuItemPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisarActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemPesquisar);

        jMenuItemEditar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/application_form_edit.png"))); // NOI18N
        jMenuItemEditar.setText("Modificar Dados");
        jMenuItemEditar.setToolTipText("Pesquisa por Tombo e altera dados.");
        jMenuItemEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemEditar);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.setToolTipText("Fecha o programa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItem1);

        jMenuBarra.add(jMenuOpcoes);

        setJMenuBar(jMenuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   //Items de Menu:
     /** Item de Menu Cadastrar Novas Obras
      *    Descrição:
      *      Abre uma janela que serve para registrar uma obra de arte no acervo
      *      pertencente ao museu.
      */
    private void jMenuItemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarActionPerformed
        PainelDeRegistro painelC = new PainelDeRegistro();
        painelC.setTitle("Cadastrar Obra de Arte");
        jTelaPrincipal.add(painelC);
        painelC.setPosicao();
        painelC.setVisible(true);
        
        bem_vindo_vazio();
    }//GEN-LAST:event_jMenuItemCadastrarActionPerformed

     /** Item de Menu Pesquisar Registros 
      *    Descrição: 
      *      Abre uma janela que serve para buscar uma obra de arte no acervo do
      *      museu dentre aquelas que já foram cadastradas.
      */
    private void jMenuItemPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisarActionPerformed
        PainelDePesquisa painelP = new PainelDePesquisa();
        jTelaPrincipal.add(painelP);
        painelP.setPosicao();
        painelP.setVisible(true);
        
        bem_vindo_vazio();
    }//GEN-LAST:event_jMenuItemPesquisarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

     /** Item de Meno Sair
      *    Descrição:
      *      Encerra o programa.
      */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

     /** Item de Menu Modificar Dados
      *    Descrição:
      *      Abre um painel (PainelDePesquisaTombo) que pede o número de tombo e,
      *      com aquilo que for digitado nele, percorre a coleção para saber
      *      se esse tombo existe para logo em seguida abrir a janela de
      *      edição de obras.
      */
    private void jMenuItemEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarActionPerformed
        PainelDePesquisaTombo painelT = new PainelDePesquisaTombo();
        jTelaPrincipal.add(painelT);
        painelT.setPosicao();
        painelT.setVisible(true);
        
        bem_vindo_vazio();
    }//GEN-LAST:event_jMenuItemEditarActionPerformed

    //Botões do Menu da Tela Principal
     /** Botão Editar
      *    Descrição:
      *      Abre um painel (PainelDePesquisaTombo) que pede o número de tombo e,
      *      com aquilo que for digitado nele, percorre a coleção para saber
      *      se esse tombo existe para logo em seguida abrir a janela de
      *      edição de obras.
      */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PainelDePesquisaTombo painelT = new PainelDePesquisaTombo();
        jTelaPrincipal.add(painelT);
        painelT.setPosicao();
        painelT.setVisible(true);
        
        bem_vindo_vazio();
    }//GEN-LAST:event_jButton1ActionPerformed

     /** Botão Pesquisar
      *    Descrição: 
      *      Abre uma janela que serve para buscar uma obra de arte no acervo do
      *      museu dentre aquelas que já foram cadastradas.
      */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PainelDePesquisa painelP = new PainelDePesquisa();
        jTelaPrincipal.add(painelP);
        painelP.setPosicao();
        painelP.setVisible(true);
        
        bem_vindo_vazio();
    }//GEN-LAST:event_jButton2ActionPerformed

     /** Botão Cadastrar
      *    Descrição:
      *      Abre uma janela que serve para registrar uma obra de arte no acervo
      *      pertencente ao museu.
      */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PainelDeRegistro painelC = new PainelDeRegistro();
        painelC.setTitle("Cadastrar Obra de Arte");
        jTelaPrincipal.add(painelC);
        painelC.setPosicao();
        painelC.setVisible(true);
        
        bem_vindo_vazio();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBarra;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCadastrar;
    private javax.swing.JMenuItem jMenuItemEditar;
    private javax.swing.JMenuItem jMenuItemPesquisar;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JPanel jPanelPrincipal;
    protected static javax.swing.JDesktopPane jTelaPrincipal;
    // End of variables declaration//GEN-END:variables
    // Outros Atributos:
    private static LinkedList<Arte> cad = new LinkedList<Arte>();
    private static Persistencia p = new Persistencia();
    // Fim dos outros Atributos;
}

package alapmuvgyak;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Muveletek extends javax.swing.JFrame {

    Random rnd = new Random();
    int eredmeny;
    int szam1, szam2;
    int osztasKerdes = 0;
    int szorzasKerdes = 0;
    int osszKerdesekSzama = 0;
    int osztasProba = 0;
    int szorzasProba = 0;
    int osszProbalkozasSzama = 0;

    public Muveletek() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jFileChooser1 = new javax.swing.JFileChooser();
        pnlGyakorlas = new javax.swing.JPanel();
        lblFeladat = new javax.swing.JLabel();
        txtEredmeny = new javax.swing.JTextField();
        btnEllenorzes = new javax.swing.JButton();
        lblValasz = new javax.swing.JLabel();
        btnUj = new javax.swing.JButton();
        btnMegoldas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblOsszKerdes = new javax.swing.JLabel();
        lblOsszProba = new javax.swing.JLabel();
        lblEredmeny = new javax.swing.JLabel();
        lblOsszeadKerdes = new javax.swing.JLabel();
        lblKivonasKerdes = new javax.swing.JLabel();
        lblOsztasKerdes = new javax.swing.JLabel();
        lblSzorzasKerdes = new javax.swing.JLabel();
        lblOsszeadProba = new javax.swing.JLabel();
        lblKivonasProba = new javax.swing.JLabel();
        lblOsztasProba = new javax.swing.JLabel();
        lblSzorzasProba = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuMentesMaskent = new javax.swing.JMenu();
        mnuFajlMegnyit = new javax.swing.JMenuItem();
        mnuFajlMent = new javax.swing.JMenuItem();
        mnuFajlMentesMaskent = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuFajlKilep = new javax.swing.JMenuItem();
        mnuMuvelet = new javax.swing.JMenu();
        mnuMuveletOsszeadas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletKivonas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletOsztas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletSzorzas = new javax.swing.JRadioButtonMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alapműveletek gyakoroltatása");

        pnlGyakorlas.setBorder(javax.swing.BorderFactory.createTitledBorder("Gyakorlás"));

        lblFeladat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnEllenorzes.setText("Ellenőrzés");
        btnEllenorzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEllenorzesActionPerformed(evt);
            }
        });

        lblValasz.setText("visszajelzés");

        javax.swing.GroupLayout pnlGyakorlasLayout = new javax.swing.GroupLayout(pnlGyakorlas);
        pnlGyakorlas.setLayout(pnlGyakorlasLayout);
        pnlGyakorlasLayout.setHorizontalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                        .addComponent(lblFeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEllenorzes)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGyakorlasLayout.createSequentialGroup()
                        .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        pnlGyakorlasLayout.setVerticalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFeladat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEllenorzes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnUj.setText("Új feladat");
        btnUj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjActionPerformed(evt);
            }
        });

        btnMegoldas.setText("Megoldás");
        btnMegoldas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegoldasActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Statisztika"));

        lblOsszKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszKerdes.setText("Össz kérdések száma: 0");

        lblOsszProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszProba.setText("Össz Probálkozások száma: 0");

        lblEredmeny.setText("Eredmény: 0 %");

        lblOsszeadKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadKerdes.setText("Összeadás: 0");

        lblKivonasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasKerdes.setText("Kivonás: 0");

        lblOsztasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasKerdes.setText("Osztás: 0");

        lblSzorzasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasKerdes.setText("Szorzás: 0");

        lblOsszeadProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadProba.setText("Összeadás: 0");

        lblKivonasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasProba.setText("Kivonás: 0");

        lblOsztasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasProba.setText("Osztás: 0");

        lblSzorzasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasProba.setText("Szorzás: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblEredmeny))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOsszKerdes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOsszeadKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKivonasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsztasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSzorzasKerdes, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKivonasProba)
                            .addComponent(lblSzorzasProba)
                            .addComponent(lblOsszeadProba)
                            .addComponent(lblOsztasProba)
                            .addComponent(lblOsszProba, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblKivonasKerdes, lblOsszeadKerdes, lblOsztasKerdes, lblSzorzasKerdes});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOsszKerdes)
                    .addComponent(lblOsszProba))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasKerdes))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasProba)))
                .addGap(18, 18, 18)
                .addComponent(lblEredmeny)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnuMentesMaskent.setText("Fájl");

        mnuFajlMegnyit.setText("Megnyit");
        mnuFajlMegnyit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMegnyitActionPerformed(evt);
            }
        });
        mnuMentesMaskent.add(mnuFajlMegnyit);

        mnuFajlMent.setText("Ment");
        mnuFajlMent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentActionPerformed(evt);
            }
        });
        mnuMentesMaskent.add(mnuFajlMent);

        mnuFajlMentesMaskent.setText("Mentés másként...");
        mnuFajlMentesMaskent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentesMaskentActionPerformed(evt);
            }
        });
        mnuMentesMaskent.add(mnuFajlMentesMaskent);
        mnuMentesMaskent.add(jSeparator1);

        mnuFajlKilep.setText("Kilép");
        mnuMentesMaskent.add(mnuFajlKilep);

        jMenuBar1.add(mnuMentesMaskent);

        mnuMuvelet.setText("Műveletek");
        buttonGroup1.add(mnuMuvelet);

        buttonGroup1.add(mnuMuveletOsszeadas);
        mnuMuveletOsszeadas.setText("Összeadas");
        mnuMuvelet.add(mnuMuveletOsszeadas);

        buttonGroup1.add(mnuMuveletKivonas);
        mnuMuveletKivonas.setText("Kivonas");
        mnuMuvelet.add(mnuMuveletKivonas);

        buttonGroup1.add(mnuMuveletOsztas);
        mnuMuveletOsztas.setText("Osztás");
        mnuMuveletOsztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuveletOsztasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(mnuMuveletOsztas);

        buttonGroup1.add(mnuMuveletSzorzas);
        mnuMuveletSzorzas.setText("Szorzás");
        mnuMuveletSzorzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuveletSzorzasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(mnuMuveletSzorzas);

        jMenuBar1.add(mnuMuvelet);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUj, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMegoldas, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMegoldas))
                    .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    String mentettFajl;
    private void mnuFajlMentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentActionPerformed
//        JFileChooser fc = new JFileChooser();
//        fc.setDialogTitle("Fájl mentése");
//        fc.setCurrentDirectory(new File("."));
//        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//
//        int választottGombErteke = fc.showSaveDialog(this);
//        if (választottGombErteke == JFileChooser.APPROVE_OPTION) {
//            File f = fc.getSelectedFile();
//            if (f.isDirectory()) {
//                lblEredmeny.setText("<html>Elérése: " + f.getPath() + "<br>Könyvtár: " + f.getName() + "</html>");
//                try {
//                    Files.write(Paths.get(f.getPath(), "stat.txt"), "Statisztika:".getBytes());
//                } catch (IOException ex) {
//                    Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
        if (mentettFajl == null) {
            mnuFajlMentesMaskentActionPerformed(evt); //1. mentésnél nevet kell adni, és helyet kell választani
        } else {
            /* ez irja ki */
            try {
                //menteni a meglévő néven és helyre
                Files.write(Paths.get(mentettFajl), tartalomOsszeallitasa().getBytes());
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }
            /*  ez irja ki VÉGE */
        }
    }//GEN-LAST:event_mnuFajlMentActionPerformed

    private void mnuFajlMentesMaskentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentesMaskentActionPerformed
        /* név és hely választás */
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Mentés másként");

        /*választható fájl típusok */
        fc.setAcceptAllFileFilterUsed(false); //nincs Minden fájl

        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("PNG és GIF képek", "png", "gif");
        fc.addChoosableFileFilter(imgFilter);
        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("csak szöveg (*.txt)", "txt");
        fc.addChoosableFileFilter(txtFilter);
        FileNameExtensionFilter knFilter = new FileNameExtensionFilter("saját (*.kn)", "kn");
        fc.addChoosableFileFilter(knFilter);

        fc.setFileFilter(txtFilter);

        /* Tesztesetek:
        - kiterjesztés megváltoztatása
        - olyan kiterjesztés írása, ami nincs a listában
        - üresen marad a fájl neve
        - másik mappa kiválasztása
        - ha kiterjesztéssel választom a meglévő fájlt, akkor megint rakja a kiterjesztést.
        - ha létezik a fájl, akkor krdés nélkül felülírja
         */
        int valasztottGombErteke = fc.showSaveDialog(this);
        if (valasztottGombErteke == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            String[] kit = ((FileNameExtensionFilter) fc.getFileFilter()).getExtensions();
            String fn = f.getPath()/*f.getName() + "." + kit[0]*/;

            /* csak egyszer rakja mögé a kiterjesztést */
            if (!fn.endsWith("." + kit[0])) {
                fn += "." + kit[0];
            }

            boolean mentes = true;
            /* ha már létezik */
            Path path = Paths.get(fn);
            if (Files.exists(path)) {
                valasztottGombErteke = JOptionPane.showConfirmDialog(this, "A fájl létezik!\nFelülírjam?", "A fájl már létezik!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (valasztottGombErteke == JOptionPane.NO_OPTION) {
                    mentes = false;
                }
            }

            lblEredmeny.setText("<html>Elérése: " + fn/*f.getPath()*/ + "<br>Fájl neve: " + f.getName() + "." + kit[0] + "</html>");
            /* név és hely választás VÉGE */
 /* ez írja ki */
            try {
                if (mentes) {
                    //Files.write(path/*Paths.get(fn/*f.getPath() + "." + kit[0])*/, "Statisztika: ".getBytes());
                    Files.write(path, tartalomOsszeallitasa().getBytes());
                }
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }
            /* kiirasi rész vége */
        } else {
            JOptionPane.showMessageDialog(this, "Mentés megszakítva!", "NINCS MENTÉS!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_mnuFajlMentesMaskentActionPerformed

    private void mnuFajlMegnyitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMegnyitActionPerformed
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Fájl megnyitása...");

        fc.setAcceptAllFileFilterUsed(false); //nincs Minden fájl

        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("PNG és GIF képek", "png", "gif");
        fc.addChoosableFileFilter(imgFilter);
        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("csak szöveg (*.txt)", "txt");
        fc.addChoosableFileFilter(txtFilter);
        FileNameExtensionFilter knFilter = new FileNameExtensionFilter("saját (*.kn)", "kn");
        fc.addChoosableFileFilter(knFilter);

        fc.setFileFilter(txtFilter);

        fc.setAcceptAllFileFilterUsed(true);
        int valasztottGomb = fc.showOpenDialog(this);
        if (valasztottGomb == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            String fn = f.getPath();
            lblEredmeny.setText("<html>Elérés: " + fn + "<br>Fájl neve: " + f.getName() + "</html>");

            Path path = Paths.get(fn);
            try {
                //byte[] bajtTomb = Files.readAllBytes(path); //betünként, ráadásul ASCII kóddal
                //byte egyBajt = bajtTomb[1];

                List<String> stringLista = Files.readAllLines(path);
                String egySor = stringLista.get(1);
                String[] adatok = egySor.split(": ");
                //int szam = Integer.parseInt(adatok[2]);
                String proSz = adatok[2];
                lblOsszProba.setText("Össz Probálkozások száma: " + proSz);
                adatok = adatok[1].split(" ");
                String kerSz = adatok[0];
                lblOsszKerdes.setText("Össz Kérdések száma: " + kerSz);
                //"".trim()
                
                //összeadás
                egySor = stringLista.get(2);
                adatok = egySor.split(": ");
                proSz = adatok[2];
                lblOsszeadProba.setText("Összadás: " + proSz);
                adatok = adatok[1].split(" ");
                kerSz = adatok[0];
                lblOsszeadKerdes.setText("Összeadás: " + kerSz);
                
                //kivonás
                egySor = stringLista.get(3);
                adatok = egySor.split(": ");
                proSz = adatok[2];
                lblKivonasProba.setText("Kivonás: " + proSz);
                adatok = adatok[1].split(" ");
                kerSz = adatok[0];
                lblKivonasKerdes.setText("Kivonás: " + kerSz);
                
                //osztás
                egySor = stringLista.get(4);
                adatok = egySor.split(": ");
                proSz = adatok[2];
                lblOsztasProba.setText("Osztás: " + proSz);
                adatok = adatok[1].split(" ");
                kerSz = adatok[0];
                lblOsztasKerdes.setText("Osztás: " + kerSz);
                
                //szorzás
                egySor = stringLista.get(5);
                adatok = egySor.split(": ");
                proSz = adatok[2];
                lblSzorzasProba.setText("Szorzás: " + proSz);
                adatok = adatok[1].split(" ");
                kerSz = adatok[0];
                lblSzorzasKerdes.setText("Szorzás: " + kerSz);
                
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Megnyitás megszakítva", "NINCS MEGNYITAS", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_mnuFajlMegnyitActionPerformed

    private void mnuMuveletOsztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuveletOsztasActionPerformed
        osztas();
        btnEllenorzes.setEnabled(true);
    }//GEN-LAST:event_mnuMuveletOsztasActionPerformed

    private void btnUjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjActionPerformed
        if (mnuMuveletOsztas.isSelected()) {
            osztas();
        } else if (mnuMuveletSzorzas.isSelected()) {
            osszKerdesekSzama++;
            lblOsszKerdes.setText("Össz kérdések száma: " + osszKerdesekSzama);
            szorzasKerdes++;
            lblSzorzasKerdes.setText("Szorzás: " + szorzasKerdes);
        }

        txtEredmeny.setText("");
        btnEllenorzes.setEnabled(true);
    }//GEN-LAST:event_btnUjActionPerformed

    private void btnEllenorzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEllenorzesActionPerformed
        /* Válasz ellenőrzése: */
//        if (txtEredmeny.getText().equals("")) {
//            lblValasz.setText("Nincs érték!");
//        }
//        int felhasznaloValasza = Integer.parseInt(txtEredmeny.getText());
//        if (eredmeny == felhasznaloValasza) {
//            lblValasz.setText("Jó válasz!");
//            btnEllenorzes.setEnabled(false);
//        } else {
//            lblValasz.setText("Rossz válasz!");
//            txtEredmeny.setText("");
//        }

        /* Statisztika */
        osszProbalkozasSzama++;
        lblOsszProba.setText("Össz probálkozások száma: " + osszProbalkozasSzama);

        if (mnuMuveletOsztas.isSelected()) {
            osztasProba++;
            lblOsztasProba.setText("Osztás: " + osztasProba);
        } else if (mnuMuveletSzorzas.isSelected()) {
            szorzasProba++;
            lblSzorzasProba.setText("Szorzás: " + szorzasProba);
        }
    }//GEN-LAST:event_btnEllenorzesActionPerformed

    private void btnMegoldasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegoldasActionPerformed
        txtEredmeny.setText(eredmeny + "");
        btnEllenorzes.setEnabled(false);
    }//GEN-LAST:event_btnMegoldasActionPerformed

    private void mnuMuveletSzorzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuveletSzorzasActionPerformed
        osszKerdesekSzama++;
        lblOsszKerdes.setText("Össz kérdések száma: " + osszKerdesekSzama);
        szorzasKerdes++;
        lblSzorzasKerdes.setText("Szorzás: " + szorzasKerdes);
        btnEllenorzes.setEnabled(true);
    }//GEN-LAST:event_mnuMuveletSzorzasActionPerformed

    private void osztas() {
        boolean jo;
        do {
            szam1 = rnd.nextInt(100) + 1;
            szam2 = rnd.nextInt(99) + 1;
            jo = szam2 != 0 && szam1 % szam2 == 0 && szam1 > szam2;
        } while (!jo /*szam1 / szam2 == 0 && szam2 != 0*/);

        eredmeny = szam1 / szam2;

        if (szam1 > szam2) {
            lblFeladat.setText(szam1 + "/" + szam2 + "=");
        } else {
            lblFeladat.setText(szam1 + "/" + szam2 + "=");
        }

        osszKerdesekSzama++;
        lblOsszKerdes.setText("Össz kérdések száma: " + osszKerdesekSzama);
        osztasKerdes++;
        lblOsztasKerdes.setText("Osztás: " + osztasKerdes);
    }

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
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muveletek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEllenorzes;
    private javax.swing.JButton btnMegoldas;
    private javax.swing.JButton btnUj;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblEredmeny;
    private javax.swing.JLabel lblFeladat;
    private javax.swing.JLabel lblKivonasKerdes;
    private javax.swing.JLabel lblKivonasProba;
    private javax.swing.JLabel lblOsszKerdes;
    private javax.swing.JLabel lblOsszProba;
    private javax.swing.JLabel lblOsszeadKerdes;
    private javax.swing.JLabel lblOsszeadProba;
    private javax.swing.JLabel lblOsztasKerdes;
    private javax.swing.JLabel lblOsztasProba;
    private javax.swing.JLabel lblSzorzasKerdes;
    private javax.swing.JLabel lblSzorzasProba;
    private javax.swing.JLabel lblValasz;
    private javax.swing.JMenuItem mnuFajlKilep;
    private javax.swing.JMenuItem mnuFajlMegnyit;
    private javax.swing.JMenuItem mnuFajlMent;
    private javax.swing.JMenuItem mnuFajlMentesMaskent;
    private javax.swing.JMenu mnuMentesMaskent;
    private javax.swing.JMenu mnuMuvelet;
    private javax.swing.JRadioButtonMenuItem mnuMuveletKivonas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletOsszeadas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletOsztas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletSzorzas;
    private javax.swing.JPanel pnlGyakorlas;
    private javax.swing.JTextField txtEredmeny;
    // End of variables declaration//GEN-END:variables

    private String tartalomOsszeallitasa() {
        String statisztika = "Az alapműveletek gyakoroltatása statisztika:\n";

        JLabel[] lblTomb = new JLabel[]{lblOsszKerdes, lblOsszProba, lblOsszeadKerdes, lblOsszeadProba, lblKivonasKerdes, lblKivonasProba, lblOsztasKerdes, lblOsztasProba, lblSzorzasKerdes, lblSzorzasProba};

        final int HE = 3; //Helyi érték 3 helyen
        final int KERDES_MAX_HOSSZ = lblTomb[0].getText().length();
        final int PROBA_MAX_HOSSZ = lblTomb[1].getText().length();

        for (int i = 0; i < lblTomb.length; i += 2) {
            JLabel lblKerdes = lblTomb[i];
            JLabel lblProba = lblTomb[i + 1];

            String format = "%" + (KERDES_MAX_HOSSZ + HE) + "s%" + (PROBA_MAX_HOSSZ + HE) + "s\n";
            statisztika += String.format(format, lblKerdes.getText(), lblProba.getText()); //lblKerdes.getText() + "\t";

            //statisztika += lblProba.getText() + "\n";
        }

        //tatisztika += lblOsszKerdes.getText() + "\n";
        //statisztika += lblOsszProba.getText() + "\n";
        return statisztika;
    }
}

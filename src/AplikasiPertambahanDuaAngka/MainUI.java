package AplikasiPertambahanDuaAngka;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUI extends JFrame {
    private JTextField textFieldAngka1;
    private JTextField textFieldAngka2;
    private JButton buttonTambah;
    private JLabel labelHasil;

    public MainUI() {
        // Mengatur properti JFrame
        setTitle("Aplikasi Pertambahan");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Menginisialisasi komponen GUI
        initComponents();

        // Menambahkan action listener untuk tombolTambah
        buttonTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungDanTampilkanHasil();
            }
        });
    }

    private void initComponents() {
        // Mengatur layout menjadi null agar dapat menempatkan komponen secara manual
        setLayout(null);

        // Membuat komponen-komponen GUI
        textFieldAngka1 = new JTextField();
        textFieldAngka2 = new JTextField();
        buttonTambah = new JButton("Tambah");
        labelHasil = new JLabel("Hasil: ");

        // Menempatkan komponen-komponen di dalam frame
        textFieldAngka1.setBounds(20, 20, 100, 30);
        textFieldAngka2.setBounds(20, 60, 100, 30);
        buttonTambah.setBounds(140, 40, 100, 30);
        labelHasil.setBounds(20, 100, 200, 30);

        // Menambahkan komponen-komponen ke frame
        add(textFieldAngka1);
        add(textFieldAngka2);
        add(buttonTambah);
        add(labelHasil);
    }

    private void hitungDanTampilkanHasil() {
        // Mengambil nilai dari textFieldAngka1 dan textFieldAngka2
        int angka1 = Integer.parseInt(textFieldAngka1.getText());
        int angka2 = Integer.parseInt(textFieldAngka2.getText());

        // Membuat objek dari kelas aplikasi
        TambahDuaAngka tambahDuaAngka = new TambahDuaAngka();

        // Memanggil metode tambah dari objek kelas aplikasi
        int hasil = tambahDuaAngka.tambah(angka1, angka2);

        // Menampilkan hasil pertambahan di labelHasil
        labelHasil.setText("Hasil: " + hasil);
    }

    public static void main(String[] args) {
        // Membuat objek MainUI dan menampilkannya
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }
}


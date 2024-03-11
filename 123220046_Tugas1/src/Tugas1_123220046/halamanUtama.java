package Tugas1_123220046;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class halamanUtama extends JFrame {
    JLabel welcome = new JLabel("Welcome, [Mr./Mrs.] [Username]");
    JLabel keterangan = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung balok");
    JLabel panjang = new JLabel("Panjang");
    JLabel lebar = new JLabel("Lebar");
    JLabel tinggi = new JLabel("Tinggi");
    JLabel hasil = new JLabel("Hasil");
    JLabel luas = new JLabel("Luas Persegi");
    JLabel keliling = new JLabel("Keliling Persegi");
    JLabel volume = new JLabel("Volume Balok");
    JLabel luasPermukaan = new JLabel("Luas Permukaan Balok");
    JLabel hasilLuas  = new JLabel("[Hasil berupa angka]");
    JLabel hasilKeliling  = new JLabel("[Hasil berupa angka]");
    JLabel hasilVolume  = new JLabel("[Hasil berupa angka]");
    JLabel hasilLuasPermukaan  = new JLabel("[Hasil berupa angka]");
    
    JTextField inputPanjang = new JTextField();
    JTextField inputLebar = new JTextField();
    JTextField inputTinggi = new JTextField();
    
    JButton tombolHitung = new JButton("Hitung");
    JButton tombolReset = new JButton("Reset");
    
    halamanUtama() {
        this.setTitle("Halaman Utama");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        
        this.add(welcome);
        welcome.setBounds(20, 10, 400, 25);
        welcome.setFont(welcome.getFont().deriveFont(20f));
        
        this.add(keterangan);
        keterangan.setBounds(20, 30, 400, 25);
        
        this.add(panjang);
        panjang.setBounds(20, 60, 100, 25);
        
        this.add(inputPanjang);
        inputPanjang.setBounds(150, 60, 300, 25);
        
        this.add(lebar);
        lebar.setBounds(20, 90, 100, 25);
        
        this.add(inputLebar);
        inputLebar.setBounds(150, 90, 300, 25);
        
        this.add(tinggi);
        tinggi.setBounds(20, 120, 100, 25);
        
        this.add(inputTinggi);
        inputTinggi.setBounds(150, 120, 300, 25);
        
        this.add(tombolHitung);
        tombolHitung.setBounds(20, 160, 430, 25);
        
        this.add(tombolReset);
        tombolReset.setBounds(20, 190, 430, 25);
        
        this.add(hasil);
        hasil.setBounds(20, 220, 430, 25);
        hasil.setHorizontalAlignment(hasil.CENTER);
        
        this.add(luas);
        luas.setBounds(20, 250, 100, 25);
        
        this.add(hasilLuas);
        hasilLuas.setBounds(200, 250, 350, 25);
        
        this.add(keliling);
        keliling.setBounds(20, 270, 100, 25);
        
        this.add(hasilKeliling);
        hasilKeliling.setBounds(200, 270, 350, 25);
        
        this.add(volume);
        volume.setBounds(20, 290, 100, 25);
        
        this.add(hasilVolume);
        hasilVolume.setBounds(200, 290, 350, 25);
        
        this.add(luasPermukaan);
        luasPermukaan.setBounds(20, 310, 150, 25);
        
        this.add(hasilLuasPermukaan);
        hasilLuasPermukaan.setBounds(200, 310, 350, 25);
        
        
        
    }
    
}

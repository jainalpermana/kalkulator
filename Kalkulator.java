import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Kalkulator extends JFrame {

// deklarasi variabel
protected static final Object JButton = null;
private JPanel contentPane;
private JTextField textField;
private Float operasi1;
private Float operasi2;
private String tanda;
private String back;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Kalkulator frame = new Kalkulator();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the frame.
*/
public Kalkulator() {

// sintax untuk pembuatan frame
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 50, 450, 300);
contentPane = new JPanel();
contentPane.setBackground(new Color(33, 33, 133));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 13));
setContentPane(contentPane);

//label judul untuk tulisan Uje Kalkulator <<<Kalkulator>>>
JLabel IrsanKalkulator = new JLabel("Kalkulator");
IrsanKalkulator.setForeground(Color.white);
IrsanKalkulator.setFont(new Font("Calibry", Font.BOLD, 28));

// label untuk tulisan hasil
JLabel lblHasil = new JLabel("Nilai");
lblHasil.setForeground(Color.white);
lblHasil.setFont(new Font("Calibry", Font.BOLD, 15));

// display hasil dan operasi kalkulator
textField = new JTextField();
textField.setBackground(Color.white);
textField.setFont(new Font("Calibry", Font.BOLD, 15));
textField.setColumns(10);

// Syntax untuk menampilkan angka (0-9)
JButton satu = new JButton("1");
satu.addMouseListener(new MouseAdapter() {

@Override
// syntax untuk menjalankan aksi,jika button angka di klik maka akan tampil di layer display angka tersebut
public void mouseClicked(MouseEvent arg0) {
textField.setText(textField.getText()+"1");
}
});
satu.setFont(new Font("Tahoma", Font.BOLD, 11));

JButton dua = new JButton("2");
dua.addMouseListener(new MouseAdapter() {

@Override
public void mouseClicked(MouseEvent arg0) {
textField.setText(textField.getText()+"2");
}
});
dua.setFont(new Font("Tahoma", Font.BOLD, 11));

JButton tiga = new JButton("3");
tiga.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
textField.setText(textField.getText()+"3");
}
});
tiga.setFont(new Font("Tahoma", Font.BOLD, 11));

JButton empat = new JButton("4");
empat.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
textField.setText(textField.getText()+"4");
}
});
empat.setFont(new Font("Tahoma", Font.BOLD, 11));

JButton lima = new JButton("5");
lima.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
textField.setText(textField.getText()+"5");
}
});
lima.setFont(new Font("Tahoma", Font.BOLD, 11));

JButton enam = new JButton("6");
enam.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
textField.setText(textField.getText()+"6");
}
});
enam.setFont(new Font("Tahoma", Font.BOLD, 11));

JButton tujuh = new JButton("7");
tujuh.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
textField.setText(textField.getText()+"7");
}
});
tujuh.setFont(new Font("Tahoma", Font.BOLD, 11));

JButton delapan = new JButton("8");
delapan.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
textField.setText(textField.getText()+"8");
}
});
delapan.setFont(new Font("Tahoma", Font.BOLD, 11));

JButton sembilan = new JButton("9");
sembilan.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
textField.setText(textField.getText()+"9");
}
});
sembilan.setFont(new Font("Tahoma", Font.BOLD, 11));

JButton nol = new JButton("0");
nol.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
textField.setText(textField.getText()+"0");
}
});
nol.setFont(new Font("Tahoma", Font.BOLD, 11));

// syntax untuk button operasi matematika(+,_,/,* dan =) dan juga tombol backspace dan clean

JButton perkalian = new JButton("x");
perkalian.addMouseListener(new MouseAdapter() {

// syntax untuk menjalankan fungsi dari tombol yaitu operasi matematika pada kalkulator dan kemudian di tampilkan pada display
@Override
public void mouseClicked(MouseEvent arg0) {
operasi1=Float.valueOf(textField.getText());
tanda="*";
textField.setText("");

}
});
perkalian.setFont(new Font("Tahoma", Font.BOLD, 11));

JButton pembagian = new JButton("/");
pembagian.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
operasi1=Float.valueOf(textField.getText());
tanda="/";
textField.setText("");

}
});
pembagian.setFont(new Font("Tahoma", Font.PLAIN, 11));

JButton penjumlahan = new JButton("+");
penjumlahan.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
operasi1=Float.valueOf(textField.getText());
tanda="+";
textField.setText("");
}
});
penjumlahan.setFont(new Font("Tahoma", Font.BOLD, 11));

JButton pengurangan = new JButton("-");
pengurangan.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
operasi1=Float.valueOf(textField.getText());
tanda="-";
textField.setText("");

}
});
pengurangan.setFont(new Font("Tahoma", Font.BOLD, 11));

// syntax sama dengan
JButton samadengan = new JButton("=");
samadengan.addMouseListener(new MouseAdapter() {

@Override
//syntax untuk operasi samadengan dan di tampilkan pada display kalkulator (textfield)
public void mouseClicked(MouseEvent arg0) {
operasi2=Float.valueOf(textField.getText());
if(tanda.equals("*"))
operasi1=operasi1*operasi2;
else if(tanda.equals("/"))
operasi1=operasi1/operasi2;
else if(tanda.equals("+"))
operasi1=operasi1+operasi2;
else if(tanda.equals("-"))
operasi1=operasi1-operasi2;
textField.setText(String.valueOf(operasi1));
}
});

samadengan.setFont(new Font("Tahoma", Font.BOLD, 11));

// syntax untuk backspace, menghapus angka per satu digit
JButton btnBa = new JButton("  < Hapus  ");
btnBa.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
int x;
back=textField.getText();
x=back.length();
back=back.substring(0,x-1);
textField.setText(back);

}
});
btnBa.setFont(new Font("Tahoma", Font.BOLD, 9));

// syntax untuk menghapus angka yang telah di tekan secara keseluruah (clear)
JButton btnC = new JButton("C");
btnC.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
textField.setText("");
}
});
btnC.setFont(new Font("Tahoma", Font.BOLD, 10));

// syntax untuk menampilankan tulisan www.irsan-alihsan.blogspot.com
JLabel lblTmd = new JLabel("@JainalPermana");
lblTmd.setForeground(Color.white);
lblTmd.setFont(new Font("Calibry", Font.BOLD, 13));

GroupLayout gl_contentPane = new GroupLayout(contentPane);
gl_contentPane.setHorizontalGroup(
gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addContainerGap()
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addComponent(lblHasil)
.addComponent(textField, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
.addGroup(gl_contentPane.createSequentialGroup()
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(satu)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(dua)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(tiga))
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(empat)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(lima)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(enam))
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(tujuh)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(delapan)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(sembilan))
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(nol)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(btnBa)))
.addGap(23)
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
.addGroup(gl_contentPane.createSequentialGroup()
.addGap(2)
.addComponent(perkalian)
.addPreferredGap(ComponentPlacement.UNRELATED)
.addComponent(pengurangan, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addGroup(gl_contentPane.createSequentialGroup()
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addComponent(penjumlahan)
.addGroup(gl_contentPane.createSequentialGroup()
.addGap(2)
.addComponent(pembagian, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
.addComponent(btnC))
.addPreferredGap(ComponentPlacement.UNRELATED)
.addComponent(samadengan)))
.addContainerGap(169, Short.MAX_VALUE))))
.addGroup(gl_contentPane.createSequentialGroup()
.addGap(114)
.addComponent(IrsanKalkulator, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
.addContainerGap(119, Short.MAX_VALUE))
.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
.addContainerGap(274, Short.MAX_VALUE)
.addComponent(lblTmd)
.addGap(22))
);
gl_contentPane.setVerticalGroup(
gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(IrsanKalkulator)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(lblHasil)
.addGap(10)
.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
.addGap(23)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(satu)
.addComponent(dua)
.addComponent(tiga)
.addComponent(perkalian)
.addComponent(pengurangan))
.addPreferredGap(ComponentPlacement.RELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
.addGroup(gl_contentPane.createSequentialGroup()
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(empat)
.addComponent(lima)
.addComponent(enam)
.addComponent(pembagian, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
.addPreferredGap(ComponentPlacement.RELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(tujuh)
.addComponent(delapan)
.addComponent(sembilan)
.addComponent(penjumlahan))
.addPreferredGap(ComponentPlacement.RELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(nol)
.addComponent(btnBa)
.addComponent(btnC)))
.addComponent(samadengan, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
.addComponent(lblTmd))
);
contentPane.setLayout(gl_contentPane);
}
}

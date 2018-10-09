package tugas;

import java.util.Stack;


public class main {

	public static void main(String[] args) {
	System.out.println("*******Object Kelas Kotak*******");
	// membuat object dari class kotak
	kotak main = new kotak();
		
	// method setter kotak
	main.setpanjang(10.23);
	main.setlebar(4.56);
		
	// method getter kotak
	System.out.println("panjang : " + main.getpanjang());
	System.out.println("lebar : " + main.getlebar());
	System.out.println("luas : " + main.getpanjang()*main.getlebar());
	System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
	
	System.out.println("*******Object Kelas Kotak*******");
	//membuat object dari class mahasiswa
	mahasiswa mahasiswa = new mahasiswa();
	
	//method setter mahasiswa
	mahasiswa.nama = "Muh.zulkifli.S";
	mahasiswa.nim = "D0217520";
	mahasiswa.alamat = "Lampa";
	mahasiswa.golonganDarah = "--";
	mahasiswa.status = "Mahasiswa";
	mahasiswa.tinggiBadan = "165";
	mahasiswa.beratBadan = "50";
	
	//method getter mahasiswa
	System.out.println("nama : " + mahasiswa.getnama());
	System.out.println("nim : " + mahasiswa.getnim());
	System.out.println("alamat : " + mahasiswa.getalamat());
	System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
	System.out.println("Status : " + mahasiswa.getstatus());
	System.out.println("tinggi badan : " + mahasiswa.getberatBadan());
	System.out.println("berat badan : " + mahasiswa.getberatBadan());

	System.out.println("*******Object Kelas Kotak*******");
	//membuat object dari kelas node
	Node Node = new Node();
	
	//method setter node
	Node.label = "AQUA";
	Node.Value = 1;
	
	//method getter node
	System.out.println("Nama Label : " + Node.getlabel());
	System.out.println("jumlah label : " + Node.getValue());

	System.out.println("------Object Kelas stack------");
	//membuat object dari kelas stack
	stack stack = new stack();
	
	stack.value[0] = "zulin";
	stack.value[1] = "dz";
	stack.value[2]= "wira";
	stack.value[3]= "Risdaynti";
	stack.value[4] = "alwi";
	stack.value[5] = "fajrin";
	stack.value[6]= "ani";
	stack.value[7]= "irja";
	stack.value[8] = "ira";
	stack.value[9] = "ikha";
	stack.value[10]= "kurni";
	stack.value[11]= "nadia";
	stack.value[12] = "yanhi";
	stack.value[13] = "mujna";
	stack.value[14]= "cica";
	stack.value[15]= "juli";
	stack.value[16] = "rosa";
	stack.value[17] = "nila";
	stack.value[18]= "lina";
	stack.value[19]= "yana";
	stack.value[20] = "mariani";
	stack.value[21] = "marwah";
	stack.value[22]= "nafisha";
	stack.value[23]= "yuli";
	stack.value[24] = "ahmad";
	stack.value[25] = "aswad";
	stack.value[26]= "udin";
	stack.value[27]= "aswandi";

	stack.setvalueAt(4 ,"Muhammad");

	//menampilkan stack
	for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};

	
	}
}

import java.util.Scanner;

public class latihan10{
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int pilihan;
		boolean loop = true;
		
				System.out.println("menu pilihan:");
						System.out.println("1.Nasi goreng ayam");
								System.out.println("2.Nasi goreng seafood");
										System.out.println("3.soto ayam");
												System.out.println("4.juice jeruk");
														System.out.println("pilihan: ");
				pilihan = input.nextInt();
				
				while(loop){
					switch(pilihan){
						case 1:
								System.out.println("Anda memilih nasi goreng ayam");
								loop = false;
								break;
								
								case 2:
										System.out.println("Anda memilih nasi goreng seafood");
										loop = false;
										break;
										
										case 3:
												System.out.println("Anda memilih soto ayam");
												loop = false;
												break;
												
												case 4:
														System.out.println("Anda memilih juice jeruk");
														loop = false;
														break;
														
														default:
																System.out.println("silahkan pilih menu 1-4");
																
										
										
					}
				}										
		System.out.println("pesanan anda akan diantar sebentar lagi..");

	}
	
}
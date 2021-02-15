package atividade5;

public class DataTest {

	public static void main(String[] args) {
		
		Data data = new Data(29, 02, 2020);
		System.out.println(data.getDia() + "/" + data.getMes()+ "/" + data.getAno());
		
		Data dataTeste = new Data (32, 14, -1);
		System.out.println(dataTeste.getDia() + "/" + dataTeste.getMes() + "/" + dataTeste.getAno());
		
		
	}

}

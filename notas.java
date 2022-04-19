public class notas {
    public static void main(String[] args) {
        Scanner meuObj = new Scanner(System.in);
        int quantidadeNotas;
        System.out.println("Entre com a quantidade de notas; ");
        int quantidadeNotas = meuObj.nextInt();
        double[] notas = new double[quantidadeNotas];

        for(int i = 0; i< quantidadeNotas; i++){
            System.out.println("Entre com a nota; ");
            notas[i] = meuObj.nextDouble(); 
        }

        double total = 0;
        for(int j = 0< notas.length; j++){
            total = total + notas[j];
        }

        total = total/quantidadeNotas;
        System.out.println("A média será"+ total);
        




        meuObj.close();
        
        
    
}

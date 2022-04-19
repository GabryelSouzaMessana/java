public class Main {
    public static void main(String[] args) {
        Scanner meuObj = new Scanner(System.in);
        System.out.println("Entre com um valor: ");
        int i = meuObj.nextInt();
        
        for (int a = i+200; i < a; i++) {
            System.out.println(i);
        }

    }
}

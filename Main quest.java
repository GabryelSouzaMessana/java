public class Main {
    
    public static void main(String[] args) {
        Scanner meuObj = new Scanner(System.in);
        int option;
        int senha;

            System.out.println("Entre com uma das opções a seguir: (1)Login (2)Média de 4 notas (3)Seja bem-vindo (4)velocidade média")
            
            switch (option) {

                case 1: 
                System.out.println("Bem-vindo(a) Carlinda, por favor, digite a senha");
                int senha = meuObj.nextInt();
                if (senha = 3456){
                    System.out.println("Usuário logado");
                } else { System.out.println("Acesso negado");

                }
                break;


                case 2: 
                System.out.println("");

                case 3: 
                System.out.println("");

                case 4: 
                System.out.println("");
            }
    }
    
}

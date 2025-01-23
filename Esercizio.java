import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, a;

        a = -1;
        System.out.println("Inserire grandezza del vettore");
        n = input.nextInt();
        int[] v = new int[n];

        for (i = 0; i <= n - 1; i++) {
            v[i] = 0;
        }
        System.out.println("Benvenuto nel menù di gestione del vettore! Seleziona una delle seguenti opzioni");
        while (a != 6) {
            System.out.println("1. Inserisci elemento / 2. Elimina elemento / 3. Ricerca elemento / 4. Elimina duplicati / 5. Visualizza vettore / 6. Esci");
            a = input.nextInt();
            if (a == 1) {
                inserisci(0, 0);
            } else {
                if (a == 2) {
                    elimina(0);
                } else {
                    if (a == 3) {
                        ricerca(0);
                    } else {
                        if (a == 4) {
                            eliminaDuplicati();
                        } else {
                            if (a == 5) {
                                visualizza(v, n);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Menù chiuso");
        input.close();
    }
    
    public static void elimina(int posizione) {
        System.out.println("funziona");
    }
    
    public static void eliminaDuplicati() {
        System.out.println("funziona");
    }
    
    public static void inserisci(int valore, int posizione) {
        System.out.println("funziona");
    }
    
    public static void ricerca(int valore) {
        System.out.println("funziona");
    }
    
    public static void visualizza(int[] v, int n) {
        int i;

        System.out.println("Vettore visualizzato:");
        for (i = 0; i <= n - 1; i++) {
            System.out.println(v[i]);
        }
    }
}

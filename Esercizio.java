import java.util.Scanner;

class Vettori113 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, a, valore, posizione;

        a = (int) (-1);
        System.out.println("Inserire grandezza del vettore");
        n = input.nextInt();
        int[] v = new int[n * 10];

        for (i = 0; i <= n - 1; i++) {
            v[i] = 0;
        }
        System.out.println("Benvenuto nel menù di gestione del vettore! Seleziona una delle seguenti opzioni");
        while (a != 6) {
            System.out.println("1. Inserisci elemento / 2. Elimina elemento / 3. Ricerca elemento / 4. Elimina duplicati / 5. Visualizza vettore / 6. Esci");
            a = input.nextInt();
            if (a == 1) {
                System.out.println("Specifica il valore da inserire:");
                valore = input.nextInt();
                System.out.println("Specifica la posizione in cui inserire il valore:");
                posizione = input.nextInt();
                n = inserisci(v, n, posizione, valore);
                System.out.println("Valore inserito");
            } else {
                if (a == 2) {
                    System.out.println("Specifica la posizione del valore da eliminare");
                    posizione = input.nextInt();
                    n = elimina(v, n, posizione);
                } else {
                    if (a == 3) {
                        System.out.println("Specifica il valore da ricercare:");
                        valore = input.nextInt();
                        posizione = ricerca(v, n, valore);
                        System.out.println("Il valore è stato trovato nella posizione: " + posizione);
                    } else {
                        if (a == 4) {
                            n = eliminaDuplicati(v, n);
                            System.out.println("Duplicati eliminati");
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
    }
    
    public static int elimina(int[] v, int n, int posizione) {
        int n2, i;

        for (i = posizione; i <= n - 2; i++) {
            v[i] = v[i + 1];
        }
        n2 = n - 1;
        
        return n2;
    }
    
    public static int eliminaDuplicati(int[] v, int n) {
        int i, j, contatore, n2, n3;

        contatore = 0;
        for (i = 0; i <= n - 2; i++) {
            for (j = i; j <= n - 1; j++) {
                if (v[i] == v[j]) {
                    n2 = elimina(v, n, j);
                    contatore = contatore + 1;
                }
            }
        }
        n3 = n2 - contatore;
        
        return n3;
    }
    
    public static int inserisci(int[] v, int n, int posizione, int valore) {
        while (posizione < 0 || posizione > n - 1) {
            System.out.println("La posizione inserita non è valida, Riprova con un valore che va da 0 a " + (n - 1));
            posizione = input.nextInt();
        }
        int n2, i;

        for (i = posizione + 1; i <= n; i++) {
            v[i] = v[i - 1];
        }
        v[posizione] = valore;
        n2 = n + 1;
        
        return n2;
    }
    
    public static int ricerca(int[] v, int n, int valore) {
        int i, posizione;

        for (i = 0; i <= n - 1; i++) {
            if (valore == v[i]) {
                posizione = i;
                i = n;
            }
        }
        
        return posizione;
    }
    
    public static void visualizza(int[] v, int n) {
        int i;

        System.out.println("Vettore visualizzato:");
        for (i = 0; i <= n - 1; i++) {
            System.out.println(v[i]);
        }
    }
}

public class Main // classe Main
{
    public static void main(String[] args) // méthode principale de Main
    {
        String langage = "Hello";
        String phrase = langage + " World !";
        System.out.println(phrase); // instruction ~= print()

        int[] tabArray = {2, 9, 199, 20}; // tableau d'entiers
        char[] arrayChar = new char[3]; // tab de char (vide) unidimensionnel de 3 cases 
        arrayChar[0] = 'a';
        arrayChar[1] = 'b';
        arrayChar[2] = 'c';
        int[][] arrayBidim = new int[2][3]; // tab bidimensionnel 2x3
        var entier = 5; // mot-clé var peut remplacer int si l'affection est faite
        
        affiche(phrase);
        int somme = Main.addition(2, 8);
        System.out.println(somme);
    }
    public static void affiche(String phrase)
    {
        System.out.println(phrase);
    }

    public static int addition(final int entier1, final int entier2)
    {
        return entier1 + entier2;
    }
}

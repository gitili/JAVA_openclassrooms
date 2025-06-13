/** déclaration de la classe Main
 * public = mot-clé qui signifie que la classe est accessible depuis n'importe où dans le programme
 * class = pour créer une classe
 * Main = nom de la classe ; le nom du fichier .java doit être le même que le nom de la classe publique
 */
public class Main 
{
/** déclaration de la méthode principale (main) -> Java commence ici à l'exécution
 * public = main peut être appelée de l'extérieur (VM Java)
 * static = méthode main appartient à classe Main
 * void = main ne retourne rien en elle-même
 * main = nom spécial de la méthode que Java cherche pour run
 * String[] args = paramètre indispensable pour que le programme run ; 
 *    qui permet de passer des arguments en ligne de commande au programme
 */
    public static void main(String[] args) // fonction main
    {
        int num; // déclaration du type et de la var num
        num = 5; // affectation à la var num

        final int immuable = 20; // final int = affectation immuable

        String langage = "Hello";
        String phrase = langage + " World !";
        
        System.out.println(phrase); // instruction ~= print()
        // System.out.println(num + immuable);

        int[] tabArray = {2, 9, 199, 20}; // déclarer un tableau d'entiers
        
        char[] arrayChar = new char[3]; // déclarer un tab de char (vide) unidimensionnel de 3 cases 
        arrayChar[0] = 'a';
        arrayChar[1] = 'b';
        arrayChar[2] = 'c';

        int[][] arrayBidim = new int[2][3]; // tab bidimensionnel de 6 cases (avec pour indices : [0][0], [0][1], [0][2], [1][0], [1][1], [1][2])

        var entier = 5; // mot-clé var peut remplacer int si l'affection est faite
    }
}

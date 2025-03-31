public class Exo032 {
    /*
Associe les définitions avec les exceptions :

    A : Se produit lorsqu'une référence null est utilisée pour appeler une méthode ou accéder à une propriété.

    B : Se produit lorsqu'on tente d'accéder à un indice invalide dans un tableau.

    C : Se produit lors d'une opération arithmétique illégale, comme une division par zéro.

    D : Se produit lorsqu'un argument passé à une méthode est illégal ou inapproprié.

    E : Se produit lorsqu'on tente d'accéder à un index en dehors des limites dans une collection (ex. ArrayList, String, etc.).

        1 : IllegalArgumentException

        2 : IndexOutOfBoundsException

        3 : NullPointerException

        4 : ArrayIndexOutOfBoundsException

        5 : ArithmeticException */


        //partie B

/*
 * Associe les codes avec les exceptions :

A :

String str = null;
int length = str.length();

B :

int[] arr = new int[5];
System.out.println(arr[10]);

C :

int result = 10 / 0; 

D :

void setAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("Age ne peut pas être négatif");
    }
}

E :

List<String> list = new ArrayList<>();
list.add("Item");
System.out.println(list.get(2)); 

1 : IllegalArgumentException

2 : IndexOutOfBoundsException

3 : NullPointerException

4 : ArrayIndexOutOfBoundsException

5 : ArithmeticException
 */
}
package rsa;

public class main {
/*
* RSA è basato sull'elevata complessità computazionale della fattorizzazione in numeri primi. Il suo funzionamento base è il seguente:
*
* 1. si scelgono a caso due numeri primi, p e q abbastanza grandi da garantire la sicurezza dell'algoritmo (per esempio, il più grande numero RSA,
*    RSA-2048, utilizza due numeri primi lunghi più di 300 cifre);
* 2. si calcola il loro prodotto n=pq, chiamato modulo (dato che tutta l'aritmetica seguente è modulo n, e il prodotto φ(n)=(p−1)(q−1), dove φ(n) è la
*    funzione toziente;
* 3. si considera che la fattorizzazione di n è segreta e solo chi sceglie i due numeri primi, p e q, la conosce;
* 4. si sceglie poi un numero e (chiamato esponente pubblico), coprimo con φ(n) e più piccolo di φ(n);
* 5. si calcola il numero d (chiamato esponente privato) tale che il suo prodotto con e sia congruo a 1 modulo φ(n) ovvero che ed≡1(modφ(n)); per calcolare d si
*    utilizza l'algoritmo esteso di Euclide.
*
* La chiave pubblica è (n,e), mentre la chiave privata è (n,d)
*
*
*
*
* */
}

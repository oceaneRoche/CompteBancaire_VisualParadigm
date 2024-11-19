import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Doe", "John", "123 rue Exemple", new Date());
        Banquier banquier = new Banquier(1001);

        banquier.creerCompte(client, 500, true, 200, 10);

        Compte compte1 = client.sesComptes.get(0);

        System.out.println("Solde initial : " + compte1.getSolde());
        client.gererCompte(compte1, 300, true); // Dépôt de 300
        System.out.println("Solde après dépôt : " + compte1.getSolde());
        client.gererCompte(compte1, 100, false); // Retrait de 100
        System.out.println("Solde après retrait : " + compte1.getSolde());
    }
}

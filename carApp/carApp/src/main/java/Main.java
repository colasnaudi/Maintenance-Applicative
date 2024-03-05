public class Main {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Sedan", "Bleu");
        Conducteur monConducteur = new Conducteur("John", 20);

        monConducteur.demarrerVoiture(maVoiture);
        maVoiture.accelerer();
        monConducteur.changerVitesse(maVoiture, 80);
        maVoiture.ralentir();
        monConducteur.changerVitesse(maVoiture,30);
        monConducteur.arreterVoiture(maVoiture);
        System.out.println("fini");
    }
}

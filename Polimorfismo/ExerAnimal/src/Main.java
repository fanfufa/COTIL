public class Main {
    public static void main(String[] args) {
        Animal a = new Cavalo("Juan", 22);
        Preguiça p = new Preguiça("Juan", 22);
        Cachorro c = new Cachorro("Juan", 22);
        Animal a2 = new Cachorro("Juan", 22);
        Cavalo cav = new Cavalo("Juan", 22);

        a.som();
        p.som();
        p.arvore();
        c.som();
        c.correr();
        a2.som();
        c.correr();
        c.som();
    }
}
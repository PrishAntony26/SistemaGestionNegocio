package Login;

public class principal {

    public static void main(String[] args) {
        Menu m = new Menu();
        Administrador a = new Administrador(m);
        Cliente c = new Cliente(m);
        Creador cre = new Creador(m);
        m.menu_principal();
    }
}
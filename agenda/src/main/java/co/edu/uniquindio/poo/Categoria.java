package co.edu.uniquindio.poo;

public enum Categoria {
    OFICINA(1),
    FIESTA(2),
    AMIGOS(3),
    FAMILIA(4);

    private final int id;

    private Categoria(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

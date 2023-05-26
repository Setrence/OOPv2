package DZ_Sem_6.lsp;

public class Penguin extends Bird {

    @Override
    public void fly() {
        throw new RuntimeException("Пингвин не умеет летать!");
    }

}

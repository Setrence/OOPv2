package DZ_Sem_6.lsp;

/**
 * S
 */
public class Duck extends Bird {

    @Override
    public void fly() {
        System.out.printf("Утка летит со скоростью %d км/ч\n", flySpeed);
    }
}

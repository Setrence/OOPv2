package DZ_Sem_7.observer;

/**
 * Интерфейс наблюдателя (соискателя, человек в поисках работы)
 */
public interface Observer {

    void receiveOffer(JobVacancy vacancy);

}

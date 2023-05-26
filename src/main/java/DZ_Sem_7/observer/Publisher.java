package DZ_Sem_7.observer;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(JobVacancy vacancy);

}

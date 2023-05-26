package DZ_Sem_7.observer;

public class Program {

    /**
     * TODO: Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя. - готово
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии. - готово
     * @param args
     */
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 40000, jobAgency);
        Company google = new Company("Google", 50000, jobAgency);
        Company yandex = new Company("Yandex", 10000, jobAgency);

        Master ivanov = new Master("Ivanov");
        Master sidorov = new Master("Sidorov");
        Student petrov = new Student("Petrov");
        Programer igor = new Programer("Igor");

        JobVacancy midll = new ITSecialist("ITSecialist", 100000, "2/2");
        JobVacancy junior = new ITSecialist("ITSecialist", 60000, "2/2");
        JobVacancy repmaster = new RepareMaster("RepareMaster", 80000, "5/2");
        JobVacancy freelans = new Freelanser("Freelanser", 40000, "free");



        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(igor);

        for (int i = 0; i < 3; i++){
            geekBrains.needEmployee(midll);
            geekBrains.needEmployee(junior);
            google.needEmployee(freelans);
            yandex.needEmployee(repmaster);
        }

    }

}

package DZ_Sem_5;

import DZ_Sem_5.models.TableModel;
import DZ_Sem_5.presenters.BookingPresenter;
import DZ_Sem_5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        bookingView.reservationTable(new Date(), 3, "Станислав");
        bookingView.reservationTable(new Date(), 1, "Станислав");
        bookingView.reservationTable(new Date(), 2, "Станислав");
        bookingView.reservationTable(new Date(), 4, "Станислав");

        bookingView.changeReservationTable(1004, new Date(), 4, "Станислав");

    }

}

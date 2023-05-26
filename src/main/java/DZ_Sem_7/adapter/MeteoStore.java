package DZ_Sem_7.adapter;

import DZ_Sem_7.adapter.MeteoSensor;
import DZ_Sem_7.adapter.MeteoSensorSimple;

public class MeteoStore {

    boolean save(MeteoSensor meteoSensor){
        System.out.printf("Сохранение данных по метеодатчику\n[%d]; temperature - %f\n", meteoSensor.getId(), meteoSensor.getTemperature());
        return true;
    }

    boolean save(MeteoSensorSimple meteoSensor){
        System.out.printf("Сохранение данных по метеодатчику\n[%d]; temperature - %f\n", meteoSensor.getId(), meteoSensor.getTemperature());
        return true;
    }

}

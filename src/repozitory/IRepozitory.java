package repozitory;

import java.util.List;

public interface IRepozitory <T>{
    T findById(int id);
    List<T> getAll();
    double getPrice(int id);



}

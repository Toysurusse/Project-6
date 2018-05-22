package dao.list;

import beans.Information;

import java.util.List;

public interface InfoDAO {
    void add(Information information);
    List <Information> read();
    int lastIDInfo(List<Information> info);
    void delete(int id);
}

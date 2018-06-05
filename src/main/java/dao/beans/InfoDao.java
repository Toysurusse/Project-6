package dao.beans;

import entity.Information;

import java.util.List;

public interface InfoDao {
    void add(Information information);
    List<Information> read();
    int lastIDInfo(List<Information> info);
    void delete(int id);
}

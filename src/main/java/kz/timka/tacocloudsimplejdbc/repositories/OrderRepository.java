package kz.timka.tacocloudsimplejdbc.repositories;


import kz.timka.tacocloudsimplejdbc.data.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder tacoOrder);
}

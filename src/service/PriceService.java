package service;

import adapter.DatabaseStorage;
import adapter.PersistInterface;
import domain.EntityInterface;
import domain.Price;
import java.util.ArrayList;
import java.util.UUID;

public class PriceService extends BaseService {
    protected PersistInterface armazenamento = new DatabaseStorage<>(Price.class);
}
